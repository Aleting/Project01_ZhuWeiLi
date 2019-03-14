package cn.edu.qut.service;


import cn.edu.qut.dao.OrdeMapper;
import cn.edu.qut.dao.Order_goodsMapper;
import cn.edu.qut.entity.*;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrdeMapper ordeMapper;
    @Autowired
    Order_goodsMapper order_goodsMapper;
    /**
     * 订单数据
     */
    public List<Orde> getOrder() {
        List<Orde> ordes = ordeMapper.selectByExample(null);

        return ordes;
    }

    /**
     * 查询商品数据
     * 两张表联合查询
     *
     * @return
     */
    public List<Order> select_order() {
        OrdeExample ordeExample = new OrdeExample();
        OrdeExample.Criteria criteria = ordeExample.createCriteria();
        return null;
    }

    /**
     * 订单录入
     */
    public boolean addOrder(Orde orders) {
        System.out.println("service");
        ordeMapper.insertSelective(orders);
        return true;
    }

    /**
     * 分页
     */
    public List<Orde> findAllPage(int store_id, int page) {
        return ordeMapper.findOrders(store_id, page);
    }

    public int count(int store_id) {
        return ordeMapper.count(store_id);
    }

    public Orde selectId(int order_id, int store_id) {
        Orde orders = ordeMapper.selectId(order_id, store_id);
        return orders;
    }

    public List<Orde> findOrders(int store_id, int page) {
        return ordeMapper.findOrders(store_id, page);
    }

    public List<Orde> selectCustomerName(String name, int store_id) {
        return ordeMapper.selectCustomerName(name, store_id);
    }

    /**
     * 导出excel
     */
    public void export(String[] titles, ServletOutputStream out, int storeId) {
        try {
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            HSSFRow hssfRow = hssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
            //居中样式
            hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

            HSSFCell hssfCell = null;
            for (int i = 0; i < titles.length; i++) {
                hssfCell = hssfRow.createCell(i);//列索引从0开始
                hssfCell.setCellValue(titles[i]);//列名1
                hssfCell.setCellStyle(hssfCellStyle);//列居中显示
            }

            // 第五步，写入实体数据
            List<Orde> costs = ordeMapper.query1(storeId);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (costs != null && !costs.isEmpty()) {
                for (int i = 0; i < costs.size(); i++) {
                    hssfRow = hssfSheet.createRow(i + 1);
                    Orde cost = costs.get(i);

                    // 第六步，创建单元格，并设置值
                    String orde_id ="";
                    if (cost.getOrderId() >= 0) {
                        orde_id = cost.getOrderId().toString();
                    }
                    hssfRow.createCell(0).setCellValue(orde_id);

                    String orde_data = "";
                    if (cost.getOrderTime2() != null) {
                        //获取String类型的时间
                        orde_data = cost.getOrderTime2();
                    }
                    hssfRow.createCell(1).setCellValue(orde_data);

                    String money = "";
                    if (cost.getOrderMoney() != null) {
                        money = cost.getOrderMoney().toString();
                    }
                    hssfRow.createCell(2).setCellValue(money);

                    String orde_state = "";
                    if (cost.getOrderState() != null) {
                        orde_state = cost.getOrderState();
                        if(orde_state.equals("0")){
                            orde_state="提交未审核";
                        }
                        if(orde_state.equals("1")){
                            orde_state="审核通过";
                        }
                        else if(orde_state.equals("2")){
                            orde_state="无效订单";
                        }
                        else {
                            orde_state="数据库信息错误！";
                        }
                    }
                    hssfRow.createCell(3).setCellValue(orde_state);

                    String cus_id = "";
                    if (cost.getCustomerId() != null) {
                        cus_id = cost.getCustomerId().toString();
                    }
                    hssfRow.createCell(4).setCellValue(cus_id);

                    String address = "";
                    if (cost.getAddress() != null) {
                        address = cost.getAddress();
                    }
                    hssfRow.createCell(5).setCellValue(address);

                    String EpayType = "";
                    if (cost.getOrderEpayType()!=null ) {
                        EpayType = cost.getOrderEpayType();
                        if(EpayType.equals("1")){
                            EpayType="支付宝";
                        }
                        else if (EpayType.equals("2")){
                            EpayType="微信";
                        }
                        else {
                            EpayType="数据库信息错误";
                        }
                    }
                    hssfRow.createCell(6).setCellValue(EpayType);

                }
            }
            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new Exception("导出信息失败！");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * z增加订单
     * @param order_goods
     */
    public void addOrderGoods(Order_goods order_goods){
        System.out.println("进入service");
        order_goodsMapper.insertSelective(order_goods);
        System.out.println("离开service");
    }

    /**
     * 修改订单状态
     */
    public boolean updateOrderState(int orderId,String state){
        OrdeExample example = new OrdeExample();
        OrdeExample.Criteria criteria= example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        Orde orde = new Orde();
        orde.setOrderState(state);
        ordeMapper.updateByExampleSelective(orde,example);
        return true;
    }
}
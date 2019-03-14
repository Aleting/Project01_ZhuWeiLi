package cn.edu.qut.service;


import cn.edu.qut.dao.T_boughtMapper;
import cn.edu.qut.entity.T_bought;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;


@Service
public class TboughtService {

    @Autowired
    T_boughtMapper t_boughtMapper;


    /**
     * 实现添加订货单功能
     * @param t_bought
     */
    public void add_tbought(T_bought t_bought) {
        t_boughtMapper.insertSelective(t_bought);
    }

    /**
     * 分页*/
    public List<T_bought> findAllPage(int storeId, int page){
        return t_boughtMapper.findAllPage(storeId,page);
    }
    public int count(int storeId){
        return t_boughtMapper.count(storeId);
    }

    public List<T_bought> selectId(int storeId, String supplierName){
        List<T_bought> orders = t_boughtMapper.selectSupplierName(supplierName,storeId);
        return orders;
    }

    /**
     * 导出excel所需方法
     * */
    public void export(String[] titles, ServletOutputStream out, int storeId) {
        try{
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
            List<T_bought> costs = t_boughtMapper.query1(storeId);


            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if(costs != null && !costs.isEmpty()){
                for (int i = 0; i < costs.size(); i++) {
                    hssfRow = hssfSheet.createRow(i+1);
                    T_bought cost = costs.get(i);
                    System.out.println("id"+costs.get(i).getGoodsName());
                    // 第六步，创建单元格，并设置值
//                    String id = null;
//                    if(cost.getBouId()!=null){
//                        id = cost.getBouId();
//                    }
//                    hssfRow.createCell(0).setCellValue(id);
                    String goodsName = null;
                    if(cost.getGoodsName()!=null){
                        goodsName = cost.getGoodsName();
                    }
                    hssfRow.createCell(0).setCellValue(goodsName);

                    String supplierName = null;
                    if(cost.getGoSpec()!=null){
                        supplierName = cost.getGoSpec();
                    }
                    hssfRow.createCell(1).setCellValue(supplierName);
                    String attributeSize = null;
                    if(cost.getAttributeSize()!=null){
                        attributeSize = cost.getAttributeSize();
                    }
                    hssfRow.createCell(2).setCellValue(attributeSize);

                    String attributePrice = null;
                    if(cost.getAttributePrice()!=null){
                        attributePrice =  cost.getAttributePrice().toString();
                    }
                    hssfRow.createCell(3).setCellValue(attributePrice);

                    int goodsNum = 0;
                    if(cost.getGoodsNum()!=0){
                        goodsNum = cost.getGoodsNum();
                    }
                    hssfRow.createCell(4).setCellValue(goodsNum);

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
        }catch(Exception e){
            e.printStackTrace();
            try {
                throw new Exception("导出信息失败！");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
//
//    /**
//     * 更改是否支付
//     * @param goId
//     * @param ifpay
//     * @return
//     */
//    public boolean ifPay(String goId,String ifpay){
//        T_boughtExample example = new T_boughtExample();
//        T_boughtExample.Criteria criteria= example.createCriteria();
//        criteria.andGoIdEqualTo(goId);
//        T_bought t_bought = new T_bought();
//        t_bought.setIfPay(ifpay);
//        t_boughtMapper.updateByExampleSelective(t_bought,example);
//        return true;
//    }
}

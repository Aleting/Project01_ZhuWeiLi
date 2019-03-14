package cn.edu.qut.service;


import cn.edu.qut.dao.CommodityManagementMapper;
import cn.edu.qut.entity.CommodityManagement;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class CommodityManagementService {
    @Autowired
    CommodityManagementMapper commodityManagementMapper;


    /*
     * 分页*/
    public List<CommodityManagement> findAllPage(int store_id,int page){
        return commodityManagementMapper.findAllPage(store_id,page);
    }
    public int count(int store_id){
        return commodityManagementMapper.count(store_id);
    }

    public CommodityManagement selectGoodsId(int goodsId,int store_id){
        CommodityManagement goods = commodityManagementMapper.selectGoodsId(goodsId,store_id);
        return goods;
    }

    public List<CommodityManagement> selectGoodsName(String goodsName,int store_id){
        return commodityManagementMapper.selectGoodsName(goodsName,store_id);
    }

    /**
     * 分类查询
     * @param sortId
     * @param storeId
     * @return
     */
    public List<CommodityManagement> selectSortId(int sortId,int storeId,int page){
        return commodityManagementMapper.selectSortId(sortId,storeId,page);
    }

    /**
     * 导出excel
     *
     */
    public void export(String[] titles, ServletOutputStream out,String store_id) {
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
            List<CommodityManagement> costs = commodityManagementMapper.query1(store_id);

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if(costs != null && !costs.isEmpty()){
                for (int i = 0; i < costs.size(); i++) {
                    hssfRow = hssfSheet.createRow(i+1);
                    CommodityManagement cost = costs.get(i);

                    // 第六步，创建单元格，并设置值
                    String goods_name = "";
                    if(cost.getGoodsName() != null){
                        goods_name = cost.getGoodsName();
                    }
                    hssfRow.createCell(0).setCellValue(goods_name);

                    String attribute_price = "";
                    if(cost.getAttributePrice() != null){
                        attribute_price = cost.getAttributePrice().toString();
                    }
                    hssfRow.createCell(1).setCellValue(attribute_price);

                    String attribute_price_vip = "";
                    if(cost.getAttributePriceVip() != null){
                        attribute_price_vip = cost.getAttributePriceVip().toString();
                    }
                    hssfRow.createCell(2).setCellValue(attribute_price_vip);

                    String attribute_price0 = "";
                    if(cost.getAttributePrice0() != null){
                        attribute_price0 = cost.getAttributePrice0().toString();
                    }
                    hssfRow.createCell(3).setCellValue(attribute_price0);

                    String supplier_name = "";
                    if(cost.getSupplierName() != null){
                        supplier_name = cost.getSupplierName();
                    }
                    hssfRow.createCell(4).setCellValue(supplier_name);

                    String goods_state="";
                    if(cost.getGoodsState() != null){
                        goods_state = cost.getGoodsState();
                    }
                    hssfRow.createCell(5).setCellValue(goods_state);

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
    /**
     * 根据Id查询供应商
     */
    public CommodityManagement getGoods(int goodsId){
        //进入service层
        System.out.println("进入service");
        return commodityManagementMapper.selectByPrimaryKey(goodsId);

    }


}

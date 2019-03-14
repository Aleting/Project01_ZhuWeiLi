package cn.edu.qut.service;


import cn.edu.qut.dao.SupplierMapper;
import cn.edu.qut.entity.Supplier;
import cn.edu.qut.entity.SupplierExample;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    SupplierMapper supplierMapper;

    /**
     * 查询所有的供应商 用来分页
     * @return
     */
    public List<Supplier> all_supplier(int store_id) {
        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(store_id);
        return supplierMapper.selectByExample(example);
    }

    /**
     * 用来添加供应商
     * @param supplier
     */
    public void add_supplier(Supplier supplier) {
        supplierMapper.insertSelective(supplier);
    }
    /**
     * 用来模糊查询供应商
     */
    public List<Supplier> select_supplier(String supplier_name,int storeId){

        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andSupplierNameLike("%"+supplier_name+"%");
        criteria.andStoreIdEqualTo(storeId);
        return supplierMapper.selectByExample(supplierExample);
    }
    /**
     * 查询列表数据多少
     */
    public int count(int storeId){
        return supplierMapper.count(storeId);
    }

    /**
     * 导出excel
     *
     */
    public void export(String[] titles, ServletOutputStream out,int storeId) {
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
            List<Supplier> costs = supplierMapper.query1(storeId);

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if(costs != null && !costs.isEmpty()){
                for (int i = 0; i < costs.size(); i++) {
                    hssfRow = hssfSheet.createRow(i+1);
                    Supplier cost = costs.get(i);

                    // 第六步，创建单元格，并设置值
                    int supplier_id = -1;
                    if(cost.getSupplierId() >=0){
                        supplier_id = cost.getSupplierId();
                    }
                    hssfRow.createCell(0).setCellValue(supplier_id);

                    String supplier_name = "";
                    if(cost.getSupplierName() != null){
                        supplier_name = cost.getSupplierName().toString();
                    }
                    hssfRow.createCell(1).setCellValue(supplier_name);

                    String supplier_contacts = "";
                    if(cost.getSupplierContacts() != null){
                        supplier_contacts = cost.getSupplierContacts().toString();
                    }
                    hssfRow.createCell(2).setCellValue(supplier_contacts);

                    String supplier_wx = "";
                    if(cost.getSupplierWx() != null){
                        supplier_wx = cost.getSupplierWx().toString();
                    }
                    hssfRow.createCell(3).setCellValue(supplier_wx);

                    String supplier_epay = "";
                    if(cost.getSupplierEpay() != null){
                        supplier_epay = cost.getSupplierEpay();
                    }
                    hssfRow.createCell(4).setCellValue(supplier_epay);

                    String supplier_phone="";
                    if(cost.getSupplierPhone()!=null){
                        supplier_phone = cost.getSupplierPhone();
                    }
                    hssfRow.createCell(5).setCellValue(supplier_phone);

                    String store_id="";
                    if(cost.getStoreId()>=0){
                        store_id = cost.getStoreId().toString();
                    }
                    hssfRow.createCell(6).setCellValue(store_id);

                    String supplier_memo="";
                    if(cost.getSupplierMemo() !=null){
                        supplier_memo = cost.getSupplierMemo();
                    }
                    hssfRow.createCell(7).setCellValue(supplier_memo);
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
     * 删除供货商
     * @param id
     * @return
     */
    public boolean deleteSupplier(int id){
        supplierMapper.deleteByPrimaryKey(id);
        return true;
    }

    /**
     * 修改供应商
     */
    public boolean updateSupplier(Supplier supplier){
        supplierMapper.updateByPrimaryKeySelective(supplier);
        return true;
    }
    /**
     * 根据Id查询供应商
     */
    public Supplier getSupplier(int supplierId){
        return supplierMapper.selectByPrimaryKey(supplierId);
    }
/**
 * 根据storeId查询供应商分类
 */
public List<Supplier> select_supplier_storeId(int storeId){
    SupplierExample example = new SupplierExample();
    SupplierExample.Criteria criteria = example.createCriteria();
    criteria.andStoreIdEqualTo(storeId);
    return supplierMapper.selectByExample(example);
}
}

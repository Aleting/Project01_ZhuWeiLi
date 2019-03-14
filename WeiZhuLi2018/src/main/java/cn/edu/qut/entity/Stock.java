package cn.edu.qut.entity;

import java.math.BigDecimal;

public class Stock {
    private Integer stockId;

    private Integer bouId;

    private String goodsId;

    private Integer orderId;

    private String goSpec;

    private Integer supplierId;

    private BigDecimal buyPrice;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getBouId() {
        return bouId;
    }

    public void setBouId(Integer bouId) {
        this.bouId = bouId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getGoSpec() {
        return goSpec;
    }

    public void setGoSpec(String goSpec) {
        this.goSpec = goSpec == null ? null : goSpec.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }
}
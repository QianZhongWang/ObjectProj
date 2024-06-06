package com.serial;

import java.io.Serializable;

public class Product implements Serializable {
    private String ProductId;
    private String ProductName;
    private String ProductCategory;
    private double productPrice;
    
    public Product() {
    }

    public Product(String productId, String productName, String productCategory, double productPrice) {
        ProductId = productId;
        ProductName = productName;
        ProductCategory = productCategory;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "产品ID："+ ProductId + ", \n产品名称：" + ProductName + ", \n产品类别：" + ProductCategory + ", \n产品价格：" + productPrice;
    }
}

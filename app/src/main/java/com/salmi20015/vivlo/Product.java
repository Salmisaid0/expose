package com.salmi20015.vivlo;

public class Product {
    private String productName;
    private String productDescription;
    private String productQuantity;
    private String productPrice;
    private String productBrand;
    public void Product(String productName,String productDescription,String productQuantity,String productPrice,String productBrand){
        this.productName=productName;
        this.productDescription=productDescription;
        this.productQuantity=productQuantity;
        this.productPrice=productPrice;
        this.productBrand=productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductQuantity() {
        return productQuantity;
    }
}

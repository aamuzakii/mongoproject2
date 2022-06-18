package com.salatin.mongoproject2.serializer;

import com.salatin.mongoproject2.model.Product;

public class ProductSerializer extends Product {

  private int intPrice;

  public ProductSerializer(Product param) {
    this.setName(param.getName());
    this.setPrice(param.getPrice());
    this.setImage_url(param.getImage_url());
    this.setId(param.getId());
    this.setCategory(param.getCategory());
    this.intPrice = param.getPrice();

    System.out.println(param.toString());
  }

  public int getInt_price() {
    return intPrice;
  }

  public void setInt_price(int intPrice) {
    this.intPrice = intPrice;
  }
}
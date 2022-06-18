package com.salatin.mongoproject2.serializer;

import com.salatin.mongoproject2.model.Product;

public class ProductSerializer extends Product {

  private int intPrice;

  ProductSerializer() {
    this.intPrice = 123;
    System.out.println(super.image_url);
    System.out.println(this.image_url);
    System.out.println(image_url);
  }

  public int getInt_price() {
    return intPrice;
  }

  public void setInt_price(int intPrice) {
    this.intPrice = intPrice;
  }
}
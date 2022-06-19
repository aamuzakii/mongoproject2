package com.salatin.mongoproject2.serializer;

import com.salatin.mongoproject2.model.Category;
import com.salatin.mongoproject2.model.Product;

import java.util.Optional;

public class ProductSerializer extends Product {

  private int intPrice;
  private Optional category;

  public ProductSerializer(Product param) {
    this.setName(param.getName());
    this.setPrice(param.getPrice());
    this.setImage_url(param.getImage_url());
    this.setId(param.getId());
    this.intPrice = param.getPrice();

  }

  public int getInt_price() {
    return intPrice;
  }

  public void setInt_price(int intPrice) {
    this.intPrice = intPrice;
  }

  public Optional getCategory() {
    return category;
  }

  public void setCategory(Optional category) {
    this.category = category;
  }
}
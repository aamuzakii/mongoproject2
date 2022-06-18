package com.salatin.mongoproject2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

  @Id
  private String id;
  private String additional_info;
  private String order_note;
  private String delivery_note;
  private String delivery_date;
  private String order_number;
  private String status;
  private String delivery_cost;
  private String subtotal;
  private String customer_id;
  private String total;

  public Order() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAdditional_info() {
    return additional_info;
  }

  public void setAdditional_info(String additional_info) {
    this.additional_info = additional_info;
  }

  public String getOrder_note() {
    return order_note;
  }

  public void setOrder_note(String order_note) {
    this.order_note = order_note;
  }

  public String getDelivery_note() {
    return delivery_note;
  }

  public void setDelivery_note(String delivery_note) {
    this.delivery_note = delivery_note;
  }

  public String getDelivery_date() {
    return delivery_date;
  }

  public void setDelivery_date(String delivery_date) {
    this.delivery_date = delivery_date;
  }

  public String getOrder_number() {
    return order_number;
  }

  public void setOrder_number(String order_number) {
    this.order_number = order_number;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDelivery_cost() {
    return delivery_cost;
  }

  public void setDelivery_cost(String delivery_cost) {
    this.delivery_cost = delivery_cost;
  }

  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public String getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(String customer_id) {
    this.customer_id = customer_id;
  }

  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }
}
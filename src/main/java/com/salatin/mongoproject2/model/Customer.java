package com.salatin.mongoproject2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {

  @Id
  private String id;
  private String name;
  private String phone;
  private String access_type;
  private String pofile_photo;
  private String google_id;
  private String password;

  public Customer() {
  }

  public Customer(String id, String name, String phone, String access_type, String pofile_photo, String google_id,
      String password) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.access_type = access_type;
    this.pofile_photo = pofile_photo;
    this.google_id = google_id;
    this.password = password;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getAccess_type() {
    return access_type;
  }
  public void setAccess_type(String access_type) {
    this.access_type = access_type;
  }
  public String getPofile_photo() {
    return pofile_photo;
  }
  public void setPofile_photo(String pofile_photo) {
    this.pofile_photo = pofile_photo;
  }
  public String getGoogle_id() {
    return google_id;
  }
  public void setGoogle_id(String google_id) {
    this.google_id = google_id;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  



}

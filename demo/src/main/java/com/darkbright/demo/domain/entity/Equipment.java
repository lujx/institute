package com.darkbright.demo.domain.entity;

public class Equipment {
  private long id;
  private String name;
  private String type;
  private double price;
  private int number;
  private double total;
  private String storageArea;
  private String remark;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public String getStorageArea() {
    return storageArea;
  }

  public void setStorageArea(String storageArea) {
    this.storageArea = storageArea;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "Equipment{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", price=" + price +
        ", number=" + number +
        ", total=" + total +
        ", storageArea='" + storageArea + '\'' +
        ", remark='" + remark + '\'' +
        '}';
  }
}

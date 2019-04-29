package com.darkbright.demo.core.filter;

/**
 * For filter result.
 *
 * @author boolo
 * @date 2019-01-18 20:11
 **/
public class Filtering {
  private Integer index;
  private Integer size;
  private String sortby;
  private String order;

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getSortby() {
    return sortby;
  }

  public void setSortby(String sortby) {
    this.sortby = sortby;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  @Override
  public String toString() {
    return "Filtering{" +
        "index=" + index +
        ", size=" + size +
        ", sortby='" + sortby + '\'' +
        ", order='" + order + '\'' +
        '}';
  }
}

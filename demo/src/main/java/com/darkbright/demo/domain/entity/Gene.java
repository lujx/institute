package com.darkbright.demo.domain.entity;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-04-26 12:36
 **/
public class Gene {
  private String id;
  private String domain;
  private String kingdom;
  private String phylum;
  private String b_class;
  private String order;
  private String family;
  private String genus;
  private String species;
  private String sequence;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getKingdom() {
    return kingdom;
  }

  public void setKingdom(String kingdom) {
    this.kingdom = kingdom;
  }

  public String getPhylum() {
    return phylum;
  }

  public void setPhylum(String phylum) {
    this.phylum = phylum;
  }

  public String getB_class() {
    return b_class;
  }

  public void setB_class(String b_class) {
    this.b_class = b_class;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  @Override
  public String toString() {
    return "Gene{" +
        "id='" + id + '\'' +
        ", domain='" + domain + '\'' +
        ", kingdom='" + kingdom + '\'' +
        ", phylum='" + phylum + '\'' +
        ", b_class='" + b_class + '\'' +
        ", order='" + order + '\'' +
        ", family='" + family + '\'' +
        ", genus='" + genus + '\'' +
        ", species='" + species + '\'' +
        ", sequence='" + sequence + '\'' +
        '}';
  }
}

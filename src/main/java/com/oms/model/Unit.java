package com.oms.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Table(name = "unit")
public class Unit extends CoreEntity {

  @Column(name = "address")
  private String address;

  @Column(name = "email")
  private String email;

  @Column(name = "fax")
  private String fax;

  @Column(name = "phone")
  private String phone;

  @Column(name = "additional_info")
  private String additionalInfo;

  @JoinColumn(name = "unit_industry_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private UnitIndustry unitIndustry;

  @JoinColumn(name = "unit_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private UnitType unitType;

  @JoinColumn(name="person_id")
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Collection<Person> persons = new LinkedHashSet<>();

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public UnitIndustry getUnitIndustry() {
    return unitIndustry;
  }

  public void setUnitIndustry(UnitIndustry unitIndustry) {
    this.unitIndustry = unitIndustry;
  }

  public Collection<Person> getPersons() {
    return persons;
  }

  public void setPersons(Collection<Person> persons) {
    this.persons = persons;
  }

  public UnitType getUnitType() {
    return unitType;
  }

  public void setUnitType(UnitType unitType) {
    this.unitType = unitType;
  }
}

package com.vpos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class LocationRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private String id;
  private String locationName;
  private String locationCode;
  private String locationType;
  private LocationAddress address;
  private LocationContact contactInfo;
  private Integer replnishmentLocationId;
  private Integer tinNo;
  private Integer taxJudrisdictionId;
  private Integer distributorId;
  private double startingAmount;
  private Integer status;
  private int isLiveLocation;
  private int isLocationOnlline;
  private String assignedUrl;
  private BigDecimal lattitude;
  private BigDecimal longitude;
  private int createdBy;
  private LocalDate createdDate;
  private int modifiedBy;
  private LocalDate modifiedDate;
  
  public LocationRequest() {
    super();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public LocationAddress getAddress() {
    return address;
  }

  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  public LocationContact getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(LocationContact contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Integer getReplnishmentLocationId() {
    return replnishmentLocationId;
  }

  public void setReplnishmentLocationId(Integer replnishmentLocationId) {
    this.replnishmentLocationId = replnishmentLocationId;
  }

  public Integer getTinNo() {
    return tinNo;
  }

  public void setTinNo(Integer tinNo) {
    this.tinNo = tinNo;
  }

  public Integer getTaxJudrisdictionId() {
    return taxJudrisdictionId;
  }

  public void setTaxJudrisdictionId(Integer taxJudrisdictionId) {
    this.taxJudrisdictionId = taxJudrisdictionId;
  }

  public Integer getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Integer distributorId) {
    this.distributorId = distributorId;
  }

  public double getStartingAmount() {
    return startingAmount;
  }

  public void setStartingAmount(double startingAmount) {
    this.startingAmount = startingAmount;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public int getIsLiveLocation() {
    return isLiveLocation;
  }

  public void setIsLiveLocation(int isLiveLocation) {
    this.isLiveLocation = isLiveLocation;
  }

  public int getIsLocationOnlline() {
    return isLocationOnlline;
  }

  public void setIsLocationOnlline(int isLocationOnlline) {
    this.isLocationOnlline = isLocationOnlline;
  }

  public String getAssignedUrl() {
    return assignedUrl;
  }

  public void setAssignedUrl(String assignedUrl) {
    this.assignedUrl = assignedUrl;
  }

  public BigDecimal getLattitude() {
    return lattitude;
  }

  public void setLattitude(BigDecimal lattitude) {
    this.lattitude = lattitude;
  }

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public int getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(int createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public int getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(int modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public LocalDate getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(LocalDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

}

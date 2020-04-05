package com.vpos.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vpos.DAO.LocationDAO;
import com.vpos.dto.LocationAddress;
import com.vpos.dto.LocationContact;
import com.vpos.dto.LocationRequest;
import com.vpos.dto.LocationResponse;
import com.vpos.dto.SearchLocationResponse;
import com.vpos.model.Location;

@Service
public class LocationService {

  @Autowired
  private LocationDAO locationDao;

  public LocationResponse createStore(LocationRequest request) {
    LocationResponse response = new LocationResponse();
    Location location = new Location();
    if (request.getId() == null) {
      LocalDate date = LocalDate.now();

      /* ************ Location Address DTO *********************/
      LocationAddress address = new LocationAddress();
      address.setAddress1(request.getAddress().getAddress1());
      address.setAddress2(request.getAddress().getAddress2());
      address.setAddress3(request.getAddress().getAddress3());
      address.setPincode(request.getAddress().getPincode());
      address.setCityId(request.getAddress().getCityId());
      address.setStateId(request.getAddress().getStateId());
      address.setCountryId(request.getAddress().getCountryId());
      location.setAddress(address);
      /***************** Location COntact Info ********************/
      LocationContact contactInfo = new LocationContact();
      contactInfo.setEmailId(request.getContactInfo().getEmailId());
      contactInfo.setMobileNo(request.getContactInfo().getMobileNo());
      contactInfo.setFax(
          request.getContactInfo().getFax() == null ? "" : request.getContactInfo().getFax());
      contactInfo.setPhoneNo(request.getContactInfo().getPhoneNo());
      location.setContactInfo(contactInfo);

      location.setAssignedUrl(request.getAssignedUrl());
      location.setCreatedBy(request.getCreatedBy());
      location.setDistributorId(request.getDistributorId());
      location.setIsLiveLocation(request.getIsLiveLocation());
      location.setIsLocationOnlline(request.getIsLocationOnlline());
      location.setLattitude(request.getLattitude());
      location.setLongitude(request.getLongitude());
      location.setLocationCode(request.getLocationCode());
      location.setLocationName(request.getLocationName());
      location.setLocationType(request.getLocationType());
      location.setModifiedBy(request.getModifiedBy());
      location.setReplnishmentLocationId(request.getReplnishmentLocationId());
      location.setStartingAmount(request.getStartingAmount());
      location.setStatus(request.getStatus());
      location.setTaxJudrisdictionId(request.getTaxJudrisdictionId());
      location.setTinNo(request.getTinNo());
      location.setCreatedDate(date);
      location.setModifiedDate(date);

      locationDao.save(location);

      response.setStatus("SUCCESS");
      response.setMessage("Location save successfully.");
    } else {
      response.setStatus("FAILED");
      response.setMessage("Server is tempoarary down.");
    }

    return response;
  }

  public SearchLocationResponse findLocations() {
    SearchLocationResponse response = new SearchLocationResponse();
    List<Location> locations = new ArrayList<Location>();
    List<LocationRequest> locationResponse = new ArrayList<LocationRequest>();
    locations = locationDao.findAll();
    if (locations != null & locations.size() > 0) {
      locations.stream().forEach((location) -> {
        LocationRequest res = new LocationRequest();
        res.setAddress(this.mapLocationAddress(location));
        res.setContactInfo(this.mapLocationContact(location));
        res.setAssignedUrl(location.getAssignedUrl());
        res.setCreatedBy(location.getCreatedBy());
        res.setDistributorId(location.getDistributorId());
        res.setIsLiveLocation(location.getIsLiveLocation());
        res.setIsLocationOnlline(location.getIsLocationOnlline());
        res.setLattitude(location.getLattitude());
        res.setLongitude(location.getLongitude());
        res.setLocationCode(location.getLocationCode());
        res.setLocationName(location.getLocationName());
        res.setLocationType(location.getLocationType());
        res.setModifiedBy(location.getModifiedBy());
        res.setReplnishmentLocationId(location.getReplnishmentLocationId());
        res.setStartingAmount(location.getStartingAmount());
        res.setStatus(location.getStatus());
        res.setTaxJudrisdictionId(location.getTaxJudrisdictionId());
        res.setTinNo(location.getTinNo());
        res.setCreatedDate(location.getCreatedDate());
        res.setModifiedDate(location.getModifiedDate());
        locationResponse.add(res);
      });
      response.setData(locationResponse);
      response.setStatus("SUCCESS");
      response.setMessage("Records found successfully.");
    } else {
      response.setStatus("FAILED");
      response.setMessage("No Records found.");
    }


    return response;
  }

  public LocationAddress mapLocationAddress(Location location) {
    LocationAddress address = new LocationAddress();
    address.setAddress1(location.getAddress().getAddress1());
    address.setAddress2(location.getAddress().getAddress2());
    address.setAddress3(location.getAddress().getAddress3());
    address.setPincode(location.getAddress().getPincode());
    address.setCityId(location.getAddress().getCityId());
    address.setStateId(location.getAddress().getStateId());
    address.setCountryId(location.getAddress().getCountryId());
    return address;
  }

  public LocationContact mapLocationContact(Location location) {
    LocationContact contactInfo = new LocationContact();
    contactInfo.setEmailId(location.getContactInfo().getEmailId());
    contactInfo.setMobileNo(location.getContactInfo().getMobileNo());
    contactInfo.setFax(
        location.getContactInfo().getFax() == null ? "" : location.getContactInfo().getFax());
    contactInfo.setPhoneNo(location.getContactInfo().getPhoneNo());
    return contactInfo;
  }


}

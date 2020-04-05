package com.vpos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vpos.dto.LocationRequest;
import com.vpos.dto.LocationResponse;
import com.vpos.dto.SearchLocationResponse;
import com.vpos.service.LocationService;

@RestController
public class LocationController {
  
  @Autowired
  private LocationService locationService;
  
  @PostMapping(value="/saveLocation")
  public ResponseEntity<?> createLocation(@RequestBody LocationRequest request) throws Exception{
    LocationResponse response = null;
    if(request != null) {
        response = locationService.createStore(request);
    }else {
      throw new Exception("request can be empty..!");
    }
    return new ResponseEntity<LocationResponse>(response, HttpStatus.OK);
  }
  
  @GetMapping(value="/locations")
  public ResponseEntity<?> searchLocations(){
    SearchLocationResponse response = new SearchLocationResponse();
    response = locationService.findLocations();    
    return new ResponseEntity<SearchLocationResponse>(response, HttpStatus.OK);
  }

}

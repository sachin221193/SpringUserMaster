package com.vpos.dto;

import java.util.List;

public class SearchLocationResponse extends ApiResponse {
  private List<LocationRequest> data;

  public List<LocationRequest> getData() {
    return data;
  }

  public void setData(List<LocationRequest> data) {
    this.data = data;
  }
  

}

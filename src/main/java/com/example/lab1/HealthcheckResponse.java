package com.example.lab1;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class HealthcheckResponse {
  private final Integer status;
  private final String timestamp;

  public HealthcheckResponse(Integer status) {
    this.status = status;
    this.timestamp = getCurrentTimestampWithManualOffset();
  }

  private String getCurrentTimestampWithManualOffset() {
    ZonedDateTime utcTime = ZonedDateTime.now(ZoneOffset.UTC);

    ZonedDateTime timeWithOffset = utcTime.plusHours(3);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return timeWithOffset.format(formatter);
  }

  public Integer getStatus() {
    return status;
  }

  public String getTimestamp() {
    return timestamp;
  }
}


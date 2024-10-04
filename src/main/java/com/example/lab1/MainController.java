package com.example.lab1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/healthcheck")
  public ResponseEntity<HealthcheckResponse> healthcheck() {
    return ResponseEntity.ok(new HealthcheckResponse(HttpStatus.OK.value()));
  }
}

package com.example.springjpaintro.client;

import com.example.springjpaintro.dto.entry.external.ExternalEntryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EntryClient {

  public ExternalEntryResponse getEntryResponse() {

    RestTemplate rt = new RestTemplate();

    String url = "https://api.publicapis.org/entries?Cors=no";

    ExternalEntryResponse response = rt.getForObject(url, ExternalEntryResponse.class);

    return response;

  }

}

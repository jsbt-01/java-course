package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.entry.internal.EntryResponse;
import com.example.springjpaintro.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

  @Autowired
  private EntryService entryService;

  @GetMapping("entries")
  public EntryResponse getEntryResponse() {

    return entryService.getEntryResponse();

  }

}

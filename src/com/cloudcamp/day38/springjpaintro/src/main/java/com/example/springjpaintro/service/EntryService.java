package com.example.springjpaintro.service;

import com.example.springjpaintro.client.EntryClient;
import com.example.springjpaintro.dto.entry.external.ExternalEntry;
import com.example.springjpaintro.dto.entry.external.ExternalEntryResponse;
import com.example.springjpaintro.dto.entry.internal.Entry;
import com.example.springjpaintro.dto.entry.internal.EntryResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

  @Autowired
  private EntryClient entryClient;

  public EntryResponse getEntryResponse() {

    ExternalEntryResponse response = entryClient.getEntryResponse();

    EntryResponse entryResponse = mapToEntryResponse(response);

    return entryResponse;

  }

  private EntryResponse mapToEntryResponse(ExternalEntryResponse externalEntryResponse) {
    EntryResponse response = new EntryResponse();
    response.setCount(externalEntryResponse.getCount());

    List<Entry> entries = new ArrayList<>();
    for (ExternalEntry externalEntry : externalEntryResponse.getEntries()) {
      Entry entry = new Entry();
      entry.setApi(externalEntry.getApi());
      entry.setAuth(externalEntry.getAuth());
      entry.setCors(externalEntry.getCors());
      entry.setSecure(externalEntry.isHttps());
      entry.setUrl(externalEntry.getLink());
      entry.setDescription(externalEntry.getDescription());

      entries.add(entry);
    }

    response.setEntries(entries);

    return response;
  }

}

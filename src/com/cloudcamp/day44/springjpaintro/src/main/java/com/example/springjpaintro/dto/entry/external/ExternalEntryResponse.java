package com.example.springjpaintro.dto.entry.external;

import java.util.List;

public class ExternalEntryResponse {
	private int count;
	private List<ExternalEntry> entries;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<ExternalEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<ExternalEntry> entries) {
		this.entries = entries;
	}
}
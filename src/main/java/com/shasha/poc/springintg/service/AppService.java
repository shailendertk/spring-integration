package com.shasha.poc.springintg.service;

import com.shasha.poc.springintg.dto.Borrower;
import com.shasha.poc.springintg.dto.Response;

public interface AppService {
	Response postMessage(Borrower borrower);
}

package com.knlkshyp.coronavirustracker.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoronaVirusTrackerService {

    public List<Object> getCoronaVirusStatistics();
}

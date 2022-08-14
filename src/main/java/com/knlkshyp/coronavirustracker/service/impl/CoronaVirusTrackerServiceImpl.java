package com.knlkshyp.coronavirustracker.service.impl;

import com.knlkshyp.coronavirustracker.service.CoronaVirusTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

import static com.knlkshyp.coronavirustracker.util.CoronaVirusTrackerUtil.CORONA_VIRUS_STATISTICS_URL;

@Service
public class CoronaVirusTrackerServiceImpl implements CoronaVirusTrackerService {

    @Autowired
    WebClient.Builder webClientBuilder;

    @Override
    public List<Object> getCoronaVirusStatistics() {
        Object[] data = webClientBuilder.baseUrl(CORONA_VIRUS_STATISTICS_URL)
                .build()
                .get()
                .retrieve()
                .bodyToMono(Object[].class)
                .block();
        return Arrays.asList(data);
    }
}

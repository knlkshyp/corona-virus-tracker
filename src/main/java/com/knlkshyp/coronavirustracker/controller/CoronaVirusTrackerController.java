package com.knlkshyp.coronavirustracker.controller;

import com.knlkshyp.coronavirustracker.service.CoronaVirusTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.knlkshyp.coronavirustracker.util.CoronaVirusTrackerUtil.CORONA_VIRUS_TRACKER_URL;

@RestController
public class CoronaVirusTrackerController {

    @Autowired
    CoronaVirusTrackerService coronaVirusTrackerService;

    @GetMapping(CORONA_VIRUS_TRACKER_URL)
    public ResponseEntity<Object> getCoronaVirusStatistics() {
        return ResponseEntity.ok(coronaVirusTrackerService.getCoronaVirusStatistics());
    }
}

package com.klu.MS_Station_Service;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @PostMapping
    public Station createStation(@RequestBody Station station) {
        return stationService.saveStation(station);
    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }
}
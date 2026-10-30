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

    // CREATE
    @PostMapping
    public Station createStation(@RequestBody Station station) {
        return stationService.saveStation(station);
    }

    // READ ALL
    @GetMapping
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Station getStationById(@PathVariable Long id) {
        return stationService.getStationById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Station updateStation(
            @PathVariable Long id,
            @RequestBody Station station) {
        return stationService.updateStation(id, station);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStation(@PathVariable Long id) {
        return stationService.deleteStation(id);
    }
}
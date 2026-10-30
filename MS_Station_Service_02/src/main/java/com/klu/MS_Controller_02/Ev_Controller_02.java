
package com.klu.MS_Controller_02;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klu.MS_Model.Ev_Station_02;
import com.klu.MS_Service_02.Ev_Service_02;

@RestController
@RequestMapping("/stations2")

public class Ev_Controller_02 {

    private final Ev_Service_02 service;

    public Ev_Controller_02(Ev_Service_02 service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Ev_Station_02 createStation(
            @RequestBody Ev_Station_02 station) {
        return service.saveStation(station);
    }

    // READ ALL
    @GetMapping
    public List<Ev_Station_02> getAllStations() {
        return service.getAllStations();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Ev_Station_02 getStationById(@PathVariable Long id) {
        return service.getStationById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Ev_Station_02 updateStation(
            @PathVariable Long id,
            @RequestBody Ev_Station_02 station) {
        return service.updateStation(id, station);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStation(@PathVariable Long id) {
        return service.deleteStation(id);
    }
}


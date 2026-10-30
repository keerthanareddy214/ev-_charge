
package com.klu.MS_Service_02;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.MS_Model.Ev_Station_02;
import com.klu.MS_Repository_02.Ev_Repository_02;

@Service
public class Ev_Service_02 {

    private final Ev_Repository_02 repository;

    public Ev_Service_02(Ev_Repository_02 repository) {
        this.repository = repository;
    }

    // CREATE
    public Ev_Station_02 saveStation(Ev_Station_02 station) {
        return repository.save(station);
    }

    // READ ALL
    public List<Ev_Station_02> getAllStations() {
        return repository.findAll();
    }

    // READ BY ID
    public Ev_Station_02 getStationById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Station not found: " + id));
    }

    // UPDATE
    public Ev_Station_02 updateStation(
            Long id, Ev_Station_02 updatedStation) {

        Ev_Station_02 existing = getStationById(id);

        existing.setName(updatedStation.getName());
        existing.setLocation(updatedStation.getLocation());
        existing.setTotalSlots(updatedStation.getTotalSlots());
        existing.setAvailableSlots(updatedStation.getAvailableSlots());
        existing.setStatus(updatedStation.getStatus());

        return repository.save(existing);
    }

    // DELETE
    public String deleteStation(Long id) {
        Ev_Station_02 existing = getStationById(id);
        repository.delete(existing);

        return "Station deleted successfully";
    }
}

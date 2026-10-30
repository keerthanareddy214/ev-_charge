package com.klu.MS_Station_Service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StationService {

	private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    // CREATE
    public Station saveStation(Station station) {
        return stationRepository.save(station);
    }

    // READ ALL
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }

    // READ BY ID
    public Station getStationById(Long id) {
        return stationRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Station not found with ID: " + id));
    }

    // UPDATE
    public Station updateStation(Long id, Station updatedStation) {

        Station existingStation = getStationById(id);

        existingStation.setName(updatedStation.getName());
        existingStation.setLocation(updatedStation.getLocation());
        existingStation.setTotalSlots(updatedStation.getTotalSlots());
        existingStation.setAvailableSlots(updatedStation.getAvailableSlots());
        existingStation.setStatus(updatedStation.getStatus());

        return stationRepository.save(existingStation);
    }

    // DELETE
    public String deleteStation(Long id) {

        Station existingStation = getStationById(id);

        stationRepository.delete(existingStation);

        return "Station deleted successfully";
    }
}
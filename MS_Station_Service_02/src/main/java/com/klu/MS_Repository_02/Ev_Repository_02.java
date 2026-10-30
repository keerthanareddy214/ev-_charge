package com.klu.MS_Repository_02;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.MS_Model.Ev_Station_02;

@Repository
public interface Ev_Repository_02 extends JpaRepository<Ev_Station_02, Long> {

}

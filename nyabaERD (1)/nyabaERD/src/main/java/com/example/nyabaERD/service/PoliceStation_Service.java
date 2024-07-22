package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.PoliceStation;

import java.util.List;

public interface PoliceStation_Service {
    List<PoliceStation> findAll();

    PoliceStation findById(long id);

    PoliceStation save(PoliceStation policeStation);

    void deleteById(long id);
}

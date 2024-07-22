package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.Circuits;

import java.util.List;

public interface Circuits_Service {
    List<Circuits> findAll();

    Circuits findById(long id);

    Circuits save(Circuits circuits);

    void deleteById(long id);
}

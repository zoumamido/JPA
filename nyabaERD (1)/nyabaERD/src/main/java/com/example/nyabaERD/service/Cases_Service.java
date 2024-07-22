package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.Cases;

import java.util.List;

public interface Cases_Service {

    List<Cases> finAll();
    Cases findById(long id);
    Cases save(Cases newCase);
    void deleteCaseById(long id);

}

package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.ApplicableLaw;

import java.util.List;

public interface ApplicableLaw_Service {

    List<ApplicableLaw> findAll();

    ApplicableLaw findById(long id);

    ApplicableLaw save(ApplicableLaw applicableLaw);

    void deleteById(long id);
}

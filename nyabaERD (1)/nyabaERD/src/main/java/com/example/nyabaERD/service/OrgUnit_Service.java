package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.OrgUnit;

import java.util.List;

public interface OrgUnit_Service {

    List<OrgUnit> findAll();

    OrgUnit findById(long id);

    OrgUnit save(OrgUnit orgUnit);

    void deleteById(long id);
}

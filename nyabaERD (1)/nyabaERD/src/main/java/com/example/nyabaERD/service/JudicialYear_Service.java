package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.Circuits;
import com.example.nyabaERD.entity.JudicialYear;

import java.util.List;

public interface JudicialYear_Service {

    List<JudicialYear> findAll();

    JudicialYear findById(long id);

    JudicialYear save(JudicialYear judicialYear);

    void deleteById(long id);
}

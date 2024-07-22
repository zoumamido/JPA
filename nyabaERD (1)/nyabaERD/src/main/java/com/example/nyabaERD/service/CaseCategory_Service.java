package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.CaseCategory;

import java.util.List;

public interface CaseCategory_Service {
    List<CaseCategory>  findall();

    CaseCategory findById(long id);

    CaseCategory save(CaseCategory caseCategory);

    void deleteById(long id);
}

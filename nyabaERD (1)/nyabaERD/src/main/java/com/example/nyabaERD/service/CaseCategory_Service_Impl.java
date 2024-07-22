package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.CaseCategory;
import com.example.nyabaERD.repos.CasesCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseCategory_Service_Impl implements CaseCategory_Service {

    private CasesCategoryRepo casesCategoryRepo;

    @Autowired
    public CaseCategory_Service_Impl(CasesCategoryRepo casesCategoryRepo) {
        this.casesCategoryRepo = casesCategoryRepo;
    }

    @Override
    public List<CaseCategory> findall() {
        return casesCategoryRepo.findAll();
    }

    @Override
    public CaseCategory findById(long id) {
        Optional<CaseCategory> result = casesCategoryRepo.findById(id);
        CaseCategory tempCaseCategory = null;
        if(result.isPresent()){
            tempCaseCategory=result.get();
        }
        else{
            throw new RuntimeException("can not find case category with this id:"+id);
        }
        return tempCaseCategory;
    }

    @Override
    public CaseCategory save(CaseCategory caseCategory) {
        return casesCategoryRepo.save(caseCategory);
    }

    @Override
    public void deleteById(long id) {
        casesCategoryRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

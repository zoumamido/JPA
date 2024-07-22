package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.Cases;
import com.example.nyabaERD.repos.CasesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Cases_Service_Impl implements Cases_Service{

    private CasesRepo casesRepo;


    @Autowired
    Cases_Service_Impl(CasesRepo casesRepo){
        this.casesRepo = casesRepo;
    }


    @Override
    public List<Cases> finAll() {
        return casesRepo.findAll();
    }

    @Override
    public Cases findById(long id) {
        Optional<Cases> result = casesRepo.findById(id);

        Cases tempCase = null;

        if(result.isPresent()){
            tempCase = result.get();
        }
        else {
            throw new RuntimeException("can not find the case with this id"+id);
        }
        return tempCase ;
    }

    @Override
    public Cases save(Cases newCase) {
        return casesRepo.save(newCase);
    }

    @Override
    public void deleteCaseById(long id) {
        casesRepo.deleteById(id);
    }
}

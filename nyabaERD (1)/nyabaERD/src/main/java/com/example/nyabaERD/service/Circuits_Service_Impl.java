package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.Circuits;
import com.example.nyabaERD.entity.OrgUnit;
import com.example.nyabaERD.repos.CircuitsRepo;
import com.example.nyabaERD.repos.OrgUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Circuits_Service_Impl implements Circuits_Service{


    private CircuitsRepo circuitsRepo;
    private OrgUnitRepo orgUnitRepo;

    @Autowired
    public Circuits_Service_Impl(CircuitsRepo circuitsRepo,OrgUnitRepo orgUnitRepo) {
        this.circuitsRepo = circuitsRepo;
        this.orgUnitRepo = orgUnitRepo;
    }

    @Override
    public List<Circuits> findAll() {
        return circuitsRepo.findAll();
    }

    @Override
    public Circuits findById(long id) {
        Optional<Circuits> result = circuitsRepo.findById(id);
        Circuits tempCircuit = null;
        if(result.isPresent()){
            tempCircuit = result.get();
        }
        else {
            throw new RuntimeException("can not find Circuit with this id :"+id);
        }
        return tempCircuit;
    }

    @Override
    public Circuits save(Circuits circuits) {
        return circuitsRepo.save(circuits);
    }

    @Override
    public void deleteById(long id) {
        circuitsRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

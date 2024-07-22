package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.PoliceStation;
import com.example.nyabaERD.repos.PoliceStationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoliceStation_Service_Impl implements PoliceStation_Service{
    private PoliceStationRepo policeStationRepo;

    @Autowired
    public PoliceStation_Service_Impl(PoliceStationRepo policeStationRepo) {
        this.policeStationRepo = policeStationRepo;
    }

    @Override
    public List<PoliceStation> findAll() {
        return policeStationRepo.findAll();
    }

    @Override
    public PoliceStation findById(long id) {
        Optional<PoliceStation> result = policeStationRepo.findById(id);
        PoliceStation tempPoliceStation = null;
        if(result.isPresent()){
            tempPoliceStation = result.get();
        }
        else{
            throw new RuntimeException("can not find police staion with id: "+id);
        }
        return tempPoliceStation;
    }

    @Override
    public PoliceStation save(PoliceStation policeStation) {
        return policeStationRepo.save(policeStation);
    }

    @Override
    public void deleteById(long id) {
        policeStationRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

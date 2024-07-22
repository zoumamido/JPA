package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.OrgUnit;
import com.example.nyabaERD.repos.OrgUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrgUnit_Service_Impl implements OrgUnit_Service{

    private OrgUnitRepo orgUnitRepo;

    @Autowired
    public OrgUnit_Service_Impl(OrgUnitRepo orgUnitRepo) {
        this.orgUnitRepo = orgUnitRepo;
    }

    @Override
    public List<OrgUnit> findAll() {
        return orgUnitRepo.findAll();
    }

    @Override
    public OrgUnit findById(long id) {
        Optional<OrgUnit> result = orgUnitRepo.findById(id);
        OrgUnit tempOrgUnit = null;
        if(result.isPresent()){
            tempOrgUnit = result.get();
        }
        else{
            throw new RuntimeException("can not find org unit with id: "+id);
        }
        return tempOrgUnit;
    }

    @Override
    public OrgUnit save(OrgUnit orgUnit) {
        return orgUnitRepo.save(orgUnit);
    }

    @Override
    public void deleteById(long id) {
        orgUnitRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

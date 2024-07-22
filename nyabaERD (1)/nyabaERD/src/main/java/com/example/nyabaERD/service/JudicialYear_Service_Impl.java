package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.JudicialYear;
import com.example.nyabaERD.repos.JudicialYearRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class JudicialYear_Service_Impl implements JudicialYear_Service{

    private JudicialYearRepo judicialYearRepo;

    @Autowired
    public JudicialYear_Service_Impl(JudicialYearRepo judicialYearRepo) {
        this.judicialYearRepo = judicialYearRepo;
    }



    @Override
    public List<JudicialYear> findAll() {
        return judicialYearRepo.findAll();
    }

    @Override
    public JudicialYear findById(long id) {
        Optional<JudicialYear> result = judicialYearRepo.findById(id);
        JudicialYear tempJudicialYear = null;
        if(result.isPresent()){
            tempJudicialYear = result.get();
        }
        else {
            throw new RuntimeException("can not find judicial year with id:"+id);
        }
        return tempJudicialYear;
    }

    @Override
    public JudicialYear save(JudicialYear judicialYear) {
        return judicialYearRepo.save(judicialYear);
    }

    @Override
    public void deleteById(long id) {
        judicialYearRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

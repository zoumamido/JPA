package com.example.nyabaERD.service;

import com.example.nyabaERD.entity.ApplicableLaw;
import com.example.nyabaERD.repos.ApplicableLawRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicableLaw_Service_impl implements ApplicableLaw_Service {

    private ApplicableLawRepo applicableLawRepo;


    @Autowired
    public ApplicableLaw_Service_impl(ApplicableLawRepo applicableLawRepo) {
        this.applicableLawRepo = applicableLawRepo;
    }

    @Override
    public List<ApplicableLaw> findAll() {
        return applicableLawRepo.findAll();
    }

    @Override
    public ApplicableLaw findById(long id) {

        Optional<ApplicableLaw> result =  applicableLawRepo.findById(id);

        ApplicableLaw tempapplicableLaw = null;

        if(result.isPresent()){
            tempapplicableLaw = result.get();
        }
        else {
            throw new RuntimeException("can not find the Applicable law with the id:"+id);
        }

        return tempapplicableLaw;
    }

    @Override
    public ApplicableLaw save(ApplicableLaw applicableLaw) {
        return applicableLawRepo.save(applicableLaw);
    }

    @Override
    public void deleteById(long id) {
        applicableLawRepo.deleteById(id);
        System.out.println("deleted successfully");
    }
}

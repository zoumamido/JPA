package com.example.nyabaERD.repos;


import com.example.nyabaERD.entity.CaseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasesCategoryRepo extends JpaRepository<CaseCategory, Long> {
}

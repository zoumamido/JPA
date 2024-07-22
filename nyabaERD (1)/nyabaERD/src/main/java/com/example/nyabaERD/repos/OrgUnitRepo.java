package com.example.nyabaERD.repos;

import com.example.nyabaERD.entity.OrgUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "OrgUnit",path = "orgunits")
public interface OrgUnitRepo extends JpaRepository<OrgUnit, Long> {
}

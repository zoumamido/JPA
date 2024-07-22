package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity(name ="org_unit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrgUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long orgUnitId;

    @Column(name = "name")
    private String orgUniName;

    @Column(name = "address")
    private String orgUnitAddress;


//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "orgUnit")
//    private Set<Cases> cases;
//
//    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "orgUnit1")
//    private Set<Circuits> circuits;



    @Override
    public String toString() {
        return "OrgUnit{" +
                "orgUnitId=" + orgUnitId +
                ", orgUniName='" + orgUniName + '\'' +
                ", orgUnitAddress='" + orgUnitAddress + '\'' +
                '}';
    }
}

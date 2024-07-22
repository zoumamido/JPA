package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name  = "case_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaseCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "id")
    private long categoryId;

    @Column(name = "name")
    private String categoryName;

//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "caseCategory")
//    private Set<Cases> cases;

    @Override
    public String toString() {
        return "CaseCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

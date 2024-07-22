package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Year;
import java.util.Set;

@Entity(name = "judicial_year")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JudicialYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long yearId;

    @Column(name = "jud_year")
    private Year judYear;


//
//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "judicialYear")
//    private Set<Cases> cases;
}

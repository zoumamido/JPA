package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "circuits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circuits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long circuitId;

    @Column(name = "name")
    private String circuitName;

    @Column(name = "address")
    private String circuitAddress;

    @ManyToOne
    @JoinColumn(name ="orgUnitId")
    private OrgUnit orgUnit1;

//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "circuit")
//    private Set<Cases> cases;
    

    @Override
    public String toString() {
        return "Circuits{" +
                "circuitId=" + circuitId +
                ", circuitName='" + circuitName + '\'' +
                ", circuitAddress='" + circuitAddress + '\'' +
                ", orgUnit=" + orgUnit1 +
                '}';
    }
}

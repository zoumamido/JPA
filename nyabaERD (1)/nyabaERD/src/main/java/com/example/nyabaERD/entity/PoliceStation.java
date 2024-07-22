package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "police_station")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PoliceStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long stationId;

    @Column(name = "name")
    private String stationName;

    @Column(name  = "address")
    private String stationAddress;

//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "policeStation")
//    private Set<Cases> cases;


    @Override
    public String toString() {
        return "PoliceStation{" +
                "stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", stationAddress='" + stationAddress + '\'' +
                '}';
    }
}

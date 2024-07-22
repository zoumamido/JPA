package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "apllicable_law")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicableLaw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long lawID;

    @Column(name = "law")
    private String law;

//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "applicableLaw")
//    private Set<Cases> cases;

    @Override
    public String toString() {
        return "ApplicableLaw{" +
                "lawID=" + lawID +
                ", law='" + law + '\'' +
                '}';
    }
}

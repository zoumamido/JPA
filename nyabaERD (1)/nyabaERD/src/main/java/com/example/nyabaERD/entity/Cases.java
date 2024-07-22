package com.example.nyabaERD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity(name = "cases")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long casesId;

    @Column(name = "name")
    private String casesName;

    @Column(name = "address")
    private String casesAddress;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name ="orgUnitId", nullable = false)
    private OrgUnit orgUnit;

    @ManyToOne
    @JoinColumn(name ="circuitId", nullable = false)
    private Circuits circuit;

    @ManyToOne
    @JoinColumn(name ="stationId", nullable = false)
    private PoliceStation policeStation;

    @ManyToOne
    @JoinColumn(name ="categoryId", nullable = false)
    private CaseCategory caseCategory;

    @ManyToOne
    @JoinColumn(name ="lawID", nullable = false)
    private ApplicableLaw applicableLaw;

    @ManyToOne
    @JoinColumn(name ="yearId", nullable = false)
    private JudicialYear judicialYear;

    @Override
    public String toString() {
        return "Cases{" +
                "casesId=" + casesId +
                ", casesName='" + casesName + '\'' +
                ", casesAddress='" + casesAddress + '\'' +
                ", createdDate=" + createdDate +
                ", orgUnit=" + orgUnit +
                ", circuit=" + circuit +
                ", policeStation=" + policeStation +
                ", caseCategory=" + caseCategory +
                ", applicableLaw=" + applicableLaw +
                ", judicialYear=" + judicialYear +
                '}';
    }
}

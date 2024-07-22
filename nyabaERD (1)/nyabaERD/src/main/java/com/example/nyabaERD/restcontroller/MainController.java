package com.example.nyabaERD.restcontroller;

import com.example.nyabaERD.entity.*;
import com.example.nyabaERD.repos.OrgUnitRepo;
import com.example.nyabaERD.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {
    private ApplicableLaw_Service applicableLawService;
    private CaseCategory_Service caseCategoryService;
    private Circuits_Service circuitsService;
    private JudicialYear_Service judicialYearService;
    private OrgUnit_Service orgUnitService;
    private PoliceStation_Service policeStationService;
    private Cases_Service casesService;
@Autowired
    public MainController(ApplicableLaw_Service applicableLawService, CaseCategory_Service caseCategoryService, Circuits_Service circuitsService, JudicialYear_Service judicialYearService, OrgUnit_Service orgUnitService, PoliceStation_Service policeStationService, Cases_Service casesService) {
        this.applicableLawService = applicableLawService;
        this.caseCategoryService = caseCategoryService;
        this.circuitsService = circuitsService;
        this.judicialYearService = judicialYearService;
        this.orgUnitService = orgUnitService;
        this.policeStationService = policeStationService;
        this.casesService = casesService;
    }

    @PostMapping("/ApplicableLaws/insert")
    public ApplicableLaw insertAppl(@RequestBody ApplicableLaw applicableLaw){
        ApplicableLaw applicableLaw1 = applicableLawService.save(applicableLaw);
        return applicableLaw1;
    }

    @PostMapping("/CaseCategory/insert")
    public CaseCategory insertCaseCat(@RequestBody CaseCategory caseCategory){
        CaseCategory caseCategory1 = caseCategoryService.save(caseCategory);
        return caseCategory1;
    }

    @PostMapping("/Cases/insert")
    public Cases insertCase(@RequestBody Cases cases){
        // creating ids of the foreign keys
        long org_id = cases.getOrgUnit().getOrgUnitId();
        long circuit_id = cases.getCircuit().getCircuitId();
        long caseCategory_id = cases.getCaseCategory().getCategoryId();
        long policeStation_id = cases.getPoliceStation().getStationId();
        long applicableLaw_id = cases.getApplicableLaw().getLawID();
        long judicialYear_id = cases.getJudicialYear().getYearId();
        //creating instances of the entities
        OrgUnit orgUnit = orgUnitService.findById(org_id);
        Circuits circuits = circuitsService.findById(circuit_id);
        CaseCategory caseCategory = caseCategoryService.findById(caseCategory_id);
        PoliceStation policeStation = policeStationService.findById(policeStation_id);
        ApplicableLaw applicableLaw = applicableLawService.findById(applicableLaw_id);
        JudicialYear judicialYear = judicialYearService.findById(judicialYear_id);
        //setting the objects into the cases instance
        cases.setOrgUnit(orgUnit);
        cases.setCircuit(circuits);
        cases.setCaseCategory(caseCategory);
        cases.setApplicableLaw(applicableLaw);
        cases.setPoliceStation(policeStation);
        cases.setJudicialYear(judicialYear);


        return casesService.save(cases);
    }

    @PostMapping("/Circuits/insert")
    public Circuits insertCircuit(@RequestBody Circuits circuits){

        Long id = circuits.getOrgUnit1().getOrgUnitId();
        //System.out.println("there is the id "+ id);
        //problem is here
        OrgUnit orgUnit = orgUnitService.findById(id);


        //////////

        circuits.setOrgUnit1(orgUnit);

        return  circuitsService.save(circuits);
    }

    @PostMapping("/JudicialYear/insert")
    public JudicialYear insertJudicialYear(@RequestBody JudicialYear judicialYear){
        JudicialYear judicialYear1 = judicialYearService.save(judicialYear);
        return judicialYear1;
    }

    @PostMapping("/OrgUnit/insert")
    public OrgUnit insertOrgUnit(@RequestBody OrgUnit orgUnit){
        OrgUnit orgUnit1 = orgUnitService.save(orgUnit);
        return orgUnit1;
    }

    @PostMapping("/PoliceStation/insert")
    public PoliceStation insertPoliceStation(@RequestBody PoliceStation policeStation){
        PoliceStation policeStation1 = policeStationService.save(policeStation);
        return policeStation1;
    }


    @GetMapping("/Cases")
    public List<Cases> findAll(){
        return  casesService.finAll();
    }
}

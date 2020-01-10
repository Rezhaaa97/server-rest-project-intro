package no.oslomet.serverrestproject.controller;

import no.oslomet.serverrestproject.model.Building;
import no.oslomet.serverrestproject.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    BuildingService buildingService;

    @GetMapping("/")
    public String home(){
        return "This is a rest controller  ";
    }

    @GetMapping("/buildings")
    public List<Building> getAllBuildings(){

        return buildingService.getAllBuildings();
    }

    @GetMapping("/buildings/{id}")
    public Building getBuildingById(@PathVariable long id){
        return buildingService.getBuildingById(id);

    }

    @DeleteMapping("/buildings/{id}")
    public void deleteBuildingById(@PathVariable long id){
         buildingService.deleteBuildingById(id);
    }

    @PostMapping("/buildings")
    public Building saveBuilding( @RequestBody  Building newBuilding){
        return buildingService.saveBuilding(newBuilding);
    }

    @PutMapping("/buildings/{id}")
    public Building updateBuilding(@PathVariable long id,  @RequestBody  Building newBuilding){
        newBuilding.setId(id);
        return buildingService.saveBuilding(newBuilding);
    }
}

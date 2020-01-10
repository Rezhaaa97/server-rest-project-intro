package no.oslomet.serverrestproject.service;

import no.oslomet.serverrestproject.model.Building;
import no.oslomet.serverrestproject.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    public List<Building> getAllBuildings(){
        return buildingRepository.findAll();
    }

    public Building getBuildingById(long id){
        return buildingRepository.findById(id).get();
    }

    public Building saveBuilding(Building building){
        return buildingRepository.save(building);
    }

    public void deleteBuildingById(long id ){
        buildingRepository.deleteById(id);
    }

}

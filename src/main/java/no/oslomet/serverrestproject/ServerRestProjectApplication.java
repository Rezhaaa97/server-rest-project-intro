package no.oslomet.serverrestproject;

import no.oslomet.serverrestproject.model.Building;
import no.oslomet.serverrestproject.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerRestProjectApplication implements CommandLineRunner {

    @Autowired
    private BuildingRepository buildingRepository;

    public static void main(String[] args) {
        SpringApplication.run(ServerRestProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       buildingRepository.save(new Building("P35", "Pilestredet 35, Oslo"));
        buildingRepository.save(new Building("P32", "Pilestredet 32, Oslo"));
        buildingRepository.save(new Building("P46", "Pilestredet 46, Oslo"));
        buildingRepository.save(new Building("P48", "Pilestredet 48, Oslo"));
    }
}

package fr.letrangecantina.EC_assistantCreationPersonnage.service;

import fr.letrangecantina.EC_assistantCreationPersonnage.DTO.SpawnExactDinoDTO;
import fr.letrangecantina.EC_assistantCreationPersonnage.model.SpawnExactDino;
import org.springframework.stereotype.Service;

@Service
public class CommandBuildService {

    public SpawnExactDino buildSpawnExactDino(SpawnExactDinoDTO dino) {
        return SpawnExactDino.builder()
                .blueprint(dino.getBlueprint())

                .build();
    }

}

package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.service;

import fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.DTO.SpawnExactDinoDTO;
import fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.model.SpawnExactDino;
import org.springframework.stereotype.Service;

@Service
public class CommandBuildService {

    public SpawnExactDino buildSpawnExactDino(SpawnExactDinoDTO dino) {
        return SpawnExactDino.builder()
                .blueprint(dino.getBlueprint())

                .build();
    }

}

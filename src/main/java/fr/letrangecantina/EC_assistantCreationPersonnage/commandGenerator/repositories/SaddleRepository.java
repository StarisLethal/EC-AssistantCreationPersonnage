package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.repositories;

import fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.model.Saddle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaddleRepository extends JpaRepository<Saddle, Integer> {

    Optional<Saddle> findByName(String saddleName);

}

package fr.letrangecantina.EC_assistantCreationPersonnage.repositories;

import fr.letrangecantina.EC_assistantCreationPersonnage.model.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DinoRepository extends JpaRepository<Dino, Integer> {
    Optional<Dino> findByName(String name);
}

package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.model;

import fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.Saddle;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String dinoBlueprint;

    @OneToMany(mappedBy = "dino", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Saddle> saddles;

}

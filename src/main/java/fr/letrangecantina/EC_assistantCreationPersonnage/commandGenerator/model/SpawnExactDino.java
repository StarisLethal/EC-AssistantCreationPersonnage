package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpawnExactDino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //valeur joueur
    private String blueprint;
    //valeur auto en fonction de blueprint
    private String saddleBlueprint;
    //valeur fixe
    private int saddleQuality;
    //valeur fixe
    private int dinoBaseLevel;
    //valeur fixe
    private int dinoExtraLevel;
    //valeur joueur a gerer en fonction de dinobase level
    private String baseStats;
    //valeur joueur a gerer en fonction de dinoextralevel
    private String extraStats;
    //valeur joueur
    private String dinoName;
    //valeur fixe 0
    private int cloned;
    //valeur fixe 0
    private boolean neutered;
    //valeur fixe ""
    private String tamedDate;
    //valeur fixe ""
    private String uploadFrom;
    //valeur fixe nom du personnage du joueur
    private String imprinterName;
    //valeur fixe 0
    private String imprinterId;
    //valeur fixe 1
    private int imprintQuality;
    //valeur fixe 0
    private int unknowValueSetToZero;
    //valeur joueur exemple "1,2,3,4,5,6" correspond au region de 0 à 5
    private String regionColors;
    //valeur fixe 0
    private int creatureId;
    //valeur fixe longmaxvalue
    private long experienceAmount;
    //valeur fixe
    //TODO ce block ci dessous est à verifier en jeu pour des valeurs correct qui seront défini de base
    private int spawnDistance;
    private int spawnY;
    private int spawnZ;

}

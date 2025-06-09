package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import jakarta.persistence.*;

@Entity
public class ResultType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String code;
    private String label;
}

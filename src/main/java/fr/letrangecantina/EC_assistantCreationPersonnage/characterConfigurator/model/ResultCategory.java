package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import jakarta.persistence.*;

@Entity
public class ResultCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String code;
    private String label;
    private String description;
    //private String icon;

    @ManyToOne
    private ResultType resultType;
}

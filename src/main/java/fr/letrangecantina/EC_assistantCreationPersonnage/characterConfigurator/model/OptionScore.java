package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import jakarta.persistence.*;

@Entity
public class OptionScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private ResultCategory resultCategory;

    private int points;

    @ManyToOne
    private AnswerOption answerOption;
}

package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AnswerOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 5000)
    private String text;

    @ManyToOne
    private Question question;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL)
    private List<OptionScore> scores = new ArrayList<>();
}

package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import jakarta.persistence.*;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;

@Entity
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String code;
    private String label;

    @ManyToOne
    private ResultType resultType;

    @OneToMany(mappedBy = "form", cascade = CascadeType.ALL)
    private List<Question> questions;
}

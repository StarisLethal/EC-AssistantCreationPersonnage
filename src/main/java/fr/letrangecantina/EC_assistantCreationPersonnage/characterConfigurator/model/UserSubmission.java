package fr.letrangecantina.EC_assistantCreationPersonnage.characterConfigurator.model;

import fr.letrangecantina.EC_assistantCreationPersonnage.character.model.Character;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime submissionDate;

    private String resultCode;

    @ManyToOne
    private ResultType resultType;

    @ManyToOne
    private Character character;

    @OneToMany(mappedBy = "submission", cascade = CascadeType.ALL)
    private List<UserAnswer> answers = new ArrayList<>();

}

package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Saddle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String blueprint;

    @ManyToOne
    @JoinColumn(name = "dino_id", nullable = false)
    private Dino dino;
}

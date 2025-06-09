package fr.letrangecantina.EC_assistantCreationPersonnage.commandGenerator.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpawnExactDinoDTO {


    @NotBlank
    private String blueprint;

    @NotBlank
    @Pattern(regexp = "(?:\\d+,){5}\\d+")
    private String baseStats;

    @NotBlank
    @Pattern(regexp = "(?:\\d+,){5}\\d+")
    private String extraStats;

    @NotBlank
    private String dinoName;

    @NotBlank
    @Pattern(regexp = "[^,]+(?:,[^,]+){5}")
    private String regionColors;

    @NotBlank
    private String imprinterName;
}

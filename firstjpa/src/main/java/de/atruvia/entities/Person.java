package de.atruvia.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Person {

    @Id
    private UUID id;
    private String vorname;


    @ElementCollection
    @Builder.Default
    private List<Kontakt> kontakte = new ArrayList<>();
}

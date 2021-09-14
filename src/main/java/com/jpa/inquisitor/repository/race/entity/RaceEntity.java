package com.jpa.inquisitor.repository.race.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "RACE")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RaceEntity {

    private static final String ID_PLAYER = "id_player";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";

    @Id
    private Integer id;

    @Column(name = NAME)
    private String name;

    @Column(name = DESCRIPTION)
    private String description;
}

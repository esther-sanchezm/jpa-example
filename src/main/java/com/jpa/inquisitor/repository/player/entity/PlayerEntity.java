package com.jpa.inquisitor.repository.player.entity;

import com.jpa.inquisitor.repository.character.entity.CharacterEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "PLAYER")
@NoArgsConstructor
public class PlayerEntity {

    @Id
    private Integer id;

    private String name;

    @OneToMany
    private List<CharacterEntity> characters;
}

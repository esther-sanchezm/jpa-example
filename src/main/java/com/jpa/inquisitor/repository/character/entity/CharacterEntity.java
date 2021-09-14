package com.jpa.inquisitor.repository.character.entity;

import com.jpa.inquisitor.repository.player.entity.PlayerEntity;
import com.jpa.inquisitor.repository.spell.entity.SpellEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Data
@Table(name = "CHARACTER")
@Entity
@NoArgsConstructor
public class CharacterEntity {

    private static final String ID_PLAYER = "id_player";
    private static final String NAME = "name";
    private static final String EXPERIENCE = "experience";

    //Generation by sequence
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = NAME)
    private String name;

    @Column(name = EXPERIENCE)
    private Integer experience;

    @Column(name = ID_PLAYER)
    private Integer idPlayer;

    /*
    @ManyToOne
    @JoinColumn(name=ID_PLAYER, nullable=false)
    private PlayerEntity player;*/

    @OneToMany
    private Set<SpellEntity> spells;
}

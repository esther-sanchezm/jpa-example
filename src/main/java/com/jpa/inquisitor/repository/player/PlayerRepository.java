package com.jpa.inquisitor.repository.player;

import com.jpa.inquisitor.repository.player.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

}

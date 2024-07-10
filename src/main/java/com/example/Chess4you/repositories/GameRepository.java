package com.example.Chess4you.repositories;

import com.example.Chess4you.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}

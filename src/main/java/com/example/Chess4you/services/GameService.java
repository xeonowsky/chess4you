package com.example.Chess4you.services;

import com.example.Chess4you.model.Game;
import com.example.Chess4you.model.User;
import com.example.Chess4you.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameService {
    @Autowired
    GameRepository gameRepository;
    public Game CreateGame(User player1, User player2){
        Game game = new Game();
        game.setPlayer1(player1);
        game.setPlayer2(player2);
        game.setStatus("Active");
        return gameRepository.save(game);
    }

}

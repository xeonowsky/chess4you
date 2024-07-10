package com.example.Chess4you.controllers;

import com.example.Chess4you.model.Game;
import com.example.Chess4you.model.User;
import com.example.Chess4you.services.GameService;
import com.example.Chess4you.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/games")
public class GameController {
    @Autowired
    public GameService gameService;
    public UserService userService;


    @PostMapping
    public Game creategame(@RequestParam String playerName1, @RequestParam String playerName2){
        User player1= userService.findByUsername(playerName1).orElseThrow();
        User player2=userService.findByUsername(playerName2).orElseThrow();

        return gameService.CreateGame(player1, player2);

    }




}

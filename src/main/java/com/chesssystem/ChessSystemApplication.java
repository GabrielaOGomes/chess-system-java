package com.chesssystem;

import boardgame.Board;
import boardgame.Position;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessSystemApplication.class, args);

        Board board = new Board(8, 8);

    }

}

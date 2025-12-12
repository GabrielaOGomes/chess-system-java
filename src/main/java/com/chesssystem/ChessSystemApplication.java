package com.chesssystem;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessSystemApplication.class, args);

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }

}

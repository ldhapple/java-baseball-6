package baseball.controller;

import baseball.game.GameManager;

public class Game {
    private GameManager gameManager;
    public Game() {
        this.gameManager = new GameManager();
    }

    public void gameStart() {
        gameManager.startGame();
        while(true) {
            gameManager.inputUserNumber();
            gameManager.showBallCount();

            if (gameManager.checkGameOver()) {
                boolean wantRestart = gameManager.askRestartGame();

                if (wantRestart) {
                    restartGame();
                } else if (!wantRestart) {
                    break;
                }
            }
        }
    }

    private void restartGame() {
        gameManager = new GameManager();
    }
}
package baseball;

import baseball.controller.PlayGameController;

public class Application {
    public static void main(String[] args) {
        PlayGameController playGameController = new PlayGameController();
        playGameController.playing();
    }
}

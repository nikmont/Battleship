package battleship;

public class GameController {
    
    private static GameField game;

    public static void createGameField() {
        game = new GameField();
        game.printField();
    }

    public static void initField() {
        game.fillWithShips();
    }


}

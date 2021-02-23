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
    
    public static void startGame() {
        GameField battlefield1 = new GameField(game.getField());
        System.out.println("The game starts!");
        battlefield1.printField();

        battlefield1.takeShot();
    }


}

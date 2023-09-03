import java.util.Random;

public class Map {
    private final MapObject[][] gameBoard;
    public int height;
    public int width;

    public Map(int Height, int Width) {
        this.height = Height;
        this.width = Width;
        this.gameBoard = new MapObject[height][width];
    }

    Random rnd = new Random();

    public void placeObject(MapObject o) {
        int x = rnd.nextInt(height);
        int y = rnd.nextInt(width);
        gameBoard[x][y] = o;
    }

    public void placeObject(MapObject o, int a, int b) {
        gameBoard[a][b] = o;
    }

    public void showMap() {
        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[r].length; c++) {
                if (gameBoard[r][c] != null)
                    System.out.print(" " + gameBoard[r][c] + " ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public void MoveCharacter(String a, Person person) {
        int x = person.posx;
        int y = person.posy;

        gameBoard[x][y] = null;
        switch (a) {
            case "north" -> {
                x = x - 1;
            }
            case "south" -> {
                x = x + 1;
            }
            case "east" -> {
                y = y + 1;
            }
            case "west" -> {
                y = y - 1;
            }
        }
        person.setPosX(x);
        person.setPosY(y);
        if(gameBoard[x][y]!=null)
            gameBoard[x][y].process(person);
        gameBoard[x][y] = person;
    }
}

//⚫
// ctrl alt L


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class Tests {

    /**
     * Check players start the game in their starting positions
     */
    @Test public void test_01() {
        Game game = new Game();
        String expected =
                "                                    +###+               +###+                                    \n" +
                "                                    # W #               # G #                                    \n" +
                "+###+###+###+###+###+###    +###+###+   +###+###+###+###+   +###+###+   +###+###+###+###+###+###+\n" +
                "#                           #           #               #           #   #                       #\n" +
                "+                       +###+   +###+###+               +###+###+   +###+                       +\n" +
                "#                       #       #                               #       #                       #\n" +
                "+                       +   +   +                               +   +   +     CONSERVATORY      +\n" +
                "#                       #       #                               #       #                       #\n" +
                "+        KITCHEN        +   +   +                               +   +   +                       +\n" +
                "#                       #       #                               #       #                       #\n" +
                "+                       +   +   +           BALL ROOM           +   +   +   +                    \n" +
                "#                       #                                                   #                    \n" +
                "    +                   +   +   +                               +   +   +   +###+###+###+###+###+\n" +
                "    #                   #       #                               #                             P #\n" +
                "+###+###+###+###+   +###+   +   +                               +   +   +   +   +   +   +   +###+\n" +
                "#                               #                               #                           #    \n" +
                "+###+   +   +   +   +   +   +   +###+   +###+###+###+###+   +###+   +###+###+###+###+###+###+###+\n" +
                "    #                                                               #                           #\n" +
                "+###+###+###+###+###+   +   +   +   +   +   +   +   +   +   +   +   +                           +\n" +
                "#                   #                                                                           #\n" +
                "+                   +###+###+###+   +   +###+###+###+###+###+   +   +         BILLIARD          +\n" +
                "#                               #       #                   #       #                           #\n" +
                "+                               +   +   +                   +   +   +           ROOM            +\n" +
                "#                               #       #                   #       #                           #\n" +
                "+           DINING              +   +   +                   +   +   +                           +\n" +
                "#                               #       #                   #       #                           #\n" +
                "+            ROOM               +   +   +                   +   +   +###+###+###+###+###+        \n" +
                "#                                       #                   #                                    \n" +
                "+                               +   +   +                   +   +   +   +###+###+   +###+###+   +\n" +
                "#                               #       #                   #           #                        \n" +
                "+                               +   +   +                   +   +   +###+                   +###+\n" +
                "#                               #       #                   #       #                           #\n" +
                "    +###+###+###+###+###+   +###+   +   +###+###+###+###+###+   +   +                           +\n" +
                "    #                                                                                           #\n" +
                "+###+   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +          LIBRARY          +\n" +
                "# M                                                                 #                           #\n" +
                "+###+   +   +   +   +   +   +   +   +###+###+       +###+###+   +   +###+                        \n" +
                "    #                               #                       #           #                        \n" +
                "+###+###+###+###+###+###+   +   +   +                       +   +   +   +###+###+###+###+###+###+\n" +
                "#                           #       #                       #                                 L #\n" +
                "+                           +   +   +                       +   +   +   +   +   +   +   +   +###+\n" +
                "#                           #       #                                                       #    \n" +
                "+                           +   +   +         HALL          +   +   +   +###+###+###+###+###+###+\n" +
                "#                           #       #                       #       #                           #\n" +
                "+          LOUNGE           +   +   +                       +   +   +                           +\n" +
                "#                           #       #                       #       #                           #\n" +
                "+                           +   +   +                       +   +   +           STUDY           +\n" +
                "#                           #       #                       #       #                           #\n" +
                "+                           +   +###+   +                   +###+   +   +                       +\n" +
                "#                           # S #       #                       #   #   #                       #\n" +
                "+###+###+###+###+###+###    +###+       +###+###+###+###        +###+   +###+###+###+###+###+###+\n";
        assertEquals(expected, game.printBoard());
    }

    /**
     * Check Player can move up into empty Square
     */
    @Test public void test_02(){
        Game game = new Game();
        game.addPlayer(1, "Bob", "Miss Scarlet");
        Player myPlayer = game.getPlayers().get(0);

        //This is the square above Miss Scarlet
        Location destination = game.getBoardLocations()[23][7];

        myPlayer.prepareForMove();
        myPlayer.move(destination);
        String expected =
                        "                                    +###+               +###+                                    \n" +
                        "                                    # W #               # G #                                    \n" +
                        "+###+###+###+###+###+###    +###+###+   +###+###+###+###+   +###+###+   +###+###+###+###+###+###+\n" +
                        "#                           #           #               #           #   #                       #\n" +
                        "+                       +###+   +###+###+               +###+###+   +###+                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +                               +   +   +     CONSERVATORY      +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+        KITCHEN        +   +   +                               +   +   +                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +           BALL ROOM           +   +   +   +                    \n" +
                        "#                       #                                                   #                    \n" +
                        "    +                   +   +   +                               +   +   +   +###+###+###+###+###+\n" +
                        "    #                   #       #                               #                             P #\n" +
                        "+###+###+###+###+   +###+   +   +                               +   +   +   +   +   +   +   +###+\n" +
                        "#                               #                               #                           #    \n" +
                        "+###+   +   +   +   +   +   +   +###+   +###+###+###+###+   +###+   +###+###+###+###+###+###+###+\n" +
                        "    #                                                               #                           #\n" +
                        "+###+###+###+###+###+   +   +   +   +   +   +   +   +   +   +   +   +                           +\n" +
                        "#                   #                                                                           #\n" +
                        "+                   +###+###+###+   +   +###+###+###+###+###+   +   +         BILLIARD          +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+                               +   +   +                   +   +   +           ROOM            +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+           DINING              +   +   +                   +   +   +                           +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+            ROOM               +   +   +                   +   +   +###+###+###+###+###+        \n" +
                        "#                                       #                   #                                    \n" +
                        "+                               +   +   +                   +   +   +   +###+###+   +###+###+   +\n" +
                        "#                               #       #                   #           #                        \n" +
                        "+                               +   +   +                   +   +   +###+                   +###+\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "    +###+###+###+###+###+   +###+   +   +###+###+###+###+###+   +   +                           +\n" +
                        "    #                                                                                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +          LIBRARY          +\n" +
                        "# M                                                                 #                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +###+###+       +###+###+   +   +###+                        \n" +
                        "    #                               #                       #           #                        \n" +
                        "+###+###+###+###+###+###+   +   +   +                       +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #                                 L #\n" +
                        "+                           +   +   +                       +   +   +   +   +   +   +   +   +###+\n" +
                        "#                           #       #                                                       #    \n" +
                        "+                           +   +   +         HALL          +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+          LOUNGE           +   +   +                       +   +   +                           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +   +                       +   +   +           STUDY           +\n" +
                        "#                           # S     #                       #       #                           #\n" +
                        "+                           +   +###+   +                   +###+   +   +                       +\n" +
                        "#                           #   #       #                       #   #   #                       #\n" +
                        "+###+###+###+###+###+###    +###+       +###+###+###+###        +###+   +###+###+###+###+###+###+\n";
        assertEquals(expected, game.printBoard());
    }

    /**
     * Check Player can't move through a wall
     */
    @Test public void test_03(){
        Game game = new Game();
        game.addPlayer(1, "Bob", "Miss Scarlet");
        Player myPlayer = game.getPlayers().get(0);

        // This is the square to the left of Miss Scarlet
        Location destination = game.getBoardLocations()[24][6];

        myPlayer.prepareForMove();
        myPlayer.move(destination);
        String expected =
                        "                                    +###+               +###+                                    \n" +
                        "                                    # W #               # G #                                    \n" +
                        "+###+###+###+###+###+###    +###+###+   +###+###+###+###+   +###+###+   +###+###+###+###+###+###+\n" +
                        "#                           #           #               #           #   #                       #\n" +
                        "+                       +###+   +###+###+               +###+###+   +###+                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +                               +   +   +     CONSERVATORY      +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+        KITCHEN        +   +   +                               +   +   +                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +           BALL ROOM           +   +   +   +                    \n" +
                        "#                       #                                                   #                    \n" +
                        "    +                   +   +   +                               +   +   +   +###+###+###+###+###+\n" +
                        "    #                   #       #                               #                             P #\n" +
                        "+###+###+###+###+   +###+   +   +                               +   +   +   +   +   +   +   +###+\n" +
                        "#                               #                               #                           #    \n" +
                        "+###+   +   +   +   +   +   +   +###+   +###+###+###+###+   +###+   +###+###+###+###+###+###+###+\n" +
                        "    #                                                               #                           #\n" +
                        "+###+###+###+###+###+   +   +   +   +   +   +   +   +   +   +   +   +                           +\n" +
                        "#                   #                                                                           #\n" +
                        "+                   +###+###+###+   +   +###+###+###+###+###+   +   +         BILLIARD          +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+                               +   +   +                   +   +   +           ROOM            +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+           DINING              +   +   +                   +   +   +                           +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+            ROOM               +   +   +                   +   +   +###+###+###+###+###+        \n" +
                        "#                                       #                   #                                    \n" +
                        "+                               +   +   +                   +   +   +   +###+###+   +###+###+   +\n" +
                        "#                               #       #                   #           #                        \n" +
                        "+                               +   +   +                   +   +   +###+                   +###+\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "    +###+###+###+###+###+   +###+   +   +###+###+###+###+###+   +   +                           +\n" +
                        "    #                                                                                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +          LIBRARY          +\n" +
                        "# M                                                                 #                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +###+###+       +###+###+   +   +###+                        \n" +
                        "    #                               #                       #           #                        \n" +
                        "+###+###+###+###+###+###+   +   +   +                       +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #                                 L #\n" +
                        "+                           +   +   +                       +   +   +   +   +   +   +   +   +###+\n" +
                        "#                           #       #                                                       #    \n" +
                        "+                           +   +   +         HALL          +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+          LOUNGE           +   +   +                       +   +   +                           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +   +                       +   +   +           STUDY           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +###+   +                   +###+   +   +                       +\n" +
                        "#                           # S #       #                       #   #   #                       #\n" +
                        "+###+###+###+###+###+###    +###+       +###+###+###+###        +###+   +###+###+###+###+###+###+\n";
        assertEquals(expected, game.printBoard());
    }

    /**
     * Check Player cannot move to an unoccupied square if it is not directly
     * adjacent to the Player's current Location
     */
    @Test public void test_04(){
        Game game = new Game();
        game.addPlayer(1, "Bob", "Miss Scarlet");
        Player myPlayer = game.getPlayers().get(0);

        // This is the square three square directly above Miss Scarlet
        Location destination = game.getBoardLocations()[21][7];

        myPlayer.prepareForMove();
        myPlayer.move(destination);
        String expected =
                "                                    +###+               +###+                                    \n" +
                        "                                    # W #               # G #                                    \n" +
                        "+###+###+###+###+###+###    +###+###+   +###+###+###+###+   +###+###+   +###+###+###+###+###+###+\n" +
                        "#                           #           #               #           #   #                       #\n" +
                        "+                       +###+   +###+###+               +###+###+   +###+                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +                               +   +   +     CONSERVATORY      +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+        KITCHEN        +   +   +                               +   +   +                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +           BALL ROOM           +   +   +   +                    \n" +
                        "#                       #                                                   #                    \n" +
                        "    +                   +   +   +                               +   +   +   +###+###+###+###+###+\n" +
                        "    #                   #       #                               #                             P #\n" +
                        "+###+###+###+###+   +###+   +   +                               +   +   +   +   +   +   +   +###+\n" +
                        "#                               #                               #                           #    \n" +
                        "+###+   +   +   +   +   +   +   +###+   +###+###+###+###+   +###+   +###+###+###+###+###+###+###+\n" +
                        "    #                                                               #                           #\n" +
                        "+###+###+###+###+###+   +   +   +   +   +   +   +   +   +   +   +   +                           +\n" +
                        "#                   #                                                                           #\n" +
                        "+                   +###+###+###+   +   +###+###+###+###+###+   +   +         BILLIARD          +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+                               +   +   +                   +   +   +           ROOM            +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+           DINING              +   +   +                   +   +   +                           +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+            ROOM               +   +   +                   +   +   +###+###+###+###+###+        \n" +
                        "#                                       #                   #                                    \n" +
                        "+                               +   +   +                   +   +   +   +###+###+   +###+###+   +\n" +
                        "#                               #       #                   #           #                        \n" +
                        "+                               +   +   +                   +   +   +###+                   +###+\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "    +###+###+###+###+###+   +###+   +   +###+###+###+###+###+   +   +                           +\n" +
                        "    #                                                                                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +          LIBRARY          +\n" +
                        "# M                                                                 #                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +###+###+       +###+###+   +   +###+                        \n" +
                        "    #                               #                       #           #                        \n" +
                        "+###+###+###+###+###+###+   +   +   +                       +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #                                 L #\n" +
                        "+                           +   +   +                       +   +   +   +   +   +   +   +   +###+\n" +
                        "#                           #       #                                                       #    \n" +
                        "+                           +   +   +         HALL          +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+          LOUNGE           +   +   +                       +   +   +                           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +   +                       +   +   +           STUDY           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +###+   +                   +###+   +   +                       +\n" +
                        "#                           # S #       #                       #   #   #                       #\n" +
                        "+###+###+###+###+###+###    +###+       +###+###+###+###        +###+   +###+###+###+###+###+###+\n";
        assertEquals(expected, game.printBoard());
    }

    /**
     * Check Player will not move onto a square occupied by another Player
     */
    @Test public void test_05(){
        Game game = new Game();
        game.addPlayer(1, "Bob", "Miss Scarlet");
        game.addPlayer(2, "Andy", "Colonel Mustard");
        Player playerOne = game.getPlayers().get(0);
        Player playerTwo = game.getPlayers().get(1);

        Location destination = game.getBoardLocations()[23][7];

        game.movePlayer(playerTwo, destination);

        playerOne.prepareForMove();
        playerOne.move(destination);
        String expected =
                        "                                    +###+               +###+                                    \n" +
                        "                                    # W #               # G #                                    \n" +
                        "+###+###+###+###+###+###    +###+###+   +###+###+###+###+   +###+###+   +###+###+###+###+###+###+\n" +
                        "#                           #           #               #           #   #                       #\n" +
                        "+                       +###+   +###+###+               +###+###+   +###+                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +                               +   +   +     CONSERVATORY      +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+        KITCHEN        +   +   +                               +   +   +                       +\n" +
                        "#                       #       #                               #       #                       #\n" +
                        "+                       +   +   +           BALL ROOM           +   +   +   +                    \n" +
                        "#                       #                                                   #                    \n" +
                        "    +                   +   +   +                               +   +   +   +###+###+###+###+###+\n" +
                        "    #                   #       #                               #                             P #\n" +
                        "+###+###+###+###+   +###+   +   +                               +   +   +   +   +   +   +   +###+\n" +
                        "#                               #                               #                           #    \n" +
                        "+###+   +   +   +   +   +   +   +###+   +###+###+###+###+   +###+   +###+###+###+###+###+###+###+\n" +
                        "    #                                                               #                           #\n" +
                        "+###+###+###+###+###+   +   +   +   +   +   +   +   +   +   +   +   +                           +\n" +
                        "#                   #                                                                           #\n" +
                        "+                   +###+###+###+   +   +###+###+###+###+###+   +   +         BILLIARD          +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+                               +   +   +                   +   +   +           ROOM            +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+           DINING              +   +   +                   +   +   +                           +\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "+            ROOM               +   +   +                   +   +   +###+###+###+###+###+        \n" +
                        "#                                       #                   #                                    \n" +
                        "+                               +   +   +                   +   +   +   +###+###+   +###+###+   +\n" +
                        "#                               #       #                   #           #                        \n" +
                        "+                               +   +   +                   +   +   +###+                   +###+\n" +
                        "#                               #       #                   #       #                           #\n" +
                        "    +###+###+###+###+###+   +###+   +   +###+###+###+###+###+   +   +                           +\n" +
                        "    #                                                                                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +   +          LIBRARY          +\n" +
                        "#                                                                   #                           #\n" +
                        "+###+   +   +   +   +   +   +   +   +###+###+       +###+###+   +   +###+                        \n" +
                        "    #                               #                       #           #                        \n" +
                        "+###+###+###+###+###+###+   +   +   +                       +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #                                 L #\n" +
                        "+                           +   +   +                       +   +   +   +   +   +   +   +   +###+\n" +
                        "#                           #       #                                                       #    \n" +
                        "+                           +   +   +         HALL          +   +   +   +###+###+###+###+###+###+\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+          LOUNGE           +   +   +                       +   +   +                           +\n" +
                        "#                           #       #                       #       #                           #\n" +
                        "+                           +   +   +                       +   +   +           STUDY           +\n" +
                        "#                           # M     #                       #       #                           #\n" +
                        "+                           +   +###+   +                   +###+   +   +                       +\n" +
                        "#                           # S #       #                       #   #   #                       #\n" +
                        "+###+###+###+###+###+###    +###+       +###+###+###+###        +###+   +###+###+###+###+###+###+\n";
        assertEquals(expected, game.printBoard());
    }

}

package de.sintec.rotgegenblaulia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    private GameService gameService;

    @ParameterizedTest
    @CsvSource({
            "o      , R",
            "oo     , RR",
            "ooo    , Roo",
            "oooo   , Rooo",
            "ooooo  , RRooo",
            "oooooo , Rooooo",
            "ooooooo, Roooooo",
            "Bo, BR",
            "Boo, BRR",
            "Ro, RB",
            "Roo, RBB",

            "Roooooo, RBooooo",
            "Rooooooo, RBoooooo",
    })
    void name(String field, String expectedResult) {
        var result = gameService.move(field);

        assertEquals(expectedResult, result);
    }

    @BeforeEach
    void setUp() {
        gameService = new GameService();
    }
}

// 1 -> win
// 2 -> win
// 3 -> 1 oder 2 -> win
// 4 -> 1 -> win
// 5 -> 2, r3
// 6 -> 1, r5
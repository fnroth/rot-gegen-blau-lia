package de.sintec.rotgegenblaulia;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final static char EMPTY = 'o';
    private final static char RED = 'R';
    private final static char BLUE = 'B';

    public String move(String field) {
        var fieldSize = field.length();
        var result = field.toCharArray();

        var lastCell = EMPTY;

        for (var i = 0; i < fieldSize; ++i) {
            var cell = field.charAt(i);
            if (cell != EMPTY) {
                lastCell = cell;
                continue;
            }

            var color = lastCell == RED ? BLUE : RED;
            var remainingCells = fieldSize - i;

            var decision = remainingCells % 3;

            if (decision == 0) {
                result[i] = color;
            } else if (decision == 1) {
                result[i] = color;
            } else { // decision == 2
                result[i] = color;
                result[i + 1] = color;
            }
            break;
        }

        return new String(result);
    }


}

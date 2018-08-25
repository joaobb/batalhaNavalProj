import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    private Character[][] board;
    private List<Character> shipParts;

    public Board() {
        board = new Character[11][11];
        shipParts = new ArrayList<>();
        shipParts.add('☻');

        for (Character[] row : board)
            Arrays.fill(row, '░');
        board[0][0] = ' '; board[0][1] = 'A'; board[0][2] = 'B'; board[0][3] = 'C'; board[0][4] = 'D';
        board[0][5] = 'E'; board[0][6] = 'F'; board[0][7] = 'G'; board[0][8] = 'H'; board[0][9] = 'I';
        board[0][10] = 'J';

        board[1][0] = '0'; board[2][0] = '1'; board[3][0] = '2'; board[4][0] = '3'; board[5][0] = '4';
        board[6][0] = '5'; board[7][0] = '6'; board[8][0] = '7'; board[9][0] = '8'; board[10][0] = '9';

        board[10][7] = '☻'; board[10][8] = '☻'; board[10][9] = '☻'; board[10][10] = '☻';
    }

    public String campVisualization() {
        return (Arrays.deepToString(this.board).replace("], ", "]" + System.lineSeparator())
                .replace("[[", "[")
                .replace("]]", "]")).replace(", ", ",");
    }


    public boolean play(int[] coordinates) {
        boolean retorno = false;
        try {
            int x = coordinates[0];
            int y = coordinates[1];

            if (!shipParts.contains(this.board[x][y])) {
                this.board[y][x] = '▒';

            } else {
                this.board[y][x] = '┼';
                retorno = true;
            }
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Posicao inserida invalida");
        }
        return retorno;
    }
}


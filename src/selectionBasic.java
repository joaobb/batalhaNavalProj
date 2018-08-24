import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
/**
 * Created by joaopbb on 24/08/18.
 */
public class selectionBasic {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String entX;
        int entY;

        String[][] arreio = new String[11][11];

        construtorDeTabuleiro1(arreio);

        do{
            System.out.println(campVisualization(arreio) + System.lineSeparator());
            entX = inp.nextLine();
            entY = inp.nextInt();
            inp.nextLine();

            System.out.println();

            mudancaDeEstado(entX, entY, arreio);

        } while (!(entX.equals("-1")) || entY != -1);
    }

    public static String campVisualization(String[][] array) {
        return (Arrays.deepToString(array).replace("], ", "]" + System.lineSeparator())
                .replace("[[", "[")
                .replace("]]", "]"));
    }

    public static void mudancaDeEstado(String entX, int entY, String[][] array) {
        int entXParsed;
        switch (entX.toUpperCase()) {
            case "A":
                entXParsed = 1;
                break;
            case "B":
                entXParsed = 2;
                break;
            case "C":
                entXParsed = 3;
                break;
            case "D":
                entXParsed = 4;
                break;
            case "E":
                entXParsed = 5;
                break;
            case "F":
                entXParsed = 6;
                break;
            case "G":
                entXParsed = 7;
                break;
            case "H":
                entXParsed = 8;
                break;
            case "I":
                entXParsed = 9;
                break;
            case "J":
                entXParsed = 10;
                break;

                default:
                    throw new IllegalArgumentException("Tipo de entrada inserida invalida");
        }
        if (array[entY][entXParsed].equals("░") || array[entY][entXParsed].equals("▒")) array[entY][entXParsed] = "▒";
        else array[entY][entXParsed] = "┼";
    }

    public static void construtorDeTabuleiro1(String[][] array) {
        for (String[] row : array)
            Arrays.fill(row, "░");
        array[0][0] = "  ";
        array[0][1] = "A";
        array[0][2] = "B";
        array[0][3] = "C";
        array[0][4] = "D";
        array[0][5] = "E";
        array[0][6] = "F";
        array[0][7] = "G";
        array[0][8] = "H";
        array[0][9] = "I";
        array[0][10] = "J";

        array[1][0] = " 1";
        array[2][0] = " 2";
        array[3][0] = " 3";
        array[4][0] = " 4";
        array[5][0] = " 5";
        array[6][0] = " 6";
        array[7][0] = " 7";
        array[8][0] = " 8";
        array[9][0] = " 9";
        array[10][0] = "10";

        array[10][10] = "☻";

    }
}

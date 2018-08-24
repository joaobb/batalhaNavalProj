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
        for (String[] row : arreio)
            Arrays.fill(row, "░");
        arreio[0][0] = "  ";
        arreio[0][1] = "A";
        arreio[0][2] = "B";
        arreio[0][3] = "C";
        arreio[0][4] = "D";
        arreio[0][5] = "E";
        arreio[0][6] = "F";
        arreio[0][7] = "G";
        arreio[0][8] = "H";
        arreio[0][9] = "I";
        arreio[0][10] = "J";

        arreio[1][0] = " 1";
        arreio[2][0] = " 2";
        arreio[3][0] = " 3";
        arreio[4][0] = " 4";
        arreio[5][0] = " 5";
        arreio[6][0] = " 6";
        arreio[7][0] = " 7";
        arreio[8][0] = " 8";
        arreio[9][0] = " 9";
        arreio[10][0] = "10";

        arreio[10][10] = "☻";


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
}

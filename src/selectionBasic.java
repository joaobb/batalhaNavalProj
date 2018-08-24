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
            Arrays.fill(row, "0");
        arreio[0][0] = "A";
        arreio[0][1] = "B";
        arreio[0][2] = "C";
        arreio[0][3] = "D";
        arreio[0][4] = "E";
        arreio[0][5] = "F";
        arreio[0][6] = "G";
        arreio[0][7] = "H";
        arreio[0][8] = "I";
        arreio[0][9] = "J";

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
                entXParsed = 0;
                break;
            case "B":
                entXParsed = 1;
                break;
            case "C":
                entXParsed = 2;
                break;
            case "D":
                entXParsed = 3;
                break;
            case "E":
                entXParsed = 4;
                break;
            case "F":
                entXParsed = 5;
                break;
            case "G":
                entXParsed = 6;
                break;
            case "H":
                entXParsed = 7;
                break;
            case "I":
                entXParsed = 8;
                break;
            case "J":
                entXParsed = 9;
                break;

                default:
                    throw new IllegalArgumentException("Tipo de entrada inserida invalida");
        }
        array[entY - 1][entXParsed] = "1";
    }
}

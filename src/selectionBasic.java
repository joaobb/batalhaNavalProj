import java.util.*;

/**
 * Obsoleto
 */
public class selectionBasic {

    public List<Character> shipParts = new ArrayList<>();

    public static void main(String[] args) {
        Controller controller = new Controller();

        Scanner inp = new Scanner(System.in);
        String entX;
        int entY;

        Character[][] arreio = new Character[11][11];
        List<Character> shipParts = new ArrayList<>();
        shipParts.add('☻');

        construtorDeTabuleiro1(arreio);


        try {
            do {
                System.out.println(controller.campVisual() + System.lineSeparator());
      //          System.out.println(campVisualization(arreio) + System.lineSeparator());

                entX = inp.nextLine();
                entY = inp.nextInt();
                inp.nextLine();
                System.out.println();

                mudancaDeEstado(entX, entY + 1, arreio, shipParts);

            } while (!(entX.equals("-1")) || !(entY == -1));
        } catch (InputMismatchException e) {
            System.out.println("Tipo de estrada inserida invalida");
        }
    }

    public static String campVisualization(Character[][] array) {
        return (Arrays.deepToString(array).replace("], ", "]" + System.lineSeparator())
                .replace("[[", "[")
                .replace("]]", "]")).replace(", ", ",");
    }

    public static boolean mudancaDeEstado(String entX, int entY, Character[][] array, List<Character> shipParts) {
        int entXParsed = -1;
        boolean retorno = false;

        try {

            if (!shipParts.contains(array[entY][entXParsed])) {
                array[entY][entXParsed] = '▒';
            } else {
                array[entY][entXParsed] = '┼';
                retorno = true;
            }
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Posicao inserida invalida");
        }
        return retorno;
    }

    public static void construtorDeTabuleiro1(Character[][] array) {
        for (Character[] row : array)
            Arrays.fill(row, '░');
        array[0][0] = ' ';
        array[0][1] = 'A';
        array[0][2] = 'B';
        array[0][3] = 'C';
        array[0][4] = 'D';
        array[0][5] = 'E';
        array[0][6] = 'F';
        array[0][7] = 'G';
        array[0][8] = 'H';
        array[0][9] = 'I';
        array[0][10] = 'J';

        array[1][0] = '0';
        array[2][0] = '1';
        array[3][0] = '2';
        array[4][0] = '3';
        array[5][0] = '4';
        array[6][0] = '5';
        array[7][0] = '6';
        array[8][0] = '7';
        array[9][0] = '8';
        array[10][0] = '9';

        array[10][10] = '☻';
        array[10][7] = '☻';
        array[10][8] = '☻';
        array[10][9] = '☻';
    }
}

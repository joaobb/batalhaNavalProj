public class HumanPlayer {
    public HumanPlayer() {

    }

    public int[] play(String entX, int entY) {
        int entXParsed = 0;
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
                throw new IllegalArgumentException("Entrada inserida invalida");
        }
        return new int[]{entXParsed, entY};
    }
}

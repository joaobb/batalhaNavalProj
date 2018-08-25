

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bot {

    private Random random;
    private List<int[]> previousPlays;


    public Bot() {
        this.random = new Random();
        this.previousPlays = new ArrayList<>();
    }

    public int[] play() {
        int[] currentPlay;

        do {
            currentPlay = new int[]{this.random.nextInt(10), this.random.nextInt(10)};
        } while (this.previousPlays.contains(currentPlay));

        this.previousPlays.add(currentPlay);
        return currentPlay;
    }

    public int[] playAgain() {
        //Condicional de errar jogada porem continuar procurando na proxima rodada

        int[] lastPlay = this.previousPlays.get(previousPlays.size() - 1);
        int[] retorn = null;

        if (previousPlays.contains(new int[]{lastPlay[0] + 1, lastPlay[1]})) {
            //TODO;
        }
        if (previousPlays.contains(new int[]{lastPlay[0] - 1, lastPlay[1]})) {
            //TODO;
        }
        if (previousPlays.contains(new int[]{lastPlay[0], lastPlay[1] + 1})) {
            //TODO;
        }
        if (previousPlays.contains(new int[]{lastPlay[0], lastPlay[1] - 1})) {
            //TODO;
        }

        return retorn;

    }

}


public class Controller {
    private Board board;
    private HumanPlayer humanPlayer;
    private Bot bot;


    public Controller() {
        this.board = new Board();
        this.humanPlayer = new HumanPlayer();
        this.bot = new Bot();
    }

    public String campVisual() {
        return this.board.campVisualization();
    }

    public void play(String entX, int entY) {
        int[] botPlay = bot.play();

        do{
            board.play(humanPlayer.play(entX, entY));
        } while (board.play(humanPlayer.play(entX, entY)));

        if (board.play(botPlay));
    }
}

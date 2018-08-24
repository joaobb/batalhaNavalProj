import javax.security.sasl.SaslServer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by joaopbb on 24/08/18.
 */
public class mainTest {
    private Random random = new Random();

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("░");
        list.add("▒");

        mainTest obj = new mainTest();
        System.out.print("________________________________" + System.lineSeparator() + "║");

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(1));
            }
            System.out.print("║" + System.lineSeparator() + "║");
        }

        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║");

        for (int j = 0; j < 10; j++) {
            System.out.print("║");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(0));
            }
            System.out.print("║" + System.lineSeparator());
        }
        System.out.println("╞≡≡}");
        System.out.println("̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ");

    }

    public String getRandomList(List<String> list) {

        int index = random.nextInt(2);
        return list.get(index);

    }
}


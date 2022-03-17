import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // входные данные
        int bonusLevel = 20; // единица начисления бонусов (1 миля за каждые 20 руб.)
        int ticketPrice = 68_000; // стоимость билета

        // логика программы
        System.out.println("Количество начисленных миль составляет:");
        System.out.println(ticketPrice / bonusLevel);
    }
}

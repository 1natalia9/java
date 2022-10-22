import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner hand = new Scanner(System.in);
        System.out.println("Сколько часов осталось до сна");
        int time = hand.nextInt();
        if (time >= 16) {
            System.out.println("Сейчас самое время спать");
        } else if (time > 10 && time <= 16) {
            System.out.println("Не переживайте, до сна больше 10 часов");
        } else if (time > 3 && time <= 7) {
            System.out.println("До сна осталось меньше 7 часов");
        } else if (time == 3) {
            System.out.println("До сна 3 часа, если вы голодные, то надо успеть перекусить");
        } else if (time == 2) {
            System.out.println("До сна 2 часа, завершайте выполнение текущей работы");
        } else if (time == 1) {
            System.out.println("До сна 1 час, посмотрите перед сном что-то интересное, или почитайте");
        } else if (time == 0) { // true && false = false
            System.out.println("Время ложиться спать. Конец дня!");



        }


    }
}

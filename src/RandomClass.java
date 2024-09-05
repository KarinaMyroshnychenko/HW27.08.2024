import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int secondsRemaining = rand.nextInt(28801);

        System.out.println("Осталось секунд: " + secondsRemaining);

        int hoursRemaining = secondsRemaining / 3600;

        switch (hoursRemaining) {
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
                System.out.println("Осталось " + hoursRemaining + " часов");
                break;
            case 1:
                System.out.println("Остался 1 час");
                break;
            case 0:
                System.out.println("Осталось менее часа");
                break;
            default:
                System.out.println("Некорректное количество часов");
                break;
        }
    }
}


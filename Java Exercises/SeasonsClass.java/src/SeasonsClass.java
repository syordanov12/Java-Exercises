import java.util.Scanner;

public class SeasonsClass {
    public static void main(String[] args) {
        // Winter = 12, 1, 2
        // Spring = 3,4,5
        // Summer = 6,7,8
        // Autumn = 9, 10, 11
        // Error

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        if (month == 12 || (month >= 1 && month <=2 )) {
            System.out.println("Winter");
        } else {
            if (month > 2 && month <= 5) {
                System.out.println("Spring");
            } else {
                if (month > 5 && month <= 8) {
                    System.out.println("Summer");
                } else {
                    if (month > 8 && month <= 11) {
                        System.out.println("Autumn");
                    } else {
                        System.out.println("Error");
                    }
                }
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer integer = null;
        int number = integer.parseInt(scanner.nextLine());
        CheckIsDivisible(number);
        System.out.println(number);
    }
    public static void CheckIsDivisible(int number){
        if (number%2 ==0) {
            System.out.println("The number is Divisible by 2");
            }
        }
    }


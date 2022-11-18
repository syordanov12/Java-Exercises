import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array = new int[5];
        for (int i =0;i<array.length;i++){
            int number = scanner.nextInt();
            array[i]=number;
        }
        Reverse(array);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public  static  void Reverse(int[]array){
        for (int i=0;i<array.length/2;i++){
            int currentElement = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=currentElement;
        }
    }
}
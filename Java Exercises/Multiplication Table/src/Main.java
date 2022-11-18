import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                    for(int i = 2;i < 100;i++){
                int currentNuber =i;
                boolean isPrimeNumber = true;
                for(int z = 1; z <100; z++){
                    if (z!=1&&z!=currentNuber){
                        if (currentNuber%z==0){
                            isPrimeNumber = false;
                            break;
                        }
                    }
                }
                if (isPrimeNumber){
                    System.out.println(currentNuber);
                }
            }
        }
    }

















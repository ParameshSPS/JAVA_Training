package Java_Training.Trainer_Aaryan.Java_25th.Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            int i = 1;
            while (i <= number) {
                System.out.println(number + " * " + i + " = " + (number * i));
                i++;
            }
        }
    }
}
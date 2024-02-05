import java.util.Scanner;

public class Limits {

        public static void main(String[] args) {
            int height;
            float weight;
            Scanner input = new Scanner(System.in);

            System.out.println("What is your height in cm?");
            height = input.nextInt();

            System.out.println("What is your weight in kg?");
            weight = input.nextFloat();

            if (height > 150 && weight < 180) {
                System.out.println("Fasten your seatbelt!");
            } else {
                System.out.println("I'm sorry you can't go!");
            }
        }
    }
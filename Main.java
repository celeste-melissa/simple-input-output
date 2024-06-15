import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gathering name details
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " +name);

        // gathering age details
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // gather favorite food details
        System.out.println("What is your favorite food?");
        scanner.nextLine(); // this clears the first scanner of nextLine() allowing new text to be entered
        String favoriteFood = scanner.nextLine();
        System.out.println("Your favorite food is " + favoriteFood + ".");
    }
}

import java.util.Scanner; // imports scanner

public class Greeting {
    public static void main(String[] args) {
        //instantiate scanner
        Scanner scanner = new Scanner(System.in);

        //prints "What's your name?"
        System.out.println("What's your name?");

        //user input will be assigned to "name" variable
        //scanner will read input
        String name = scanner.nextLine();

        //prints "Hi " plus user input
        System.out.println("Hi " + name);
    }
}

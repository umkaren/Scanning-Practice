import java.util.Scanner; // imports scanner

public class HelloThere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        String mood = scanner.nextLine();

        System.out.println("Wow - Interesting. Tell me more about yourself!");

        String icebreaker = scanner.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");
    }
}

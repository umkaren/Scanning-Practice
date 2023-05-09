import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");

        String superheroName = scanner.nextLine();

        System.out.println("What is their superpower?");

        String power = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + superheroName + ", who had the power of " + power + ".");
        System.out.println("As they grew older, " + superheroName + " saw that the world needed them.");
        System.out.println(superheroName + " used their ability to " + power + " to save the world.");
    }
}

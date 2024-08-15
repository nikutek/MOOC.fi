
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        ArrayList birds = new ArrayList<Bird>();
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        controler(scan, birds);
    }

    public static void controler(Scanner scan, ArrayList<Bird> birds) {
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                add(scan, birds);
            } else if (command.equals("Observation")) {
                observe(scan, birds);
            } else if (command.equals("All")) {
                print(scan, birds);
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                print(scan, birds, name);
            } else if (command.equals("Quit")) {
                break;
            }
        }

    }

    public static void add(Scanner scan, ArrayList<Bird> birds) {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }

    public static void observe(Scanner scan, ArrayList<Bird> birds) {
        System.out.println("Bird?");
        String name = scan.nextLine();
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public static void print(Scanner scan, ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public static void print(Scanner scan, ArrayList<Bird> birds, String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}

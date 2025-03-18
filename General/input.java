import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? ", name);
        // int age = scanner.nextInt();
        // clean up the input buffer, remove <enter>.
        // scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        // double gpa = Double.parseDouble(scanner.nextLine());

        System.out.printf("%d is a nice number. What's your favourite language? ", age);
        String language = scanner.nextLine();

        System.out.printf("%s is my favourite too! ", language);
        
        scanner.close();
    }
}









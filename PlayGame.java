import java.util.Scanner;

public class PlayGame implements Game {
    Scanner sc = new Scanner(System.in);

    @Override
    public void showGame() {
        String[] PC = {"Mac", "Hp", "Acer", "Lenova", "Hawei"};

        for (String laptop : PC) {
            System.out.println(laptop);
        }

        System.out.print("Enter  the best PC: ");
        String userChoice = userInput();

        boolean isValid = false;

        for (String laptop : PC) {
            if (userChoice.equalsIgnoreCase(laptop)) {
                System.out.println("Congratulations, you made it!");
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            System.out.println("Invalid choice");
        }
    }

    @Override
    public String userInput() {
        String input = sc.nextLine();
        return input;
    }
}

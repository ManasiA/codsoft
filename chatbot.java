import java.util.Scanner;

public class chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("hi") || userInput.equals("hello") || userInput.equals("hey")) {
                System.out.println("🤖 Chatbot: Hello! How can I help you?");
            } else if (userInput.equals("how are you")) {
                System.out.println("🤖 Chatbot: I'm just a program, but I'm doing fine!");
            } else if (userInput.equals("what is your name")) {
                System.out.println("🤖 Chatbot: I'm a simple Java chatbot.");
            } else if (userInput.equals("bye")) {
                System.out.println("🤖 Chatbot: Goodbye! Have a great day.");
                break;
            } else {
                System.out.println("🤖 Chatbot: Sorry, I don't understand.");
            }
        }

        scanner.close();
    }
}

import java.util.*;

public class chatbot {

    private static Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I help you?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm doing great! Thanks for asking.");
        responses.put("what is your name", "I am a Java Chatbot.");
        responses.put("bye", "Goodbye! Have a nice day.");
        responses.put("help", "I can answer basic questions. Try asking: hi, what is your name, how are you.");
    }

    private static String getResponse(String userInput) {
        userInput = userInput.toLowerCase();
        for (String key : responses.keySet()) {
            if (userInput.contains(key)) {
                return responses.get(key);
            }
        }
        return "Sorry, I didn't understand. Can you rephrase?";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot Started. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();
            String reply = getResponse(input);
            System.out.println("Bot: " + reply);
            if (input.toLowerCase().contains("bye")) break;
        }

        sc.close();
    }
}
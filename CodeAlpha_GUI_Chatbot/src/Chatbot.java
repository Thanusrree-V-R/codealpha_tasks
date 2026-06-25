import java.util.HashMap;

public class Chatbot {
    private HashMap<String, String> responses;

    public Chatbot() {
        responses = new HashMap<>();
        responses.put("hello", "Hello Thanusrree! Nice to meet you.");
        responses.put("hi", "Hi there!");
        responses.put("how are you", "I am doing great.");
        responses.put("java", "Java is an object-oriented programming language.");
        responses.put("codealpha", "CodeAlpha provides internship projects.");
        responses.put("bye", "Goodbye! Have a nice day.");
    }

    public String getResponse(String input) {
        input = input.toLowerCase();
        for(String key : responses.keySet()) {
            if(input.contains(key)) return responses.get(key);
        }
        return "Sorry, I do not understand that yet.";
    }
}
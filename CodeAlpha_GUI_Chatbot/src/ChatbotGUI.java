import javax.swing.*;
import java.awt.*;

public class ChatbotGUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private Chatbot bot;

    public ChatbotGUI() {
        bot = new Chatbot();

        setTitle("AI Chatbot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        sendButton.addActionListener(e -> sendMessage());
        inputField.addActionListener(e -> sendMessage());

        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! Ask me anything.\n");
        setVisible(true);
    }

    private void sendMessage() {
        String userText = inputField.getText().trim();
        if(userText.isEmpty()) return;

        chatArea.append("You: " + userText + "\n");
        chatArea.append("Bot: " + bot.getResponse(userText) + "\n\n");
        inputField.setText("");
    }
}
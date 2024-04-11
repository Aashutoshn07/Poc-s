import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseByWord {
    public static void main(String[] args) {
        String text = "Industry Development and Training In Word Buzz A Technologies I Naresh";

        reverseByWordWithTokenizer(text);
        reverseByWordWithoutTokenizer(text);

    }

    public static void reverseByWordWithTokenizer(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        Stack<String> stack = new Stack<>();

        while (tokenizer.hasMoreTokens()) {
            stack.push(tokenizer.nextToken());
        }

        StringBuilder reversedText = new StringBuilder();
        while (!stack.empty()) {
            reversedText.append(stack.pop()).append(" ");
        }

        // Remove the extra space at the end
        reversedText.deleteCharAt(reversedText.length() - 1);

        System.out.println("Reversed String by Word (Tokenizer): " + reversedText.toString());
    }

    public static void reverseByWordWithoutTokenizer(String text) {
        String[] words = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]).append(" ");
        }

        // Remove the extra space at the end
        reversedText.deleteCharAt(reversedText.length() - 1);

        System.out.println("Reversed String by Word (Without Tokenizer): " + reversedText.toString());
    }
}

public class CharacterWrapperDemo {
    public static void main(String[] args) {
        char[] a = {'A', 'b', '3', ' ', '\t', 'x'};

        for (int i = 0; i < a.length; i++) {
            char ch = a[i];
            System.out.println("Character: " + ch);

            String digitMessage = Character.isDigit(ch) ? "is a digit" : "is not a digit";
            System.out.println("Digit: " + digitMessage);

            String letterMessage = Character.isLetter(ch) ? "is a letter" : "is not a letter";
            System.out.println("Letter: " + letterMessage);

            String whitespaceMessage = Character.isWhitespace(ch) ? "is whitespace" : "is not whitespace";
            System.out.println("Whitespace: " + whitespaceMessage);

            String lowerCaseMessage = Character.isLowerCase(ch) ? "is in lower case" : "is not in lower case";
            System.out.println("Lower Case: " + lowerCaseMessage);

            String upperCaseMessage = Character.isUpperCase(ch) ? "is in upper case" : "is not in upper case";
            System.out.println("Upper Case: " + upperCaseMessage);

            System.out.println();
        }
    }
}

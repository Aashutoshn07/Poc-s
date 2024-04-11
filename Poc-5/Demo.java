public class Demo {
    private String strVar;

    public Demo(String strVar) {
        this.strVar = strVar;
    }

    public String getStrVar() {
        return strVar;
    }

    public void splitAndPrint() {
        // Split the string by comma or period
        String[] splitStrings = strVar.split("[,.]");

        // Print the split strings using enhanced for loop
        for (String s : splitStrings) {
            System.out.println(s.trim()); // Trim to remove leading/trailing spaces
        }
    }

    public static void main(String[] args) {
        String input = "There is Something that i wanna say to you!";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            output.append(reversed).append(" ");
        }

        // Remove the trailing space
        output.deleteCharAt(output.length() - 1);

        System.out.println(output.toString());
    }
}

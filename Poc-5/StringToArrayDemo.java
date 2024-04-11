public class StringToArrayDemo {
    public static void main(String[] args) {
        String literal = "Naresh I Technologies, A Buzz Word in Training Industry";
        char [] charArr = literal.toCharArray();

        System.out.println(literal);
        for(char ch : charArr){
            System.out.print(ch);
        }
    }
}

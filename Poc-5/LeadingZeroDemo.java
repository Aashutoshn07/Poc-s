public class LeadingZeroDemo {
    public static void main(String[] args) {
        String number = "1500";
        String formattedNumber = String.format("%010d", Integer.parseInt(number));
        System.out.println("Formatted Number: " + formattedNumber);
    }
}

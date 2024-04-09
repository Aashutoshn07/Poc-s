public class Main {
    public static void main(String[] args) {
        ElectircityBill e1 = new ElectircityBill("1090  ", "Manish ", 3450  , 4600  , "commercial ");
        
        System.out.println(e1.getThisMonthcmr());

        System.out.println(e1.toString());
        System.out.println("Your Bill amount is: "+ e1.calculateBill());
        // System.out.println(e1.getCmr());


    }
}

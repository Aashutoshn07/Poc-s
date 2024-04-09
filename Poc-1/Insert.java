public class Insert {
    int i = 1;
    int j;

    Insert() {
        System.out.println("i = " + i + ",j = " + j);
        j = 1;
    }

    private static int x1 = print("static Insect.x1 initialized");

    public static int print(String string) {
        // TODO Auto-generated method stub
        System.out.println(string);
        return 0;
    }
}

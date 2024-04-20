package Problem_5;

public class PrintPattern implements Runnable {
    private String pattern;
    private int lines;

    public PrintPattern(String patter, int lines) {
        this.pattern = patter;
        this.lines = lines;
    }

    public void run() {
        for (int i = 0; i < lines; i++) {
            System.out.print(pattern+" ");
        }
        System.out.println();
    }
}

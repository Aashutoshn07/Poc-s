package Problem_3;

public class StringOperation {
    private String strVar;

    public String getStrVar() {
        return strVar;
    }

    public void setStrVar(String strVar) {
        this.strVar = strVar;
    }
    public void splitString(){
        if (strVar == null || strVar.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }
        String [] splitStrings = strVar.split("[,.]");

        System.out.println("Split Strings: ");
        for( String split : splitStrings){
            System.out.println(split.trim());
        }
    }
}

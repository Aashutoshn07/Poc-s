package Problem_5;

public class StringOperations {
    private String strVar;

    public StringOperations(String strVar){
        this.strVar = strVar;
    }
    public String getStrVar() {
        return strVar;
    }

    public void setStrVar(String strVar) {
        this.strVar = strVar;
    }
    public boolean hasDigit(){
        for(char c: strVar.toCharArray()){
            if (Character.isDigit(c)) {
                return true;
                
            }
        }
        return false;
    }

}
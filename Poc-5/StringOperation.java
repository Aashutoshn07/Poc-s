public class StringOperation {
    private String strVar;

    public String getStrVar() {
        return strVar;
    }

    public void setStrVar(String strVar) {
        this.strVar = strVar;
    }

    public String reverseWithBuffer() {
        StringBuffer stringBuffer = new StringBuffer(strVar);
        return stringBuffer.reverse().toString();
    }

    public String reverseWithoutBuffer() {
        char[] charArray = strVar.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
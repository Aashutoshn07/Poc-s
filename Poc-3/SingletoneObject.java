public class SingletoneObject {
    private static SingletoneObject singletoneObject = null;

    private SingletoneObject() {
    }

    public static synchronized SingletoneObject getSingletoneObject() {
        if (singletoneObject == null) {
            singletoneObject = new SingletoneObject();
            return singletoneObject;
        }
        return singletoneObject;

    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}

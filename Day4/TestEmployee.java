import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestEmployee {
    public static void main(String[] args) {
        Integer a = null;
        // a.toString();
        // System.out.println(a);
        Optional optional1 = Optional.ofNullable(a);

        if (a.toString()==null) {
            
        }
        // System.out.println(a.toString());
        List<Employee> list = new ArrayList<>();

        Employee emp1= new Employee();
        emp1.setName("ravi");

        Employee emp2= new Employee();
        Optional<String> optional = Optional.ofNullable(emp1.getEmail());
        if(optional.isPresent()){

            System.out.println( emp1.getName().concat(emp1.getEmail()));
        }else{
            System.out.println("Null object data");
        }


        list.add(emp1);
        list.add(emp2);

        System.out.println(list);

    }
}

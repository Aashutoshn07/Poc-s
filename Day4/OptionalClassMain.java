import java.util.Optional;

public class OptionalClassMain {
    public static void main(String[] args) {
        String value = "Hello, World!";
        
        // Creating an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of(value);
        
        // Creating an Optional with a potentially null value
        String nullValue = null;
        Optional<String> optionalWithNull = Optional.ofNullable(nullValue);
        
        // Retrieving the value from the Optional if present
        if (optionalWithValue.isPresent()) {
            String result = optionalWithValue.get();
            System.out.println("Value from optionalWithValue: " + result);
        } else {
            System.out.println("optionalWithValue does not contain a value.");
        }
        
        // Using ifPresent to perform an action if the value is present
        optionalWithNull.ifPresent(val -> System.out.println("Value from optionalWithNull: " + val));
        
        // Using orElse to provide a default value if the Optional is empty
        String defaultValue = optionalWithNull.orElse("Default Value");
        System.out.println("Default Value from optionalWithNull: " + defaultValue);
        
        // Using orElseGet to lazily provide a default value if the Optional is empty
        String lazyDefaultValue = optionalWithNull.orElseGet(() -> {
            // Some complex computation to generate a default value
            return "Lazy Default Value";
        });
        System.out.println("Lazy Default Value from optionalWithNull: " + lazyDefaultValue);
        
        // Using orElseThrow to throw an exception if the Optional is empty
        try {
            String result = optionalWithNull.orElseThrow(() -> new RuntimeException("Value is null"));
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

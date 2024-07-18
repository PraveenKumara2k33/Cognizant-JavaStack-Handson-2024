import java.util.regex.Pattern;

public class CustomerUtility {
    
    public static boolean validateCustomerEmail(String customerEmail) {
        
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        
        Pattern pat = Pattern.compile(emailRegex);
        if (customerEmail == null) {
            return false;
        }
        return pat.matcher(customerEmail).matches();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List customers = new ArrayList<>();
        customers.add(new Customer(1, "Jack"));
        customers.add(new Customer(2, "James"));
        customers.add(new Customer(3, "Kelly"));
        Customer james = new Customer(2, "James");
        if (customers.contains(james)) {
            System.out.println("true");
        }
    }
}
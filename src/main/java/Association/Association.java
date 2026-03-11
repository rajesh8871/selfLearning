package Association;

class Bank {
    private String name;

    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

// Association between both the classes in main method
public class Association {

    public static void main(String[] args) {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");

        // Print and display name and corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}
/*Output:  Ridhi is employee of ICICI
Output Explanation: In the above example, two separate classes Bank and Employee are associated
through their Objects. Bank can have many employees, So it is a one-to-many relationship*/
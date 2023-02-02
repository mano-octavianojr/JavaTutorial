package ClassesObjects2;

class Employee {

    // Variables
    int refno;
    String refname;

    /**
     * Constructor with no parameter.
     *
     */
    public Employee() {

        // "this" keyword, call constructor that accepts the parameter.
        this(999, "default name");
    }

    /**
     * Constructor with two parameter.
     *
     * @param i, reference number
     * @param n, reference name
     */
    Employee(int i, String n) {
        refno = i;
        refname = n;
    }

    /**
     * Constructor with one parameter. It accepts an object!
     *
     * @param e, employee object.
     */
    Employee(Employee e) {
        refno = e.refno;
        refname = e.refname;
    }

    /**
     * Display the reference number and name of the class.
     */
    public void display() {
        System.out.println(refno + " " + refname);
    }

    /**
     * Set the reference name of the class.
     */
    public void setName(String name) {
        refname = name;
    }

    /**
     * Private method that is only accesible in the class.
     *
     * Note: Check your IDE, it marks that the sayHello() is not been used.
     */
    private void sayHello() {
        System.out.println("I am hello");
    }

}

public class Sample2 {

    public static void main(String[] args) {

        // Create an employee object
        Employee e1 = new Employee(123, "raman");

        // Create another employee object using previous employee.
        Employee e2 = new Employee(e1);
        e1.display();
        e2.display();

        // NOTE: Uncomment all the codes below and see what will happen.
        //System.out.println("- - - - -");
        //e2.setName("new name");
        //e1.display();
        //e2.display();
        
        // Try to uncomment this code.
        // e2.sayHello()
    }

}

package inheritance1;

public class Sample2 extends ParentClass {

    /**
     * 
     * You will use the constructor of the current class after the ParentClass.
     */
    public Sample2() {
        System.out.println("Sample2 constructor");
    }

    public static void main(String[] args) {

        // This will execute the constructor of ParentClass followed 
        // by current class.
        Sample2 sample = new Sample2();

        // You can also access the methods of the ParentClass.
        String parentName = sample.getName();
        System.out.println("parent: " + parentName);
    }

}

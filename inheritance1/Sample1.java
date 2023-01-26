package inheritance1;

public class Sample1 extends ParentClass {

    public static void main(String[] args) {

        // This will execute the constructor of ParentClass.
        Sample1 sample = new Sample1();

        // You can also access the methods of the ParentClass.
        String parentName = sample.getName();
        System.out.println("parent: " + parentName);
    }

}

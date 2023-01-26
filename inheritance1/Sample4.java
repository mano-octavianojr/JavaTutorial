package inheritance1;

public class Sample4 extends ParentClass {

    String childName = "child";

    public Sample4() {
        System.out.println("Sample2 constructor");
    }

    public static void main(String[] args) {

        Sample4 sample = new Sample4();

        String getName = sample.getName();
        System.out.println("getName: " + getName);
    }

    /**
     * OVERRIDDING
     *
     * This will be used when getName is called by Java and not the ParentClass
     * method.
     *
     * @return Name.
     */
    @Override // RECOMMEND TO INCLUDE THIS.
    public String getName() {
        // Use the "super" keyword if you want to execute the method of the ParentClass.
        return super.getName();
    }
}

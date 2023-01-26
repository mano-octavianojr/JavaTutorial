package inheritance1;

public class Sample3 extends ParentClass {

    String childName = "child";

    public Sample3() {
        System.out.println("Sample2 constructor");
    }

    public static void main(String[] args) {

        Sample3 sample = new Sample3();

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
        return childName;
    }

    public void accessVariable() {
        // In ParentClass, try changing the public into private.
        System.out.println(parentName);
    }
}

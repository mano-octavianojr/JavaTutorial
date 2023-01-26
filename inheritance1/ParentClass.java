package inheritance1;

public class ParentClass {

    /**
     * Constructor.
     *
     * This will always be executed first when instantiating.
     */
    public ParentClass() {
        System.out.println("constructor in ParentClass w/o values");
    }

    int parentAge = 3;
    String parentName = "Mano";

    /**
     * @return name of the ParentClass
     */
    public String getName() {
        return parentName;
    }

    /**
     * @param name set name of ParentClass
     */
    public void setName(String name) {
        parentName = name;
    }

    /**
     * OVERLOAD
     *
     * @param parentName set name of ParentClass
     * @param age set age of parentClass
     */
    public void setName(String parentName, int parentAge) {

        // NOTE: use "this" if the instance variable is same with params in method.
        this.parentName = parentName;
        this.parentAge = parentAge;
    }

}

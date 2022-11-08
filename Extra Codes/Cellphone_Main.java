
public class Cellphone_Main {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        Cellphone cp2 = new Cellphone("Apple","Space Gray",7.2,75000,true);
        System.out.println(cp.getBrand());
        cp.setBrand("Xiaomi");
        System.out.println(cp.getBrand());
        cp2.takePhoto();
    }
}

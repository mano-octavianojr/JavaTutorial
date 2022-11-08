
package conditional_games;

public class MultiplyUsingAddition {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        System.out.println(multiply(x,y));
    }
    static int product = 0;
    public static int multiply(int x, int y){
        
        if(y != 0){
            product = product + x; // 15
            return multiply(x, --y); //y = 0
        }
        return product;
    }
}

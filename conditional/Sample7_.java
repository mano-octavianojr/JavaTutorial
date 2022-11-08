package conditional;

// QUESTION: What do you think is the output of the program?
public class Sample7_ {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        a++;
        b++;
        c += a + b;

        if (a > b) {
            a++;
            b++;
        } else if (a < c) {
            c++;
        } else {
            a += 2;
            b += 2;
        }
        int sum = a + b + c;
        System.out.println("sum: " + sum);
    }
}

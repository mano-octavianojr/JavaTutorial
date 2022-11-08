
package beecrowd;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        double increase;
        
        if(salary > 0.0 && salary <= 400.00){
            increase = salary * 0.15;
            System.out.printf("Novo salario: %.2f\n", salary + increase);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 15 %");
        }
        else if(salary >= 400.01 && salary <= 800.00){
            increase = salary * 0.12;
            System.out.printf("Novo salario: %.2f\n", salary + increase);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 12 %");
        }
        else if(salary >= 800.01 && salary <= 1200.00){
            increase = salary * 0.10;
            System.out.printf("Novo salario: %.2f\n", salary + increase);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 10 %");
        }
        else if(salary >= 1200.01 && salary <= 2000.00){
            increase = salary * 0.07;
            System.out.printf("Novo salario: %.2f\n", salary + increase);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 7 %");
        }
        else if(salary > 2000.00){
            increase = salary * 0.04;
            System.out.printf("Novo salario: %.2f\n", salary + increase);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 4 %");
        }
    }
}

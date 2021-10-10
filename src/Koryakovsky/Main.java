package Koryakovsky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws KoryakovskyException {
        try {
            Quadratic quadratic = new Quadratic();
            KoryakovskyLog.I().log("Enter 3 params: a, b, c");
            KoryakovskyLog.I().write();
            Scanner scanner = new Scanner(System.in);
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            KoryakovskyLog.I().log("Your equation is " + a +"x^2" + b + "x" + c + " = 0");

            var i = quadratic.solve(a, b, c);
            KoryakovskyLog.I().log("The roots are " + i);
        }catch (KoryakovskyException ex){
            System.out.println(ex.getMessage());
        }
        KoryakovskyLog.I().write();
    }
}

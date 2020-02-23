package pl.sda.javabasic;

public class Multiplier {
    public static void main(String[] args) {
        Multiplier m = new Multiplier();
        System.out.println(m.multiply(3, 5));
    }
        int multiply (int a, int b){
            //Math.abs(a) to wartość bezwzględna
            int result = 0;
            for (int i = 0; i < Math.abs(b); i++) {
                result += a;
            }
            if (b < 0){
                result = Math.negateExact(result); // result = - result;
            }
            return result;
        }
    }

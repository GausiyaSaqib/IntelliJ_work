package oops;

public class multiplicationOfFractionUsingOOPs {

    // FXN MULTIPLY WD RETURN TYPE FRACTION
    public static multiplyFraction multiply(multiplyFraction f4,multiplyFraction f5){
        int newNum = f4.num* f5.num;
        int newDen = f4.den*f5.den;
        multiplyFraction f6 = new multiplyFraction(newNum,newDen);
        return f6;
    }
    public static int gcd(int num, int den) { // FXN GCD
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) return i;
        }
        return min;
    }
    public static class multiplyFraction {  // CLASS
        int num;
        int den;
        public multiplyFraction(int num, int den) { // CONSTRUCTOR
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {   // FXN INSIDE CLASS
            int hcf = gcd(num, den);
            num = num / hcf;
            den = den / hcf;
        }
    }
    public static void main(String[] args) {
        multiplyFraction f4 = new multiplyFraction(5,15);
        System.out.println(f4.num+"/"+f4.den);
        multiplyFraction f5 = new multiplyFraction(6,4);
        System.out.println(f5.num+"/"+f5.den);
        multiplyFraction f6 = multiply(f4,f5);
        System.out.println(f6.num+"/"+f6.den);

    }

    }



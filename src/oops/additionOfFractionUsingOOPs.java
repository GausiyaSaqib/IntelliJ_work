package oops;

public class additionOfFractionUsingOOPs {
    public static fraction add(fraction f1 , fraction f2){
        int newNumerator = (f1.numerator*f2.denominator)+(f2.numerator*f1.denominator);
        int newDenominator = f1.denominator* f2.denominator;
        fraction f3 = new fraction(newNumerator,newDenominator);
        return f3;
    }
    public static int gcd(int num, int den){
       int  min = Math.min(num,den);
        for (int i = min; i >= 1; i--) {
            if(num%i==0 && den%i ==0) return i;
        }
        return min;
    }
    public static class fraction {
        int numerator;
        int denominator;
        public fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            simplify(); // here no need of f1 dott as its in constructor
        }
        public void simplify(){
            int hcf = gcd(numerator,denominator);
            numerator = numerator/hcf;
            denominator = denominator/hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35,21);
        System.out.println(f1.numerator+"/"+f1.denominator);
       // f1.simplify();  // if we want ki ye simplified aye wdout writung here
                           // use in constructor
        fraction f2 = new fraction(63,35);
        System.out.println(f2.numerator+"/"+f2.denominator);
        fraction f3 = add(f1,f2);
        System.out.println(f3.numerator+"/"+f3.denominator);



    }
}

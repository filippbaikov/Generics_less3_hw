public class Calculator<T extends Number> {

    public double sum(T a, T b) {
         double a1=Double.parseDouble(String.valueOf(a));
        double b1=Double.parseDouble(String.valueOf(b));
        return a1 + b1;
    }

    public double div(T a, T b) {
        double a1=Double.parseDouble(String.valueOf(a));
        double b1=Double.parseDouble(String.valueOf(b));
        return a1 / b1;
    }
    public double subtract(T a, T b) {
        double a1=Double.parseDouble(String.valueOf(a));
        double b1=Double.parseDouble(String.valueOf(b));
        return a1 - b1;
    }
    public double multiply(T a, T b) {
        double a1=Double.parseDouble(String.valueOf(a));
        double b1=Double.parseDouble(String.valueOf(b));
        return a1 * b1;
    }

    public double calculate(T a, String str, T b) {
        if (str.equals("+"))
            return sum(a, b);
        if (str.equals("-"))
            return subtract(a,b);
        if (str.equals("*"))
            return multiply(a, b);
        if (str.equals("/"))
            return div(a,b);
       else
            System.out.println("wrong operation");
       return 0;
    }


}

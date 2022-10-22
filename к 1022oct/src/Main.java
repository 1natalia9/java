public class Main {
    public static void main(String[] args) {
        double value1 = 8.2;
        double value2 = 10.3;
        double result1 = 10 - value1;
        double result2 = 10 -value2;

        if ( result1 > result2 ) System.out.println("value1 ближайшее к 10  i = " + result2);
        else System.out.println("value2 ближайшее к 10 i = " + result1);
    }
}

package ch.hslu.oop.sw06;

public class OOPMath {
    public static int max(final int a, final int b){
        return a >= b ? a : b;
    }
    public static int max(final int a, final int b, final int c){
        return max(max(a, b), c);
    }
}

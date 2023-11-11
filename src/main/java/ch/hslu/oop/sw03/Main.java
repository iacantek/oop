package ch.hslu.oop.sw03;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 2.c) & d)
        //increaseFloat();

        // 2.e)
        //fixedIterations();

        printBox(2, 2);
    }

    /**
     * 1.a)
     * Gets lower number out of the two parameters.
     * @param a Number 1
     * @param b Number 2
     * @return Lower number
     */
    private static int min(final int a, final int b){
        return a <= b ? a : b;
    }

    /**
     * 1.a)
     * Gets greater number out of the two parameters.
     * @param a Number 1
     * @param b Number 2
     * @return Greater number
     */
    private static int max(final int a, final int b){
        return a >= b ? a : b;
    }

    /**
     * 1.c)
     * Gets greatest number out of the three parameters.
     * @param numbers Input numbers
     * @return Greatest Number
     */
    private static int max(final int... numbers){
        int max = 0;

        for(int number : numbers) {
            max = number > max ? number : max;
        }

        return max;
    }

    /**
     * 2.a) & b)
     * Prints numbers from 1 to 10.
     */
    private static void printNumbers() {
        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop
        int index1 = 1;
        while (index1 <= 10) {
            System.out.println(index1);
            index1++;
        }

        // do while loop
        int index2 = 1;
        do {
            System.out.println(index2);
            index2++;
        } while (index2 <= 10);
    }

    /**
     * 2.c) & d)
     * Increases float variable until it reaches the value 1.0f.
     */
    private static void increaseFloat() {
        int counter = 0;
        float init = 0.9f;
        float increaseBy = 0.000025f;

        while (init <= 1.0f) {
            counter++;
            init += increaseBy;
        }

        System.out.println("Counter: " + counter);
        System.out.println("Value: " + init);
    }

    /**
     * 2.e)
     */
    private static void fixedIterations() {
        int counter = 4000;
        float init = 0.9f;
        float increaseBy = 0.000025f;

        for (int i = 0; i < counter; i++) {
            init += increaseBy;
        }

        System.out.println("Counter: " + counter);
        System.out.println("Value: " + init);
    }

    /**
     * 2.f)
     * Prints a box with the given dimensions using hashtags
     * @param width Box width
     * @param height Box height
     */
    private static void printBox(final int width, final int height) {
        for (int iHeight = 0; iHeight < height; iHeight++) {
            for (int iWidth = 0; iWidth < width; iWidth++) {
                if (iHeight == 0 || iHeight + 1 == height || iWidth == 0 || iWidth + 1 == width) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }

                if (iWidth + 1 == width) {
                    System.out.println();
                }
            }
        }
    }
}
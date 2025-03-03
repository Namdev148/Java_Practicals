public class FactorialPerformance {

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;

        }

        return fact;

    }



    public static int factorial2(int n) {

        if (n <= 1) {

            return 1;

        }

        return n * factorial2(n - 1);

    }



    public static void main(String[] args) {

        int size = 10000;

        int[] numbers = new int[size];



        for (int i = 0; i < size; i++) {

            numbers[i] = (int) ((System.nanoTime() % 50) + 1);

        }



        long startIterative = System.nanoTime();

        for (int num : numbers) {

            factorial(num);

        }

        long timeIterative = System.nanoTime() - startIterative;



        long startRecursive = System.nanoTime();

        for (int num : numbers) {

            factorial2(num);

        }

        long timeRecursive = System.nanoTime() - startRecursive;



        System.out.println("Total time taken by Iterative factorial: " + timeIterative + " ns");

        System.out.println("Total time taken by Recursive factorial: " + timeRecursive + " ns");



        if (timeIterative < timeRecursive) {

            System.out.println("Iterative method is faster.");

        } else {

            System.out.println("Recursive method is faster.");

        }

    }

} 

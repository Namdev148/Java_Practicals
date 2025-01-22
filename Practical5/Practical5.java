import java.util.Arrays;
public class Practical5 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factorial1(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int factorial2(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial2(n - 1);
    }
    
    public static int getSum(int[] numbers){
    int[] copiedArray= Arrays.copyOf(numbers,numbers.length);
    int sum=0;
    if(copiedArray.length>0) sum+=copiedArray[0];
    if(copiedArray.length>1) sum+=copiedArray[1];
    if(copiedArray.length>2) sum+=copiedArray[2];
    if(copiedArray.length>3) sum+=copiedArray[3];
    if(copiedArray.length>4) sum+=copiedArray[4];
    return sum;
    }
    
    public static void main(String[] args) {
        int number = 6;
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(factorial(number));
        System.out.println(factorial1(number));
        System.out.println(factorial2(number));
        System.out.println(getSum(array));
    }
}


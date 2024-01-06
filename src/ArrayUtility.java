public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array.length-1);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i: array){
            sum = sum + i;
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        double average = sum / array.length;
        int avg = (int) (average * 100);
        return (double) avg / 100;
    }

    public static int minimum(int[] array) {
        int min = 0;
        int test = array[0];

        for (int i: array){
            if (i <= test) {
                test = i;
            }
            min = test;
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = 0;
        int test = array[0];

        for (int i: array){
            if (i >= test){
                test = i;
            }
            max = test;
        }

        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i: array){
            if ((i%2) == 0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {

        for (int i = 0; i < (array.length / 2); i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return;
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i: array){
            if (i == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String str = "";

        for (int i = 0; i < array.length - 1; i++){
            str += array[i] + ", ";
        }

        return str + array[array.length - 1];
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            int check = num - array[i];

            int n = 0;
            while (n < array.length && n != i){
                if (check == array[n]){
                    return true;
                }
                n++;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        int firstElement = array[0];

        for (int i = 0; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        n = n % array.length;

        for (int i = 0; i < n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        n = n % array.length;

        for (int i = 0; i < n; i++){
            shiftLeft(array);
        }
    }

}

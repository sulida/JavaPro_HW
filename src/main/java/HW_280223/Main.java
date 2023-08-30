//Найти среднее арифметическое положительных элементов массива.
package HW_280223;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 9, -3, 4, 5, -7, 9, -8, 15};

        double avepositivenumber = calculateAverageOfPositiveNumbers(numbers);
        System.out.println("Average of positive numbers: " + avepositivenumber);
    }

    public static double calculateAverageOfPositiveNumbers(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double avepositivenumber = (double) sum / count;
            return avepositivenumber;
        } else {
            return 0;
        }
    }
}

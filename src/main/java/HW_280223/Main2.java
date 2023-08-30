//Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
package HW_280223;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 9, -3, 4, 5, -7, 9, -8, 15};

        int sum = 0;
        for (int num : numbers) {
            if (num % 3 == 0 && num % 5 != 0) {
                sum += num;
            }
        }

        System.out.println("The sum of elements that are divisible by 3 and at the same time are not divisible by 5: " + sum);
    }
}

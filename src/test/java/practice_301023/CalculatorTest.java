package practice_301023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(5, 2));
        assertEquals(0, calculator.subtract(10, 10));
    }

    @Test
    void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(2, 0));
    }

    @Test
    void power() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
        assertEquals(1.0, calculator.power(5.0, 0.0), 0.001);
    }

    @Test
    void factorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void isEven() {
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(7));
    }

    @Test
    void findMax() {
        assertEquals(5, calculator.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, calculator.findMax(new int[]{-10, -5, -1, -3, -7}));
    }

    @Test
    void isPrime() {
        assertTrue(calculator.isPrime(2));
        assertTrue(calculator.isPrime(7));
        assertFalse(calculator.isPrime(4));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    void toBaseString() {
        assertEquals("1010", calculator.toBaseString(10, 2));
        assertEquals("A", calculator.toBaseString(10, 16));
        assertEquals("3C", calculator.toBaseString(60, 16));
    }

    @Test
    void sqrt() {
        assertEquals(2.0, calculator.sqrt(4.0), 0.001);
        assertEquals(0.0, calculator.sqrt(0.0), 0.001);
    }

    @Test
    void reverseString() {
        assertEquals("gnirts elpmaxe", calculator.reverseString("example string"));
        assertEquals("racecar", calculator.reverseString("racecar"));
    }

    @Test
    void isPalindrome() {
        assertTrue(calculator.isPalindrome("racecar"));
        assertFalse(calculator.isPalindrome("hello"));
    }

    @Test
    void gcd() {
        assertEquals(3, calculator.gcd(6, 9));
        assertEquals(7, calculator.gcd(14, 21));
    }

    @Test
    void productOfArray() {
        assertEquals(24, calculator.productOfArray(new int[]{2, 3, 4}));
        assertEquals(0, calculator.productOfArray(new int[]{2, 0, 5}));
    }

    @Test
    void lengthOfLongestWord() {
        assertEquals(7, calculator.lengthOfLongestWord("The quick brown fox jumps over the lazy dog"));
        assertEquals(5, calculator.lengthOfLongestWord("Hello World"));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, calculator.celsiusToFahrenheit(0.0), 0.001);
        assertEquals(212.0, calculator.celsiusToFahrenheit(100.0), 0.001);
    }

    @Test
    void containsSubstring() {
        assertTrue(calculator.containsSubstring("Hello, world!", "world"));
        assertFalse(calculator.containsSubstring("Java is fun", "programming"));
    }


    @Test
    void sumOfDigits() {
        assertEquals(7, calculator.sumOfDigits(25));
        assertEquals(13, calculator.sumOfDigits(256));
    }

    @Test
    void isLeapYear() {
        assertTrue(calculator.isLeapYear(2000)); // год високосный
        assertFalse(calculator.isLeapYear(2022)); // год не високосный
        assertTrue(calculator.isLeapYear(2008)); // год високосный
        assertFalse(calculator.isLeapYear(1900)); // год не високосный
        assertTrue(calculator.isLeapYear(2400)); // год високосный

    }
}
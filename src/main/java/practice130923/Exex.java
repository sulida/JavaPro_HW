package practice130923;

import practice11092023.Employee;

import java.util.*;

public class Exex {
//    Уровень сложности 5 из 10:
//    Найти сумму всех элементов ArrayList<Integer>

    public int getSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        return sum;
    }

//    Найти среднее значение элементов LinkedList<Integer>.


    public int getAvverage(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        return sum / list.size();
    }

//    Перебрать ArrayList<String> и вывести все элементы на экран.

    public void getElements(List<String> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

//    Перебрать LinkedList<String> и найти самую длинную строку.


    public String getLongestElement(List<String> list) {
        int longestElementIndex = 0;
        int elementLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > elementLength) {
                longestElementIndex = i;
                elementLength = list.get(i).length();
            }
        }

        return list.get(longestElementIndex);
    }

//    Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

    public void printElementsOfList(List<Employee> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

//    Уровень сложности 6 из 10:
//    Перебрать ArrayList<Integer> и найти наименьший элемент.

    public int findTheSmallestElement(List<Integer> list) {
        int theSmallestElement = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (theSmallestElement > list.get(i)) {
                theSmallestElement = list.get(i);
            }

        }
        return theSmallestElement;
    }

//    Перебрать LinkedList<Integer> и найти наибольший элемент.

    public int findMaxElement(LinkedList<Integer> list) {
        int maxElement = list.get(0);
        for (int element : list) {
            if (maxElement < element) {
                maxElement = element;
            }
        }

        return maxElement;
    }

//    Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.

    public int findQuantityOfElementsWhichStartWithLetter(List<String> listnew, char letter) {

        int count = 0;
        for (String element : listnew) {
            if (element.charAt(0) == letter) {
                count++;
            }
        }

        return count;
    }
//    Перебрать LinkedList<String> и найти первое вхождение определенной строки.

    public int findTheFirstString(LinkedList<String> list, String string) {
        int theFirstIndexOfString = -1;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == string) {
                theFirstIndexOfString = i;
                break;
            }
        }

        return theFirstIndexOfString;
    }


    //    Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
    public Employee deleteElementsIfMethod(LinkedList<Employee> list, String condition) {
        for (Employee element : list) {
            if (element.equals(condition)) {
                list.remove(element);

            }
        }

        return null;
    }

//    Уровень сложности 7 из 10:
//    Перебрать ArrayList<Integer> и удалить все четные числа.

    public void deleteEvenNumbers(ArrayList<Integer> listnumbers) {
        for (Integer number : listnumbers) {
            if (number % 2 == 0) {
                listnumbers.remove(number);
            }
        }
    }
//    Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.

    public void deleteAndReplaceMultiplesOf3WithZeros(ArrayList<Integer> listnumbersnew) {
        for (Integer number : listnumbersnew) {
            if (number % 3 == 0) {
                listnumbersnew.set(number, 0);
            }
        }
    }
//    Перебрать ArrayList<String> и объединить все элементы в одну строку.

    public String concatenateElementsIntoSingleLine(List<String> listOneLine) {
        StringBuilder oneLine = new StringBuilder();

        for (String element : listOneLine) {
            oneLine.append(element);
        }

        return oneLine.toString();
    }

    //    Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
    public void deleteElelementsWithString(LinkedList<String> list, String string) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains(string)) {
                list.remove(i);
            }
        }


    }


//    Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.

    public void printElementsOfListIfCondition(List<Employee> list, String condition) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(condition)) {
                System.out.println(list.get(i));
            }

        }

    }

    //    Уровень сложности 8 из 10:
    //    Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    public void findSumOfSquaresOfElements(ArrayList<Integer> listnumbers1) {
        int sum = 0;
        for (Integer number : listnumbers1) {
            int squareOfNumber = (int) Math.pow(number, 2);
            sum += squareOfNumber;
        }
    }

    //    Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
    public void calculateProductOfElements(LinkedList<Integer> listnumbers2) {
        int product = 1;
        for (Integer number : listnumbers2) {
            product = product * number;
        }
    }

    //    Перебрать ArrayList<String> и найти самую короткую строку.
    public String findTheShortestString(ArrayList<String> listnew) {
        String theShorteststring = listnew.get(0);

        for (int i = 0; i < listnew.size(); i++) {


            int theShortestLength = 0;

            if (theShortestLength > listnew.get(i).length()) {

                theShorteststring = listnew.get(i);
            }
        }
        return theShorteststring;
    }
//    Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.

    public void replaceVowelLettersWithCharacter(LinkedList<String> linkedlist) {
        String regex = "[aeiouAEIOU]";
        for (int i = 0; i < linkedlist.size(); i++) {

            String originalString = linkedlist.get(i);
            String replacedString = originalString.replaceAll(regex, "*");
            linkedlist.set(i, replacedString);
        }
    }


//    Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.

    public void sortLinkedList(LinkedList<Employee> employeeLinkedList) {
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary).reversed();

        Collections.sort(employeeLinkedList, salaryComparator);
    }

//    Уровень сложности 9 из 10:
//    Перебрать ArrayList<Integer> и найти второй по величине элемент.

    public int findTheSecondBiggestElement(ArrayList<Integer> elements) {

        int theBiggestElement = elements.get(0);
        int theSecondBiggestElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (theBiggestElement < elements.get(i)) {
                theSecondBiggestElement = theBiggestElement;
                theBiggestElement = elements.get(i);

            } else theSecondBiggestElement = elements.get(i);
        }
        return theSecondBiggestElement;

    }

    //    Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
    public void printElementsInReverseOrder(LinkedList<Integer> ellinkedlist) {

        for (int i = ellinkedlist.size() - 1; i <= 0; i--) {
            System.out.println(ellinkedlist.get(i));


        }
    }

    //    Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
    public void printStringsWithLeters(ArrayList<String> listString) {

        for (int i = 0; i < listString.size(); i++) {
            for (char c : listString.get(i).toCharArray()) {
                if (Character.isLetter(c)) {
                    System.out.println(listString.get(i));
                }


            }
        }
    }
//    Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.

    public void findTheLongestStringWithoutSpaces(LinkedList<String> listStrings) {
        int theLongestIndex = 0;
        String theLongestString = listStrings.get(0);
        for (String str : listStrings) {
            if (str.length() > theLongestString.length() && !str.contains(" ")) {
                theLongestString = str;
            }


        }

    }

    //    Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы
    public void doFiltrUniqueElements(LinkedList<Employee> employeeLinkedListForUnique) {
        Set<Employee> uniqueElemnt = new HashSet<>();
        List<Employee> uniqueList = new ArrayList<>();
        for (Employee element : employeeLinkedListForUnique) {
            if (uniqueElemnt.add(element)) {
                uniqueList.add(element);
            }
        }
        System.out.println(uniqueList);
    }
}

//    Уровень сложности 10 из 10:
//        Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.

//        Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
//        Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
//        Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя.
//        Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
//
//

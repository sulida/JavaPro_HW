package tasks_041023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {


//Задание 1: Фильтрация списка целых чисел на нечетные числа

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);


//Задание 2: Преобразование списка строк в список чисел

        List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7");

        List<Integer> listNumbers = stringNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(listNumbers);

//Задание 3: Суммирование списка чисел
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers2.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

//Задание 4: Определение максимального значения в списке
        List<Integer> numbers3 = Arrays.asList(1, 7, 3, 8, 2, 9);

        Optional<Integer> maxNumber = numbers3.stream()
                .max(Integer::compare);

        if (maxNumber.isPresent()) {
            System.out.println("Max number: " + maxNumber.get());

        }
//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр

        List<String> words = Arrays.asList("apple", "banana", "pineapple", "ananas", "melon");

        String start = "a";

        List<String> newlist = words.stream()
                .filter(word -> word.startsWith(start))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(newlist);

//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

                List<String> uniqueWords = words.stream()
                .filter(word -> word.length() > 4)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueWords);

//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
        List<Person> people = Arrays.asList(
                new Person("Mary", 19),
                new Person("Klide", 27),
                new Person("Jerry", 20),
                new Person("John", 42)
        );

        List<String> sortedNamesByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(sortedNamesByAge);

//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum2 = numbers4.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum2);

//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк


        List<String> uniqueCharacters = words.stream()
                .map(word -> word.chars()
                        .distinct()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());

        System.out.println(uniqueCharacters);

        // Задача 1: Фильтрация четных чисел и умножение на 2.
        // Задача 2: Удаление дубликатов из списка строк.
        // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        // Задача 9: Получить среднее значение чисел в списке.
        // Задача 10: Получить строку, объединяющую элементы списка через запятую.
        // Задача 11: Получить список квадратов чисел из другого списка.
        // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
        // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
        // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
        // Задача 15: Фильтрация и сортировка пользователей по возрасту.
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

    }

}

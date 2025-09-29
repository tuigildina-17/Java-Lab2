import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Задание 1.2: ");
//        Person cleopatraPerson = new Person("Клеопатра", 152);
//        Person pushkinPerson = new Person("Пушкин", 167);
//        Person vladimirPerson = new Person("Владимир", 189);
//
//        System.out.println(cleopatraPerson);
//        System.out.println(pushkinPerson);
//        System.out.println(vladimirPerson);
//
//        System.out.println("Задание 1.3: ");
//        Name cleopatraName = new Name("Клеопатра");
//        Name pushkinName = new Name("Пушкин", "Александр", "Сергеевич");
//        Name vladimirName = new Name("Маяковский", "Владимир");
//
//        System.out.println(cleopatraName);
//        System.out.println(pushkinName);
//        System.out.println(vladimirName);

        Name cleopatraName = new Name("Клеопатра");
        Name pushkinName = new Name("Пушкин", "Александр", "Сергеевич");
        Name vladimirName = new Name("Маяковский", "Владимир");

        Person cleopatraPerson = new Person(cleopatraName, 152);
        Person pushkinPerson = new Person(pushkinName, 167);
        Person vladimirPerson = new Person(vladimirName, 189);

        System.out.println("Задание 2.2: ");

        System.out.println(cleopatraPerson);
        System.out.println(pushkinPerson);
        System.out.println(vladimirPerson);

        System.out.println("Задание 3.3, 4.8: ");

        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addPath(B, 5);
        B.addPath(A, 5);

        B.addPath(C, 3);
        C.addPath(B, 3);

        C.addPath(D, 4);
        D.addPath(C, 4);

        D.addPath(E, 2);

        F.addPath(E, 2);
        E.addPath(F, 2);

        F.addPath(B, 1);

        // С помощью нового конструктора
        //        D.addPath(A, 6);
        //        A.addPath(D, 6);
        //        A.addPath(F, 1);

        Map<City, Integer> pathsForD = new HashMap<>();
        pathsForD.put(A, 6);
        pathsForD.put(E, 2);

        D = new City("D", pathsForD);

        Map<City, Integer> pathsForA = new HashMap<>();
        pathsForA.put(F, 1);
        pathsForA.put(D, 6);

        A = new City("A", pathsForA);

        City[] cities = {A, B, C, D, E, F};

        for (City city : cities) {
            System.out.println(city);
        }

        System.out.println("Задание 5.5: ");

        Scanner scanner = new Scanner(System.in);

        Fraction f1 = new Fraction(scanner);
        System.out.println("Вы создали дробь f1: " + f1);

        Fraction f2 = new Fraction(scanner);
        System.out.println("Вы создали дробь f2: " + f2);

        Fraction f3 = new Fraction(scanner);
        System.out.println("Вы создали дробь f3: " + f3);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));

        Fraction result = f1.sum(f2).div(f3).minus(5);
        System.out.println("Результат выражения: f1.sum(f2).div(f3).minus(5) = (" + f1 + " + " + f2 + ") / " + f3 + " - 5 = " + result);
    }
}
package by.epam.algaritmization.by.epam.algaritmization.decompozition;

import java.util.Arrays;
import java.util.Scanner;

public class Decompositions {


    public static void main(String[] args) {
//        1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//        натуральных чисел: НОК(А,В)= А*В/НОД(А,В)
//        decomposition1();
//        2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
//        decomposition2();
//         3. Вычислить площадь правильного шестиугольника со стороной а,
//         используя метод вычисления площади треугольника.
//        decomposition3();
// 4. На плоскости заданы своими координатами n точек. Написать
// метод(методы), определяющие, между какими из пар точек самое большое
// расстояние. Указание. Координаты точек занести в массив.
//        decomposition4();
//        5. Составить программу, которая в массиве A[N] находит второе по величине число
//                (вывести на печать число, которое меньше максимального элемента массива,
//                        но больше всех других элементов).
//        decomposition5();
//        6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
//        decomposition6();
//        7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
//        decomposition7();
        //    8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4]
//    + D[5]; D[4] +D[5] +D[6].Пояснение. Составить метод(методы) для вычисления суммы
//    трех последовательно расположенных элементов массива с номерами от k до m.
//        decomposition8();
//        9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//        если угол между сторонами длиной X и Y— прямой.
//        decomposition9();
        //       10. Дано натуральное число N. Написать метод(методы) для формирования массива,
        //       элементами которого являются цифры числа N.
        //     decomposition10();
//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
//        decomposition11();
//        12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//        элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
//        decomposition12();
        //    13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//    Для решения задачи использовать декомпозицию.
//        decomposition13();
//        14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
//        если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
//        Для решения задачи использовать декомпозицию.
//        decomposition14();
//        15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
//        Для решения задачи использовать декомпозицию.
//        decomposition15();
//  16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
//decomposition16();
//    17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
        decomposition17();
    }

    public static int getAB(int a, int b) {
        return (a * b / nod(a, b));
    }

    public static int nod(int a, int b) {
        int result = 1;
        if (a != 0 && b != 0) {
            for (int i = 1; i < 10; i++) {
                if (a % i == 0 && b % i == 0) {
                    result *= i;
                }
            }

        } else {
            System.out.println("Check the dates!\n" +
                    "division by zero is prohibited");
        }

        return result;
    }

    //        1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//        натуральных чисел: НОК(А,В)= А*В/НОД(А,В)
    public static void decomposition1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter of value - > a: ");
        int a = scanner.nextInt();
        System.out.print("Enter of value - > b:");
        int b = scanner.nextInt();
        int nod = nod(a, b);
        System.out.println("NOD - >" + nod);
        int nok = getAB(a, b);
        System.out.println("NOK - >" + nok);
    }

    //  2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void decomposition2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter of value - > a: ");
        int a = scanner.nextInt();
        System.out.print("Enter of value - > b:");
        int b = scanner.nextInt();
        System.out.print("Enter of value - > c: ");
        int c = scanner.nextInt();
        System.out.print("Enter of value - > d:");
        int d = scanner.nextInt();
        int result = 1;
        if (a != 0 && b != 0 && c != 0 && d != 0) {
            for (int i = 1; i < 10; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                    result *= i;
                }
            }

        } else {
            System.out.println("Check the dates!\n" +
                    "division by zero is prohibited");
        }
        System.out.println("NOD for natural number - > " + result);

    }

    // 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
    public static void decomposition3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter value of sideLength - > ");
        double a = scanner.nextDouble();
        double squareHexagon = ((a * a * Math.sqrt(3)) / 4) * 6;
        System.out.println("Square Hexagon = > " + squareHexagon);

    }

    // 4. На плоскости заданы своими координатами n точек. Написать
// метод(методы), определяющие, между какими из пар точек самое большое
// расстояние. Указание. Координаты точек занести в массив.
    public static void decomposition4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter count of point - > ");
        final int N = scanner.nextInt();
        double[] x = new double[N];
        double[] y = new double[N];

        for (int i = 0; i < N; i++) {
            x[i] = (Math.random() * 100 + 1);
            y[i] = (Math.random() * 100 + 1);
        }
        System.out.println(" Points :");
        for (int i = 0; i < N; i++) {
            System.out.print(" X [" + (i + 1) + "]->" + x[i]);
            System.out.print("\n Y [" + (i + 1) + "]->" + y[i]);
            System.out.println("\n =======================================");
        }
        int[] indexes = getMaxDistanceIndex(x, y);

        System.out.println("Max distance between : " + x[indexes[0]] +
                ", " + y[indexes[0]] + " and " + x[indexes[1]] + ", " + y[indexes[1]]);
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double distans;
        distans = (Math.abs(x1 - x2)) + (Math.abs(y1 - y2));
        return distans;
    }

    private static int[] getMaxDistanceIndex(double[] x, double[] y) {
        double max = Double.MIN_VALUE;
        int maxIndexX = 0, maxIndexY = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                double d = getDistance(x[i], y[i], x[j], y[j]);
                if (d > max) {
                    max = d;
                    maxIndexX = i;
                    maxIndexY = j;
                }
            }
        }
        return new int[]{maxIndexX, maxIndexY};
    }
    //        5. Составить программу, которая в массиве A[N] находит второе по величине число
//                (вывести на печать число, которое меньше максимального элемента массива,
//                        но больше всех других элементов).

    public static void decomposition5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  the number items   - > ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int max = getMaxValueArray(array);
        System.out.println("Maximum vaylue in arra - > " + max);
        System.out.println(" Second maximum vaylue in arra - > " + getSecondMaxValueArray(array, max));

    }

    public static int getMaxValueArray(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getSecondMaxValueArray(int[] array, int maxValue) {

        int secondMax = Integer.MIN_VALUE;

        for (int j = 0; j < array.length; j++) {
            if (array[j] > secondMax && secondMax != maxValue) {
                secondMax = array[j];
            }
        }
        return secondMax;
    }

    //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void decomposition6() {
        System.out.println("Enter 3 number - >");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean primeA = primeNumber(a);
        boolean primeB = primeNumber(b);
        boolean primeC = primeNumber(c);

        System.out.println(primeA);
        System.out.println(primeB);
        System.out.println(primeC);

        if (primeA == true && primeB == true && primeC == true) {
            System.out.println("Simple numbers");
        } else System.out.println("One or more numbers are not simple");
    }

    private static boolean primeNumber(int x) {

        boolean prime = true;

        if (x == 1) {
            prime = false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                prime = false;
            }
        }
        return prime;

    }

    //    7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    public static void decomposition7() {
        int summFactorial = 0;
        for (int i = 1; i <= 9; i += 2) {

            summFactorial += getFactorial(i);
        }
        System.out.println("Amount of factorials - >" + summFactorial);
    }

    public static int getFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    //    8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4]
//    + D[5]; D[4] +D[5] +D[6].Пояснение. Составить метод(методы) для вычисления суммы
//    трех последовательно расположенных элементов массива с номерами от k до m.
    public static void decomposition8() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("D[l] + D[2] + D[3] = " + summThreeElemArray(array, 1));
        System.out.println("D[3] + D[4] + D[5] = " + summThreeElemArray(array, 3));
        System.out.println("D[4] + D[5] + D[6] = " + summThreeElemArray(array, 4));

    }

    public static int summThreeElemArray(int[] array, int k) {
        int summElem = 0;
        for (int i = k; i < k + 3; i++) {
            summElem += array[i];
        }
        return summElem;
    }

    //    9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//       Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    public static void decomposition9() {
        double X = 5, Y = 5, Z = 10, T = 10;
        double s = getTetragonAreaBySides(X, Y, Z, T);
        System.out.println("Area of tetragon with sides " + X + " " + Y + " " + Z + " " + T + " = " + s);
    }

    // угол между сторонами длиной a и b — прямой
    public static double getTetragonAreaBySides(double a, double b, double c, double d) {
        double s = 0;
        double h = getHypotenuse(a, b);
        s = getRightTriangleArea(a, b) + getTriangeAreaBySides(c, d, h);
        return s;
    }

    public static double getTriangeAreaBySides(double a, double b, double c) {
        double p = (a + b + c) / 2.;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double getHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double getRightTriangleArea(double a, double b) {
        return a * b / 2.;
    }

    //  10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
    public static void decomposition10() {

        long N = 243324553;
        int[] a = getArrayFromNumerals(N);

        System.out.println("Array from numerals of " + N);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] getArrayFromNumerals(long n) {
        int size = (int) Math.log10(n) + 1;
        int[] a = new int[size];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (int) (n % 10);
            n = n / 10;
        }
        return a;
    }

    // 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    public static void decomposition11() {

        long a = 12345678L;
        long b = 87654321L;
        System.out.println("Numbers: " + a + ", " + b);
        int countA = countNumeral(a);
        int countB = countNumeral(b);
        comparisonNumbers(countA, countB);

    }

    public static int countNumeral(long a) {
        int counter = 0;
        boolean count = true;

        while (count) {
            if (0 < a) {
                a = a / 10;
                counter++;

            } else {
                count = false;
            }
        }

        return counter;
    }

    public static void comparisonNumbers(int a, int b) {
        if (a > b) {
            System.out.println("The first number has more digits.");
        } else if (a == b) {
            System.out.println("Same number of digits.");
        } else {
            System.out.println("The first number has more digits");
        }
    }

    //12. Даны натуральные числа К и N.Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
    public static void decomposition12() {
        int K = 10;
        int N = 100;

        System.out.println("K = " + K + ", N = " + N);

        int[] a = getArray(K, N);

        System.out.println("Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int getNumeralsSum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    private static int[] getArray(int K, int N) {
        int[] t = new int[N];
        int count = 0;
        for (int i = 1; i <= t.length; i++) {
            if (getNumeralsSum(i) == K) {
                t[count] = i;
                count++;
            }
        }

        return t;//return Arrays.copyOf(t, count);
    }

    //    13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//    Для решения задачи использовать декомпозицию.
    public static void decomposition13() {
        System.out.println("Enter value N - >");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findTwins(n);
    }

    public static boolean numberPrime(int a) {
        if (1 < a) {
            for (int i = 2; i <= a / 2 + 1; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void findTwins(int n) {
        int oldPrime = 0;
        for (int i = n; i <= n * 2; i++) {
            if (numberPrime(i)) {
                if (oldPrime != 0) {

                    System.out.println("Twins: " + oldPrime + ", " + i);
                }
                oldPrime = i;
            }
        }
    }

    //    14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
//    если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
//    Для решения задачи использовать декомпозицию.
    public static void decomposition14() {
        int k = 10000;

        findArmstrongNumbers(k);

    }

    private static int getNumeralsCount(int a) {
        return (int) Math.log10(a) + 1;
    }

    private static void findArmstrongNumbers(int k) {
        for (int i = 1; i <= k; i++) {
            if (isNumberOccurArmstrong(i)) {
                System.out.println("Armstrong number: " + i);
            }
        }
    }

    private static boolean isNumberOccurArmstrong(int a) {
        int n = getNumeralsCount(a);
        int sum = 0;
        int backup = a;
        while (a > 0) {
            sum += Math.pow(a % 10, n);
            a /= 10;
        }
        if (sum == backup) {
            return true;
        } else {
            return false;
        }
    }

    //    15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
    public static void decomposition15() {
        int n = 3;
        findNumbersWithIncreaseNumerals(n);
    }

    private static void findNumbersWithIncreaseNumerals(int n) {
        int first = getMinNumber(n);
        int last = getMaxNumber(n);

        for (int i = first; i < last; i++) {
            if (isNumberWithIncreaseNumerals(i)) {
                System.out.println("Num with incr numerals: " + i);
            }
        }

    }

    private static boolean isNumberWithIncreaseNumerals(int a) {
        int old = -1;
        while (a > 0) {
            int n = a % 10;
            if (old != -1) {
                if (old <= n) {
                    return false;
                }
            }
            old = n;
            a /= 10;
        }
        return true;
    }

    private static int getMinNumber(int n) {
        int a = 1;
        for (int i = 1; i < n; i++) {
            a *= 10;
        }
        return a;
    }

    private static int getMaxNumber(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            a *= 10;
        }
        return a;
    }

    //  16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    //  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
    public static void decomposition16() {
        int n = 3;

        int sum = findSumNumbersWithOddNumerals(n);
        System.out.println("Sum of numbers with odd numerals: " + sum);

        int k = findEvenNumeralsCount(sum);
        System.out.println("Count of even numerals in sum: " + k);

    }

    private static int findEvenNumeralsCount(int a) {
        int k = 0;
        while (a > 0) {
            int n = a % 10;
            if (n % 2 == 0) {
                k++;
            }
            a /= 10;
        }
        return k;
    }

    private static int findSumNumbersWithOddNumerals(int n) {
        int first = getMinNumber16(n);
        int last = getMaxNumber16(n);

        int sum = 0;
        for (int i = first; i < last; i++) {
            if (isNumberConsistOfOddNumerals(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isNumberConsistOfOddNumerals(int a) {
        while (a > 0) {
            int n = a % 10;
            if (n % 2 == 0) {
                return false;
            }
            a /= 10;
        }
        return true;
    }

    private static int getMinNumber16(int n) {
        int a = 1;
        for (int i = 1; i < n; i++) {
            a *= 10;
        }
        return a;
    }

    private static int getMaxNumber16(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            a *= 10;
        }
        return a;
    }

    //    17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.----
    public static void decomposition17() {
        int a = 1234;
        System.out.println("Number: " + a);

        int k = getActionCount(a);
        System.out.println("Actions count: " + k);
    }

    private static int getActionCount(int a) {
        int k = 0;
        while (a > 0) {
            a -= getNumeralsSum17(a);
            k++;
        }
        return k;
    }

    private static int getNumeralsSum17(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}

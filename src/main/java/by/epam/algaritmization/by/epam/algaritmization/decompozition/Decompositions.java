package by.epam.algaritmization.by.epam.algaritmization.decompozition;

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
        decomposition4();
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
}

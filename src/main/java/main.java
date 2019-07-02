
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    static int[] A;
    static double[] B;
    static int n;
    static int m;
    static int k;
    //====================
    private static int[][] magicSquare;
    //private static int n = 0;
    //=================

    public static void main(String[] args) {
//        Одномерные массивы
//        1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        // funtionArray1();

        /////////////////=============================================================
//        2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.
        //  funtionArray2();

//        3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов.
        // funtionArray3();
        // 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
        //   funtionArray4();
        /// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
        // funtionArray5();
//        6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//        являются простыми числами.
        // functionArray6();
//       7. Даны действительные числа n a ,a , ,a 1 2  . Найти
//        max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .
        //  functionArray7();
//        8.Дана последовательность целых чисел a1, a2, …an.
//                Образовать новую последовательность, выбросив из исходной, те члены, которые равны min(a1, a2, …an)
        //     funtionArray8();
//        9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//        чисел несколько, то определить наименьшее из них.
        //    funtionArray9();
//        10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//        элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
        //     functionArray10();
        //////////////////////////////Задачи. Массивы массивов////////////////////////
//        1.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
        //funtionMatrix1();
        //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        // functionMatrix2();

        // 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        // functionMatrix3();
        //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        //functionMatrix4();
        //5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное
        //functionMatrix5();
        //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        //  functionMatrix6();
        // 7. Сформировать квадратную матрицу порядка N по правилу:
        //  functionMatrix7();
//        8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//        на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//        пользователь с клавиатуры
        // functionMatrix8();
        //    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//    столбец содержит максимальную сумму.
        // functionMatrix9();
        // 10. Найти положительные элементы главной диагонали квадратной матрицы.
        //functionMatrix10();
//        11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//        которых число 5 встречается три и более раз.
        // functionMatrix11();
        //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        // functionMatrix12();
//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
        // functionMatrix13();
//        14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//        единиц равно номеру столбца.
        // functionMatrix14();
        // 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        // functionMatrix15();
//        16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//        собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//        6 1 8
//        7 5 3
//        2 9 4
        functionMatrix16();


    }

    public static void enterArrayInt() {
        System.out.println(" Enter amount of elements array - >");
        n = scanner.nextInt();
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Enter - >" + i + " element - > ");
            A[i] = scanner.nextInt();
        }
    }

    public static void enterArrayDouble() {
        System.out.println(" Enter amount of elements array - >");
        n = scanner.nextInt();
        B = new double[n];
        for (int i = 0; i < B.length; i++) {
            System.out.print("Enter - >" + i + " element (double) - > ");
            B[i] = scanner.nextDouble();
        }
    }

    public static int[][] fillMatrix() {
        System.out.println(" Enter amount of elements Matrix - >");
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] M = new int[m][k];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = (int) (Math.random() * 10);
                System.out.print(M[i][j] + ", ");
            }
            System.out.println();
        }
        return M;

    }

    public static void outputArrayDouble(double[] arrayDouble) {
        for (int i = 0; i < arrayDouble.length; i++) {

            System.out.println(i + " element - > " + B[i]);
        }
    }

    public static void outputArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println(i + " element - > " + A[i]);
        }
    }

    //        1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    public static void funtionArray1() {
        int summ = 0;
//        System.out.println(" Enter amount of elements array - >");
//         n = scanner.nextInt();
        enterArrayInt();
        System.out.println("Enter of divider k =");
        int k = scanner.nextInt();

        for (int i = 0; i < A.length; i++) {

            if (A[i] % k == 0) {

                summ += A[i];
            }
        }
        System.out.println(" Summa - > " + summ);
    }

    //2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//    числом. Подсчитать количество замен.
    public static void funtionArray2() {
        int numberLinks = 0;
        enterArrayInt();
        int z = 0;
        System.out.println(" Enter number for change - > ");
        z = scanner.nextInt();
        for (int i = 0; i < A.length; i++) {

            if (A[i] > z) {

                A[i] = z;
                numberLinks++;

            }

        }
        outputArrayInt(A);
        System.out.println("Number of replasments = > " + numberLinks);
    }

    //     3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//     положительных и нулевых элементов.
    public static void funtionArray3() {
        double minusElem = 0;
        double plusElem = 0;
        int nullElem = 0;
        enterArrayInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                minusElem++;
            } else if (A[i] > 0) {

                plusElem++;
            } else if (A[i] == 0) {
                nullElem++;
            }
        }
        System.out.println(" Elements < 0 => " + minusElem + "  Elements > 0 =>  " + plusElem + " Elements = 0 =>  " + nullElem);


    }

    ///4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    public static void funtionArray4() {
        //double [] arry = new double[n];
        int minIndex = 0;
        int maxIndex = 0;
        enterArrayDouble();
        if (B != null) {
            for (int i = 0; i < B.length; i++) {
                if (B[i] < B[minIndex]) {
                    minIndex = i;
                } else if (B[i] > B[maxIndex]) {
                    maxIndex = i;
                }

            }

        }
        double arrayTemp = B[minIndex];
        B[minIndex] = B[maxIndex];
        B[maxIndex] = arrayTemp;

        outputArrayDouble(B);

    }

    /////5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    public static void funtionArray5() {
        enterArrayInt();
        if (A != null) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] > i) {
                    System.out.println(" Conditions (аi > i) - >" + A[i]);

                }
            }
        }

    }

    //    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//    являются простыми числами.
//Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя —
//    единицу и самого себя[1]. Другими словами, число {\displaystyle x} x является простым, если оно больше
//    {\displaystyle 1} 1 и при этом делится без остатка только на {\displaystyle 1} 1 и на {\displaystyle x} x.
//    К примеру, {\displaystyle 5} 5 — простое число, а {\displaystyle 6} 6 является составным числом, так как, помимо
//    {\displaystyle 1} 1 и {\displaystyle 6} 6, также делится на {\displaystyle 2} 2 и на {\displaystyle 3} 3.
    public static void functionArray6() {
        enterArrayDouble();
        double summ = 0;
        if (B != null) {
            for (int i = 0; i < B.length; i++) {

                if (i > 1 && i % 1 % i == 0) {
                    summ += B[i];

                }

            }
            System.out.println(" Total summ - > " + summ);

        }

    }

    //7. Даны действительные числа n a ,a , ,a 1 2  . Найти
//    max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .
    public static void functionArray7() {
        int maxSumm = 0;
        enterArrayInt();
        if (A != null) {
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = A.length - 1; j > i; j--) {

                    maxSumm += A[i] + A[j];
                }


            }
            System.out.println(" Max summ - > " + maxSumm);
        }

    }

    //   8. Дана последовательность целых чисел a1, a2, …an.
//    Образовать новую последовательность, выбросив из исходной, те члены, которые равны min(a1, a2, …an)
    public static void funtionArray8() {
        enterArrayInt();
        int[] array = new int[9];
        if (A != null) {

            for (int i = 0; i < A.length; i++) {
                int min = A[0];
                if (A[i] > min) {

                    array[i] = A[i];
                    System.out.println(" - > " + array[i]);
                }
            }
        }

    }

    //    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//    чисел несколько, то определить наименьшее из них.
    public static void funtionArray9() {
        enterArrayInt();
        int[] freq = new int[A.length];
        int globalFreqCounter = 0;
        for (int i = 0; i < A.length; i++) {
            int counter = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == A[i]) {
                    counter++;
                }
            }
            freq[i] = counter;
            if (counter > globalFreqCounter) {
                globalFreqCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == globalFreqCounter && A[i] < result) {
                result = A[i];
            }
        }

        System.out.println(result);
    }

    //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    public static void functionArray10() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i <= array.length; i = i + 2) {
//            int j = 0;
//            array[j] = array[i];
//            j++;
//            System.out.print("<-> " + array[j]);
            array[i] = 0;
            System.out.println(" " + array[i]);


        }
    }
    // Arrays.fill();

    /////////===========Задачи. Массивы массивов
    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void funtionMatrix1() {
        int[][] matrix = fillMatrix();

        System.out.println("----------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0 && matrix[0][j] > matrix[matrix.length - 1][j]) {

                    System.out.print(matrix[i][j] + ", ");
                }

            }
            System.out.println();

        }


    }
    ///  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void functionMatrix2() {
        System.out.println(" Matrix is square!!! ");
        int[][] array = fillMatrix();
        int summ = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    summ += array[i][j];
                }
            }

        }
        System.out.println("The sum of dioganal - >" + summ);

    }

    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void functionMatrix3() {
        int[][] array = fillMatrix();
        System.out.println(" Enter line for output - >");
        int k = scanner.nextInt();
        System.out.println(" Enter column for output - >");
        int p = scanner.nextInt();
        System.out.print("Line - > ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == (k - 1)) {
                    System.out.print(" ," + array[i][j]);
                }
            }
        }
        System.out.println("\n Column - > ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == (p - 1)) {
                    System.out.println(" ," + array[i][j]);
                }
            }


        }
    }

    // 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void functionMatrix4() {
        System.out.print(" enter n - >");
        int num = scanner.nextInt();
        int k = 0;
        int[][] arr = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = j + 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[i][j] = j + 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

    //5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    public static void functionMatrix5() {
        System.out.print(" enter n ( n is even) - >");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            int[][] arr = new int[num][num];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = i + 1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - i; j < arr.length; j++) {
                    arr[i][j] = 0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println(" Check n (n is even!!!!)");

        }


    }

    // 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void functionMatrix6() {
        System.out.print(" enter n ( n is even) - >");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            int[][] array = new int[num][num];


            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {

                    for (int j = i; j < array.length - i; j++) {
                        array[i][j] = 1;
                    }
                } else {

                    for (int j = array.length - i - 1; j <= i; j++) {
                        array[i][j] = 1;
                    }

                }

            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println(" Check n (n is even!!!!)");
        }

    }


    //7. Сформировать квадратную матрицу порядка N по правилу:
    // A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов
    public static void functionMatrix7() {
        System.out.print(" enter n ( n is even) - >");
        int num = scanner.nextInt();
        int counter = 0;
        if (num % 2 == 0) {

            double[][] array = new double[num][num];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / array.length);
                    if (array[i][j] > 0) {
                        counter++;
                    }
                }

            }
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println(" Check n (n is even!!!!)");
        }
        System.out.println(" Count positive elements = >" + counter);

    }

    //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//    пользователь с клавиатуры
    public static void functionMatrix8() {
        int[][] array = fillMatrix();
        System.out.println("Input number of first column = >");
        int firstColunm = scanner.nextInt() - 1;
        System.out.println("Input number of second column = >");
        int secondColumn = scanner.nextInt() - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int arr = array[i][firstColunm];
                array[i][firstColunm] = array[i][secondColumn];
                array[i][secondColumn] = arr;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }


    //    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//    столбец содержит максимальную сумму.
    public static void functionMatrix9() {

        int[][] array = fillMatrix();
        int summElem = 0;
        int maxColmIndex = 0;
        int maxSummElem = summElem;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                summElem += array[i][j];
            }
            if (maxSummElem < summElem) {
                maxSummElem = summElem;
                maxColmIndex = (j + 1);
            }
            System.out.println(" Summ = > " + summElem + " column" + (j + 1));
            summElem = 0;
        }
        System.out.println(" Max = > " + maxColmIndex + " \n MaxSumm =>  " + maxSummElem);
    }

    //10. Найти положительные элементы главной диагонали квадратной матрицы.
    public static void functionMatrix10() {
        System.out.print(" enter n ( n is even) - >");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10 - 5);
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("===============================================");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
    }

    //    11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//    которых число 5 встречается три и более раз.
    public static void functionMatrix11() {
        System.out.println(" Matrix - > 10x20 ");
        int[][] array = new int[10][20];
        int[] arr = new int[10];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + ", ");
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (3 <= counter) {
                arr[i] = (i + 1);
            }
            counter = 0;
            System.out.println();
        }
        System.out.println("Number line - >");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    // 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public static void functionMatrix12() {
        int[][] array = fillMatrix();
        System.out.println("==========Sorted in descending order===========");
        boolean isSort = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i][j - 1] < array[i][j]) {
                    int temp = array[i][j];
                    array[i][j] = array[i][j - 1];
                    array[i][j] = temp;
                }
            }

            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");
            }

        }

        System.out.println("==========Sorted in ascending order===========");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i][j - 1] > array[i][j]) {
                    int temp = array[i][j];
                    array[i][j] = array[i][j - 1];
                    array[i][j - 1] = temp;

                }
            }
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");
            }
        }
    }

    //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    public static void functionMatrix13() {
        int[][] array = fillMatrix();
        System.out.println("==========Sorted in descending order===========");

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[j][i] < array[j][i + 1]) {
                    int temp = array[i][j + 1];
                    array[j][i + 1] = array[j][i];
                    array[j][i] = temp;
                }
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[j][i] + " ,");
            }
        }

        System.out.println("==========Sorted in ascending order===========");
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < j; i++) {
                if (array[j][i] > array[j][i + 1]) {
                    int temp = array[i][j];
                    array[j][i] = array[j][+1];
                    array[j][i + 1] = temp;

                }
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[j][i] + " ,");
            }
        }

    }

    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
    public static void functionMatrix14() {
        System.out.println(" Enter amount of elements Matrix - >");
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] array = new int[m][k];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {

                while (i != count) {
                    int index1 = (int) (Math.random() * k);

                    if (array[index1][i] != 1) {
                        array[index1][i] = 1;
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void functionMatrix15() {
        int[][] array = fillMatrix();
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println("Max element - >" + maxElement);
        System.out.println(" Modified array = > ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxElement;
                }
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //    16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//            ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//    собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//            6 1 8
//            7 5 3
//            2 9 4
    public static void functionMatrix16() {

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter N(n>=3) = ");
            n = in.nextInt();
        } while (n < 3);

        magicSquare = magicSquate(n);

        System.out.println("\nMagic Square:");
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }


    private static int[][] magicSquate(int sizeMatrix) {
        //нечетное n
        if ((n - 1) % 2 == 0) {
            magicSquare = magicSquare3();
//кратно 4
        } else if (n % 4 == 0) {
            magicSquare = magicSquare4(n);
//кратно 2
        } else {
            magicSquare = magicSquare2();
        }
        return magicSquare;
    }

    private static int[][] magicSquare3() {
        magicSquare = new int[n][n];

        int i = 0;
        int j = (n - 1) / 2;
        magicSquare[i][j] = 1;
        i--;
        j++;

        for (int element = 2; element <= n * n; element++, i--, j++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (magicSquare[i][j] != 0) {
                i += 2;
                j--;
            }
            magicSquare[i][j] = element;
        }
        return magicSquare;
    }

    private static int[][] magicSquare4(int n) {

        magicSquare = new int[n][n];
        int element = 1;

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                magicSquare[i][j] = element;
                element++;
            }
        }

        int tempElement;

        for (int i = 0; i < magicSquare.length / 2; i++) {
            for (int j = 0; j < magicSquare.length / 2; j++) {
                if (i == j) {
                    tempElement = magicSquare[i][j];
                    magicSquare[i][j] = magicSquare[magicSquare.length - 1 - i][magicSquare.length - 1 - j];
                    magicSquare[magicSquare.length - 1 - i][magicSquare.length - 1 - j] = tempElement;
                }
            }
        }

        for (int i = 0, j = magicSquare.length - 1 - i; i <= (magicSquare.length / 2) - 1; ++i, --j) {
            tempElement = magicSquare[i][j];
            magicSquare[i][j] = magicSquare[j][i];
            magicSquare[j][i] = tempElement;
        }

        return magicSquare;
    }

    private static int[][] magicSquare2() {
        int[][] magicSquare2 = new int[n][n];
        int[][] matrixTemp = magicSquare4(n - 2);

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                magicSquare2[i][j] = matrixTemp[i - 1][j - 1] + 2 * (n - 1);
            }
        }

        int k = n * n + 1;

        magicSquare2[0][0] = 3 * n / 2 - 1;
        magicSquare2[0][n - 1] = 1;
        magicSquare2[n - 1][0] = k - 1;
        magicSquare2[n - 1][n - 1] = k - 3 * n / 2 + 1;

        int i = 0;
        int j = 0;
        for (i = 1; i <= n / 2 - 2; i++) {
            magicSquare2[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= n / 2; j++) {
            magicSquare2[0][j + i - 1] = k - 2 * j;
        }

        for (j = 1; j < n - 1; j++) {
            magicSquare2[n - 1][j] = n * n + 1 - magicSquare2[0][j];
        }

        magicSquare2[1][0] = 2 * n / 2 - 1;
        for (i = 1; i <= n / 2 / 2; i++) {
            magicSquare2[i + 1][0] = 3 * n / 2 - 1 - i;
        }

        i--;

        for (j = 1; j <= n / 2 / 2 + 1; j++) {
            magicSquare2[i + j + 1][0] = k - 4 * n / 2 + 1 + j;
        }

        j--;

        for (int q = 1; q <= n / 2 / 2 - 1; q++, i++) { //??
            magicSquare2[i + j + q + 1][0] = 3 * n / 2 - 1 + q;
            magicSquare2[i + j + q + 2][0] = k - 2 * n / 2 - q;
        }

        for (i = 1; i < n - 1; i++) {
            magicSquare2[i][n - 1] = n * n + 1 - magicSquare2[i][0];
        }

        return magicSquare2;
    }
}



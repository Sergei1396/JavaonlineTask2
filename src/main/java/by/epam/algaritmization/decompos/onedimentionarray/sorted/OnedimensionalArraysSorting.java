package by.epam.algaritmization.decompos.onedimentionarray.sorted;

import java.util.Scanner;

public class OnedimensionalArraysSorting {

    public static void main(String[] args) {
//        1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.
        // oneDimenArraySort1();
        //// 2.Даны две последовательности a1 < a2 <...< an и b1 < b2 <...< bm.
//// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
//// Примечание. Дополнительный массив не использовать.
        // oneDimenArraySort2();
        //3.Сортировка выбором. Дана последовательность чисел а1<=a2<=...<=an.
//Требуется переставить элементы так, чтобы они были расположены по
//убыванию. Для этого в массиве, начиная с первого, выбирается
//наибольший элемент и ставится на первое место, а первый - на место
//наибольшего. Затем, начиная со второго, эта процедура повторяется.
//Написать алгоритм сортировки выбором.
        //oneDimenArraySort3();
        //   4. Сортировка обменами. Дана последовательность чисел a_1 < a_2 < ... < a_n.
//    Требуется переставить числа в порядке возрастания.
//    Для этого сравниваются два соседних числа a_i и a_i+1.
//    Если a_i < a_i+1. 1, то делается перестановка.
//    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
        //oneDimenArraySort4();
        //  5. Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an.
//   Требуется переставить числа в порядке возрастания. Делается это следующим
//   образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
//   a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в после-
//  довательность так, чтобы новая последовательность была тоже возрастающей.
//   Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
//   перебраны. Примечание. Место помещения очередного элемента в отсортированную
//   часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
//   отдельной функции.
        //oneDimenArraySort5();
//        6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//                Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
//        на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
//        Составить алгоритм этой сортировки.
        // oneDimenArraySort6();
//7.  Пусть даны две неубывающие последовательности действительных
// чисел  a1 < a2 < ... < an и b1 < b2 < ... <bm .
// Требуется указать те места, на которые нужно вставлять элементы
// последовательности b1 < b2 < ... <bm в первую  последовательность так,
// чтобы новая последовательность оставалась возрастающей.
        //oneDimenArraySort7();
// 8.Даны дроби  p1/q1, p2/q2, ... , pn/qn  ( pi, qi - натуральные).
//Составить программу, которая приводит эти дроби к общему  знаменателю и упорядочивает их в порядке возрастания.
        oneDimenArraySort8();
    }

    public static int[] fillOneDimenArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    public static void outPutOnedimenArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }

    //    1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//    дополнительный массив.
    public static void oneDimenArraySort1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array1  N : ");
        int sizeArray_1 = scanner.nextInt();

        System.out.print("Enter size of array2  N : ");
        int sizeArray_2 = scanner.nextInt();

        System.out.print("Enter k (k<sizeOfArray1) : ");
        int k = scanner.nextInt();

        int[] array_1 = fillOneDimenArray(sizeArray_1);
        for (int i : array_1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] array_2 = fillOneDimenArray(sizeArray_2);
        for (int i : array_2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] array_12 = new int[array_1.length + array_2.length];

        for (int i = 0; i < array_12.length; i++) {
            if (i <= k) {
                array_12[i] = array_1[i];
            } else if (i > k && i <= k + array_2.length) {
                array_12[i] = array_2[i - k - 1];
            } else {
                array_12[i] = array_1[i - array_2.length];
            }
        }

        for (int i : array_12) {
            System.out.print(i + "\t");
        }
    }

    //// 2.Даны две последовательности a1 < a2 <...< an и b1 < b2 <...< bm.
//// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
//// Примечание. Дополнительный массив не использовать.
    public static void oneDimenArraySort2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number of items 1 - > ");
        int n = scanner.nextInt();
        int[] array_1 = fillOneDimenArray(n);
        System.out.print(" \n Enter the number of items 2 - > ");
        int m = scanner.nextInt();
        int[] array_2 = fillOneDimenArray(m);
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array_1.length - j; i++) {
                if (array_1[i] > array_1[i + 1]) {
                    tmp = array_1[i];
                    array_1[i] = array_1[i + 1];
                    array_1[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        j = 0;
        swapped = true;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array_2.length - j; i++) {
                if (array_2[i] > array_2[i + 1]) {
                    tmp = array_2[i];
                    array_2[i] = array_2[i + 1];
                    array_2[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        System.out.print("\n Sequence 1 = >");
        outPutOnedimenArray(array_1);
        System.out.print("\n Sequence 2 = >");
        outPutOnedimenArray(array_2);
        System.out.println(" \n New sequence = >");
        int[] newArray = new int[array_1.length + array_2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array_1.length) {
                newArray[i] = array_1[i];
            } else {
                newArray[i] = array_2[i - array_1.length];
            }

        }
        j = 0;
        swapped = true;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < newArray.length - j; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    tmp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        outPutOnedimenArray(newArray);
    }
//3.Сортировка выбором. Дана последовательность чисел а1<=a2<=...<=an.
//Требуется переставить элементы так, чтобы они были расположены по
//убыванию. Для этого в массиве, начиная с первого, выбирается
//наибольший элемент и ставится на первое место, а первый - на место
//наибольшего. Затем, начиная со второго, эта процедура повторяется.
//Написать алгоритм сортировки выбором.

    public static void oneDimenArraySort3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array n : ");
        int n = scanner.nextInt();
        int[] array = fillOneDimenArray(n);
        int maxIndex;
        int temp;
        for (int i = 0; i < array.length; i++) {
            maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;


        }
        System.out.println("\n Sorted array = >");
        outPutOnedimenArray(array);
    }

    //   4. Сортировка обменами. Дана последовательность чисел a_1 < a_2 < ... < a_n.
//    Требуется переставить числа в порядке возрастания.
//    Для этого сравниваются два соседних числа a_i и a_i+1.
//    Если a_i < a_i+1. 1, то делается перестановка.
//    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
    public static void oneDimenArraySort4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array n : ");
        int n = scanner.nextInt();
        int[] array = fillOneDimenArray(n);
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        System.out.println("\n Sorted array = >");
        outPutOnedimenArray(array);
    }


//  5. Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an.
//   Требуется переставить числа в порядке возрастания. Делается это следующим
//   образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
//   a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в после-
//  довательность так, чтобы новая последовательность была тоже возрастающей.
//   Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
//   перебраны. Примечание. Место помещения очередного элемента в отсортированную
//   часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
//   отдельной функции.

    public static void oneDimenArraySort5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array n : ");
        int n = scanner.nextInt();
        int[] array = fillOneDimenArray(n);// j >=0 && array[j] > tmp
        int i = 0, j;
        for (i = (i + 1); i <= array.length - 1; i++) {
            int tmp = array[i];
            for (j = i - 1; j >= 0 && array[j] > tmp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
        System.out.println("\nSorted array = >");
        outPutOnedimenArray(array);
    }
//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//    Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
//    на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
//    Составить алгоритм этой сортировки.

    public static void oneDimenArraySort6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array n : ");
        int n = scanner.nextInt();
        int[] array = fillOneDimenArray(n);
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        System.out.println("\nSorted array = >");
        outPutOnedimenArray(array);
    }

    //7.  Пусть даны две неубывающие последовательности действительных
// чисел  a1 < a2 < ... < an и b1 < b2 < ... <bm .
// Требуется указать те места, на которые нужно вставлять элементы
// последовательности b1 < b2 < ... <bm в первую  последовательность так,
// чтобы новая последовательность оставалась возрастающей.
    public static void oneDimenArraySort7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array 1 n : ");
        int n = scanner.nextInt();
        System.out.print("Enter size of array 2 m : ");
        int m = scanner.nextInt();
        int[] array_1 = new int[n];
        array_1 = fillOneDimenArray(n);
        System.out.println("\n=======================");
        int[] array_2 = new int[m];
        array_2 = fillOneDimenArray(m);
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array_1.length - j; i++) {
                if (array_1[i] > array_1[i + 1]) {
                    tmp = array_1[i];
                    array_1[i] = array_1[i + 1];
                    array_1[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        System.out.println("\nSorted array = >");
        outPutOnedimenArray(array_1);
        swapped = true;
        j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array_2.length - j; i++) {
                if (array_2[i] > array_2[i + 1]) {
                    tmp = array_2[i];
                    array_2[i] = array_2[i + 1];
                    array_2[i + 1] = tmp;
                    swapped = true;
                }
            }

        }
        System.out.println("\n Sorted array = >");
        outPutOnedimenArray(array_2);
        System.out.println("\n Places for array B in array A: ");
        int indexA = 0;
        for (int i = 0; i < array_1.length; i++) {
            while (indexA < array_1.length && array_1[indexA] < array_2[i]) {
                indexA++;
            }
            System.out.println(i + " " + array_2[i] + ", place: " + indexA);
        }

    }

    //8.Даны дроби  p1/q1, p2/q2, ... , pn/qn  ( pi, qi - натуральные.)
    // Составить программу, которая приводит эти дроби к общему  знаменателю
    // и упорядочивает их в порядке возрастания.
    public static void oneDimenArraySort8() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter size of array 1 n : ");
//        int n = scanner.nextInt();
//        System.out.print("Enter size of array 2 m : ");
//        int m = scanner.nextInt();
        int n = 5;
        int[] array_1 = new int[n];
        for (int i = 0; i < array_1.length; i++) {
            array_1[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array_1[i] + ", ");
        }
        System.out.println("\n=======================");
        int[] array_2 = new int[n];
        for (int i = 0; i < array_2.length; i++) {
            array_2[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array_2[i] + ", ");
        }

        int[] array_3 = new int[n];


        for (int i = 0; i < array_3.length; i++) {
            array_3[i] = resultFractions(array_1[i], array_2[i]);

        }
        System.out.println("\n ===========================");
        outPutOnedimenArray(array_3);
        System.out.println("\n Array is after the sorted = >");
        for (int i = 0; i < array_3.length; i++) {
            for (int j = 0; j < array_3.length - i - 1; j++) {
                if (array_3[j] > array_3[j + 1]) {
                    int tmp = array_3[j];
                    array_3[j] = array_3[j + 1];
                    array_3[j + 1] = tmp;
                }
            }
        }
        outPutOnedimenArray(array_3);

    }

    public static int resultFractions(int a, int b) {

        return (a * b) / commonDenominator(a, b);
    }

    public static int commonDenominator(int a, int b) {
        if (a > 0 && b > 0) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        } else {

            System.out.println("Impossible to divide by zero");
        }

        return 1;
    }
}


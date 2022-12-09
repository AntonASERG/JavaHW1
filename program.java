/**
 * program начало работы -метод статический работа с массивом строк МЕЙН
 */
// чтоб выводить массивы
import java.util.Arrays;


public class program {
    public static void main(String[] args) {
        // 1
        System.out.println(sumInRange(13, 2));
        // 2
        posOrNeg(-1);
        // 3
        System.out.println(trueNeg(13));
        // 4
        printStr("3 сентября...", 4);
        // 5
        System.out.println(leapYear(100));
        // 6
        int [] binArray = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(rotateArr(binArray)));
        // 7
        int [] arr7 = new int [100];
        System.out.println(Arrays.toString(arr123(arr7)));
        // 8
        int [] arr8 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr2x6(arr8)));
        // 9
        qArr(4);
        // 10
        System.out.println(Arrays.toString(arrParams(5,6)));
        // 11
        int [] arr10 = { 1, 5, 3, 2, 11, 4, 5, 22, 4, 8, 9, 23 };
        maxMin(arr10);



    }
    // // 1 Написать метод, принимающий на вход два целых числа и проверяющий, 
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //  в противном случае – false.

    static boolean sumInRange(int a, int b){
        if (10<=(a+b) && (a+b)<=20){
            return true; 
        }
        else{
            return false;
        }
    }

    // 2. Написать метод, которому в качестве параметра передается целое число, 
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
    // Замечание: ноль считаем положительным числом.

    static void posOrNeg (int a){
        if (a<0){
            System.out.println("Число отрицательное");
        }
        else{
            System.out.println("Число положительное");
        }
    }
    
    //3.  Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false
    // если положительное
    static boolean trueNeg(int a){
        if (a<0){
            return true; 
        }
        else{
            return false;
        }
    }
    // Написать метод, которому в качестве аргументов передается строка и число,
    //  метод должен отпечатать в консоль указанную строку, указанное количество раз;
    
    static void printStr(String strA, int a){
        for(int i = 0;i<a;i++)
        {
        System.out.print(strA +"\n");
        }
    }

// // 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//  (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
//   100-го, при этом каждый 400-й – високосный. .
    static boolean leapYear(int a){
        if (a%100 == 0){
            return false; 
        }
        else if (a%4 == 0){
            return true; 
        }
        else{
            return false;
        }
    }

//    6. // Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static int [] rotateArr(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        return arr;
    }
    
// 7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить 
//  его значениями 1 2 3 4 5 6 7 8 … 100;
    static int[] arr123 (int arr[]) {
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }
        return arr;
    }

// 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//  и числа меньшие 6 умножить на 2;
    static int[] arr2x6 (int arr[]) {
        for(int i = 0;i<arr.length;i++){
            if (arr[i] < 6){
                arr[i] *=2;
            }
        }
        return arr;
    }

// 9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
// , и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из 
// диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему 
// принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    static void qArr (int n) {
        int[][] array = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int j = 0; j<n; j++){
                if (k==j){
                    array[k][j] = 11;
                }
                else if (k+j == n-1){
                    array[k][j] = 11;
                }
                else{
                    array[k][j] = (k*10+j);   
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
        }
    }
// 10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//  одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    static int[] arrParams (int len, int initialValue) {
        int[] arr = new int [len];
        for(int i = 0;i<len;i++){
            arr[i] = initialValue;
        }
        return arr;
    }
// 11* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
  
    static void maxMin (int[] array) {
        
        Arrays.sort(array);

        int maxNum = array[array.length - 1];
        System.out.println("Max = " + maxNum);

        int minNum = array[0];
        System.out.println("Max = " + minNum);
    }

}



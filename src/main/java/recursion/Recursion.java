package recursion;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Recursion {
    public static void main(String[] args) {
    // С клавиатуры в консоль задается число n, вывести в консоль все числа от 1 до n в строку
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<n+1; i++){
            System.out.print(i +" ");
        }


        // C клавиатуры в консоль задается натуральное число n1, m. Вывести все числа в консоль от меньшего к большему
        System.out.println("\n Введите первое число");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int m = scanner.nextInt();
        if (n1<m){
            for(int j=n1; j<m+1; j++){
                System.out.print(j +" ");
            }
        }
        else {
            for(int a=m; a<n1+1; a++){
                System.out.print(a +" ");
            }
        }

        // C клавиатуры в консоль задается натуральное число,вывести в консоль сумму его цифр, не используя строки,списки, массивы
        System.out.println("Введите число");
        int b = scanner.nextInt();
        int sum=0;
        for(int c = 0; c<b+1; c++){
            sum = sum+c;
        }
        System.out.println(sum);

        //C клавиатуры в консоль задается натуральное число, вывести в консоль все его цифры в обратном порядке, не используя строки, списки и массивы
        System.out.println("Введите число");
        int d = scanner.nextInt();
        for( int e=d; e>0; e--){
            System.out.print(e + " ");
        }

        // C клавиатуры вводится число. Требуется проверить входит ли заданное число в массив чисел при помощи алгоритма бинарного поиска
        System.out.println("Введите число");
        int f = scanner.nextInt();
        int[] nums = {1, 4, 7, 9, 1, 9, 25, 46, 74, 67};


        Arrays.sort(nums); // для бин поиска массив должен быть отсортирован
        if(binarySearch(nums, 0, 9, f) >-1){
            System.out.println("Введенное число находится в массиве");
        }
        else{
            System.out.println("Введенное число не находится в массиве");
        }
    }
}


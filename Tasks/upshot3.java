package Tasks;

import java.util.Scanner;

public class upshot3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int value = scan.nextInt();
        int[]arr = new int[value];
        System.out.print("Укажите элементы массива: ");
        for (int i = 0; i < value; i++){
            arr[i] =scan.nextInt();
        }
        System.out.println("Вывести элементы массива кратные 3: ");
        for (int i = 0; i < value; i++){
            if (arr[i] % 3 == 0){
                System.out.println(arr[i]);
            }
        }

        }
    }


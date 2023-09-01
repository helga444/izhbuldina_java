import java.util.Scanner;
public class upshot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = scan.nextInt();
        if (value>7){
            System.out.println("Привет");
        }
    }
}

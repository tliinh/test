/*
 ài 6. Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ
bàn phím. Sau đó tính và in ra giai thừa của số đó.
 */
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên dương: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        System.out.printf("%d! = %d", n, a);
        sc.close();

    }
}

  
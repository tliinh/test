/*
 Bài 5. Viết chương trình nhập vào các số nguyên và tính tổng các
số đó, nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo
tổng của các số đã nhập.
 */
import java.util.Scanner;
public class bai5 {
     public static void main(String[] args) {
            
            int sum = 0;
            Scanner sc = new Scanner(System.in);
    
            while (sum <= 100) {
                System.out.print("Nhập số nguyên: ");
                int num = sc.nextInt();
                sum += num;
            }
    
            System.out.println("Tổng các số đã nhập là: " + sum);
        sc.close();

        }
    }
     


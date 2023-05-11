/*
 Bài 4. Viết chương trình nhập vào một số nguyên từ 1 - 12 từ bàn
phím và hiển thị ra tháng tương ứng với số đó (nhập vào số 1 thì sẽ hiển
thị ra là "Tháng 1“)
 */
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào một số từ 1 đến 12: ");
            int ngay = sc.nextInt();//Đọc vào một số nguyên
            switch (ngay){
                case 1 : System.out.println("Tháng 1 ");
                        break;
                case 2: System.out.println("Tháng 2");
                        break;   
                case 3: System.out.println("Tháng 3");
                        break;   
                case 4: System.out.println("Tháng 4");
                        break;     
                case 5: System.out.println("Tháng 5");
                        break;
                case 6: System.out.println("Tháng 6");
                        break;
                case 7: System.out.println("Tháng 7");
                        break;
                case 8 : System.out.println("Tháng 8 ");
                        break;  
                case 9 : System.out.println("Tháng 9 ");
                        break;  
                case 10 : System.out.println("Tháng 10 ");
                        break;
                case 11 : System.out.println("Tháng 11 ");
                        break;
                case 12 : System.out.println("Tháng 12 ");
                        break;                 
                              
            }
        sc.close();

    }
    
}

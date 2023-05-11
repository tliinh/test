//  viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật và hiển thị ra màn hình area , perimeter
import java.util.Scanner;

public class lop3 {  // class chính
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.getInformation(); // phương thức nhập thông tin 
        r1.display(); // phương thức hiển thị thông tin
    }    
}

class Rectangle {  // lớp rectangle gồm 2 phương thức nhập , hiển thị thông tin 
    double length, width;
    public void getInformation(){ // nhập thông tin
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: " );
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
    }

    public double getArea(){ 
        return length * width; // trả về kết quả
    }
    public double getPerimeter(){
        return (length + width)*2;
    }
    public void display(){ // hiển thị thông tin
        System.out.println("Area: "+ getArea() );
        System.out.println("Perimeter: "+ getPerimeter() );
    }
 }

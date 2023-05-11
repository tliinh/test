// viết chương trình khai báo lớp Student
// trong 1 chương trình chỉ có 1 class khai báo public, tên file phải trùng với tên class này (class chính)
import java.util.Scanner;

public class lop2 {
	public static void main(String[]args) {
		student s1 = new student(); // khai báo đối tượng s1 thuộc lop2
		s1.getInformation();
		s1.display();
	}
}

 class student { // lớp student gồm 2 phương thức nhập và hiển thị thông tin
    String name;
	int age;
	public void getInformation(){ // phương thức nhập thông tin
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age  = sc.nextInt();
	}
	public void display(){ // phương thức hiển thị thông tin
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}



/*
 class lop2 {
	String name;
	int age;
	public void display(){
		System.out.println("My name is "+ name);
	}
 }

 public class Entry {
	public static void main (String[] args){
		lop2 s1 = new lop2 ();
		s1.name = "Linh" // gán giá trị cho thuộc tính name của đối tượng s1
		s1.display(); // gọi tới phương thức display của đối tượng s1
	}
}
 }
 */
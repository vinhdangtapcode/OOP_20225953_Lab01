import java.util.Scanner;
public class Phuongtrinhbacnhat {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Giai phuong trinh ax + b = 0");

		System.out.println("Nhap a: ");
		double a = input.nextDouble();

		System.out.println("Nhap b: ");
		double b = input.nextDouble();

		if(a!=0) System.out.println("x= "+(-b/a));
		else if(b==0) System.out.println("Phuong trinh co vo so nghiem x");
		else System.out.println("Phuong trinh vo nghiem");
		input.close();
	}
}
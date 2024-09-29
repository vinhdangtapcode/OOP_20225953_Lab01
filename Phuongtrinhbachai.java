import java.util.Scanner;
public class Phuongtrinhbachai {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Giai phuong trinh ax^2 + bx + c = 0");

		double a=0;
		while(a==0) {
			System.out.println("Nhap a: ");
			a = input.nextDouble();
		}

		System.out.println("Nhap b: ");
		double b = input.nextDouble();

		System.out.println("Nhap c: ");
		double c = input.nextDouble();

		double delta=b*b-4*a*c;
		double canbachaidelta=Math.sqrt(delta);

		if(delta>0) System.out.println("Phuong trinh co hai nghiem phan biet:\nx1 = "+((-b+canbachaidelta)/(2*a))+"; x2 = "+((-b-canbachaidelta)/(2*a)));
		else if(delta==0) System.out.println("Phuong trinh co nghiem kep x = "+(-b/(2*a)));
		else System.out.println("Phuong trinh vo nghiem");
		input.close();
	}
}
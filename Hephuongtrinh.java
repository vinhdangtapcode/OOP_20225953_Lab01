import java.util.Scanner;
public class Hephuongtrinh {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Giai he phuong trinh: \nax + by = m \ncx + dy = n ");

		System.out.println("Nhap a: ");
		double a = input.nextDouble();

		System.out.println("Nhap b: ");
		double b = input.nextDouble();

		System.out.println("Nhap m: ");
		double m = input.nextDouble();

		System.out.println("Nhap c: ");
		double c = input.nextDouble();

		System.out.println("Nhap d: ");
		double d = input.nextDouble();

		System.out.println("Nhap n: ");
		double n = input.nextDouble();

		double D = a*d-b*c;
		double Dx = m*d-n*b;
		double Dy = a*n-m*c;
		
		if(D!=0) System.out.println("He phuong trinh co nghiem:\nx = "+(Dx/D)+"; y = "+(Dy/D));
		else if(D==0&&Dx==0) System.out.println("He co vo so nghiem");
		else System.out.println("He vo nghiem");
			
			
	}
}
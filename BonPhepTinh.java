import java.util.Scanner;
public class BonPhepTinh {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap so thu nhat: ");
		double firstNum = input.nextDouble();

		System.out.println("Nhap so thu hai: ");
		double secondNum = input.nextDouble();

		System.out.println("Tong: "+(firstNum+secondNum));
		System.out.println("Hieu: "+(firstNum-secondNum));
		System.out.println("Tich: "+(firstNum*secondNum));
		if(secondNum!=0) System.out.println("Thuong: "+(firstNum/secondNum));
		else System.out.println("Khong co phep chia cho 0");
		input.close();
	}
}
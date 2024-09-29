import java.util.Scanner;
public class DisplayDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year=-1; 
		while(year<0) {
			System.out.println("Nhap nam:");
			year = input.nextInt();
		}
		int LeapYear=0;
		if((year%4==0&&year%100!=0)||year%400==0) LeapYear=1;
		String month;
		int correctMonth= 0;
		System.out.println("Nhap thang:");
		while(correctMonth==0) {
			correctMonth=1;
			month = input.nextLine();
			if(month.equals("January")||month.equals("Jan")||month.equals("1")) System.out.println("31");
			else if(month.equals("February")||month.equals("Feb")||month.equals("2")) {
				if(LeapYear==1) System.out.println("29");
				else System.out.println("28");
			}
			else if(month.equals("March")||month.equals("Mar")||month.equals("3")) System.out.println("31");
			else if(month.equals("April")||month.equals("Apr")||month.equals("4")) System.out.println("30");
			else if(month.equals("May")||month.equals("5")) System.out.println("31");
			else if(month.equals("June")||month.equals("Jun")||month.equals("6")) System.out.println("30");
			else if(month.equals("July")||month.equals("Jul")||month.equals("7")) System.out.println("31");
			else if(month.equals("August")||month.equals("Aug")||month.equals("8")) System.out.println("31");
			else if(month.equals("September")||month.equals("Sep")||month.equals("9")) System.out.println("30");
			else if(month.equals("October")||month.equals("Oct")||month.equals("10")) System.out.println("31");
			else if(month.equals("November")||month.equals("Nov")||month.equals("11")) System.out.println("30");
			else if(month.equals("December")||month.equals("Dec")||month.equals("12")) System.out.println("31");
			else correctMonth=0;
		}
		input.close();
	}
}

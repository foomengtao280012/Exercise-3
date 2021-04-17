import java.util.Scanner;

public class Shoes {
	String brand, colour, type;
	int size, quantity;
	double price, weight;
	Scanner scan = new Scanner(System.in);
	
	Shoes(){
		System.out.print("Enter brand\t : ");
		this.brand = scan.next()+scan.nextLine();
		System.out.print("Enter colour\t : ");
		this.colour = scan.next()+scan.nextLine();
		System.out.print("Enter type\t : ");
		this.type = scan.next()+scan.nextLine();
		System.out.print("Enter size\t : ");
		this.size = scan.nextInt();
		System.out.print("Enter quantity\t : ");
		this.quantity = scan.nextInt();
		System.out.print("Enter price\t : ");
		this.price = scan.nextDouble();
		System.out.print("Enter weight\t : ");
		this.weight = scan.nextDouble();
	}
	
	Shoes(String b,String c,String t, int s, int q, double p, double w){
		this.brand = b;
		this.colour = c;
		this.type = t;
		this.size = s;
		this.quantity = q;
		this.price = p;
		this.weight = w;
	}
}


public class Main {

	public static void main(String[] args) {
		Shoes MyShoes = new Shoes();
		System.out.println();
		System.out.println("\n=======My Shoes=======");
		System.out.println("Brand\t\t : " + MyShoes.brand);
		System.out.println("Colour\t\t : " + MyShoes.colour);
		System.out.println("Type\t\t : " + MyShoes.type);
		System.out.println("Size\t\t : " + MyShoes.size);
		System.out.println("Quantity\t : " + MyShoes.quantity);
		System.out.printf("Price\t\t : RM%.2f%n" , MyShoes.price);
		System.out.println("Weight\t\t : " + MyShoes.weight+"g");
		
	
	Shoes AbuShoes = new Shoes("Nike", "Red", "Basketball Shoes", 10, 2, 300, 600);
		System.out.println();
		System.out.println("\n=======Abu's  Shoes=======");
		System.out.println("Brand\t\t : " + AbuShoes.brand);
		System.out.println("Colour\t\t : " + AbuShoes.colour);
		System.out.println("Type\t\t : " + AbuShoes.type);
		System.out.println("Size\t\t : " + AbuShoes.size);
		System.out.println("Quantity\t : " + AbuShoes.quantity);
		System.out.printf("Price\t\t : RM%.2f%n" , AbuShoes.price);
		System.out.println("Weight\t\t : " + AbuShoes.weight+"g");

	}

}

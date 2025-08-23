package skill5;
class Order{
	void printDetails() {
		System.out.println("Order detials: smartphone, earpods, smartwatch.");
	}
}
class OnlineOrder extends Order{
	void printDetails() {
		super.printDetails();
		System.out.println("Delivery details: Getting packed .");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Order Or = new OnlineOrder();
          
          Or.printDetails();
	}

}

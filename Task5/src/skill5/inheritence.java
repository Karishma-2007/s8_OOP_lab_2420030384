package skill5;
class transport{
	void ticketprice() {
		System.out.println("general transport tickets. ");
	}
}
class Bus extends transport{
	void ticketprice() {
		System.out.println("Bus ticket price is $30.");
	}
}
class Train extends transport{
	void ticketprice() {
		System.out.println("Train ticket price is $60.");
	}
}
 
public class inheritence{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        transport t1 = new Bus();
        transport t2 = new Train();
        
        t1.ticketprice();
        t2.ticketprice();
	}
}

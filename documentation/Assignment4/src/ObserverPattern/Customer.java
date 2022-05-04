
public class Customer implements Observer {
	private String customerName;
	public Customer(String customerName, Subject subject) {
	this.customerName= customerName;
	subject.addObserver(this);
	}
	@Override
	public void update(String availabiliy) {
	System.out.println("Hello " + this.customerName + ", Product is now " + availabiliy );
	}
}

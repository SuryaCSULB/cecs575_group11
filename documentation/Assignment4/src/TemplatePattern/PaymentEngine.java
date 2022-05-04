
public abstract class PaymentEngine {
	abstract void addPaymentDetails();
    abstract void billingAddress();
	public final void pay() {

		try {
            billingAddress();
			addPaymentDetails();
           
		} catch (Exception e) {

			System.out.println("Something went wrong, error is : " + e);

			System.out.println("Also, rollback stuff !!");

		} finally {

			System.out.println("cleaning up resources");

		}

	}
}

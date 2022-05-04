import java.util.Scanner;

public class UKPaymentEngine extends PaymentEngine{
String Username;
String Password;
String StreetNo;
String StreetName;
String PostalCode;
	@Override
	void addPaymentDetails() {
		System.out.println("Enter PayPal Username");
		Scanner sc=new Scanner(System.in);
		Username=sc.next();
        System.out.println("Enter Password");
        Password=sc.next();
		// taking input from Scanner(System.in) for demonstration purpose showing that
		//abstract functions implementation in the template 

}

	@Override
	void billingAddress() {
		System.out.println("Enter Street No");
		Scanner sc=new Scanner(System.in);
        StreetNo=sc.next();
		System.out.println("Enter Street Name");
        StreetName=sc.next();
		System.out.println("Enter US Postal Code");
		PostalCode=sc.next();
		// taking input from Scanner(System.in) for demonstration purpose showing that
		//abstract functions implementation in the template 

	}

}

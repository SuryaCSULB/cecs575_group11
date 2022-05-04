import java.util.Scanner;

public class USPaymentEngine extends PaymentEngine
{
String CardNumber;
String CardMemberName;
String CVV;
String ExpiryDate;
String StreetNo;
String StreetName;
String AptNo;
String PostalCode;
	@Override
	void addPaymentDetails() {
		System.out.println("Enter Card Number");
		Scanner sc=new Scanner(System.in);
		CardNumber=sc.next();
		System.out.println("Enter Card Member Name");
		CardMemberName=sc.next();
		System.out.println("Enter CVV");
		CVV=sc.next();
		System.out.println("Enter Expiry Data");
		ExpiryDate=sc.next();
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
		System.out.println("Enter Apt Number");
		AptNo=sc.next();
		System.out.println("Enter US Postal Code");
		PostalCode=sc.next();
		// taking input from Scanner(System.in) for demonstration purpose showing that
		//abstract functions implementation in the template


	}

}

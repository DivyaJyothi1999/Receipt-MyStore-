import java.util.*;
public class Receipt {
	String product_name;
	String product_id;
	long transaction_id;
	double product_price;
	int product_sold;
	float money_pays;
	float subtotal;
	float salestax;
	float total;
	float balance;
	public Receipt(String product_name,String product_id,long transaction_id,double product_price,int product_sold,float money_pays)
	{
		this.product_name=product_name;
		this.product_id=product_id;
		this.transaction_id=transaction_id;
		this.product_price=product_price;
		this.product_sold=product_sold;
		this.money_pays=money_pays;	
	}
	public void display()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(product_name+" "+product_sold);
		System.out.println("Unit Price:"+product_price);
		subtotal=(float) (product_price*product_sold);
		System.out.println("SubTotal:"+subtotal);
		salestax=(float) (subtotal*8.25/100);
		System.out.println("Tax (8.25%):"+salestax);
		total=subtotal+salestax;
		System.out.println("Total:"+total);
		System.out.println("---------------------------------------");
		System.out.println("Cash:"+money_pays);
		balance=money_pays-total;
		System.out.println("Change:"+balance);
	}

}

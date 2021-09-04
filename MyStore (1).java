import java.util.*;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyStore{
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter product Name:");
			String product_name=scan.nextLine();
			System.out.print("Enter product ID:");
			String product_id=scan.nextLine();
			System.out.print("Enter transaction Id:");
			long transaction_id=scan.nextLong();
			System.out.print("Enter product price:");
			double product_price=scan.nextDouble();
			System.out.print("Enter how many unit purchased:");
			int product_sold=scan.nextInt();
			System.out.print("Enter amount of money paid:");
			float money_pays=scan.nextFloat();
			System.out.println("---------------------------------------");
System.out.println("        MY STORE\n 123 MG RD BANGALORE KA IN 560001\n       STORE #:22222\n  THANK YOU FOR YOUR SHOPPING\n     TRANSACTION #:34");
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
            Date date = new Date();
            System.out.print("Date:");
      System.out.println(dateFormat.format(date));
            System.out.println("---------------------------------------");
			Receipt re=new Receipt(product_name,product_id,transaction_id,product_price,product_sold,money_pays);
			re.display();
		}

	}

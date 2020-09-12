/*Program should use a SWITCH statement to determine the retail price for each product. It should calculate and display the total retail value of all products sold. 
Use a sentinel-controlled loop to determine when the program should stop looping and display the final results.*/

package salesCalculator;
import java.util.Scanner;
public class SalesCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double product1 = 2.98;
		double product2 = 4.50;
		double product3 = 9.98;
		double product4 = 4.49;
		double product5 = 6.87;
		
		double total = 0.00;
		String proceed = "yes";
		
		System.out.println("Would you like to enter products? yes or no ");
		proceed = input.nextLine();
		
		while (proceed == "yes"); {//I tried making this != "no" but it won't enter the loop
			
			System.out.print("Enter Product Number: ");
			int prodnum = input.nextInt();
			
			switch (prodnum) {
				case 1:
					System.out.print("Enter Quantity of Product 1: ");
					int quantity = input.nextInt();
					total += (double) quantity * product1;
					break;
				case 2:
					System.out.print("Enter Quantity of Product 2: ");
					quantity = input.nextInt();
					total += (double) quantity * product2;
					break;
				case 3:
					System.out.print("Enter Quantity of Product 3: ");
					quantity = input.nextInt();
					total += (double) quantity * product3;
					break;
				case 4:
					System.out.print("Enter Quantity of Product 4: ");
					quantity = input.nextInt();
					total += (double) quantity * product4;
					break;
				case 5:
					System.out.print("Enter Quantity of Product 5: ");
					quantity = input.nextInt();
					total += (double) quantity * product5;
					break;
			}
			System.out.print("Would you like to continue? yes or no");
			proceed = input.nextLine();
		}
	
	System.out.println(total);	//Only goes through one iteration then breaks out of the while loop
	}
}

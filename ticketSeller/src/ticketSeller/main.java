package ticketSeller;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tkt = 100;
		int users=0;
		int not;
		
		while(tkt>0)
		{
			not = scan.nextInt();
			if(not>4) System.out.println("invalid");
			else
			{
				tkt = tkt- not;
				
				users ++;
			}
		}
		
		System.out.println(users);
	}

}

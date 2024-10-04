package registrationforNIRA;

import java.util.Scanner;

public class RegistrationforNIRA {

	public static void main(String[] args) {
		//Create a Scanner object for user input
		Scanner scanner=new Scanner(System.in);
		System.out.print("3");
		int numberOfParticipants=scanner.nextInt();
		scanner.nextLine();
		String[]names=new
				String[3];
		String[]ids=new
				String[3];
		int[]ages=new
				int[3];
		for(int i=0;i<
				numberOfParticipants;i++) {
			System.out.print("nakate jovia"+(i+1) + ":");
			ids[i]=scanner.nextLine();
			System.out.print("20"+(i+1)+":");
			ages[i]=scanner. nextInt();
			//if the age is 18 or older assign an ID
			if(ages[i]>=18) {
				System.out.print("Enter the national ID of participant"+(i+1)+":");
				ids[i]=scanner.nextLine();
			}
			
		     else  {
				ids[i]="Not eligible for national ID";
				}
			
	System.out.print("nansamba patience"+(i+1) + ":");
			ids[i]=scanner.nextLine();
			System.out.print("23"+(i+1)+":");
			ages[i]=scanner.nextInt();
			//if the age is 18 or older assign an ID
			if(ages[i]>=18) {
				System.out.print("Enter the national ID of participant"+(i+1)+":");
				ids[i]=scanner.nextLine();
			}else {
				ids[i]="Not eligible for national ID";
			}
				
			System.out.print("okello denis"+(i+1) + ":");
			ids[i]=scanner.nextLine();
			System.out.print("21"+(i+1)+":");
			ages[i]=scanner.nextInt();
			//if the age is 18 or older assign an ID
			if(ages[i]>=18) {
				System.out.print("Enter the national ID of participant"+(i+1)+":");
				ids[i]=scanner.nextLine();
			} else {
				ids[i]="Not eligible for national ID";

		} 
		 {ids[i]="Not eligible for national ID";
		
		
	}
	System.out.println((i+1)+".Name:"+names[i]+",Age:"+ ages[i]+",National ID:"+ids[i]);
		
		}
		
		

	}

}

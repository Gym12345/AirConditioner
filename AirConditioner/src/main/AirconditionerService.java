package main;

import java.util.Scanner;

import interface_airConditioner.AirConditionalInterface;

public class AirconditionerService implements AirConditionalInterface{

	@Override
	public void AirconditionerUI() {
		System.out.println("choose (1:temperature, 2:windVolume)");
		Scanner scan=new Scanner(System.in);
		int choice1=scan.nextInt();
		

		
		
		if(choice1==1) {
			System.out.println("(temperature page)\nButton1(up)\nButton2(down) :");
			
			

			
//			if(choice2==1) {
//				
//			}
//			else if(choice2==2) {
//				
//			}
//			else {
//				System.out.println("wrong input");
//			}
		
			
		}else if(choice1==2) { 
			System.out.println("(windVolume page)\nButton1(up)\nButton2(down) :");
			
			
//			if(choice2==1) {
//				
//			}
//			else if(choice2==2) {
//				
//			}
//			else {
//				System.out.println("wrong input");
//			}
			
		}
		else {
			System.out.println("wrong input");
		}
		
			
			
			
			
		
		
			
		
		scan.close();
		
			
		
	}

	

	

}

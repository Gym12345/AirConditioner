package main;

import java.util.Scanner;

import impls.Change_temperatureImpl;
import impls.Change_windVolumeImpl;
import interface_airConditioner.AirConditionalInterface;


public class AirconditionerService implements AirConditionalInterface{
	
	AirconditionerDTO dto =new AirconditionerDTO(0,0); 
	
	Change_windVolumeImpl cw = new Change_windVolumeImpl();
	Change_temperatureImpl ct = new Change_temperatureImpl();
		
		
	@Override
	public void AirconditionerUI() {
		
			System.out.print("choose (1:temperature, 2:windVolume):");
			Scanner scan=new Scanner(System.in);
			int choice1=scan.nextInt();
			

			
			
			if(choice1==1) {
				System.out.print("(temperature page)\nButton1(up)\nButton2(down) :");
				
				int choice2=scan.nextInt();


				
				if(choice2==1) {
					ct.change_temperature_Down(dto);
					
				}
				else if(choice2==2) {
					ct.change_temperature_Down(dto);

				}
				else {
					System.out.println("wrong input");
				}
			
				
			}else if(choice1==2) { 
				System.out.print("(windVolume page)\nButton1(up)\nButton2(down) :");
				
				int choice2=scan.nextInt();
				if(choice2==1) {
					cw.change_windVolume_Up(dto);
				}
				else if(choice2==2) {
					cw.change_windVolume_Down(dto);
				}
				else {
					System.out.println("wrong input");
				}
				
			}
			else {
				System.out.println("wrong input");
			}
			
		
			System.out.println(dto.display());
			
		
		
			
			
			
			
		
		
			
		
		
		
			
		
	}
	}

	

	



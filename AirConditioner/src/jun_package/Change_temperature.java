package jun_package;

import main.AirconditionerDTO;

public class Change_temperature  extends AirconditionerDTO implements interface_airConditioner.Change_temperature{
	
	@Override
	public int change_temperature(int choice) {
		int num;
		while(true) {
		if(choice==1) {
			 setTemperature(num=(choice+=1));
			 System.out.println("현재 온도는"+num+"도 입니다.");
	}
	else if(choice==2) {
			setTemperature(num=choice-=1);
			 System.out.println("현재 온도는"+num+"도 입니다.");
	}
	else {
		System.out.println("wrong input");
		return 0;
	}
		
	}
	}

}

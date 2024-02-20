package windVolume;


import interface_airConditioner.Change_windVolume;
import main.AirconditionerDTO;

public class kjh_windVolume implements Change_windVolume {
	AirconditionerDTO ato = new AirconditionerDTO();
	@Override
	
	public int change_windVolume(int choice) {
	int nunm;	
			if(choice==1) {
				ato.setTemperature(choice+=1);
				System.out.println("온도가 변경되었습니다.");
		}
		else if(choice==2) {
			ato.setTemperature(choice-=1);
			System.out.println("온도가 변경되었습니다.");
	}
		else {
			System.out.println("wrong input");
		}
		
			
		
		return 0;
	}

}

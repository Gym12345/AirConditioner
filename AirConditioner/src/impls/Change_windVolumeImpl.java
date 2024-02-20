package impls;

import interface_airConditioner.Change_windVolume;
import main.AirconditionerDTO;

public class Change_windVolumeImpl implements Change_windVolume{

	
	 
	@Override
	public void change_windVolume_Up(AirconditionerDTO dto) {
		dto.setWindVolume(dto.getWindVolume()+1);
		
		
		
	}

	@Override
	public void change_windVolume_Down(AirconditionerDTO dto) {
		dto.setWindVolume(dto.getWindVolume()-1);
		
	}
	
	
	
	
	

}

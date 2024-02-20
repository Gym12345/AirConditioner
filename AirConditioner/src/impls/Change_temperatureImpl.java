package impls;

import interface_airConditioner.Change_temperature;
import main.AirconditionerDTO;

public class Change_temperatureImpl implements Change_temperature {

	@Override
	public void change_temperature_Up(AirconditionerDTO dto) {
		dto.setTemperature(dto.getTemperature()+1);
		
	}

	@Override
	public void change_temperature_Down(AirconditionerDTO dto) {
		dto.setTemperature(dto.getTemperature()-1);

		
	}
	
	

	

}

package interface_airConditioner;

import main.AirconditionerDTO;

public interface Change_temperature {
	
	public void change_temperature_Up(AirconditionerDTO dto);
	public void change_temperature_Down(AirconditionerDTO dto);
	
}

package main;

public class AirconditionerDTO {
	private int temperature, windVolume; // ¿Âµµ
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public int getWindVolume() {
		return windVolume;
	}

	public void setWindVolume(int windVolume) {
		this.windVolume = windVolume;
	}
	
	public AirconditionerDTO() {
		
	}
	public AirconditionerDTO(int temperature, int windVolume) {
		super();
		this.temperature = temperature;
		this.windVolume = windVolume;
	}


	public String display() {
		return "current status: [temperature=" + temperature + ", windVolume=" + windVolume + "]";
	}
	
	

}

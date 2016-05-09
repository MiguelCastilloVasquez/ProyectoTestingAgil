package cl.ubb.agil.Model;

public class Sanction {

	private int identifier;
	private String description;
	
	public Sanction(){
		
	}
	public Sanction(int identifier){
		this.identifier=identifier;
	}
	
	public Sanction(int identifier, String description){
		this.identifier=identifier;
		this.description=description;
	}
	
	public int getID(){
		return identifier;
	}
	
	public String getDescription(){
		return description;
	}
}

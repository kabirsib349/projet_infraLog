package fr.coffeemocha.modele;

public enum Size {
	
	PETIT("PETIT"),   
    MOYEN("MOYEN"),  
    GRAND("GRAND");    

    Size(String size) {
		this.size=size;
	}
	private final String size;
	
	public String getValue() {
		return size;
	}
}

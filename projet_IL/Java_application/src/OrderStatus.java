package fr.coffeemocha.modele;

public enum OrderStatus {
	
	EN_ATTENTE("EN_ATTENTE"),    
    EN_COURS("EN_COURS"), 
    PRET("PRET");
	
	private final String value;
	
	private OrderStatus(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}


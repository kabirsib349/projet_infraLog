package fr.coffeemocha.modele;

public enum SugarLevel {
	
    NO_SUGAR(0),   
    LOW(1),        
    MEDIUM(2),     
    HIGH(3);         

    private final int level;
    
    private SugarLevel(int level) {
		this.level=level;
	}
    
    public int getLevel() {
        return level;
    }
    
    public static SugarLevel fromLevel(int level) {
    	for(SugarLevel sugarLevel: SugarLevel.values()) {
    		if(sugarLevel.level== level)
    			return sugarLevel;
    	}
    	throw new IllegalArgumentException("Niveau de sucre invalide : " + level);
    }
    
}

package fr.coffeemocha.modele;

public class OrderItem {
    private Product product;
    private int quantity;
    private Size size;
    private SugarLevel sugarLevel;
    private double price;
   
    public OrderItem(Product product, int quantity, Size size, SugarLevel sugarLevel) {
        this.product = product;
        this.quantity = quantity;
        this.size = size;
        this.sugarLevel = sugarLevel;
        this.price=calculatePrice();
    }

    public Size getSize() {
        return size;
    }

    public SugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public int getSugarLevelValue() {
        return sugarLevel.getLevel(); 
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price; 
    }

    private double calculatePrice() {
        double basePrice = 2.0; 
        double sizeMultiplier = getSizeMultiplier(size);
        double sugarCharge = getSugarCharge(sugarLevel);
        return (basePrice + sugarCharge) * sizeMultiplier * quantity;
    }
       
    private double getSizeMultiplier(Size size) {
        switch (size) {
            case PETIT: return 1.0;
            case MOYEN: return 1.5;
            case GRAND: return 2.0;
            default: return 1.0;
        }
    }
    
    private double getSugarCharge(SugarLevel sugarLevel) {
        return getSugarLevelValue() * 0.5; 
    }
}

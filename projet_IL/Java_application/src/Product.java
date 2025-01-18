package fr.coffeemocha.modele;

public class Product {

    private int productId;
    private String name;
    private String category;
    private boolean available;
    
    
    public Product(int productId, String name, String category, boolean available) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.available = available;
    }
    
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}

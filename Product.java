// https://www.sitepoint.com/implement-javas-equals-method-correctly/

class Product {
    private double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public boolean equalsW(Product someProduct){
        return Object.equalsW(price, someProduct.price) && Object.equalsW(description, someProduct.description);
    }

    public static void main(String[] args) {
        Product watch1 = new Product(69.99, "Apple watch 1");
        Product watch2 = new Product(69.99, "Apple watch 1");

        boolean equal = watch1.equals(watch2);



    }
    
}

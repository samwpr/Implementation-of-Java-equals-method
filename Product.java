// Best explanation: https://www.baeldung.com/java-equals-hashcode-contracts

import nl.jqno.equalsverifier.EqualsVerifier;


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


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof Product){
            Product other = (Product) obj;
            if(other.price == this.price && other.description == this.description){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + Double.valueOf(price).hashCode();
        hash = 31 * hash + description.hashCode();
        return hash;
    }


    public static void main(String[] args) {
        Product watch1 = new Product(69.99, "Apple watch 1");
        Product watch2 = new Product(69.99, "Apple watch 1");
        System.out.println(watch1.equals(watch2));
        System.out.println(watch1.hashCode());
        System.out.println(watch2.hashCode());
    }
    
}

public class Product
{
    //Declare class fields here
    private double unitPrice;
    private String name;
    private String brand;

/**
     * Default Constructor for objects of class Product
     */
    public Product()
    {
        brand = "Unknown";
        name = "Unknown";
        unitPrice = -1;
    }

    /**
     * Non Default Constructor for objects of class Product
     * 
     */
    public Product(String newBrand, String newName, double newUnitPrice)
    {
        brand = newBrand;
        name = newName;
        unitPrice = newUnitPrice;
    }

    /**
     * Method to return the state of the object
     * 
     */
    public String display()
    {
        return brand + " " + name + " " + unitPrice + " ";
    }

    /**
     * Accessor Method to get the brand of the Product
     * 
     * @return A single string which contains the brand of the Product
     */
    public String getBrand()
    {
        return brand;
    }
    
    /**
     * Accessor Method to get the name of the Product
     * 
     * @return A single string which contains the name of the Product
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor Method to get the unit price of the Product
     * 
     * @return A double number which contains the unit price of the Product
     */
    public double getUnitPrice()
    {
        return unitPrice;
    }

    /**
     * Mutator Method to set the brand of the Product
     * 
     * @param newBrand A single string which contains the new brand of the Product
     */
    public void setBrand(String newBrand)
    {
        brand = newBrand;
    }
    
    /**
     * Mutator Method to get the name of the Product
     * 
     * @param newName A single string which contains the new name of the Product
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Mutator Method to set the unit price of the Product
     * 
     * @param newUnitPrice A double number which contains the unit price of the Product
     */
    public void setUnitPrice(double newUnitPrice)
    {
        unitPrice = newUnitPrice;
    }
}    
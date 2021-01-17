public class Container
{
    /*Declare class fields.*/
    private int no;
    private double weight;
    private Owner own;
    private Product prod;

    /*Default constructor for objects.*/
    public Container()
    {
        no = 0;
        weight = 0;
        own = new Owner();
        prod = new Product();
    }

    /*Non-default constructor for objects.*/
    public Container(int newNo, double newWeight, Owner newOwn, Product newProd)
    {
        no = newNo;
        weight = newWeight;
        own = newOwn;
        prod = newProd;
    }

    /*Display method to return state of objects.*/
    public String display()
    {
        return no + " " + weight + " " + own.display() + " " + prod.display();
    }
    
    /*Accessor method to get no.*/
    public int getNo()
    {
        return no;
    }

    /*Accessor method to get weight.*/
    public double getWeight()
    {
        return weight;
    }

    /*Accessor method to get Own.*/
    public Owner getOwn()
    {
        return own;
    }

    /*Accessor method to get product.*/
    public Product getProd()
    {
        return prod;
    }

    //Mutator method to set no.
    public void setNo(int newNo)
    {
        no = newNo;
    }

    //Mutator method to set weight.
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }

    public void setOwner(Owner owner)
    {
        own = owner;
    }
    
    public void setOwner(String name, double insured)
    {
        own.setInsured(insured);
        own.setName(name);
    }

    //Mutator method to set unit.
    public void setProduct(Product product)
    {
        prod = product;
    }
}
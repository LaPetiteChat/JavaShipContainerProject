public class Owner
{
    //Declare class fields here
    private double insured;
    private String name;

/**
     * Default Constructor for objects of class Owner
     */
    public Owner()
    {
        name = "Unknown";
        insured = -1;
    }

    /**
     * Non Default Constructor for objects of class Owner
     * 
     */
    public Owner(String newName, double newInsured)
    {
        name = newName;
        insured = newInsured;
    }

    /**
     * Method to return the state of the object
     * 
     */
    public String display()
    {
        return name + " " + insured + " ";
    }

    /**
     * Accessor Method to get the insurance no of the Owner
     * 
     * @return A double number which contains the insurance no of the Owner
     */
    public double getInsured()
    {
        return insured;
    }

    /**
     * Accessor Method to get the name of the owner
     * 
     * @return A single string which contains the name of the owner
     */
    public String getName()
    {
        return name;
    }

    /**
     * Mutator Method to set the insurance no of the owner
     * 
     * @param newInsured String to define the new address where the student lives
     */
    public void setInsured(double newInsured)
    {
        insured = newInsured;
    }

    /**
     * Mutator Method to set the name of the owner
     * @param newName String to set the new name of the owner
     */
    public void setName(String newName)
    {
        name = newName;
    }
}    
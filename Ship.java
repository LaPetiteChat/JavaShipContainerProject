class Ship
{
    private String name;
    private String origin;
    private Container contain;

    public Ship()
    {
        name = "Name of the Ship";
        origin = "Origin of the Ship";
        contain = new Container();
    }
    
    public Ship(String nam, String orgn, Container container)
    {
        name = nam;
        origin = orgn;
        contain = container;
    }
    
    public void display()
    {
        System.out.println("Name: " + name + "Origin" + origin + contain.display());
    }

    public static void main(String[] args)
    {
        Ship ship = new Ship("Titanic","Abcdwer",new Container());
        ship.display();

        Container contain = new Container();
        contain.setOwner(new Owner("Xiaowei",123));
        Ship ship1 = new Ship("Wnasdfg","asdfg",contain);
        ship1.display();

    }
}
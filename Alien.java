class Alien
{
    // public static final int SNAKE_ALIEN = 0;
    // public static final int OGRE_ALIEN = 1;
    // public static final int MARSHMALLOW_MAN_ALIEN = 2;

    // public int type; // Stores one of the three above types 
    private int health; // 0 == dead and 10 == full strength
    private String name;

    public Alien (int health, String name)
    {
        this.health = health;
        this.name = name;
    }

    public Alien()
    {
        health = 0;
        name = "";
    }

    //mutator methods
    public void setHealth(int health)
    {
        this.health = health;
    }
    //mutator methods
    public void setName(String name)
    {
        this.name = name;
    }
    //accessor methods
    public String getName ()
    {
        return name;
    }
    //accessor methods
    public int getHealth()
    {
        return health;
    }
    //overridden by child classes 
    public int getDamage()
    {
        return 0;
    }

}

class Tower
{
    private List<Flyable*> observers;

    public void register(Flyable* p_flyable)
    {
        System.out.println("Tower says" + "THIS NEEDS TO BE THE OBJECT TYPE ETC " + " registered to weather tower.");
    };

    public void unregister(Flyable* p_flyable)
    {
        System.out.println("Tower says" + "THIS NEEDS TO BE THE OBJECT TYPE ETC " + " unregistered from weather tower.");
    };

    protected void conditionChanged()
    {
        //call the update condition
    };
}
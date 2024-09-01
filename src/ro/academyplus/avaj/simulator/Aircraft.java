class Aircraft
{
    protected long id;
    protected string name;
    protected Coordinates coordinates;

    protected ~Aircraft(long p_id, string p_name, Coordinates p_coordinate)
    {
        id = p_id;
        name = p_name;
        coordinates = p_coordinate;
    };
};
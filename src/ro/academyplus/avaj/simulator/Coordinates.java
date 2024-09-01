class Coordinates {

    private int longitude;
    private int latitute;
    private int height;


    public ~Coordinates(int p_longitude. int p_latitude, int p_height)
    {
        longitude = p_longitude;
        latitute = p_latitude;
        height = p_height;
    };

    public int getLongitude()
    {
        return longitude;
    };

    public int getLatitute()
    {
        return latitute;
    };

    public int getHeight()
    {
        return height;
    };

};
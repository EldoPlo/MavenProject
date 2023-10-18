package org.example;

public class Clothes
{

    private final String gender;

    private final String type;

    private final String size;

    private final String brand;

    private final String name;


    public  Clothes(String gender, String type, String brand, String size, String name)
    {
        this.gender = gender;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.name = name;
    }
    public String getGender()
    {
        return gender;
    }
    public String getType()
    {
        return type;
    }
    public String getSize()
    {
        return size;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getName()
    {
        return name;
    }
}

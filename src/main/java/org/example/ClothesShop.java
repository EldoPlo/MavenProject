package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClothesShop
{
    private final List<Clothes> clothesList = new ArrayList<>();

    public void addClothes(Clothes clothes)
    {
        clothesList.add(clothes);
    }

    public void removeClothes(Clothes clothes)
    {
        clothesList.remove(clothes);
    }
    public List<Clothes> getClothesList()
    {
        return clothesList;
    }
}

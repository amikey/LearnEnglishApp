package com.example.englishquiz;

public class Item {

   String animalName;
    int animalImage;
    int animalSound;

    public Item(String animalName,int animalImage, int animalSound)
    {
        this.animalImage=animalImage;
        this.animalName=animalName;
        this.animalSound=animalSound;

    }
    public String getAnimalName()
    {
        return animalName;
    }
    public int getAnimalImage()
    {
        return animalImage;
    }
    public int getAnimalSound() { return animalSound; }
}

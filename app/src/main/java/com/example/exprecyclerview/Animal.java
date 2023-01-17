package com.example.exprecyclerview;

import java.util.ArrayList;

public class Animal {
    private static ArrayList<Animal> lstAnim= new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Animal(String nom, int photo) {
        this.nom = nom;
        this.photo = photo;
    }

    private String nom;
    private int photo;
public static ArrayList<Animal> getLstAnimals()
{
    ArrayList<Animal> AL = new ArrayList<>();
    AL.add(new Animal("Ours",R.drawable.image1));
    AL.add(new Animal("Oiseau",R.drawable.image2));
    AL.add(new Animal("Poisson",R.drawable.image3));
    AL.add(new Animal("Flament",R.drawable.image4));
    AL.add(new Animal("Girafe",R.drawable.image5));
    return  AL;

}
}

package com.mycompany.csc325_oop_designreview_lab;

public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
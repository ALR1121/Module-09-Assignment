package com.mycompany.csc325_oop_designreview_lab;

public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
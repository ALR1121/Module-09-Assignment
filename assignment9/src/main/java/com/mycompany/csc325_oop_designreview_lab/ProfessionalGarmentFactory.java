package com.mycompany.csc325_oop_designreview_lab;

public class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
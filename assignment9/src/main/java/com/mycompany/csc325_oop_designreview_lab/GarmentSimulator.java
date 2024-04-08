package com.mycompany.csc325_oop_designreview_lab;

public class GarmentSimulator {
    public static void main(String[] args) {
        // Create a Professional outfit
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalFactory.createTop();
        Pants professionalPants = professionalFactory.createPants();
        Shoes professionalShoes = professionalFactory.createShoes();

        // Wear the Professional outfit
        System.out.println("Professional Outfit:");
        professionalTop.wear();
        professionalPants.wear();
        professionalShoes.wear();

        // Similarly, you can create and wear Casual and Party outfits using CasualGarmentFactory and PartyGarmentFactory
    }
}
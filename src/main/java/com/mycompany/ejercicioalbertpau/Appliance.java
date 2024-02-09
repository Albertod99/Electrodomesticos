package com.mycompany.ejercicioalbertpau;
import java.util.Scanner;

public class Appliance {
    public enum Consumptions {
        A, B, C, D, E, F
    }
    public enum Colours {
        blanco, negro, rojo, azul, gris
    }
    
    private final Consumptions defaultConsumption = Consumptions.F;
    private final Colours defaultColour = Colours.blanco;
    public double price = 100;
    public float weight = 5;
    public Colours colour = defaultColour;
    public Consumptions consumption = defaultConsumption;
    
     Scanner sc = new Scanner(System.in);
    
    public Appliance(){
        this.price = precioFinal(weight, consumption);
    }
    public Appliance(float weight){
        this.weight = weight;
        this.price = precioFinal(weight, consumption);
    }
    public Appliance(float weight, Colours colour, Consumptions consumption){
        this.weight = weight;
        this.colour = comprobarColor(colour);
        this.consumption = comprobarConsumoEnergetico(consumption);
        this.price = precioFinal(weight, consumption);
    }
    
    public double getPrice(){
        return this.price;
    }
    public float getWeight(){
        return this.weight;
    }
    public String getColour(){
        return this.colour.toString();
    }
    public String getConsumption(){
        return this.consumption.toString();
    }
    
    private Consumptions comprobarConsumoEnergetico(Consumptions consumption){
        try {
            return Consumptions.valueOf(consumption.toString());
        } catch (IllegalArgumentException e) {
            return defaultConsumption;
        }
    }
    
    private Colours comprobarColor(Colours colour) {
        try {
            return Colours.valueOf(colour.toString());
        } catch (IllegalArgumentException e) {
            return defaultColour;
        }
    }
    
    private float precioFinal(float weight, Consumptions consumption){
        
        float finalPrice=0;
        do{
        try{
            finalPrice = sc.nextFloat();
        }catch(java.util.InputMismatchException ex){
            System.out.println("Introduce un precio valido");
            sc.nextFloat();
            }}
        while(finalPrice<=0);
           
        
        
        switch (consumption) {
            case Consumptions.B -> finalPrice+=80;
            case Consumptions.C -> finalPrice+=60;
            case Consumptions.D -> finalPrice+=50;
            case Consumptions.E -> finalPrice+=30;
            case Consumptions.F -> finalPrice+=10;
            default -> finalPrice+=100;
        }
        if (weight>0 && weight<20){
            finalPrice+=10;
        } else if (weight>=20 && weight<50){
            finalPrice+=50;
        } else if (weight>=50 && weight<80){
            finalPrice+=80;
        } else {
            finalPrice+=100;
        }
        
        return finalPrice;
    }
    
   
    public String toString(){
        return "Precio electrodoméstico: " + this.price + "€ / Peso: " + this.weight + "kg, Color: " + this.colour + ", Consumo: " + this.consumption;
    }
}

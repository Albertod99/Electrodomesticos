package com.mycompany.ejercicioalbertpau;

public class Lavadora extends Appliance {
    private float load = 5;
    
    public Lavadora(){}
    public Lavadora(float weight){
        super(weight);
    }
    public Lavadora(float weight, Colours colour, Consumptions consumption, float load){
        super(weight, colour, consumption);
        this.load = load;
        precioFinal(load, this.price);
    }
    
    public float getLoad(){
        return this.load;
    }
    
    private void precioFinal(float load, double price){
        if (load > 30) {
            this.price = price+50;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " / Tipo: Lavadora, Carga máxima: " + this.load + "kg.";
    }
}

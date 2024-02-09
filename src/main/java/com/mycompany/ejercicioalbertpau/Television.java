package com.mycompany.ejercicioalbertpau;

public class Television extends Appliance {
    private float resolution = 20;
    private boolean tdt = false;
    
    public Television(){}
    public Television(float weight){
        super(weight);
    }
    public Television(float weight, Colours colour, Consumptions consumption, float resolution, boolean tdt){
        super(weight, colour, consumption);
        this.resolution = resolution;
        this.tdt = tdt;
        precioFinal(resolution, tdt, this.price);
    }
    
    public float getResolution(){
        return this.resolution;
    }
    
    public boolean isTdt(){
        return this.tdt;
    }
    
    private void setResolution(float load){
        this.resolution = resolution;
    }
    
    private void precioFinal(float resolution, boolean tdt, double price){
        if (resolution > 40) {
            this.price = price*1.3;
        }
        
        if (tdt) {
            this.price+=50;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " / Tipo: Televisión, Resolución: " + this.resolution + "\", TDT: " + this.tdt;
    }
}

package com.mycompany.ejercicioalbertpau;
import com.mycompany.ejercicioalbertpau.Appliance.Consumptions;
import com.mycompany.ejercicioalbertpau.Appliance.Colours;
import java.util.Scanner;

public class EjercicioAlbertPau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceAppliances = 0;
        double priceLavadoras = 0; 
        double priceTelevisions = 0;
        Appliance[] arrayAppliances = new Appliance[10];
        arrayAppliances[0] = new Appliance();
        arrayAppliances[1] = new Appliance(10);
        arrayAppliances[2] = new Appliance(60, Colours.rojo, Consumptions.B);
        arrayAppliances[3] = new Lavadora();
        arrayAppliances[4] = new Lavadora(80);
        arrayAppliances[5] = new Lavadora(90, Colours.negro, Consumptions.C, 10);
        arrayAppliances[6] = new Television();
        arrayAppliances[7] = new Television(15);
        arrayAppliances[8] = new Television(20, Colours.gris, Consumptions.A, 25, false);
        arrayAppliances[9] = new Television(25, Colours.negro, Consumptions.A, 45, true);
        
        for (int i=0; i<arrayAppliances.length; i++){
            if (arrayAppliances[i] instanceof Lavadora){
                priceLavadoras += arrayAppliances[i].price;
            } else if (arrayAppliances[i] instanceof Television) {
                priceTelevisions += arrayAppliances[i].price;
            } else {
                priceAppliances += arrayAppliances[i].price;
            }
            System.out.printf((i+1) + ". Electrodoméstico "+ arrayAppliances[i].getClass().getSimpleName() + ": %.2f€\n", arrayAppliances[i].price);
        }
        System.out.println("\n------------------------------------------------------------------------");
        
        System.out.printf("\nTOTAL Electrodomésticos: %.2f€", priceAppliances);
        System.out.printf("\nTOTAL Lavadoras: %.2f€", priceLavadoras);
        System.out.printf("\nTOTAL Television: %.2f€", priceTelevisions);
        
        System.out.println("\n------------------------------------------------------------------------");
        
        System.out.printf("\nTOTAL: %.2f€", finalPrice(priceLavadoras,priceTelevisions,priceAppliances));
        
        /*float peso, resolucion;
        String color, consumo, isTdt;
        boolean tdt;
        System.out.println("Introduce el peso de la Televisión: ");
        peso = sc.nextFloat();
        sc.nextLine();
        System.out.println("Introduce el color de la Televisión: ");
        color = sc.nextLine().toLowerCase();
        System.out.println("Introduce el consumo de la Televisión: ");
        consumo = sc.nextLine().toUpperCase();
        System.out.println("Introduce la resolución de la Televisión: ");
        resolucion =  sc.nextFloat();
        sc.nextLine();
        System.out.println("Introduce si la Televisión tiene TDT [S/N]: ");
        isTdt = sc.nextLine();
        if (isTdt.equals("S")){
            tdt = true;
        } else {
            tdt = false;
        }
        
        Television tele1 = new Television(peso, Colours.valueOf(color), Consumptions.valueOf(consumo), resolucion, tdt);
        System.out.println(tele1);
        sc.close();*/
    }
    public static double finalPrice(double priceLavadoras, double priceTelevisions, double priceAppliances){
            return priceLavadoras + priceTelevisions + priceAppliances;
    }
    
}

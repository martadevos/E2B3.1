package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir datos
	* Escanear datos
	* Calcular area lateral (2pirh)
	* calcular area total (2pir^2+area lateral)
	* calcular volumen (pir^2h)
	* Decir resultados*/
        double areal=0;
        double areat=0;
        double volumen=0;
        float radio=0;
        float altura=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduzca el radio");
        radio= scan.nextFloat();
        System.out.println("Introduzca la altura");
        altura= scan.nextFloat();
        areal=2*Math.PI*radio*altura;
        areat=2*Math.PI*Math.pow(radio,2)+areal;
        volumen=Math.PI*Math.pow(radio,2)*altura;
        System.out.println("El área lateral es"+" "+areal+", el área total es"+" "+areat+" "+"y es volumen es"+" "+volumen);
    }
}

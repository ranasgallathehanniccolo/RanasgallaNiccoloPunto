/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolopunto;
import java.util.Scanner;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Test {
    public Test(){
    }
    public void prova(){
        Punto a, b, p;
        a = new Punto(0, 0);
        b = new Punto(0, 0);
        p = new Punto(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi la x del punto a");
        int x= input.nextInt();
        System.out.println("dimmi la y del punto a");
        int y= input.nextInt();
        a.setX(x);
        a.setY(y);
        System.out.println("dimmi la x del punto b");
        x= input.nextInt();
        System.out.println("dimmi la y del punto b");
        y= input.nextInt();
        b.setX(x);
        b.setY(y);
        System.out.println("Dimmi la larghezza dello spazio");
        int spaziox = input.nextInt();
        System.out.println("Dimmi l'altezza dello spazio");
        int spazioy = input.nextInt();
        Quadrato q;
        q = new Quadrato(a, b);
        if(q.controlloArea(spaziox, spazioy) == false){
            System.out.println("Il quadrato è all'interno dello spazio definito");  
        }else{
            System.out.println("Il quadrato è fuori dello spazio definito");
        }
        if(q.controlloQuadrato() == true){
            System.out.println("È un quadrato");
        }else{
            System.out.println("Non è un quadrato");
        }
        do{
            System.out.println("Vuoi spostare il punto p? s7n");
            String scelta = input.nextLine();
            if(scelta == "s"){
            p.sposta(spaziox, spazioy);
            if(q.controlloPunto(p) == true){
                System.out.println("È dentro dal quadrato");
            }else{
                System.out.println("È fuori dal quadrato");
            }
            }
        }while(scelta == "s");
    }
}

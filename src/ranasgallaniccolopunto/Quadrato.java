/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolopunto;

/**
 *
 * @author ranasgalla.niccolo
 */
public class Quadrato {
    private Punto a;
    private Punto b;
    
    public Quadrato(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }
    public boolean controlloArea(int spazioX, int spazioY){
        if(a.getX() < spazioX && a.getY() < spazioY && b.getX() < spazioX && b.getY() < spazioY){
            return false;
        }
        return true;
    }
    public boolean controlloQuadrato(){
        if(a.getX() - b.getX() == a.getY() - b.getY()){
            return true;
        }
        return false;
    }
    public boolean controlloPunto(Punto p){
        if(b.getX() >= p.getX() && p.getX() >= a.getX() && a.getY() >= p.getY() && p.getY() >= b.getY()){
            return true;
        }
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolopunto;

/**
 *
 * @author ranasgalla.niccolo
 */
public class Punto {
    protected double X;
    protected double Y;
    
    public Punto(float x, float y){
        this.X=x;
        this.Y=y;
    }
    public float distanzaOrigine(){
        return (float)Math.sqrt(Math.pow(X, 2)+Math.pow(Y, 2));
    }
    public int getX(){
        return (int)this.X;
    }
    public int getY(){
        return (int)this.Y;
    }
    public int setX(double x){
        return (int)this.X;
    }
    public int setY(double y){
        return (int)this.Y;
    }
    public float distanzaPunto(Punto altroPunto) {
    double dx = this.X - altroPunto.X;
    double dy = this.Y - altroPunto.Y;
    return (float)Math.sqrt(dx * dx + dy * dy);
    }
    public void sposta(int spazioX, int spazioY){
        X=Math.random()*spazioX;
        Y=Math.random()*spazioY;
    }
}

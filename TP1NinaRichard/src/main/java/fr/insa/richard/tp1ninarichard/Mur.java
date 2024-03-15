/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.richard.tp1ninarichard;

import static java.lang.Math.sqrt;

/**
 *
 * @author nrichard01
 */
public class Mur {
    private int id;
    private Coin coin1;
    private Coin coin2;
    
    // je ne sais pas
    private boolean interior;
    private double longueur;
    private double hauteur = 2; //mettre une reference a l'etage
    private double surface;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coin getCoin1() {
        return coin1;
    }

    public void setCoin1(Coin coin1) {
        this.coin1 = coin1;
    }

    public Coin getCoin2() {
        return coin2;
    }

    public void setCoin2(Coin coin2) {
        this.coin2 = coin2;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
    
    

    public Mur(int id, Coin coin1, Coin coin2) {
        this.id = id;
        this.coin1 = coin1;
        this.coin2 = coin2;
    }

    public Mur(int id, Coin coin1, Coin coin2, boolean interior) {
        this.id = id;
        this.coin1 = coin1;
        this.coin2 = coin2;
        this.interior = interior;
    }
    
    public  double Longueur(){
        longueur = sqrt((coin1.getX() - coin2.getX())*(coin1.getX() - coin2.getX()) + (coin1.getY() - coin2.getY())* (coin1.getY() - coin2.getY()) );
        return longueur;
    }

   public  double Surface(){
       surface = longueur * hauteur;
       return surface;
   }
    
    @Override
    public String toString() {
        return "Mur{" + "id=" + id + ", coin1=" + coin1 + ", coin2=" + coin2 + ", interior=" + interior + ", longueur=" + longueur + '}';
    }

   
    
    
}

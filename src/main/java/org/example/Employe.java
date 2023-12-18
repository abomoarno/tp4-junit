package org.example;

public class Employe {
    private String nom;
    private int age;
    private double brute;
    private int enfant;

    public Employe(String nom, int age, double brute, int enfant) throws IllegalArgumentException  {

        if (brute <= 0){
            throw new IllegalArgumentException();
        }

        this.nom = nom;
        this.age = age;
        this.brute = brute;
        this.enfant = enfant;
    }

    @Override
    public String toString() {
        return nom + " - " +
                age +
                " - " +
                brute +
                " - " +
                enfant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBrute() {
        return brute;
    }

    public void setBrute(double brute) {
        this.brute = brute;
    }

    public int getEnfant() {
        return enfant;
    }

    public void setEnfant(int enfant) {
        this.enfant = enfant;
    }
}

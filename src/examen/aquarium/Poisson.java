package examen.aquarium;

public abstract class Poisson {
    protected String nom;
    protected int age;
    protected String couleur;

    public Poisson(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void nager() {
        System.out.println(nom + " nage dans l'eau.");
    }

    public abstract void manger();

    @Override
    public String toString() {
        return nom + " (" +age + " ans) " + couleur ;
    }
}
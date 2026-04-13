package examen.aquarium;

public class Piranha extends Poisson {

    public Piranha(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des poissons!");
    }

    @Override
    public void nager() {
        System.out.println(nom + " nager à la surface à la recherche de sa proie.");
    }
}

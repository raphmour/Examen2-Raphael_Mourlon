package examen;

import examen.aquarium.*;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        AbstractPoisson p1 = new PoissonClown("Nemo", 2, "orange");
        AbstractPoisson p2 = new Piranha("Terreur", 3, "bleu");
        AbstractPoisson p3 = new PoissonVolant("Superman", 7, "rouge");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);
        aquarium.ajouterPoisson(p3);
        System.out.println();
        aquarium.afficherPoissons();

        System.out.println("\nActivité dans l'Aquarium :");
        aquarium.faireNagerTous();
    }
}

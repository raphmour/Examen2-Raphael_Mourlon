package examen;

import examen.aquarium.Aquarium;
import examen.aquarium.Piranha;
import examen.aquarium.Poisson;
import examen.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "orange");
        Poisson p2 = new Piranha("Terreur", 3, "bleu");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);
        System.out.println();
        aquarium.afficherPoissons();

        System.out.println("\nActivité dans l'Aquarium :");
        aquarium.faireNagerTous();
    }
}

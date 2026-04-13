package examen.aquarium;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<AbstractPoisson> poissons = new ArrayList<>();
    private int capaciteMax;

    public Aquarium(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void ajouterPoisson(AbstractPoisson p) {
        if (poissons.size() < capaciteMax) {
            poissons.add(p);
            System.out.println(p.getNom() + " ajouté à l'aquarium.");
        } else {
            System.out.println("Aquarium plein !");
        }
    }

    public void afficherPoissons() {
        System.out.println("Contenu de l'Aquarium: ");
        for (AbstractPoisson p : poissons) {
            System.out.println("\t-" + p);
        }
    }

    public void faireNagerTous() {
        for (AbstractPoisson p : poissons) {
            System.out.print("\t-");
            p.nager();
            System.out.print("\t-");
            p.manger();
        }
    }
}
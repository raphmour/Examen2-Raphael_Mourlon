package examen.aquarium;

public class PoissonClown extends AbstractPoisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des algues et des petits crustacés");
    }
}

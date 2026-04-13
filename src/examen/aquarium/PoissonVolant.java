package examen.aquarium;

public class PoissonVolant extends AbstractPoisson {

    public PoissonVolant(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger(){
        System.out.println(nom+" mange des mouches en bondissant hors de l'eau.");
    }
    @Override
    public void nager(){
        System.out.println(nom+" nage rapidement proche de la surface et plane hors de l'eau.");
    }
}

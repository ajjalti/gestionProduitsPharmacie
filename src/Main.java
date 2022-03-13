import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       //tester le code par ici
        Pharmacie pharmacie = new Pharmacie("Ahmed Ajjalti","42 risting Berkane");
        Produit produit = new Produit();
        Produit p1=new Produit("123",12.89,10);
        Produit p2=new Produit("124",12.89,20);
        pharmacie.Achat(p1);
        pharmacie.Achat(p2);
        pharmacie.EnregestrerDansFichier();
    }
}

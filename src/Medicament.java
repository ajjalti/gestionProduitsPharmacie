public class Medicament extends Produit {
    private boolean Generique;
    private boolean Ordonnance;
    Produit p = new Produit();

    //constructeur par défault :
    public Medicament(Produit p ){
        this.p = p;
    }
    // constructeur d'initialisation :
    public Medicament(Produit p, boolean gen,boolean ord){
        this.p = p;
        this.Generique = gen;
        this.Ordonnance = ord;
    }

    // les accesseurs :

    public boolean isGenerique() {
        return Generique;
    }

    public boolean isOrdonnance() {
        return Ordonnance;
    }

    public void setOrdonnance(boolean ordonnance) {
        this.Ordonnance = ordonnance;
    }
    public void setGenerique(boolean gen){
        this.Generique = gen;
    }
}

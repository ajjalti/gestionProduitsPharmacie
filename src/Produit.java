public class Produit {
    protected String ref;
    protected Double prix;
    protected int qte;

    // constructeur par défault:
    public Produit(){}
    // constructeur d'initialisation:
    public Produit(String ref,Double prix,int qte) {
        this.ref = ref;
        this.prix = prix;
        this.qte = qte;
    }

    //les accesseurs :

    public String getRef() {
        return ref;
    }

    public Double getPrix() {
        return prix;
    }

    public int getQte() {
        return qte;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setQte(int qte) {
        if(qte>0){
        this.qte = qte;}
        }
    public String toString(){
        return "réference : "+this.ref+"\nprix: "+ this.prix+"\nquantité :" +this.qte+"\n";
    }
}


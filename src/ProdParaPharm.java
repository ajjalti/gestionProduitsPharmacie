public class ProdParaPharm extends Produit {
    private String type;
    Produit p = new Produit();
    //constructeur par défault :
    public ProdParaPharm(Produit p ){
        this.p = p;
    }
    public ProdParaPharm(Produit p,String type){
        this.p = p;
        this.type = type;
    }
    //les accesseurs :

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

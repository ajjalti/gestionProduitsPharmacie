import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Pharmacie{
    private String nom;
    private String adress;
    static ArrayList<Produit> produits = new ArrayList<Produit>();

    //constructeur par défault :
    public Pharmacie(){
    }
    // constructeur d'initialisation  :
    public Pharmacie(String nom, String adress){
        this.nom = nom;
        this.adress = adress ;
    }
    // les accesseurs :

    public String getNom() {
        return nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String AfficherProduits(){
        String list="";
        for (int i=0;i<this.produits.size();i++)
        {
            list+=this.produits.get(i).toString();
        }
        return list;
    }

    public void Achat(Produit p){
            if(this.produits.contains(p)){
            if(this.produits.get(this.produits.indexOf(p)).ref != p.ref) {
                this.produits.add(p);}
            }else {
                this.produits.add(p);
            }
    }
    public void Approvisionner(Produit p,int qts){
        if(Collections.frequency(this.produits,p)>=qts)
        { for (int i=0;i< qts;i++){
            this.produits.remove(p);
        }
        }
    }
    public void EnregestrerDansFichier() throws IOException {
        File f = null;
        try {
            f = new File("/Users/mac/WorkSpace/gestionProduitsPharmacie/src/PH.txt");
            if (f.createNewFile()) {
                System.out.println("Fichier créé!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter writer = new PrintWriter(f, StandardCharsets.UTF_8);
        writer.println(this);
        writer.close();
    }

    @Override
    public String toString() {
        return "\t\t\t****Pharmacie****\n" +
                "nom = " + this.nom +"\n"+
                "adress =" + this.adress +"\n"+"détails des produits:\n"+
                this.AfficherProduits();
    }
}


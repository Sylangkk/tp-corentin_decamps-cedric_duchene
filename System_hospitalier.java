package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {
        // Cette méthode analyse une requête donnée et renvoie une chaîne de caractères
        // indiquant que la requête a été analysée.
        // Le paramètre d'entrée est un objet de type Requête.
        
        return "requête analysée";
    }

    private String comparerDonnes() {
        // Cette méthode compare les données (probablement des ensembles de données internes)
        // et cherche à identifier un "cluster" ou un regroupement significatif de données.
        // Elle ne prend aucun paramètre et renvoie une chaîne indiquant qu'un cluster a été trouvé.
        return "Cluster trouvé";
    }

}

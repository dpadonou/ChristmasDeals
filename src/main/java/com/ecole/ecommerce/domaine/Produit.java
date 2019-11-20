package com.ecole.ecommerce.domaine;

import javax.persistence.*;
/*import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.SimpleDateFormat;
import java.util.Date;*/

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    @Column(name = "nom_produit", nullable = false)
    private String nomProduit;

    @Column(name = "description")
    private String description;

    @Column(name = "prix", nullable = false)
    private double prix;

    @Column(name = "nouveaute")
    private boolean nouveaute;

    @Column(name = "quantite")
    private int quantite;

    /**
     * Un produit appartient à une et une seule catégorie
     */
    @ManyToOne(optional = false)
    private Categorie categorie;

    /**
     * Définit l'ancienneté du produit dans le magasin
     * par défaut à true lors de l'ajout du produit
     * peut prendre la valeur "false" au bout d'un certain temps
     */
    public Produit() {
        nouveaute = true;
    }

    public Produit(String nomProduit, String description, double prix, boolean nouveaute, Categorie categorie, int quantite) {
        this.nomProduit = nomProduit;
        this.description = description;
        this.quantite = quantite;
        this.prix = prix;
        this.categorie = categorie;
        this.nouveaute = true;
        this.nouveaute = nouveaute;
    }

    public Produit(String nomProduit, String description, double prix, int quantite) {
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        nouveaute = true;
    }

    public Produit(String nomProduit, double prix, Categorie categorie, int quantite) {
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        nouveaute = true;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isNouveaute() {
        return nouveaute;
    }

    public void setNouveaute(boolean nouveaute) {
        this.nouveaute = nouveaute;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
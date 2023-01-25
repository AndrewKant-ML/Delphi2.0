package it.uniroma2.dicii.ispw.gradely.model;

import java.util.List;

public class User {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String email;


    private List<AbstractRole> ruoli;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AbstractRole> getRuoli() {
        return ruoli;
    }

    public void setRuoli(List<AbstractRole> ruoli) {
        this.ruoli = ruoli;
    }
}

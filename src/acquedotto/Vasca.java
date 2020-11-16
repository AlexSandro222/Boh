/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acquedotto;

/**
 *
 * @author aless
 */
public class Vasca {
private String nome;
private double volume;

private double contenuto;
// costruttore con il solo attributo nome

    public Vasca(String nome) {
        this.nome = nome;
    }
    public void aggiungiContenuto(double quantita){
    double contenutoAggiornato=this.contenuto+quantita;
    if(contenutoAggiornato<=this.volume){
     // posso aggiungere la quantita
     this.contenuto=this.contenuto+quantita;
    }else{
    // stampa messaggiogit 
    System.out.println("volume della vasca superato,quantita impossibile da aggiungere");
    }
    }
    
    
    public void prelevaContenuto(double quantita){
    
    if(this.volume>=quantita){
     // quantita prelevabile
     this.contenuto=this.contenuto-quantita;    
    }else{
    System.out.println("volume della vasca inferiore alla quantita richiesta");
    }
    }

    public String getNome() {
        return nome;
    }

    public void setContenuto(double contenuto) {
        this.contenuto = contenuto;
    }
    
    public double getVolume() {
        return volume;
    }

    public double getContenuto() {
        return contenuto;
    }

}

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
public class Acquedotto {
     private Vasca[] vasche;
     
     public void aggiungiContenuto(String nome,double quantita){
     for(int i = 0;i<this.vasche.length;i++){
      Vasca vascaCorrente=this.vasche[i];
      if(vascaCorrente.getNome()==nome){
       // vasca trovata
       vascaCorrente.aggiungiContenuto(quantita);
      }
     }
     }
     
     public void prelevaContenuto(String nome,double quantita){
     for(int i = 0;i<this.vasche.length;i++){
      Vasca vascaCorrente=this.vasche[i];
      if(vascaCorrente.getNome()==nome){
       // vasca trovata
       vascaCorrente.prelevaContenuto(quantita);
      }
     }    
     }
     
     public double getContenuto(){
       double quantitaTotale=0.0;
       for(int i = 0;i<this.vasche.length;i++){
        Vasca vascaCorrente=this.vasche[i];
        // aggiunta la quantita della vasca corrente
        quantitaTotale=quantitaTotale+vascaCorrente.getContenuto();
       }
       
       
       return quantitaTotale;
     }
     
     public double getDispo(){
     double spazioDisponibile=0.0;
     double volumeTotale=0.0;
     double contenutoTotale=this.getContenuto();
     for(int i = 0;i<this.vasche.length;i++){
      Vasca vascaCorrente=this.vasche[i];
      // aggiungo il volume della vasca corrente
      volumeTotale=volumeTotale+vascaCorrente.getVolume();
     }
     spazioDisponibile=volumeTotale-contenutoTotale;
     
     return spazioDisponibile;
     }
     
     
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

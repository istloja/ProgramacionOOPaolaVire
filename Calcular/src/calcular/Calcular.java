/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;



/**
 *
 * @author FRANCO
 */
class Calcular {


    public double seno;
    public double tangente;
    public double coseno;
    static double valor;
    static double grados;

    public Calcular(double seno, double tangente, double coseno) {
        this.seno = seno;
        this.tangente = tangente;
        this.coseno = coseno;
    }
    

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getTangente() {
        return tangente;
    }

    public void setTangente(double tangente) {
        this.tangente = tangente;
    }

    public double getCoseno() {
        return coseno;
    }

    public void setCoseno(double coseno) {
        this.coseno = coseno;
    }

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        Calcular.valor = valor;
    }

    public static double getGrados() {
        return grados;
    }

    public static void setGrados(double grados) {
        Calcular.grados = grados;
    }
}
    
        
        
    

   


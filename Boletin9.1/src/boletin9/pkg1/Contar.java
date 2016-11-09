
package boletin9.pkg1;

import javax.swing.JOptionPane;


public class Contar {
    int num;
    int contadorpositivo =0;
    int contadornegativo= 0;
    int contadorceros=0;
    public void contador(){
    for (int i=0; i<10; i++){
        num = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
           if (num>0)
               contadorpositivo++;
           else if (num==0)
               contadorceros++;
           else contadornegativo++;
    }
        System.out.println("numeros positivos" + contadorpositivo);
        System.out.println("numeros igual a 0" + contadorceros);
        System.out.println("numeros negativos" + contadornegativo);
    
    }
}

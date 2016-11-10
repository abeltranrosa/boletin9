
package boletin9.pkg5;

import javax.swing.JOptionPane;


public class Fibonacci {
    public void operacion(){
        String cadena;
        int numElementos;
        int i;
        numElementos = Integer.parseInt(JOptionPane.showInputDialog("introduce numero de elementos"));
        
        int fibonacci1=0; 
        int fibonacci2=1;
        cadena=" "+fibonacci1+ " "; 
        
        for(i=2;i<=numElementos;i++){
            cadena=cadena + fibonacci2+" ";//hasta esta parte se concatena
            fibonacci2 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2 - fibonacci1;
        }
        System.out.println(cadena);
        
        
        
    }
    
}

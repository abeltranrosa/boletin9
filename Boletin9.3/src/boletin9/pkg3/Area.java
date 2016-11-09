
package boletin9.pkg3;

import javax.swing.JOptionPane;


public class Area {
    public void Rectangulo(){
    
    int base;
    int altura;
    do{
        base = Integer.parseInt(JOptionPane.showInputDialog("introduce base"));
    }while (base<0);
    do{
        altura = Integer.parseInt(JOptionPane.showInputDialog("introduce altura"));
        }while (altura<0);
        int area= base*altura;
        System.out.println("Area es: " + area );
    }
    
}

package boletin9.pkg4;

import javax.swing.JOptionPane;


public class Numero {
    public void tabla(){
    int num;
    int i;
    num = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
    while (num!=0){
        for(i=0;i<10;i++){
            System.out.println(num + "*" +i+"="+(num*i));
            
 }
    num = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
    
}
}
}
    
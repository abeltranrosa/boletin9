
package boletin9.pkg5;

import javax.swing.JOptionPane;


public class Elementopositivonegativo {
    public void operacion(){
     
      int numElementos;
      int i;
      numElementos = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
      for (i=1;i<numElementos;i++){
          if (i%2==0)
              System.out.println("el numero es :" + "+" + i);
          else
              System.out.println("el numero es :" + "-" + i);
             
          
      }
        
        
    }
    
}


package boletin.pkg9.pkg2;


public class Operacion {
    public void Operando(){
    int i;//declaro la variable i para que figure en el contador suma y producto
    int acumuladorsuma=0;
    double acumuladorproducto=1;
    for (i=10;i<=90;i++){
        acumuladorsuma = acumuladorsuma + i;
        acumuladorproducto= acumuladorproducto*i;
}
        System.out.println("el resultado de la suma es: " + acumuladorsuma);
        System.out.println("el resultado del producto es: "+ acumuladorproducto);
    
    }
}
    


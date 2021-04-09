/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

import javax.swing.JOptionPane;

/**
 *
 * @author pelus
 */
public class clssuma extends clsoperaciones {
     
    public clssuma(int numero1, int numero2){
        
       super(numero1, numero2);
     
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor valor"));
    this.resultado = numero1 + numero2;
    
    this.setResultado(resultado);
    
    JOptionPane.showMessageDialog(null, resultado);
    
    }    

}

/**
 *
 * @Emily Rharysa
 */
/*
    Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
*/

import javax.swing.JOptionPane;
public class Recursividade_serie5 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        JOptionPane.showMessageDialog(null, Serie5(num));
    }
    
    public static int Serie5(int n){
        int soma;
        if(n==1){
            return n;
        }else{
            soma =+ Fatorial(n)+Serie5(n-1);
            return soma;
        }
    }
    
    public static int Fatorial(int f){
        int somaF;
        if(f==1){
            return f;
        }else{
            somaF = f * Fatorial(f-1);
            return somaF;
        }
}
}
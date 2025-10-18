/**
 *
 * @Emily Rharysa
 */
/*
    Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
*/
import javax.swing.JOptionPane;
public class Recursividade_serie4 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        JOptionPane.showMessageDialog(null, Serie4(num, 1));
    }
    public static double Serie4(double d, double n){
        if(d == n){
            return (1.0/n);
        }else{
            double soma = ((d - n + 1)/n) + Serie4(d, n+1);
            return soma;
        }
    }
}

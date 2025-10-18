/**
 *
 * @Emily Rharysa
 */
/*
    Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
*/
import javax.swing.JOptionPane;
public class Recursividade_serie2 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        JOptionPane.showMessageDialog(null, Serie2(num));
    }
    public static int Serie2(int n){
        int soma;
        if(n==1){
            return n;
        }else{
            soma = n + Serie2(n-1);
            return soma;
        }
    }
}

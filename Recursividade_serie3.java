/**
 *
 * @Emily Rharysa
 */
/*
    Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
*/
import javax.swing.JOptionPane;
public class Recursividade_serie3 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        JOptionPane.showMessageDialog(null, Serie3(num));
    }
    public static double Serie3(int n){
        double soma;
        if(n == 1){
            return 1.0;
        }else{
            soma = Serie3(n-1) + (1.0/n);
            return soma;
        }
    }
}

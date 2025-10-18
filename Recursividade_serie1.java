/**
 *
 * @Emily Rharysa
 */

/*
    Serie1 = (1+2+3+...+100)
*/
import javax.swing.JOptionPane;
public class Recursividade_serie1 {
    public static void main(String args[]){
    int num;
    num = 100;
    JOptionPane.showMessageDialog(null, Serie1(num));
    }
    
    public static int Serie1(int n){
        int soma;
        if(n==1){
           return n; 
        }else{
            soma = n + Serie1(n-1);
            return soma;
        }
    }
}

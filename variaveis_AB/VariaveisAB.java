import javax.swing.JOptionPane;

public class VariaveisAB {
  public static void main(String[] args) {
    
    //Declarando variável A e B
    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de A","Soma",JOptionPane.QUESTION_MESSAGE));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de B","Soma",JOptionPane.QUESTION_MESSAGE));
    
    //Declarando variável X
    int X = (a + b);

    JOptionPane.showMessageDialog(null,"X = "+X);
  }
}
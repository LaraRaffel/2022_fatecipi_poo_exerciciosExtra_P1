import javax.swing.JOptionPane;

public class VariavelSoma {
  public static void main(String[] args) {

    int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A:"));
    int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B"));
    
    //declarando a variavel soma
    int SOMA = A + B;
    System.out.printf("SOMA = %d", SOMA);

  }
}
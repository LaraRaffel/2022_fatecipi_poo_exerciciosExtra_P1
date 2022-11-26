import javax.swing.JOptionPane;

public class PontoFlutuante {
  public static void main(String[] args) {

      Double a,b,c;
      Double delta;

      a=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor de A?"));
      b=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor de B?"));
      c=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor de C?"));

      delta = ((b*b)-4*a*c);

      if(a==0  | delta <0){
        System.out.println("É impossével de calcular");
      }else{
        Double R1 = (-b + Math.sqrt(delta))/(2*a);
        Double R2 = (-b - Math.sqrt(delta))/(2*a);
        //Float.parseFloat(R2);
        System.out.printf("Primeira Raiz %.5f", R1);
        System.out.printf("\nPrimeira Raiz %.5f", R2);
      }
  }
}
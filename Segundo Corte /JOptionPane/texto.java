import javax.swing.JOptionPane;

public class JavaApplication20 {
    public static void main(String[] args) {
        String value1;
        String value2;
        int result, number1 , number2;
        
        value1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        value2 = JOptionPane.showInputDialog("Ingrese el primer numero");
        
        number1 = Integer.parseInt(value1);
        number2 = Integer.parseInt(value2);
        
        result = number1 + number2;
        
       
        JOptionPane.showMessageDialog(null,"Resultado es: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    
    }
    
}

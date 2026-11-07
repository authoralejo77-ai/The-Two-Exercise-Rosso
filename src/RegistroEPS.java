import javax.swing.JOptionPane;

public class RegistroEPS {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));

        while(edad <= 0 || edad >= 120) {
            JOptionPane.showMessageDialog(null, "Lo siento, debe colocar bien su edad para registrarse.");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de nuevo su edad:"));
        }
        if(edad < 18){
             JOptionPane.showMessageDialog(null, "Paciente registrado: " + nombre + "," + edad + "años (Menor de edad) ");
        }
        JOptionPane.showMessageDialog(null, "Paciente registrado: " + nombre + " , " + edad + "años (Mayor de edad) ");
        
    }
}

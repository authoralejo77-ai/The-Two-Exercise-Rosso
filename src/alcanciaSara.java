import javax.swing.JOptionPane;

public class alcanciaSara {
    public static void main(String[] args) {
        int total = 0;
        int cantidad = 0;

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Depósito (0 para terminar):"));

        while (valor != 0) {
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten valores negativos.");
            } else {
                total = total + valor;
                cantidad = cantidad + 1;
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog("Depósito (0 para terminar):"));
        }

        JOptionPane.showMessageDialog(null,
                "Hiciste " + cantidad + " depósitos. Total ahorrado: $" + total);
    }
}

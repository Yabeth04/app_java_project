package app_java_project;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class App_java_project {

    public static void main(String[] args) {
        // INICIO MAIN

        int indice = 0;

        do {

            indice = Integer.parseInt(JOptionPane.showInputDialog("********* MENU *********\n"
                    + "1) Agregar\n2) Consultar\n3) Eliminar\n0) Salir"));

            switch (indice) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Caso 1");
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Caso 2");
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Caso 3");
                }
                case 0 ->{
                }
                
                default -> JOptionPane.showMessageDialog(null, "ERROR: Opcion no valida");

            }//FIN SWITCH

        } while (indice != 0);

        //FIN MAIN
    }

}

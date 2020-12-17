/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0, elemento = 0;

        Cola colita = new Cola();

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. insertar un elemento en la cola \n"
                        + "2. quitar un elemento en la cola \n"
                        + "3. la cola esta vacia ?\n"
                        + "4. elemento ubicado al inicio de la cola \n"
                        + "5. tamano de la cola \n"
                        + "6. Salir",
                         JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {

                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento a insertar", "insertando en la cola", JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {

                            JOptionPane.showMessageDialog(null, "el elemento atendido es " + colita.quitar(),
                                    "quitando elementos de la cola", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "la cola esta vacia",
                                    "cola vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "la cola esta vacia " + colita.quitar(),
                                    "quitando elementos de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la cola no esta vacia",
                                    "cola no vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "el elemento ubicado al inicio de la cola es " + colita.inicioCola(),
                                    "ubicacion al inicio de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la cola esta vacia",
                                    "cola  vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:

                        JOptionPane.showMessageDialog(null, "el tamanio de la cola es " + colita.tamanoCola(),
                        "tamanio de  cola",JOptionPane.INFORMATION_MESSAGE
                        );
                               
                            break;

                    case 6:
                        
                            JOptionPane.showMessageDialog(null, "aplicacion finalizada",
                                    "fin", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta",
                                "cuidado ", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "eroor" + n.getMessage());
            }

        } while (opcion != 6);

    }

}
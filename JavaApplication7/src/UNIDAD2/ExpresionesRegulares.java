package UNIDAD2;

import javax.swing.JOptionPane;

public class ExpresionesRegulares {

    public static boolean ComparaEX1(String ex) {
        // Verificar si la cadena está vacía o es nula
        if (ex == null || ex.isEmpty()) {
            return false;
        }

        // Verificar si la cadena cumple con el patrón
        String patron = "\\d+[a-zA-Z]+!*"; // patrón: números + letras + signo de exclamación
        return ex.matches(patron);
    }
    
    public static boolean ComparaEX2(String ex) {
        if (ex == null || ex.isEmpty()) {
            return false;
        }
        
        String patron = "[A|a][B|b][C|c](\\d+)*";
        return ex.matches(patron);
    }
    
    public static boolean ComparaEX3(String ex) {
        if (ex == null || ex.isEmpty()) {
            return false;
        }
        
        String patron = "^[^Aa]*\\d+\\$";
        
        return ex.matches(patron);
    }
    
    public static void main(String[] args) {
        String menu = """
                  1) Ingresar palabras para comparar con la expresión regular
                  2) Mostrar las expresiones regulares 
                  3) Salir
                  """;
        
        int opcion = 0;
        int totalOpciones = 3;
        
        String expresiones = """
                             1)Una cadena de uno o más numeros, seguida de una cadena
                               de una cadena de una o más letras y puede o no tener un '!'
                               al final.
                             
                             (0-9)+(a-z)+!*
                             
                             2)Un caracter que podría ser 'A' o 'a', un carácter que podría
                               ser 'B' o 'b', un caracter que podría ser 'C' O 'c' y podría
                               o no tener un número al final
                             
                             [A|a][B|b][C|c](0-9)*
                             
                             3)Todo lo que no sea 'A' o 'a', seguido de uno o más números
                             y podría o no tener un '$' al final.
                             
                             [^A|a](0-9)+$*
                             """;
        
        while (opcion != totalOpciones) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcion) {
                case 1:
                    String captura = JOptionPane.showInputDialog(null, "Ingresa las palabras que quieren comparar ");
                    
                    String mensaje = "";
                    
                    String palabras[] = captura.split(" ");
                    
                    for (int i = 0; i < palabras.length; i++) {
                        if (ComparaEX1(palabras[i])) {
                                mensaje += palabras[i] + " coincide con la expresión regular \\d+[a-zA-Z]+!*\n";
                        }
                        
                        if (ComparaEX2(palabras[i])) {
                                mensaje += palabras[i] + " coincide con la expresión regular [A|a][B|b][C|c](\\d+)*\n";
                        }
                        
                        if (ComparaEX3(palabras[i])) {
                                mensaje += palabras[i] + " coincide con la expresión regular ^[^Aa]*\\d+\\$\n";
                        }
                    }
                    
                    if (mensaje.equals("")) {
                        JOptionPane.showMessageDialog(null, "No hay ninguna expresion regular \n"
                                + "que coincida con lo que acabas de escribir");
                    } else {
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, expresiones);
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una opción válida");
                    break;
            }
        }
    }
    
}

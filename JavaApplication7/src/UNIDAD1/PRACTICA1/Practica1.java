package UNIDAD1.PRACTICA1;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica1 {
    public static void main(String [] args){
        String texto = "";
        int opcion = 0, totalOpciones = 4;
        String menu = """
                      1) Escribir texto
                      2) Almacenar texto en archivo
                      3) Leer texto de archivo
                      4) Salir""";
        
        while(opcion != totalOpciones){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(opcion){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduce el texto (escribir 'fin.' para terminar):");

                    StringBuilder sb = new StringBuilder();
                    while (true) {
                    String line = scanner.nextLine();
                    if (line.equals("fin.")) {
                    break;
                    }
                    sb.append(line).append("\n");
                    }
                    
                    texto = sb.toString();
                    break;
                    
                case 2:
                    try {
                        FileWriter writer = new FileWriter("word.txt");
                        writer.write(texto);
                        writer.close();
                        
                        JOptionPane.showMessageDialog(null, "La palabra se ha escrito correctamente!");
                        
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "No se ha podido guardar la palabra correctamente");
                    }
                    break;
                    
                case 3:
                    String letra = "";
                    File file = new File("word.txt");
                    
                    try {
                        Scanner sc = new Scanner(file);
                        while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        letra += line + "\n";
                    }
                    sc.close();
                    JOptionPane.showMessageDialog(null, letra);
                    
                    } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "El archivo no se ha encontrado");
                    }
                    
                    int contador = 0;
                    
                    for (int i = 0; i < letra.length(); i++) {
                        if(letra.charAt(i) == '\n'){
                            contador++;
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "Hay " + contador + " renglones en el archivo de texto");
                    
                    contador = 0;
                    
                    for (int i = 0; i < letra.length(); i++) {
                        if(letra.charAt(i) == ' ' || letra.charAt(i) == '\n'){
                            contador++;
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "Hay " + contador + " palabras en el archivo de texto");
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    
                    try {
                    FileWriter writer = new FileWriter("word.txt");
                    writer.write("");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "El contenido del archivo se ha borrado");
                    } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error al borrar el contenido del archivo");
                    }
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor introduzca una opcion válida");
                    break;
            }
        }
    }
}

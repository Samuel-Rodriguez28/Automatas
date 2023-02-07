package UNIDAD1.PRACTICA1;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica1 {
    public static void main(String [] args){
        
        int opcion = 0, totalOpciones = 4;
        String menu = """
                      1) Escribir texto
                      2) Escribir texto en archivo
                      3) Leer texto de archivo
                      4) Salir""";
        
        while(opcion != totalOpciones){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(opcion){
                case 1:
                    String palabra = JOptionPane.showInputDialog("Introduzca una palabra que quiera introducir al archivo");
                    
                    try {
                        FileWriter writer = new FileWriter("word.txt");
                        writer.write(palabra + "\n");
                        writer.close();
                        
                        JOptionPane.showMessageDialog(null, "La palabra se ha escrito correctamente!");
                        
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "No se ha podido guardar la palabra correctamente");
                    }
                    break;
                    
                case 2:
                    File file = new File("word.txt");
                    
                    try {
                        Scanner sc = new Scanner(file);
                        while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        System.out.println(line);
                        
                        
                    }
                    sc.close();
                    } catch (FileNotFoundException e) {
                    System.out.println("El archivo no se ha encontrado");
                    }
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                default:
                    break;
            }
        }
    }
}

package UNIDAD1.PRACTICA1;

import java.io.*;

public class Repaso1 {
	public static void main(String[] a) {
		FileInputStream origen = null;
		FileOutputStream destino = null;
		File f1 = new File(
        "C:\\Users\\Samuel\\Desktop\\TareasTEC\\AUTOMATAS\\src\\UNIDAD1\\PRACTICA1\\jardines.txt");
		File f2 = new File(
        "C:\\Users\\Samuel\\Desktop\\TareasTEC\\AUTOMATAS\\src\\UNIDAD1\\PRACTICA1\\jardinesOld.txt");
		try {
			origen = new FileInputStream(f1);
			destino = new FileOutputStream(f2);
			int c;
			while ((c = origen.read()) != -1)
			{
				destino.write((byte) c);
				System.out.print((char)c);
			}
			
			System.out.println("SE COPIO EL ARCHIVO 'jardines.txt' a 'jardinesOld.txt'");
			
		} catch (IOException er) {
			System.out.println("Excepción en los flujos " + er.getMessage());
		} finally {
			try {
				origen.close();
				destino.close();
			} catch (IOException er) {
				er.printStackTrace();
			}
		}
	}
}

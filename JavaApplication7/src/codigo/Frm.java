/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

/**
 *
 * @author Samuel
 */
public class Frm extends javax.swing.JFrame {

    /**
     * Creates new form Frm
     */
    public Frm() {
        initComponents();
        
        File archivo = new File("archivo.txt");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AnalizeLex = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabLex = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        AnalizeSintax = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSin = new javax.swing.JTextArea();
        OpenFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Léxico-Sintáctico");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnalizeLex.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        AnalizeLex.setText("Analizar Lexico");
        AnalizeLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizeLexActionPerformed(evt);
            }
        });
        jPanel1.add(AnalizeLex, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 170, 40));

        txtInput.setBackground(new java.awt.Color(255, 255, 255));
        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        txtInput.setForeground(new java.awt.Color(0, 0, 0));
        txtInput.setRows(5);
        txtInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInputFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(txtInput);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 380));

        tabLex.setBackground(new java.awt.Color(255, 255, 255));
        tabLex.setForeground(new java.awt.Color(0, 0, 0));
        tabLex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Token", "Posicion", "Linea"
            }
        ));
        jScrollPane1.setViewportView(tabLex);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 890, 10));

        AnalizeSintax.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        AnalizeSintax.setText("Analizar Sintaxis");
        AnalizeSintax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizeSintaxActionPerformed(evt);
            }
        });
        jPanel1.add(AnalizeSintax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 170, 40));

        txtSin.setEditable(false);
        txtSin.setBackground(new java.awt.Color(255, 255, 255));
        txtSin.setColumns(20);
        txtSin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSin.setForeground(new java.awt.Color(0, 0, 0));
        txtSin.setRows(5);
        jScrollPane3.setViewportView(txtSin);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 890, 170));

        OpenFile.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        OpenFile.setText("Abrir Archivo");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        jPanel1.add(OpenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalizeLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizeLexActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtInput.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            
            Lexer lexer = new Lexer(lector);
            
            DefaultTableModel model = (DefaultTableModel) tabLex.getModel();
            
            int tokens = 0;
            
            while ((tokens = lexer.yylex()) != 0) {
                
//                JOptionPane.showMessageDialog(null, tokens);
                        
                try {
                    switch (tokens) {
                        case -1:
                            String[] programa = {"programa", "-1", "-1", "" + buscaLinea(archivo, "programa")};
                            model.addRow(programa);
                            break;
                        
                        case -2:
                            String[] inicio = {"inicio", "-2", "-1", "" + buscaLinea(archivo, "inicio")}; //+ buscaLinea(archivo, lexer.lexeme)}; 
                            model.addRow(inicio);
                            break;
                        
                        case -3:
                            String[] fin = {"fin", "-3", "-1", "" + buscaLinea(archivo, "fin")};
                            model.addRow(fin);
                            break;
                        
                        case -4:
                            String[] leer = {"leer", "-4", "-1", "" + buscaLinea(archivo, "leer")};
                            model.addRow(leer);
                            break;
                        
                        case -5:
                            String[] escribirt = {"escribir", "-5", "-1", "" + buscaLinea(archivo, "escribir")};
                            model.addRow(escribirt);
                            break;
                        
                        case -6:
                            String[] si = {"si", "-6", "-1", "" + buscaLinea(archivo, "si")};
                            model.addRow(si);
                            break;
                        
                        case -7:
                            String[] sino = {"sino", "-7", "-1", "" + buscaLinea(archivo, "sino")};
                            model.addRow(sino);
                            break;
                        
                        case -8:
                            String[] mientras = {"mientras", "-8", "-1", "" + buscaLinea(archivo, "mientras")};
                            model.addRow(mientras);
                            break;
                        
                        case -9:
                            String[] repetir = {"repetir", "-9", "-1", "" + buscaLinea(archivo, "repetir")};
                            model.addRow(repetir);
                            break;
                        
                        case -10:
                            String[] hasta = {"hasta", "-10", "-1", "" + buscaLinea(archivo, "hasta")};
                            model.addRow(hasta);
                            break;
                        
                        case -11:
                            String[] entero = {"entero", "-11", "-1", "" + buscaLinea(archivo, "entero")};
                            model.addRow(entero);
                            break;
                        
                        case -12:
                            String[] real = {"real", "-12", "-1", "" + buscaLinea(archivo, "real")};
                            model.addRow(real);
                            break;
                        
                        case -13:
                            String[] cadena = {"cadena", "-13", "-1", "" + buscaLinea(archivo, "cadena")};
                            model.addRow(cadena);
                            break;
                        
                        case -14:
                            String[] logico = {"logico", "-14", "-1", "" + buscaLinea(archivo, "logico")};
                            model.addRow(logico);
                            break;
                        
                        case -15:
                            String[] variables = {"variables", "-15", "-1", "" + buscaLinea(archivo, "variables")};
                            model.addRow(variables);
                            break;
                        
                        case -16:
                            String[] entonces = {"entonces", "-16", "-1", "" + buscaLinea(archivo, "entonces")};
                            model.addRow(entonces);
                            break;
                        
                        case -17:
                            String[] hacer = {"hacer", "-17", "-1", "" + buscaLinea(archivo, "hacer")};
                            model.addRow(hacer);
                            break;
                        
                        case -21:
                            String[] mul = {"*", "-21", "-1", "" + buscaLinea(archivo, "*")};
                            model.addRow(mul);
                            break;
                        
                        case -22:
                            String[] div = {"/", "-22", "-1", "" + buscaLinea(archivo, "/")};
                            model.addRow(div);
                            break;
                        
                        case -24:
                            String[] suma = {"+", "-24", "-1", "" + buscaLinea(archivo, "+")};
                            model.addRow(suma);
                            break;
                        
                        case -25:
                            String[] resta = {"-", "-25", "-1", "" + buscaLinea(archivo, "-")};
                            model.addRow(resta);
                            break;
                        
                        case -26:
                            String[] igual = {"=", "-26", "-1", "" + buscaLinea(archivo, "=")};
                            model.addRow(igual);
                            break;
                        
                        case -31:
                            String[] menor = {"<", "-31", "-1", "" + buscaLinea(archivo, "<")};
                            model.addRow(menor);
                            break;
                        
                        case -32:
                            String[] menor_igual = {"<=", "-32", "-1", "" + buscaLinea(archivo, "<=")};
                            model.addRow(menor_igual);
                            break;
                        
                        case -33:
                            String[] mayor = {">", "-33", "-1", "" + buscaLinea(archivo, ">")};
                            model.addRow(mayor);
                            break;
                        
                        case -34:
                            String[] mayor_igual = {">=", "-34", "-1", "" + buscaLinea(archivo, ">=")};
                            model.addRow(mayor_igual);
                            break;
                        
                        case -35:
                            String[] igual_igual = {"==", "-35", "-1", "" + buscaLinea(archivo, "==")};
                            model.addRow(igual_igual);
                            break;
                        
                        case -36:
                            String[] diferente = {"!=", "-36", "-1", "" + buscaLinea(archivo, "!=")};
                            model.addRow(diferente);
                            break;
                        
                        case -41:
                            String[] and = {"&", "-41", "-1", "" + buscaLinea(archivo, "&")};
                            model.addRow(and);
                            break;
                        
                        case -42:
                            String[] or = {"|", "-42", "-1", "" + buscaLinea(archivo, "|")};
                            model.addRow(or);
                            break;
                        
                        case -43:
                            String[] not = {"!", "-43", "-1", "" + buscaLinea(archivo, "!")};
                            model.addRow(not);
                            break;
                        
                        case -51:
                            String[] id_entero = {lexer.lexeme, "-51", "-2", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(id_entero);
                            break;
                        
                        case -52:
                            String[] id_reales = {lexer.lexeme, "-52", "-2", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(id_reales);
                            break;
                        
                        case -53:
                            String[] id_string = {lexer.lexeme, "-53", "-2", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(id_string);
                            break;
                        
                        case -54:
                            String[] id_logico = {lexer.lexeme, "-54", "-2", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(id_logico);
                            break;
                        
                        case -55:
                            String[] id_programa = {lexer.lexeme, "-55", "-1", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(id_programa);
                            break;
                        
                        case -61:
                            String[] num = {lexer.lexeme, "-61", "-1", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(num);
                            break;
                        
                        case -62:
                            String[] num_real = {lexer.lexeme, "-62", "-1", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(num_real);
                            break;
                        
                        case -63:
                            String[] string = {lexer.lexeme, "-63", "-1", "" + buscaLinea(archivo, lexer.lexeme)};
                            model.addRow(string);
                            break;
                        
                        case -64:
                            String[] verdadero = {"verdadero", "-64", "-1", "" + buscaLinea(archivo, "verdadero")};
                            model.addRow(verdadero);
                            break;
                        
                        case -65:
                            String[] falso = {"falso", "-65", "-1", "" + buscaLinea(archivo, "falso")};
                            model.addRow(falso);
                            break;
                        
                        case -73:
                            String[] parentesis_a = {"(", "-73", "-1", "" + buscaLinea(archivo, "(")};
                            model.addRow(parentesis_a);
                            break;
                        
                        case -74:
                            String[] parentesis_c = {")", "-74", "-1", "" + buscaLinea(archivo, ")")};
                            model.addRow(parentesis_c);
                            break;
                        
                        case -75:
                            String[] punto_coma = {";", "-75", "-1", "" + buscaLinea(archivo, ";")};
                            model.addRow(punto_coma);
                            break;
                        
                        case -76:
                            String[] coma = {",", "-76", "-1", "" + buscaLinea(archivo, ",")};
                            model.addRow(coma);
                            break;
                        
                        case -77:
                            String[] dos_puntos = {":", "-77", "-1", "" + buscaLinea(archivo, ":")};
                            model.addRow(dos_puntos);
                            break;
                        
                        case -150:
                            String[] error = {"ERROR", "-150", "-1", "1"};
                            model.addRow(error);
                            break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "FileNotFound\n" + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "IO\n" + ex.getMessage());
        }

    }//GEN-LAST:event_AnalizeLexActionPerformed

    private void txtInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusGained
        DefaultTableModel model = (DefaultTableModel) tabLex.getModel();
        
        model.setRowCount(0);
        
        txtSin.setText("");
    }//GEN-LAST:event_txtInputFocusGained

    private void AnalizeSintaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizeSintaxActionPerformed
        String ST = new String(txtInput.getText());
        
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtSin.setText("Análisis realizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            
            txtSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + "\nColumna: " + (sym.left + 1) + "\nError: " + sym.value);
        }
    }//GEN-LAST:event_AnalizeSintaxActionPerformed

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());        
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));            
            txtInput.setText(ST);
        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_OpenFileActionPerformed
    
    public int buscaLinea(File archivo, String lexema) {
        BufferedReader lector;
        String linea = null;
        int numLinea = 1;
        
        try {
            lector = new BufferedReader(new FileReader(archivo));
            
            try {
                while ((linea = lector.readLine()) != null) {                    
                    if (linea.contains(lexema)) {
                        break;
                    } else {
                        numLinea++;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
                
                JOptionPane.showMessageDialog(null, "Error en metodo para leer archivo. 1");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "Error en metodo para leer archivo. 2");
        }
        
        return numLinea;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizeLex;
    private javax.swing.JButton AnalizeSintax;
    private javax.swing.JButton OpenFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabLex;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtSin;
    // End of variables declaration//GEN-END:variables
}

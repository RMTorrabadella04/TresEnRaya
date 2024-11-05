/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tresenraya;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        
     TextoGanadores1.setText("VICTORIAS X: " + victoriasX);
     TextoGanadores2.setText("VICTORIAS O: " + victoriasO);
        
           jTextField1.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto1){
                    jTextField1.setText("X");
                }else if(texto1){
                    jTextField1.setText("O");
                }
                
                texto1=false;
                numero++;
                ganador();
                
            }
        });
        
           jTextField2.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto2){
                    jTextField2.setText("X");
                }else if(texto2){
                    jTextField2.setText("O");
                }
                
                texto2=false;
                numero++;
                ganador();
            }
        });
           
           jTextField3.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto3){
                    jTextField3.setText("X");
                }else if(texto3){
                    jTextField3.setText("O");
                }
                
                texto3=false;
                numero++;
                ganador();
            }
        });
           
           jTextField4.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto4){
                    jTextField4.setText("X");
                }else if(texto4){
                    jTextField4.setText("O");
                }
                
                texto4=false;
                numero++;
                ganador();
            }
        });
            
           jTextField5.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto5){
                    jTextField5.setText("X");
                }else if(texto5){
                    jTextField5.setText("O");
                }
                
                texto5=false;
                numero++;
                ganador();
            }
        });
             
           jTextField6.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto6){
                    jTextField6.setText("X");
                }else if(texto6){
                    jTextField6.setText("O");
                }
                
                texto6=false;
                numero++;
                ganador();
            }
        });
           
           jTextField7.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto7){
                    jTextField7.setText("X");
                }else if(texto7){
                    jTextField7.setText("O");
                }
                
                texto7=false;
                numero++;
                ganador();
            }
        });
           
            jTextField8.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto8){
                    jTextField8.setText("X");
                }else if(texto8){
                    jTextField8.setText("O");
                }
                
                texto8=false;
                numero++;
                ganador();
            }
        });
            
            jTextField9.addMouseListener(new MouseAdapter() {
     
            public void mouseClicked(MouseEvent e) {
                
                
                if (queJugadorVa() && texto9){
                    jTextField9.setText("X");
                }else if(texto9){
                    jTextField9.setText("O");
                }
                
                texto9=false;
                numero++;
                ganador();
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        botonRestablecer = new javax.swing.JButton();
        TextoGanadores2 = new javax.swing.JTextField();
        TextoGanadores1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 244, 250));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("                     ");
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("                     ");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("                     ");
        jTextField4.setBorder(null);

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("                     ");
        jTextField5.setBorder(null);

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("                     ");
        jTextField6.setBorder(null);

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("                     ");
        jTextField9.setBorder(null);

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("                     ");
        jTextField8.setBorder(null);

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("                     ");
        jTextField7.setBorder(null);

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("                     ");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTextField10.setBackground(new java.awt.Color(235, 244, 250));
        jTextField10.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(102, 102, 102));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("TRES EN RAYA");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        botonRestablecer.setBackground(new java.awt.Color(102, 102, 102));
        botonRestablecer.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonRestablecer.setForeground(new java.awt.Color(204, 204, 204));
        botonRestablecer.setText("RESTABLECER");
        botonRestablecer.setBorder(null);
        botonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestablecerActionPerformed(evt);
            }
        });

        TextoGanadores2.setBackground(new java.awt.Color(235, 244, 250));
        TextoGanadores2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TextoGanadores2.setForeground(new java.awt.Color(102, 102, 102));
        TextoGanadores2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoGanadores2.setToolTipText("");
        TextoGanadores2.setBorder(null);
        TextoGanadores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoGanadores2ActionPerformed(evt);
            }
        });

        TextoGanadores1.setBackground(new java.awt.Color(235, 244, 250));
        TextoGanadores1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TextoGanadores1.setForeground(new java.awt.Color(102, 102, 102));
        TextoGanadores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoGanadores1.setToolTipText("");
        TextoGanadores1.setBorder(null);
        TextoGanadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoGanadores1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(TextoGanadores2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(454, Short.MAX_VALUE)
                    .addComponent(TextoGanadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoGanadores2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(TextoGanadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void botonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestablecerActionPerformed
        restablecer();
    }//GEN-LAST:event_botonRestablecerActionPerformed

    private void TextoGanadores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoGanadores2ActionPerformed
        
    }//GEN-LAST:event_TextoGanadores2ActionPerformed

    private void TextoGanadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoGanadores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoGanadores1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });  
    }
    
    public boolean queJugadorVa() {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // No funciona ganador todavia
    
public void ganador() {
    // Definir las combinaciones ganadoras: horizontales, verticales y diagonales
    String[][] combinacionesGanadoras = {
        {jTextField1.getText(), jTextField2.getText(), jTextField3.getText()}, // Fila 1
        {jTextField4.getText(), jTextField5.getText(), jTextField6.getText()}, // Fila 2
        {jTextField7.getText(), jTextField8.getText(), jTextField9.getText()}, // Fila 3
        {jTextField1.getText(), jTextField4.getText(), jTextField7.getText()}, // Columna 1
        {jTextField2.getText(), jTextField5.getText(), jTextField8.getText()}, // Columna 2
        {jTextField3.getText(), jTextField6.getText(), jTextField9.getText()}, // Columna 3
        {jTextField1.getText(), jTextField5.getText(), jTextField9.getText()}, // Diagonal 1
        {jTextField3.getText(), jTextField5.getText(), jTextField7.getText()}  // Diagonal 2
    };

    // Verificar combinaciones ganadoras
    for (String[] combinacion : combinacionesGanadoras) {
        // Verificar que los tres campos tienen el mismo valor y que no son vacíos
        if ((combinacion[0].equals("X") || combinacion[0].equals("O")) &&
            combinacion[0].equals(combinacion[1]) && 
            combinacion[0].equals(combinacion[2])) {
            // Anunciar ganador con el valor (X o O)
            JOptionPane.showMessageDialog(this, "¡Jugador " + combinacion[0] + " gana!");
            if (combinacion[0].equals("X")){
                victoriasX++;
                TextoGanadores1.setText("VICTORIAS X: " + victoriasX);
            }else if (combinacion[0].equals("O")){
                victoriasO++;
                TextoGanadores2.setText("VICTORIAS O: " + victoriasO);
            }
            restablecer();
            return;  // Salir del método después de encontrar un ganador
        }
    }

    // Verificar si es un empate (cuando todos los espacios están llenos y no hay ganador)
    if (numero == 9) {  // 'numero' es la cantidad de jugadas realizadas
        JOptionPane.showMessageDialog(this, "¡Empate!");
        restablecer();
    }
}

public void restablecer(){
    
    texto1=true;
    texto2=true;
    texto3=true;
    texto4=true;
    texto5=true;
    texto6=true;
    texto7=true;
    texto8=true;
    texto9=true;
    numero=0;
    
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
}
    
    boolean texto1=true;
    boolean texto2=true;
    boolean texto3=true;
    boolean texto4=true;
    boolean texto5=true;
    boolean texto6=true;
    boolean texto7=true;
    boolean texto8=true;
    boolean texto9=true;
    int numero=0;
    int victoriasX =0;
    int victoriasO =0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextoGanadores1;
    private javax.swing.JTextField TextoGanadores2;
    private javax.swing.JButton botonRestablecer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

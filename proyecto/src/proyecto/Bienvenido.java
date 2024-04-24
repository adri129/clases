/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author amoli
 */
public class Bienvenido extends javax.swing.JFrame {

    /**
     * Creates new form tablero
     */
    public Bienvenido() {
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cartel_Bienvenidas = new javax.swing.JLabel();
        Nombre_jugador1 = new javax.swing.JLabel();
        Nombre_jugador2 = new javax.swing.JLabel();
        texto_jugador1 = new javax.swing.JTextField();
        Texto_jugador2 = new javax.swing.JTextField();
        Logo_Menu = new javax.swing.JLabel();
        Boton_newPartida = new javax.swing.JButton();
        Boton_salir = new javax.swing.JButton();
        Boton_cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1764, 770));

        Cartel_Bienvenidas.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Cartel_Bienvenidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cartel_Bienvenidas.setText("Bienvenido a Megapoly");

        Nombre_jugador1.setText("Nombre del jugador 1");

        Nombre_jugador2.setText("Nombre del jugador 2");

        texto_jugador1.setText("Nombre");
        texto_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_jugador1ActionPerformed(evt);
            }
        });

        Texto_jugador2.setText("Nombre");
        Texto_jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_jugador2ActionPerformed(evt);
            }
        });

        Logo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/megapoly.jpg"))); // NOI18N

        Boton_newPartida.setText("Iniciar partida");
        Boton_newPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_newPartidaActionPerformed(evt);
            }
        });

        Boton_salir.setText("Salir");
        Boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salirActionPerformed(evt);
            }
        });

        Boton_cargar.setText("Cargar partida");
        Boton_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cartel_Bienvenidas, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(Nombre_jugador1)
                        .addGap(18, 18, 18)
                        .addComponent(Logo_Menu)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_jugador2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(texto_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379)
                        .addComponent(Texto_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(722, 722, 722)
                        .addComponent(Boton_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(697, 697, 697)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_newPartida)
                            .addComponent(Boton_cargar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cartel_Bienvenidas)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre_jugador1)
                            .addComponent(Logo_Menu)))
                    .addComponent(Nombre_jugador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(Boton_newPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_cargar)
                .addGap(72, 72, 72)
                .addComponent(Boton_salir)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Texto_jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_jugador2ActionPerformed
       
       
    }//GEN-LAST:event_Texto_jugador2ActionPerformed
    //Con este boton nos permite pasar los nombre que se escriban en los huecos de texto para iniciar una nueva partida
    private void Boton_newPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_newPartidaActionPerformed
        // TODO add your handling code here:
        Tablero n  = new Tablero(texto_jugador1.getText(), Texto_jugador2.getText());
        
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_newPartidaActionPerformed
    //Con este boton se sale de la partida
    private void Boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Boton_salirActionPerformed
    
    private void texto_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_jugador1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_texto_jugador1ActionPerformed
    //Con este boton se carga los datos almacenados NO FUNCIONA 
    private void Boton_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cargarActionPerformed
        // TODO add your handling code here:
        new Tablero().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_cargarActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_cargar;
    private javax.swing.JButton Boton_newPartida;
    private javax.swing.JButton Boton_salir;
    private javax.swing.JLabel Cartel_Bienvenidas;
    private javax.swing.JLabel Logo_Menu;
    private javax.swing.JLabel Nombre_jugador1;
    private javax.swing.JLabel Nombre_jugador2;
    private javax.swing.JTextField Texto_jugador2;
    private javax.swing.JTextField texto_jugador1;
    // End of variables declaration//GEN-END:variables
}
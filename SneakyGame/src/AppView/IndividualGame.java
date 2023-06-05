/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AppView;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author David Hernandez
 */
public class IndividualGame extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    private int posicionJugador;

    public IndividualGame() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.Imagen(this.lblImagen, "src/Resources/tablero.jpg");
        this.Imagen(this.lblTapa, "src/Resources/tapa.png");
        this.Imagen(this.lblDado, "src/Resources/dado0.png");

        lblImagen.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mostrarPosicionMouse(e.getX(), e.getY());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTapa = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDado = new javax.swing.JLabel();
        btnDado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblTapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 450, 70, 70));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(197, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDado.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel3.add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btnDado.setText("Tirar Dado");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        int nuevaPosicion;
        int random = (int) (Math.random() * 6) + 1;

        this.setLocationRelativeTo(this);
        switch (random) {
            case 1:
                this.Imagen(this.lblDado, "src/Resources/dado1.png");
                moverLabel(random);
                break;
            case 2:
                this.Imagen(this.lblDado, "src/Resources/dado2.png");
                moverLabel(random);
                break;
            case 3:
                this.Imagen(this.lblDado, "src/Resources/dado3.png");
                moverLabel(random);
                break;
            case 4:
                this.Imagen(this.lblDado, "src/Resources/dado4.png");
                moverLabel(random);
                break;
            case 5:
                this.Imagen(this.lblDado, "src/Resources/dado5.png");
                moverLabel(random);
                break;
            case 6:
                this.Imagen(this.lblDado, "src/Resources/dado6.png");
                moverLabel(random);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnDadoActionPerformed

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
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualGame().setVisible(true);
            }
        });
    }

    private void mostrarPosicionMouse(int x, int y) {
        System.out.println("Posicion del mouse - X: " + x + ", Y: " + y);
    }

    private void moverLabel(int random) {
        posicionJugador += random; // Actualizar la posición del jugador

        // Calcular la posición actual en el tablero
        int fila = 4 - (posicionJugador - 1) / 10; // Calcular la fila actual (comenzando desde la última)
        int columna;

        //Calcular columna actual
        if (fila % 2 == 0) {
            columna = (posicionJugador - 1) % 10;
        } else {
            columna = 9 - (posicionJugador - 1) % 10;
        }

        // Calcular el tamaño de cada cuadro del tablero
        int anchoCuadro = 960 / 10; // Ancho del tablero dividido por el número de columnas
        int altoCuadro = 540 / 5; // Alto del tablero dividido por el número de filas

        // Calcular las coordenadas x e y en el centro del cuadro
        int x = columna * anchoCuadro + (anchoCuadro / 2) - (lblTapa.getWidth() / 2);
        int y = fila * altoCuadro + (altoCuadro / 2) - (lblTapa.getHeight() / 2);
        // Mover la etiqueta del jugador al centro del cuadro
        lblTapa.setLocation(x, y);

        switch (posicionJugador) {
            case 13: // Serpiente - Casilla 13 a 8
                posicionJugador = 8;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete"
                        + "\nRegresaras a la posicion 8");
                lblTapa.setLocation(683, 451);
                break;
            case 14: // Escalera - Casilla 14 a 34
                posicionJugador = 25;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 25");
                lblTapa.setLocation(586, 240);
                break;
            case 4: // Escalera - Casilla 16 a 24
                posicionJugador = 17;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 17");
                lblTapa.setLocation(303, 345);
                break;
            case 23: // Escalera - Casilla 23 a 43
                posicionJugador = 38;
                JOptionPane.showMessageDialog(null, "Oh! una escalera"
                        + "\nAvance a la posicion 38");
                lblTapa.setLocation(211, 137);
                break;
            case 41: // Serpiente - Casilla 41 a 21
                posicionJugador = 21;
                JOptionPane.showMessageDialog(null, "Ups! Piasate una serpinete"
                        + "\nRegresaras a la posicion 21");
                lblTapa.setLocation(16, 236);
                break;
            case 49: // Serpiente - Casilla 49 a 29
                posicionJugador = 29;
                JOptionPane.showMessageDialog(null, "Ups! Pisaste una serpinete"
                        + "\nRegresaras a la posicion 29");
                lblTapa.setLocation(781, 238);
                break;
        }

        if (posicionJugador == 50) {
            lblTapa.setLocation(x, y);
            JOptionPane.showMessageDialog(null, "¡¡¡Felicidades, Usted ha ganado el juego!!!"
                    + "\nHas ganado el juego");
            return;
        } else if (posicionJugador >= 50) {
            JOptionPane.showMessageDialog(null, "Perdiste el juego :("
                    + "\nVuelve a Intentarlo");
            posicionJugador = 0;
            lblTapa.setLocation(-60, 550);
            this.Imagen(this.lblDado, "src/Resources/dado0.png");
        }

        // lblTapa.repaint(); // Actualizar la posición del label en el panel
    }

    private void Imagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_SMOOTH
                )
        );

        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTapa;
    // End of variables declaration//GEN-END:variables
}

package Login;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    String ruta = "";
    URL url = null;
    ImageIcon icon = null;

    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        freVentana2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jcbOpciones = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        btnOpcion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlLista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("freVentana2"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        freVentana2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        freVentana2.setText("Acceso Correcto");
        jPanel1.add(freVentana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 21, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 74, -1, -1));

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enamorado", "Enojado", "Muerto" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 70));

        btnOpcion.setText("OPCION");
        btnOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jlLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
        int op = jcbOpciones.getSelectedIndex();
        String cadena = jcbOpciones.getSelectedItem().toString();

        switch (op) {
            case 0: 
                this.mostrarImagen("/Imagenes/enamorado.png", op+1, cadena);   
                break;
            case 1: 
                this.mostrarImagen("/Imagenes/enojado.png", op+1, cadena);
                break;
            case 2: 
                this.mostrarImagen("/Imagenes/muerto.png", op+1, cadena);
                break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

    private void btnOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionActionPerformed
        int opc = jlLista.getSelectedIndex();
        switch (opc) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
                mostrarCuadro(opc + 1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona Una De Las Opciones", "Opcion Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        
        
    }//GEN-LAST:event_btnOpcionActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }
    
    public void mostrarImagen(String urlImagen, int opcion, String cad){
                url = this.getClass().getResource(urlImagen);
                icon = new ImageIcon(url);
                lblImagen.setIcon(icon);
                lblImagen.setText("Opción: " + opcion + "\n Texto: " + cad);
    }
    
     private void mostrarCuadro(int opc) {
            JOptionPane.showMessageDialog(null, "Opcion No: " + opc, "Opcion Seleccionada", JOptionPane.INFORMATION_MESSAGE);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel freVentana2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JList<String> jlLista;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables

}

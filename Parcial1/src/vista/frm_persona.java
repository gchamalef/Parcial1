/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc01
 */
public class frm_persona extends javax.swing.JFrame {
    Empleado empleado;
    DefaultTableModel tblModelo;

    /**
     * Creates new form frm_persona
     */
    public frm_persona() {
        initComponents();
        empleado = new Empleado();
        tblModelo = new DefaultTableModel();
        String encabezado [] = {"Codigo", "nombres", "apellidos", "direccion", "telefono", "FechaNacimiento", "Sueldo", "Bono", "Total"};
            tblModelo.setColumnIdentifiers(encabezado);
            tbl_empleados.setModel(tblModelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_fn = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        lbl_sueldo = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JTextField();
        lbl_bonificacion = new javax.swing.JLabel();
        txt_bono = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("EMPLEADOS");

        lbl_codigo.setText("Codigo");

        lbl_nombres.setText("Nombres");

        lbl_apellidos.setText("Apellidos");

        lbl_direccion.setText("Direccion");

        lbl_telefono.setText("Telefono");

        lbl_fn.setText("Nacimiento");

        lbl_sueldo.setText("Sueldo");

        lbl_bonificacion.setText("Bonificacion");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_empleados);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_codigo)
                                    .addComponent(lbl_nombres)
                                    .addComponent(lbl_apellidos)
                                    .addComponent(lbl_direccion)
                                    .addComponent(lbl_telefono)
                                    .addComponent(lbl_fn))
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(txt_nombres)
                                            .addComponent(txt_apellidos)
                                            .addComponent(txt_direccion)
                                            .addComponent(txt_telefono)))
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_fn)))
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                                .addComponent(lbl_bonificacion)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_bono, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                                .addComponent(lbl_sueldo)
                                                .addGap(48, 48, 48)
                                                .addComponent(txt_sueldo))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_agregar)
                                        .addGap(39, 39, 39))))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_titulo)))
                        .addGap(351, 351, 351))))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sueldo)
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_bonificacion)
                    .addComponent(txt_bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        int sueldo = Integer.parseInt(txt_sueldo.getText());
        int bono = Integer.parseInt(txt_bono.getText());
        empleado = new Empleado(
                txt_codigo.getText(),
                sueldo,
                bono,
                0,
                txt_nombres.getText(),
                txt_apellidos.getText(),
                txt_direccion.getText(),
                txt_telefono.getText(),
                txt_fn.getText()
        );
            tblModelo.addRow(empleado.crear());
            tbl_empleados.setModel(tblModelo);
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
            java.util.logging.Logger.getLogger(frm_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_agregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_bonificacion;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_sueldo;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_bono;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration                   
}

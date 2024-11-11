package Vista;

import Db.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewUser extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    DefaultTableModel modeloUSer;
    int idc;

    public ViewUser() {
        initComponents();
        setTitle("Administrar usuarios");
        setLocationRelativeTo(null);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaCreaciontextfield = new javax.swing.JTextField();
        tipoUsuariotexfield = new javax.swing.JTextField();
        nombreUsuariotexfield = new javax.swing.JTextField();
        idUsuariotextfield = new javax.swing.JTextField();
        usuariotextfield = new javax.swing.JTextField();
        contraseñatextfield = new javax.swing.JTextField();
        estadotxt = new javax.swing.JLabel();
        estadotextfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        modificarbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("Id_Usuario");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Fecha de creacion");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Tipo de Usuario");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Nombre de persona");

        fechaCreaciontextfield.setEditable(false);
        fechaCreaciontextfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fechaCreaciontextfield.setEnabled(false);

        tipoUsuariotexfield.setEditable(false);
        tipoUsuariotexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tipoUsuariotexfield.setEnabled(false);

        nombreUsuariotexfield.setEditable(false);
        nombreUsuariotexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreUsuariotexfield.setEnabled(false);

        idUsuariotextfield.setEditable(false);
        idUsuariotextfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idUsuariotextfield.setEnabled(false);

        usuariotextfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        contraseñatextfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        estadotxt.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idUsuariotextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(usuariotextfield)
                    .addComponent(contraseñatextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(estadotxt)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoUsuariotexfield)
                    .addComponent(nombreUsuariotexfield)
                    .addComponent(fechaCreaciontextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(estadotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(fechaCreaciontextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUsuariotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(estadotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(tipoUsuariotexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(nombreUsuariotexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñatextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        modificarbtn.setText("Modificar");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Inhabilitar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(modificarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(181, 181, 181))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarbtn)
                    .addComponent(jButton2))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        usertable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Usuario", "Usuario", "Contraseña", "Fecha de Creacion", "Tipo de Usuario", "Nombre de persona", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usertable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        modificar();
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void usertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertableMouseClicked
        int fila = usertable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono fila");
        } else {
            idc = Integer.parseInt(usertable.getValueAt(fila, 0).toString());
            String nombre = usertable.getValueAt(fila, 1).toString();
            String contraseña = usertable.getValueAt(fila, 2).toString();;
            Date fecha = (Date) usertable.getValueAt(fila, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaString = sdf.format(fecha);
            String nombreTipoUsuario = usertable.getValueAt(fila, 4).toString();;
            String nombreUsuario = usertable.getValueAt(fila, 5).toString();;
            int estado = Integer.parseInt(usertable.getValueAt(fila, 6).toString());

            idUsuariotextfield.setText(String.valueOf(idc));
            usuariotextfield.setText(nombre);
            contraseñatextfield.setText(String.valueOf(contraseña));
            fechaCreaciontextfield.setText(String.valueOf(fecha));
            nombreUsuariotexfield.setText((String.valueOf(nombreUsuario)));
            tipoUsuariotexfield.setText(String.valueOf(nombreTipoUsuario));
            estadotextfield.setText(String.valueOf(estado));
        }
    }//GEN-LAST:event_usertableMouseClicked

    void consultar() {
        String sql = "SELECT "
                + "usuario.id_usuario, "
                + "usuario.nombre_usuario, "
                + "usuario.password, "
                + "usuario.fecha_creacion, "
                + "tipo_usuario.nombre_tipo_usuario, "
                + "persona.nombre AS nombre_persona, "
                + "usuario.estado "
                + "FROM "
                + "usuario "
                + "INNER JOIN "
                + "tipo_usuario ON usuario.tipo_usuario_id_tipo_usua = tipo_usuario.id_tipo_usua "
                + "INNER JOIN "
                + "persona ON usuario.persona_id_persona = persona.id_persona;";

        try {
            Connection con = connection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] usuarios = new Object[7];
            modeloUSer = (DefaultTableModel) usertable.getModel();
            while (rs.next()) {
                usuarios[0] = rs.getInt("id_usuario");
                usuarios[1] = rs.getString("nombre_usuario");
                usuarios[2] = rs.getString("password");
                usuarios[3] = rs.getDate("fecha_creacion");
                usuarios[4] = rs.getString("nombre_tipo_usuario");
                usuarios[5] = rs.getString("nombre_persona");
                usuarios[6] = rs.getInt("estado");
                modeloUSer.addRow(usuarios);
            }
            usertable.setModel(modeloUSer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void limpiartabla() {
        if (modeloUSer.getRowCount() > 0) {
            for (int i = modeloUSer.getRowCount() - 1; i >= 0; i--) {
                modeloUSer.removeRow(i);
            }
        }
    }

    void modificar() {
        String nombre = usuariotextfield.getText();
        String contraseña = contraseñatextfield.getText();
        int estado = Integer.parseInt(estadotextfield.getText());

        try {
            if (nombre.equals("") || contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            } else {
                String sql = "UPDATE usuario SET nombre_usuario=?, password=?, estado=? WHERE id_usuario=?";
                Connection con = connection.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nombre);
                pstmt.setString(2, contraseña);
                pstmt.setInt(3, estado);
                pstmt.setInt(4, idc);
                
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos de usuario actualizados");
                limpiartabla();
                consultar(); // Para actualizar la tabla con los cambios
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el usuario: " + ex.getMessage());
        }
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseñatextfield;
    private javax.swing.JTextField estadotextfield;
    private javax.swing.JLabel estadotxt;
    private javax.swing.JTextField fechaCreaciontextfield;
    private javax.swing.JTextField idUsuariotextfield;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField nombreUsuariotexfield;
    private javax.swing.JTextField tipoUsuariotexfield;
    private javax.swing.JTable usertable;
    private javax.swing.JTextField usuariotextfield;
    // End of variables declaration//GEN-END:variables
}

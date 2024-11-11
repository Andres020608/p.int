package Vista;

import Db.connection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewJoyas extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int idc;

    public ViewJoyas() {
        initComponents();

        setLocationRelativeTo(null);
        consultar();
    }

    public static void main(String[] args) {
        new ViewJoyas().setVisible(true);

    }

    void consultar() {
        String sql = "Select * from joya";

        try {
            Connection con = connection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] joyas = new Object[9];
            modelo = (DefaultTableModel) joyatable.getModel();
            while (rs.next()) {
                joyas[0] = rs.getInt("id_joya");
                joyas[1] = rs.getString("nombre");
                joyas[2] = rs.getInt("peso");
                joyas[3] = rs.getDouble("cantidad_saldo");
                joyas[4] = rs.getDouble("precio_venta");
                joyas[5] = rs.getDouble("costo_joya");
                joyas[6] = rs.getDate("fech_ultim_act");
                joyas[7] = rs.getInt("usuario_id_usuario");
                joyas[8] = rs.getInt("tipo_joya_id_tipo_joya");
                modelo.addRow(joyas);

            }
            joyatable.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void agregar() {
    String nombre = nombreJoyatxt.getText();
    int peso = Integer.parseInt(pesoJoyatxt.getText());
    double cantidad = Double.parseDouble(cantidadJoyatxt.getText());
    double precio = Double.parseDouble(precioJoyatxt.getText());
    double costo = Double.parseDouble(costoJoyatxt.getText());
    int idUsuario = Integer.parseInt(usuarioIdtxt.getText());
    int idTipoJoya = Integer.parseInt(idTipoJoyatxt.getText());

    try {
        if (nombre.isEmpty() || peso == 0 || cantidad == 0 || precio == 0 || costo == 0 || idUsuario == 0 || idTipoJoya == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
        } else {
            String sql = "INSERT INTO joya (nombre, peso, cantidad_saldo, precio_venta, costo_joya, usuario_id_usuario, tipo_joya_id_tipo_joya) VALUES (?, ?, ?, ?, ?, ?, ?)";
            Connection con = connection.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, peso);
            pstmt.setDouble(3, cantidad);
            pstmt.setDouble(4, precio);
            pstmt.setDouble(5, costo);
            pstmt.setInt(6, idUsuario);
            pstmt.setInt(7, idTipoJoya);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nueva joya registrada");
            limpiartabla();
        }
    } catch (SQLException | NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error al agregar la joya: " + ex.getMessage());
    }
}
         void limpiartabla() {
    if (modelo.getRowCount() > 0) {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idJoyatxt = new javax.swing.JTextField();
        nombreJoyatxt = new javax.swing.JTextField();
        pesoJoyatxt = new javax.swing.JTextField();
        cantidadJoyatxt = new javax.swing.JTextField();
        precioJoyatxt = new javax.swing.JTextField();
        costoJoyatxt = new javax.swing.JTextField();
        usuarioIdtxt = new javax.swing.JTextField();
        idTipoJoyatxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        agregarbtn = new javax.swing.JButton();
        modificarbtn = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        joyatable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id_joya");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre de la Joya");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Peso de la Joya");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cantidad de Joyas");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Precio de la Joya");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Costo de la Joya");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Usuario_id");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Id_tipo_Joya");

        idJoyatxt.setEditable(false);
        idJoyatxt.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cantidadJoyatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(pesoJoyatxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreJoyatxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idJoyatxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precioJoyatxt)
                    .addComponent(costoJoyatxt)
                    .addComponent(usuarioIdtxt)
                    .addComponent(idTipoJoyatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(idJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(nombreJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(pesoJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(cantidadJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTipoJoyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        agregarbtn.setText("Agregar");
        agregarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbtnActionPerformed(evt);
            }
        });

        modificarbtn.setText("modificar");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        eliminarbtn.setText("Eliminar");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(agregarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(modificarbtn)
                .addGap(128, 128, 128)
                .addComponent(eliminarbtn)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarbtn)
                    .addComponent(modificarbtn)
                    .addComponent(eliminarbtn))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 780, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        joyatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Joya", "Nombre ", "Peso", "Cantidad", "Precio", "Costo", "Fecha_actualizacion", "Id_Usuario", "Id_tipo_joya"
            }
        ));
        joyatable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joyatableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(joyatable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 780, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbtnActionPerformed
           agregar();
        consultar();
    }//GEN-LAST:event_agregarbtnActionPerformed

    private void joyatableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joyatableMouseClicked
        int fila = joyatable.getSelectedRow();
    if(fila == -1) {
        JOptionPane.showMessageDialog(null, "No se selecciono fila");
    } else {
        idc = Integer.parseInt(joyatable.getValueAt(fila, 0).toString());
        String nombre = joyatable.getValueAt(fila, 1).toString();
        int peso = Integer.parseInt(joyatable.getValueAt(fila, 2).toString());
        double cantidad = Double.parseDouble(joyatable.getValueAt(fila, 3).toString());
        double precio = Double.parseDouble(joyatable.getValueAt(fila, 4).toString());
        double costo = Double.parseDouble(joyatable.getValueAt(fila, 5).toString());
        Date fecha = (Date) joyatable.getValueAt(fila, 6);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaString = sdf.format(fecha);
        int idUsuario = Integer.parseInt(joyatable.getValueAt(fila, 7).toString());
        int idTipoJoya = Integer.parseInt(joyatable.getValueAt(fila, 8).toString());
 
        idJoyatxt.setText(String.valueOf(idc));
        nombreJoyatxt.setText(nombre);
        pesoJoyatxt.setText(String.valueOf(peso));
        cantidadJoyatxt.setText(String.valueOf(cantidad));
        precioJoyatxt.setText(String.valueOf(precio));
        costoJoyatxt.setText(String.valueOf(costo));
        usuarioIdtxt.setText(String.valueOf(idUsuario));
        idTipoJoyatxt.setText(String.valueOf(idTipoJoya));
    }
    }//GEN-LAST:event_joyatableMouseClicked
    
    
    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        modificar();
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
     eliminar();
     consultar();
    }//GEN-LAST:event_eliminarbtnActionPerformed
    
    void modificar() {
    String nombre = nombreJoyatxt.getText();
    int peso = Integer.parseInt(pesoJoyatxt.getText());
    double cantidad = Double.parseDouble(cantidadJoyatxt.getText());
    double precio = Double.parseDouble(precioJoyatxt.getText());
    double costo = Double.parseDouble(costoJoyatxt.getText());
    int idUsuario = Integer.parseInt(usuarioIdtxt.getText());
    int idTipoJoya = Integer.parseInt(idTipoJoyatxt.getText());

    try {
        if (nombre.isEmpty() || peso == 0 || cantidad == 0 || precio == 0 || costo == 0 || idUsuario == 0 || idTipoJoya == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
        } else {
            String sql = "UPDATE joya SET nombre=?, peso=?, cantidad_saldo=?, precio_venta=?, costo_joya=?, usuario_id_usuario=?, tipo_joya_id_tipo_joya=? WHERE id_joya=?";
            Connection con = connection.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, peso);
            pstmt.setDouble(3, cantidad);
            pstmt.setDouble(4, precio);
            pstmt.setDouble(5, costo);
            pstmt.setInt(6, idUsuario);
            pstmt.setInt(7, idTipoJoya);
            pstmt.setInt(8, idc);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de joya actualizados");
            limpiartabla();
            consultar(); // Para actualizar la tabla con los cambios
        }
    } catch (SQLException | NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar la joya: " + ex.getMessage());
    }
    }
    void eliminar(){
        int fila = joyatable.getSelectedRow();
        try {
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Joya no seleccionada");
            limpiartabla();
            }else{
                String sql = "delete from joya where id_joya="+idc;
                 Connection con = connection.getConnection();
                 st = con.createStatement();
                 st.executeUpdate(sql);
                 limpiartabla();
            }
        } catch (Exception e) {
        }
    
}
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarbtn;
    private javax.swing.JTextField cantidadJoyatxt;
    private javax.swing.JTextField costoJoyatxt;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JTextField idJoyatxt;
    private javax.swing.JTextField idTipoJoyatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable joyatable;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField nombreJoyatxt;
    private javax.swing.JTextField pesoJoyatxt;
    private javax.swing.JTextField precioJoyatxt;
    private javax.swing.JTextField usuarioIdtxt;
    // End of variables declaration//GEN-END:variables
}

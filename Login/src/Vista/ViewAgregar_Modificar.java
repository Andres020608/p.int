
package Vista;

import Controlador.JoyaController;
import Modelo.Joya;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ViewAgregar_Modificar extends javax.swing.JPanel {
    JoyaController joyaController = new JoyaController();
    public ViewAgregar_Modificar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        titulotxt = new javax.swing.JLabel();
        usuariojpg = new javax.swing.JLabel();
        nombreJoyatxt = new javax.swing.JLabel();
        tipoJoyatxt = new javax.swing.JLabel();
        materialtxt = new javax.swing.JLabel();
        pesotxt = new javax.swing.JLabel();
        precioJoyatxt = new javax.swing.JLabel();
        costoJoyatxt = new javax.swing.JLabel();
        nombreJoyatexfield = new javax.swing.JTextField();
        pesotexfield = new javax.swing.JTextField();
        precioJoyatexfield = new javax.swing.JTextField();
        costoJoyatexfield = new javax.swing.JTextField();
        tipoJoyacombobox = new javax.swing.JComboBox<>();
        materialcombobox = new javax.swing.JComboBox<>();
        iconopng = new javax.swing.JLabel();
        agregarbtn = new javax.swing.JPanel();
        agregartxt = new javax.swing.JLabel();
        cantidadJoyatxt = new javax.swing.JLabel();
        cantidadJoyatexfield = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(599, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        titulotxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulotxt.setText("Agregar Joya");

        usuariojpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account_login_log_in_icon_250759.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(usuariojpg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(usuariojpg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 589, 40));

        nombreJoyatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreJoyatxt.setText("Nombre de la Joya");
        add(nombreJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 120, 19));

        tipoJoyatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tipoJoyatxt.setText("Tipo de joya");
        add(tipoJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, 100, 22));

        materialtxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        materialtxt.setText("Material");
        add(materialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, 100, 22));

        pesotxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pesotxt.setText("Peso");
        add(pesotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 22));

        precioJoyatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioJoyatxt.setText("Precio de la Joya");
        add(precioJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 22));

        costoJoyatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        costoJoyatxt.setText("Costo de la Joya");
        add(costoJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 22));

        nombreJoyatexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreJoyatexfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreJoyatexfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreJoyatexfieldMouseClicked(evt);
            }
        });
        add(nombreJoyatexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, -1));

        pesotexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pesotexfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pesotexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 20));

        precioJoyatexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioJoyatexfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(precioJoyatexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 120, 20));

        costoJoyatexfield.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        costoJoyatexfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(costoJoyatexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 20));

        tipoJoyacombobox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tipoJoyacombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tipoJoyacombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(tipoJoyacombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, 20));

        materialcombobox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        materialcombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        materialcombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(materialcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 20));

        iconopng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2024-10-23 at 8.35.36 PM.jpeg"))); // NOI18N
        iconopng.setText("jLabel9");
        add(iconopng, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 180, -1));

        agregarbtn.setBackground(new java.awt.Color(0, 134, 190));
        agregarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        agregartxt.setBackground(new java.awt.Color(0, 134, 190));
        agregartxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        agregartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregartxt.setText("Agregar");
        agregartxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregartxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregarbtnLayout = new javax.swing.GroupLayout(agregarbtn);
        agregarbtn.setLayout(agregarbtnLayout);
        agregarbtnLayout.setHorizontalGroup(
            agregarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        agregarbtnLayout.setVerticalGroup(
            agregarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(agregarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, -1));

        cantidadJoyatxt.setText("Cantidad de Joyas");
        add(cantidadJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, -1));

        cantidadJoyatexfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(cantidadJoyatexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void agregartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregartxtMouseClicked
        String nombre = nombreJoyatexfield.getText();
        String pesoSeleccionado = pesotexfield.getText();
        int peso = Integer.parseInt(pesoSeleccionado);
        String cantidadSeleccionada = cantidadJoyatexfield.getText();
        int cantidad = Integer.parseInt(cantidadSeleccionada);
        String precioSeleccionado = precioJoyatexfield.getText();
        String costoSeleccionado = costoJoyatexfield.getText();
        int precio = Integer.parseInt(precioSeleccionado);
        int costo_Joya = Integer.parseInt(costoSeleccionado);
        
    }//GEN-LAST:event_agregartxtMouseClicked
    Joya joya = new Joya();
    private void nombreJoyatexfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreJoyatexfieldMouseClicked
        JoyaController joyaController = new JoyaController();
        
        joyaController.traerTipoJoyas();
        System.out.println(joyaController.getNombreJoya());
        //int id_tipo_joya = joyaController.getId_tipo_joya();
        //String nombreJoya = joyaController.getNombreJoya();
        ArrayList<Joya> joyas = joya.getAlltiposJoyas();
        int d=0;
        boolean s = false;
        for (Joya joya : joyas) {
        int id_tipo_joya = joya.getId_tipo_joya();
        String nombreJoya = joya.getNombre_tipo_joya();
        tipoJoyacombobox.addItem(Integer.toString(id_tipo_joya));  
        

        
        
         
        
        }
    }//GEN-LAST:event_nombreJoyatexfieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarbtn;
    private javax.swing.JLabel agregartxt;
    private javax.swing.JTextField cantidadJoyatexfield;
    private javax.swing.JLabel cantidadJoyatxt;
    private javax.swing.JTextField costoJoyatexfield;
    private javax.swing.JLabel costoJoyatxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconopng;
    private javax.swing.JComboBox<String> materialcombobox;
    private javax.swing.JLabel materialtxt;
    private javax.swing.JTextField nombreJoyatexfield;
    private javax.swing.JLabel nombreJoyatxt;
    private javax.swing.JTextField pesotexfield;
    private javax.swing.JLabel pesotxt;
    private javax.swing.JTextField precioJoyatexfield;
    private javax.swing.JLabel precioJoyatxt;
    private javax.swing.JComboBox<String> tipoJoyacombobox;
    private javax.swing.JLabel tipoJoyatxt;
    private javax.swing.JLabel titulotxt;
    private javax.swing.JLabel usuariojpg;
    // End of variables declaration//GEN-END:variables
}

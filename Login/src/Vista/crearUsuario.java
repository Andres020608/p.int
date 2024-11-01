
package Vista;

public class crearUsuario extends javax.swing.JFrame {
        private Login login;

    public crearUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        crearUsuarioLabel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        crearUsuariotxt = new javax.swing.JLabel();
        usuarioPreguntabtn = new javax.swing.JPanel();
        usuarioPreguntatxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correoElectronicotxt = new javax.swing.JLabel();
        telefonotxt = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JLabel();
        contraseñatxt = new javax.swing.JLabel();
        rolDesplegable = new javax.swing.JComboBox<>();
        Fecha_creaciontxt = new javax.swing.JLabel();
        nombreTextfield = new javax.swing.JTextField();
        correoTextfield = new javax.swing.JTextField();
        usuarioTextfield = new javax.swing.JTextField();
        contraseñapasswordfield = new javax.swing.JPasswordField();
        telefonoTextfield = new javax.swing.JTextField();
        apellidoTextfield = new javax.swing.JTextField();
        fecha_creacionTextfield = new javax.swing.JTextField();
        roltxt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        registrarbtn = new javax.swing.JPanel();
        registrartxt = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        crearUsuarioLabel.setBackground(new java.awt.Color(255, 255, 255));
        crearUsuarioLabel.setMinimumSize(new java.awt.Dimension(800, 500));
        crearUsuarioLabel.setPreferredSize(new java.awt.Dimension(800, 500));
        crearUsuarioLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        jLabel1.setText("JESSICA JOYERIA");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        crearUsuarioLabel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));
        crearUsuarioLabel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 10));

        crearUsuariotxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        crearUsuariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearUsuariotxt.setText("Crear Usuario");
        crearUsuarioLabel.add(crearUsuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        usuarioPreguntatxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        usuarioPreguntatxt.setForeground(new java.awt.Color(51, 51, 255));
        usuarioPreguntatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioPreguntatxt.setText("¿Tienes un usuario?");
        usuarioPreguntatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarioPreguntatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioPreguntatxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout usuarioPreguntabtnLayout = new javax.swing.GroupLayout(usuarioPreguntabtn);
        usuarioPreguntabtn.setLayout(usuarioPreguntabtnLayout);
        usuarioPreguntabtnLayout.setHorizontalGroup(
            usuarioPreguntabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuarioPreguntabtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuarioPreguntatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usuarioPreguntabtnLayout.setVerticalGroup(
            usuarioPreguntabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuarioPreguntabtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioPreguntatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        crearUsuarioLabel.add(usuarioPreguntabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 80, 130, 50));
        crearUsuarioLabel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 760, 10));

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        crearUsuarioLabel.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        apellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellido.setText("Apellido");
        crearUsuarioLabel.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, 20));

        correoElectronicotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoElectronicotxt.setText("Correo electronico");
        crearUsuarioLabel.add(correoElectronicotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        telefonotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonotxt.setText("Telefono");
        crearUsuarioLabel.add(telefonotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, 20));

        usuariotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuariotxt.setText("Usuario");
        crearUsuarioLabel.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 20));

        contraseñatxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contraseñatxt.setText("Contraseña");
        crearUsuarioLabel.add(contraseñatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 20));

        rolDesplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        crearUsuarioLabel.add(rolDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        Fecha_creaciontxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Fecha_creaciontxt.setText("Fecha de Creacion");
        crearUsuarioLabel.add(Fecha_creaciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, 20));

        nombreTextfield.setText("Ingrese su nombre");
        nombreTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreTextfieldMouseClicked(evt);
            }
        });
        crearUsuarioLabel.add(nombreTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 270, -1));

        correoTextfield.setText("Ingrese su correo electronico");
        crearUsuarioLabel.add(correoTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, -1));

        usuarioTextfield.setText("Ingrese su usuario");
        crearUsuarioLabel.add(usuarioTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 280, -1));

        contraseñapasswordfield.setText("jPasswordField1");
        crearUsuarioLabel.add(contraseñapasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 260, -1));

        telefonoTextfield.setText("Ingrese su numero celular");
        crearUsuarioLabel.add(telefonoTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 260, -1));

        apellidoTextfield.setText("Ingrese su apellido");
        crearUsuarioLabel.add(apellidoTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 260, -1));
        crearUsuarioLabel.add(fecha_creacionTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 220, -1));

        roltxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        roltxt.setText("Selecione el rol");
        crearUsuarioLabel.add(roltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        crearUsuarioLabel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 520, 10));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2024-10-23 at 8.35.36 PM.jpeg"))); // NOI18N
        crearUsuarioLabel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 180, 180));

        registrarbtn.setBackground(new java.awt.Color(0, 134, 190));

        registrartxt.setBackground(new java.awt.Color(0, 134, 190));
        registrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrartxt.setText("Registrar Usuario");

        javax.swing.GroupLayout registrarbtnLayout = new javax.swing.GroupLayout(registrarbtn);
        registrarbtn.setLayout(registrarbtnLayout);
        registrarbtnLayout.setHorizontalGroup(
            registrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registrarbtnLayout.setVerticalGroup(
            registrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        crearUsuarioLabel.add(registrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearUsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearUsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTextfieldMouseClicked
            if(nombreTextfield.getText().equals("Ingrese su nombre"))
                nombreTextfield.setText("");
                apellidoTextfield.setText("");
                correoTextfield.setText("");
                telefonoTextfield.setText("");
                usuarioTextfield.setText("");
                contraseñapasswordfield.setText("");
    }//GEN-LAST:event_nombreTextfieldMouseClicked
    protected void setLogin(Login login){
        this.login= login;
    }
   
    private void usuarioPreguntatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioPreguntatxtMouseClicked
       login.setNuevoUsuario(this);
       login.setVisible(true);
        login.setSize(800, 500);
        login.setLocation(0, 0);
        this.setVisible(false);
    }//GEN-LAST:event_usuarioPreguntatxtMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha_creaciontxt;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidoTextfield;
    private javax.swing.JPasswordField contraseñapasswordfield;
    private javax.swing.JLabel contraseñatxt;
    private javax.swing.JLabel correoElectronicotxt;
    private javax.swing.JTextField correoTextfield;
    private javax.swing.JPanel crearUsuarioLabel;
    private javax.swing.JLabel crearUsuariotxt;
    private javax.swing.JTextField fecha_creacionTextfield;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTextfield;
    private javax.swing.JPanel registrarbtn;
    private javax.swing.JLabel registrartxt;
    private javax.swing.JComboBox<String> rolDesplegable;
    private javax.swing.JLabel roltxt;
    private javax.swing.JTextField telefonoTextfield;
    private javax.swing.JLabel telefonotxt;
    private javax.swing.JPanel usuarioPreguntabtn;
    private javax.swing.JLabel usuarioPreguntatxt;
    private javax.swing.JTextField usuarioTextfield;
    private javax.swing.JLabel usuariotxt;
    // End of variables declaration//GEN-END:variables
}

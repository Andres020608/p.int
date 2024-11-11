
package Vista;


public class Joya_Descrp extends javax.swing.JFrame {


    public Joya_Descrp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nameEnterprise = new javax.swing.JLabel();
        iniciarSesionbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreJoya = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        precioJoya = new javax.swing.JLabel();
        tamañotxt = new javax.swing.JLabel();
        tamañodesp = new javax.swing.JComboBox<>();
        cantidadACompratxt = new javax.swing.JLabel();
        cantidadAComprarDesp = new javax.swing.JComboBox<>();
        pesotxt = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        pesoDesp = new javax.swing.JComboBox<>();
        compraBtn = new javax.swing.JPanel();
        compraTxtBtn = new javax.swing.JLabel();
        imagePrin = new javax.swing.JPanel();
        image1 = new javax.swing.JPanel();
        image2 = new javax.swing.JPanel();
        image3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        nameEnterprise.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        nameEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameEnterprise.setText("JESSICA JOYERIA");

        iniciarSesionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account_login_log_in_icon_250759.png"))); // NOI18N
        iniciarSesionbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(nameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(iniciarSesionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(iniciarSesionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        nombreJoya.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreJoya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJoya.setText("Nombre");
        nombreJoya.setToolTipText("");
        nombreJoya.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(nombreJoya, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 109, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 169, 184, 10));

        precioJoya.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        precioJoya.setText("Precio");
        precioJoya.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(precioJoya, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        tamañotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tamañotxt.setText("Tamaño");
        jPanel1.add(tamañotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 191, 165, -1));

        tamañodesp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tamañodesp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tamañodesp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tamañodesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 220, 165, -1));

        cantidadACompratxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cantidadACompratxt.setText("Cantidad a comprar");
        jPanel1.add(cantidadACompratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 327, 165, -1));

        cantidadAComprarDesp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cantidadAComprarDesp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cantidadAComprarDesp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cantidadAComprarDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 350, 165, -1));

        pesotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pesotxt.setText("Peso");
        jPanel1.add(pesotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 253, 165, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 309, 184, 10));

        pesoDesp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pesoDesp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pesoDesp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(pesoDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 282, 165, -1));

        compraBtn.setBackground(new java.awt.Color(51, 153, 255));

        compraTxtBtn.setBackground(new java.awt.Color(255, 255, 255));
        compraTxtBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        compraTxtBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraTxtBtn.setText("Realizar compra");
        compraTxtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout compraBtnLayout = new javax.swing.GroupLayout(compraBtn);
        compraBtn.setLayout(compraBtnLayout);
        compraBtnLayout.setHorizontalGroup(
            compraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compraTxtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        compraBtnLayout.setVerticalGroup(
            compraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compraTxtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(compraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 383, -1, -1));

        imagePrin.setBackground(new java.awt.Color(204, 204, 204));
        imagePrin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout imagePrinLayout = new javax.swing.GroupLayout(imagePrin);
        imagePrin.setLayout(imagePrinLayout);
        imagePrinLayout.setHorizontalGroup(
            imagePrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        imagePrinLayout.setVerticalGroup(
            imagePrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        jPanel1.add(imagePrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        image1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout image1Layout = new javax.swing.GroupLayout(image1);
        image1.setLayout(image1Layout);
        image1Layout.setHorizontalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        image1Layout.setVerticalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        image2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout image2Layout = new javax.swing.GroupLayout(image2);
        image2.setLayout(image2Layout);
        image2Layout.setHorizontalGroup(
            image2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        image2Layout.setVerticalGroup(
            image2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        image3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout image3Layout = new javax.swing.GroupLayout(image3);
        image3.setLayout(image3Layout);
        image3Layout.setHorizontalGroup(
            image3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        image3Layout.setVerticalGroup(
            image3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSesionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionbtnActionPerformed
        VistaLogin login = new VistaLogin();
        login.setVisible(true);
        login.setSize(800,500);
        login.setLocation(0,0);
        
    }//GEN-LAST:event_iniciarSesionbtnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cantidadAComprarDesp;
    private javax.swing.JLabel cantidadACompratxt;
    private javax.swing.JPanel compraBtn;
    private javax.swing.JLabel compraTxtBtn;
    private javax.swing.JPanel header;
    private javax.swing.JPanel image1;
    private javax.swing.JPanel image2;
    private javax.swing.JPanel image3;
    private javax.swing.JPanel imagePrin;
    private javax.swing.JButton iniciarSesionbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel nameEnterprise;
    private javax.swing.JLabel nombreJoya;
    private javax.swing.JComboBox<String> pesoDesp;
    private javax.swing.JLabel pesotxt;
    private javax.swing.JLabel precioJoya;
    private javax.swing.JComboBox<String> tamañodesp;
    private javax.swing.JLabel tamañotxt;
    // End of variables declaration//GEN-END:variables
}

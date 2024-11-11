package Vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class paginaInicio extends javax.swing.JFrame {

    private VistaLogin vistaLogin;
    private ViewJoyas viewJoyas;
    private ViewUser viewUser;

    public paginaInicio() {
        initComponents();
        JPopupMenu popupMenu = new JPopupMenu();

        // Crear las opciones del menú
        JMenuItem opcion1 = new JMenuItem("Gestionar joya");
        JMenuItem opcion2 = new JMenuItem("Gestionar Usuarios");
        JMenuItem opcion3 = new JMenuItem("Cerrar sesion");

        // Agregar las opciones al popupMenu
        popupMenu.add(opcion1);
        popupMenu.add(opcion2);
        popupMenu.add(opcion3);

        // Agregar acción para cada opción
        opcion1.addActionListener(e -> new ViewJoyas().setVisible(true));
        opcion2.addActionListener(e -> new ViewUser().setVisible(true));
        opcion3.addActionListener(e -> {
            this.dispose(); // Cierra la ventana actual
            vistaLogin.setVisible(true); // Muestra la ventana de inicio de sesión
        });
        // Añadir un MouseListener al JLabel que funciona como ícono
        usuarioIcono.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Mostrar el menú en la posición del clic
                popupMenu.show(usuarioIcono, e.getX(), e.getY());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paginaInicioPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nombreEmpresatxt = new javax.swing.JLabel();
        joyaDesplegable = new javax.swing.JComboBox<>();
        tipoJoyatxt = new javax.swing.JLabel();
        irbtn = new javax.swing.JPanel();
        irtxt = new javax.swing.JLabel();
        buscarIcono = new javax.swing.JLabel();
        usuarioIcono = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        imagenInicio = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        imagen1 = new javax.swing.JPanel();
        imagen8 = new javax.swing.JPanel();
        imagen4 = new javax.swing.JPanel();
        imagen2 = new javax.swing.JPanel();
        imagen3 = new javax.swing.JPanel();
        imagen5 = new javax.swing.JPanel();
        imagen7 = new javax.swing.JPanel();
        imagen6 = new javax.swing.JPanel();
        imagen9 = new javax.swing.JPanel();
        imagen10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paginaInicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        paginaInicioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEmpresatxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreEmpresatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresatxt.setText("JESSICA JOYERIA");
        header.add(nombreEmpresatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 160, 50));

        joyaDesplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anillos", "Collares", "Aretes" }));
        joyaDesplegable.setBorder(null);
        header.add(joyaDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 30));

        tipoJoyatxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoJoyatxt.setText("Tipos de joyas");
        header.add(tipoJoyatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 50));

        irbtn.setBackground(new java.awt.Color(255, 255, 255));

        irtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        irtxt.setText("Ir");

        javax.swing.GroupLayout irbtnLayout = new javax.swing.GroupLayout(irbtn);
        irbtn.setLayout(irbtnLayout);
        irbtnLayout.setHorizontalGroup(
            irbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(irbtnLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(irtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        irbtnLayout.setVerticalGroup(
            irbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(irbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(irtxt)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        header.add(irbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 3, 30, 60));

        buscarIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        header.add(buscarIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 40));

        usuarioIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account_login_log_in_icon_250759.png"))); // NOI18N
        header.add(usuarioIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 40));
        header.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 10));

        paginaInicioPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
        paginaInicioPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, -1));

        javax.swing.GroupLayout imagenInicioLayout = new javax.swing.GroupLayout(imagenInicio);
        imagenInicio.setLayout(imagenInicioLayout);
        imagenInicioLayout.setHorizontalGroup(
            imagenInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        imagenInicioLayout.setVerticalGroup(
            imagenInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 230));
        paginaInicioPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1000, -1));

        javax.swing.GroupLayout imagen1Layout = new javax.swing.GroupLayout(imagen1);
        imagen1.setLayout(imagen1Layout);
        imagen1Layout.setHorizontalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen1Layout.setVerticalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        javax.swing.GroupLayout imagen8Layout = new javax.swing.GroupLayout(imagen8);
        imagen8.setLayout(imagen8Layout);
        imagen8Layout.setHorizontalGroup(
            imagen8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen8Layout.setVerticalGroup(
            imagen8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        javax.swing.GroupLayout imagen4Layout = new javax.swing.GroupLayout(imagen4);
        imagen4.setLayout(imagen4Layout);
        imagen4Layout.setHorizontalGroup(
            imagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen4Layout.setVerticalGroup(
            imagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        javax.swing.GroupLayout imagen2Layout = new javax.swing.GroupLayout(imagen2);
        imagen2.setLayout(imagen2Layout);
        imagen2Layout.setHorizontalGroup(
            imagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen2Layout.setVerticalGroup(
            imagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        javax.swing.GroupLayout imagen3Layout = new javax.swing.GroupLayout(imagen3);
        imagen3.setLayout(imagen3Layout);
        imagen3Layout.setHorizontalGroup(
            imagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen3Layout.setVerticalGroup(
            imagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        javax.swing.GroupLayout imagen5Layout = new javax.swing.GroupLayout(imagen5);
        imagen5.setLayout(imagen5Layout);
        imagen5Layout.setHorizontalGroup(
            imagen5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen5Layout.setVerticalGroup(
            imagen5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));

        javax.swing.GroupLayout imagen7Layout = new javax.swing.GroupLayout(imagen7);
        imagen7.setLayout(imagen7Layout);
        imagen7Layout.setHorizontalGroup(
            imagen7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen7Layout.setVerticalGroup(
            imagen7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        javax.swing.GroupLayout imagen6Layout = new javax.swing.GroupLayout(imagen6);
        imagen6.setLayout(imagen6Layout);
        imagen6Layout.setHorizontalGroup(
            imagen6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        imagen6Layout.setVerticalGroup(
            imagen6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 100));

        javax.swing.GroupLayout imagen9Layout = new javax.swing.GroupLayout(imagen9);
        imagen9.setLayout(imagen9Layout);
        imagen9Layout.setHorizontalGroup(
            imagen9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen9Layout.setVerticalGroup(
            imagen9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, -1, -1));

        javax.swing.GroupLayout imagen10Layout = new javax.swing.GroupLayout(imagen10);
        imagen10.setLayout(imagen10Layout);
        imagen10Layout.setHorizontalGroup(
            imagen10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagen10Layout.setVerticalGroup(
            imagen10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        paginaInicioPanel.add(imagen10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jLabel6.setText("nombreJoya");
        paginaInicioPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jLabel7.setText("nombreJoya");
        paginaInicioPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel8.setText("nombreJoya");
        paginaInicioPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jLabel9.setText("nombreJoya");
        paginaInicioPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        jLabel10.setText("nombreJoya");
        paginaInicioPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, -1, -1));

        jLabel11.setText("nombreJoya");
        paginaInicioPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        jLabel12.setText("nombreJoya");
        paginaInicioPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        jLabel13.setText("nombreJoya");
        paginaInicioPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, -1, -1));

        jLabel14.setText("nombreJoya");
        paginaInicioPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        jLabel15.setText("nombreJoya");
        paginaInicioPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paginaInicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paginaInicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setviewUser(ViewUser viewuser) {
        this.viewUser = viewUser;
    }

    public void setviewJoyas(ViewJoyas viewJoyas) {
        this.viewJoyas = viewJoyas;
    }

    public void setVistaLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarIcono;
    private javax.swing.JPanel header;
    private javax.swing.JPanel imagen1;
    private javax.swing.JPanel imagen10;
    private javax.swing.JPanel imagen2;
    private javax.swing.JPanel imagen3;
    private javax.swing.JPanel imagen4;
    private javax.swing.JPanel imagen5;
    private javax.swing.JPanel imagen6;
    private javax.swing.JPanel imagen7;
    private javax.swing.JPanel imagen8;
    private javax.swing.JPanel imagen9;
    private javax.swing.JPanel imagenInicio;
    private javax.swing.JPanel irbtn;
    private javax.swing.JLabel irtxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> joyaDesplegable;
    private javax.swing.JLabel nombreEmpresatxt;
    private javax.swing.JPanel paginaInicioPanel;
    private javax.swing.JLabel tipoJoyatxt;
    private javax.swing.JLabel usuarioIcono;
    // End of variables declaration//GEN-END:variables
}

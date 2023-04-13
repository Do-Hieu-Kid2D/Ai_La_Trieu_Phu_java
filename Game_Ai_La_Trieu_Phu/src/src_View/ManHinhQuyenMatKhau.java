
package src_View;

import javax.swing.JOptionPane;


public class ManHinhQuyenMatKhau extends javax.swing.JFrame {
    

    public ManHinhQuyenMatKhau() {
        initComponents();
        panDatLaiMatKhau.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panQuyenMatKhau = new javax.swing.JPanel();
        panXacThuc = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnXacThuc = new javax.swing.JButton();
        labQuayLai = new javax.swing.JLabel();
        panDatLaiMatKhau = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnThayDoiMatKhau = new javax.swing.JButton();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 552));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panQuyenMatKhau.setMaximumSize(new java.awt.Dimension(1000, 522));
        panQuyenMatKhau.setMinimumSize(new java.awt.Dimension(1000, 522));
        panQuyenMatKhau.setOpaque(false);
        panQuyenMatKhau.setPreferredSize(new java.awt.Dimension(1000, 522));
        panQuyenMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panXacThuc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setText("QUYÊN MẬT KHẨU");
        jPanel2.add(jLabel1);

        panXacThuc.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        panXacThuc.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 60, 375, 10));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Nhập email của bạn:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 40));

        btnXacThuc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnXacThuc.setText("XÁC THỰC");
        btnXacThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacThucActionPerformed(evt);
            }
        });
        jPanel3.add(btnXacThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        labQuayLai.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labQuayLai.setText("Quay lại...");
        labQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labQuayLaiMousePressed(evt);
            }
        });
        jPanel3.add(labQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, -1));

        panXacThuc.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 200));

        panQuyenMatKhau.add(panXacThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 400, 290));

        panDatLaiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setText("ĐẶT LẠI MẬT KHẨU");
        jPanel1.add(jLabel3);

        panDatLaiMatKhau.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 390, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(2.0F);
        jSeparator2.setAlignmentY(2.0F);
        panDatLaiMatKhau.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Nhập mật khẩu mới:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextField4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Nhập lại mật khẩu:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jTextField5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 40));

        btnThayDoiMatKhau.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnThayDoiMatKhau.setText("Thay đổi");
        jPanel4.add(btnThayDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 40));

        panDatLaiMatKhau.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 260));

        panQuyenMatKhau.add(panDatLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 400, 340));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panQuyenMatKhau.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panQuyenMatKhau);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacThucActionPerformed
        
        // Check email...
        
        // Khi đã xác thực được đúng email! -> hiện panel cho đặt lại mật khẩu lên
        panXacThuc.setVisible(false);
        panDatLaiMatKhau.setVisible(true);
    }//GEN-LAST:event_btnXacThucActionPerformed

    private void labQuayLaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labQuayLaiMousePressed
        
        // Ấn lable quay lại để k quên mật khẩu nữa
        
        ManHinhDangNhap manHinhDangNhap = new ManHinhDangNhap();
        manHinhDangNhap.setLocationRelativeTo(null);
        manHinhDangNhap.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_labQuayLaiMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThayDoiMatKhau;
    private javax.swing.JButton btnXacThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labQuayLai;
    private javax.swing.JPanel panDatLaiMatKhau;
    private javax.swing.JPanel panQuyenMatKhau;
    private javax.swing.JPanel panXacThuc;
    // End of variables declaration//GEN-END:variables
}

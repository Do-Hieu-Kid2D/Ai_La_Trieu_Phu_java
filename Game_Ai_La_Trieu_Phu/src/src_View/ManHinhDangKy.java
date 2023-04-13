
package src_View;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class ManHinhDangKy extends javax.swing.JFrame {


    public ManHinhDangKy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLoaiNguoiChoi = new javax.swing.ButtonGroup();
        panlManHinhDangNhap = new javax.swing.JPanel();
        btnQuayLai = new javax.swing.JButton();
        panDangNhap = new javax.swing.JPanel();
        panlChuDangNhap = new javax.swing.JPanel();
        lablehuDangNHap = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtTenDangNhap = new javax.swing.JTextField();
        jtxtMatKhauNhapLai = new javax.swing.JPasswordField();
        btnDangKy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labDangNhap = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtMatKhau = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenCuaBan = new javax.swing.JTextField();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 552));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panlManHinhDangNhap.setMaximumSize(new java.awt.Dimension(1000, 522));
        panlManHinhDangNhap.setMinimumSize(new java.awt.Dimension(1000, 522));
        panlManHinhDangNhap.setOpaque(false);
        panlManHinhDangNhap.setPreferredSize(new java.awt.Dimension(1000, 522));
        panlManHinhDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/quaylai.png"))); // NOI18N
        btnQuayLai.setToolTipText("");
        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        panlManHinhDangNhap.add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 30));

        panDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        panDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panlChuDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panlChuDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lablehuDangNHap.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lablehuDangNHap.setText("ĐĂNG KÝ TÀI KHOẢN");
        lablehuDangNHap.setToolTipText("");
        lablehuDangNHap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panlChuDangNhap.add(lablehuDangNHap);

        panDangNhap.add(panlChuDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.5F);
        jSeparator2.setAlignmentY(1.5F);
        jSeparator2.setFocusTraversalPolicyProvider(true);
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(100, 30));
        panDangNhap.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 10));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhập:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nhập lại mật khẩu:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 20));

        jtxtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(jtxtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, 30));

        jtxtMatKhauNhapLai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(jtxtMatKhauNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 320, 30));

        btnDangKy.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDangKy.setText("ĐĂNG KÝ");
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 230, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Bạn đã có tài khoản?");
        jPanel2.add(jLabel4);

        labDangNhap.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labDangNhap.setForeground(new java.awt.Color(255, 51, 51));
        labDangNhap.setText("Đăng nhập");
        labDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labDangNhapMousePressed(evt);
            }
        });
        jPanel2.add(labDangNhap);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 270, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));

        jtxtMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(jtxtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, 30));

        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 320, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Tên của bạn:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        txtTenCuaBan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(txtTenCuaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 30));

        panDangNhap.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 410));

        panlManHinhDangNhap.add(panDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 400, 490));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panlManHinhDangNhap.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panlManHinhDangNhap);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        
        // Check các thông tin khi nhập vào xem đúng fomat không?.....
        
        
        // Khi đăng kí thành công 
        JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       
        // Khi muốn quay lại thì ấn nút này!
       this.setVisible(false);
       ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void labDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDangNhapMousePressed
       
        // Không đăng ký nữa -> ấn "lab đăng nhập" -> sang màn đăng nhập
        
        ManHinhDangNhap manHinhDangNhap = new ManHinhDangNhap();
        manHinhDangNhap.setLocationRelativeTo(null);
        manHinhDangNhap.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_labDangNhapMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.ButtonGroup groupLoaiNguoiChoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jtxtMatKhau;
    private javax.swing.JPasswordField jtxtMatKhauNhapLai;
    private javax.swing.JTextField jtxtTenDangNhap;
    private javax.swing.JLabel labDangNhap;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel lablehuDangNHap;
    private javax.swing.JPanel panDangNhap;
    private javax.swing.JPanel panlChuDangNhap;
    private javax.swing.JPanel panlManHinhDangNhap;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTenCuaBan;
    // End of variables declaration//GEN-END:variables
}

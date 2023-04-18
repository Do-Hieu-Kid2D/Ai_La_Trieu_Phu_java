
package src_View;
import src_module.*;

import javax.swing.JOptionPane;


public class ManHinhQuyenMatKhau extends javax.swing.JFrame {
    

    public ManHinhQuyenMatKhau() {
        initComponents();
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
        txtTaiKhoan = new javax.swing.JTextField();
        btnXacThuc = new javax.swing.JButton();
        labQuayLai = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

        panXacThuc.setBackground(new java.awt.Color(204, 255, 204));
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
        jLabel2.setText("Tài khoản của bạn:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTaiKhoan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 40));

        btnXacThuc.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnXacThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/confirmation.png"))); // NOI18N
        btnXacThuc.setText("  XÁC THỰC");
        btnXacThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacThucActionPerformed(evt);
            }
        });
        jPanel3.add(btnXacThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, -1));

        labQuayLai.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labQuayLai.setText("Quay lại...");
        labQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labQuayLaiMousePressed(evt);
            }
        });
        jPanel3.add(labQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 70, -1));

        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Email xác thực:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        panXacThuc.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 280));

        panQuyenMatKhau.add(panXacThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 400, 370));

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
        // Lấy được người choi qua tên đăng nhập:
        String taiKhoanNguoiChoi = txtTaiKhoan.getText();
        String emaiNguoiChoi = txtEmail.getText();
        NguoiChoi admin = new NguoiChoi();
        NguoiChoi canTim = admin.layNguoiChoiQuaTenDN(taiKhoanNguoiChoi);
        if(canTim == null){
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không tồn tại!", 
            "Thông báo!",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(canTim.getEmail().equals(emaiNguoiChoi)){
            FrameDoiMatKhau doiMatKhau = new FrameDoiMatKhau(canTim,this);
            doiMatKhau.setVisible(true);
            doiMatKhau.setLocationRelativeTo(panQuyenMatKhau);
        }else{
            JOptionPane.showMessageDialog(this, "Emai không khớp, vui lòng nhập lại!", 
            "Thông báo!",JOptionPane.ERROR_MESSAGE);
        }  
        
    }//GEN-LAST:event_btnXacThucActionPerformed

    private void labQuayLaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labQuayLaiMousePressed
        
        // Ấn lable quay lại để k quên mật khẩu nữa
        
        ManHinhDangNhap manHinhDangNhap = new ManHinhDangNhap();
        manHinhDangNhap.setLocationRelativeTo(null);
        manHinhDangNhap.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_labQuayLaiMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labQuayLai;
    private javax.swing.JPanel panQuyenMatKhau;
    private javax.swing.JPanel panXacThuc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}

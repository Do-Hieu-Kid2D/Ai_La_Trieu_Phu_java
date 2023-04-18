
package src_View;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import src_module.*;

public class ManHinhDangNhap extends javax.swing.JFrame {
    NguoiChoi nguoiChoiDaDangNhap;
    String banLaAi;
    public ManHinhDangNhap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupLoaiNguoiChoi = new javax.swing.ButtonGroup();
        panlManHinhDangNhap = new javax.swing.JPanel();
        btnQuayLai = new javax.swing.JButton();
        panDangNhap = new javax.swing.JPanel();
        panlChuDangNhap = new javax.swing.JPanel();
        lablehuDangNHap = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        labQuyenMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labDangKyNgay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbtnNguoiQuanLy = new javax.swing.JRadioButton();
        rbtnNguoiChoi = new javax.swing.JRadioButton();
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
        btnQuayLai.setToolTipText("Quay lại");
        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        panlManHinhDangNhap.add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 30));

        panDangNhap.setBackground(new java.awt.Color(204, 255, 204));
        panDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panlChuDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panlChuDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lablehuDangNHap.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lablehuDangNHap.setText("ĐĂNG NHẬP");
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Mật khẩu:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 20));

        txtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTenDangNhap.setText("hieu");
        jPanel1.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 320, 40));

        txtMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMatKhau.setText("123");
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 40));

        labQuyenMatKhau.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labQuyenMatKhau.setText("Quyên mật khẩu...");
        labQuyenMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labQuyenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labQuyenMatKhauMousePressed(evt);
            }
        });
        jPanel1.add(labQuyenMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, -1));

        btnDangNhap.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/log-in.png"))); // NOI18N
        btnDangNhap.setText(" ĐĂNG NHẬP");
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 230, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Bạn chưa có tài khoản...");
        jPanel2.add(jLabel4);

        labDangKyNgay.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labDangKyNgay.setForeground(new java.awt.Color(255, 51, 51));
        labDangKyNgay.setText("Đăng ký ngay");
        labDangKyNgay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labDangKyNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labDangKyNgayMousePressed(evt);
            }
        });
        jPanel2.add(labDangKyNgay);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 270, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Bạn là:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        btnGroupLoaiNguoiChoi.add(rbtnNguoiQuanLy);
        rbtnNguoiQuanLy.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        rbtnNguoiQuanLy.setText("Người Quản lý");
        rbtnNguoiQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNguoiQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNguoiChoiActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnNguoiQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        btnGroupLoaiNguoiChoi.add(rbtnNguoiChoi);
        rbtnNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        rbtnNguoiChoi.setText("Người chơi");
        rbtnNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNguoiChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNguoiChoiActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 80));

        panDangNhap.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 360));

        panlManHinhDangNhap.add(panDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 400, 450));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panlManHinhDangNhap.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panlManHinhDangNhap);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        
        // Check tài khoản mật khẩu..
        // loại người dùng lưu trong biến banLaAi rồi
        String tenDangNhap = txtTenDangNhap.getText();
        String matKhau = String.valueOf(txtMatKhau.getPassword());
        if(banLaAi == null){
            JOptionPane.showMessageDialog(this,
                    "Vui lòng chọn người chơi hoặc người quản lý!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);

            return;
        }
        if(banLaAi.equals("nguoiChoi")){
            NguoiChoi tempChoi = new NguoiChoi(tenDangNhap,matKhau);
            NguoiChoi admin = new NguoiChoi();
            NguoiChoi nguoiChoiTimDuoc = admin.soSanhTendnVaMatKhau(tempChoi);
            if(nguoiChoiTimDuoc==null){
                JOptionPane.showMessageDialog(this,
                 "Thông tin đăng nhập không chính xác!",
                 "Thông báo",
                 JOptionPane.ERROR_MESSAGE);
            }
            else{
                nguoiChoiDaDangNhap = nguoiChoiTimDuoc;
                this.setVisible(false);
                ManHinhQuyenNguoiChoi manHinhQuyenNguoiChoi = new ManHinhQuyenNguoiChoi(nguoiChoiDaDangNhap);
                manHinhQuyenNguoiChoi.setLocationRelativeTo(null);
                manHinhQuyenNguoiChoi.setVisible(true);
                this.dispose();
            }           
        }
         if(banLaAi.equals("nguoiQuanLy")){
            NguoiQuanLy tempNguoiQL = new NguoiQuanLy(tenDangNhap,matKhau);
            NguoiQuanLy admin = new NguoiQuanLy();
            NguoiQuanLy nguoiQuanLYTimDuoc = admin.soSanhTendnVaMatKhau(tempNguoiQL);
            if(nguoiQuanLYTimDuoc==null){
                  JOptionPane.showMessageDialog(this,
                    "Thông tin đăng nhập không chính xác!",
                    "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            }
            else{
                this.setVisible(false);
                ManHinhQuyenNguoiQuanLy manHinhQuyenNguoiQuanLy = new ManHinhQuyenNguoiQuanLy(nguoiQuanLYTimDuoc);
                manHinhQuyenNguoiQuanLy.setLocationRelativeTo(null);
                manHinhQuyenNguoiQuanLy.setVisible(true);
                this.dispose();
            }           
               
         }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       
        // Quay lại thì tắt thằng này đi gọi PaPa lên!
       this.setVisible(false);
       ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void labDangKyNgayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDangKyNgayMousePressed
        
        // Ấn lable "đăng ký ngay" => chuyển sang màn hình đăng ký!
        ManHinhDangKy manHinhDangKy = new  ManHinhDangKy();
        manHinhDangKy.setLocationRelativeTo(null);
        manHinhDangKy.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_labDangKyNgayMousePressed

    private void labQuyenMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labQuyenMatKhauMousePressed
        
         // Ấn lable "quên mật khẩu" => chuyển sang màn hình đặt lại mật khẩu!
        ManHinhQuyenMatKhau manHinhQuyenMatKhau = new ManHinhQuyenMatKhau();
        manHinhQuyenMatKhau.setLocationRelativeTo(null);
        manHinhQuyenMatKhau.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_labQuyenMatKhauMousePressed

    private void rbtnNguoiChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNguoiChoiActionPerformed
         if(evt.getSource()==rbtnNguoiChoi) {
            banLaAi = "nguoiChoi";
         }
         if(evt.getSource()==rbtnNguoiQuanLy) {
            banLaAi = "nguoiQuanLy";
         }
    }//GEN-LAST:event_rbtnNguoiChoiActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.ButtonGroup btnGroupLoaiNguoiChoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labDangKyNgay;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labQuyenMatKhau;
    private javax.swing.JLabel lablehuDangNHap;
    private javax.swing.JPanel panDangNhap;
    private javax.swing.JPanel panlChuDangNhap;
    private javax.swing.JPanel panlManHinhDangNhap;
    private javax.swing.JRadioButton rbtnNguoiChoi;
    private javax.swing.JRadioButton rbtnNguoiQuanLy;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}

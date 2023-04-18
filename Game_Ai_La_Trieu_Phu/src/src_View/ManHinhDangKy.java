
package src_View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import src_module.*;

public class ManHinhDangKy extends javax.swing.JFrame {

    NguoiChoi admin = new NguoiChoi();
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
        labTenDangNhap = new javax.swing.JLabel();
        labMatKhauNhapLai = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhauNhapLai = new javax.swing.JPasswordField();
        btnDangKy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labDangNhap = new javax.swing.JLabel();
        labMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        labEmail = new javax.swing.JLabel();
        labTenCuaBan = new javax.swing.JLabel();
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

        labTenDangNhap.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labTenDangNhap.setText("Tên đăng nhập:");
        labTenDangNhap.setToolTipText("");
        jPanel1.add(labTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        labMatKhauNhapLai.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labMatKhauNhapLai.setText("Nhập lại mật khẩu:");
        labMatKhauNhapLai.setToolTipText("");
        jPanel1.add(labMatKhauNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 20));

        txtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, 30));

        txtMatKhauNhapLai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtMatKhauNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 320, 30));

        btnDangKy.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/write.png"))); // NOI18N
        btnDangKy.setText(" ĐĂNG KÝ");
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

        labMatKhau.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labMatKhau.setText("Mật khẩu:");
        labMatKhau.setToolTipText("");
        jPanel1.add(labMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));

        txtMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, 30));

        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 320, 30));

        labEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEmail.setText("Email:");
        labEmail.setToolTipText("");
        jPanel1.add(labEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 30));

        labTenCuaBan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labTenCuaBan.setText("Tên của bạn:");
        labTenCuaBan.setToolTipText("");
        jPanel1.add(labTenCuaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

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
        private boolean isLoiKhongDuThongtin(String tenNguoiChoi, String tenDangNhap,String matKhau, String matKhauNhapLai, String Email){
            if(tenNguoiChoi.equals("") || tenDangNhap.equals("")|| matKhau.equals("") 
                    || matKhauNhapLai.equals("") || Email.equals("")){

                if(tenNguoiChoi.equals("")){
                    labTenCuaBan.setForeground(Color.red);
                }else{
                    labTenCuaBan.setForeground(Color.BLACK);
                }
                if(tenDangNhap.equals("")){
                    labTenDangNhap.setForeground(Color.red);
                }else{
                    labTenDangNhap.setForeground(Color.BLACK);
                }
                if(matKhau.equals("")){
                    labMatKhau.setForeground(Color.red);
                }else{
                    labMatKhau.setForeground(Color.BLACK);
                }
                if(matKhauNhapLai.equals("")){
                    labMatKhauNhapLai.setForeground(Color.red);
                }else{
                    labMatKhauNhapLai.setForeground(Color.BLACK);
                }
                if(Email.equals("")){
                    labEmail.setForeground(Color.red);
                }else{
                    labEmail.setForeground(Color.BLACK);
                }  

                txtTenCuaBan.setText(tenNguoiChoi);
                txtTenDangNhap.setText(tenDangNhap);
                txtMatKhau.setText(matKhau);
                txtMatKhauNhapLai.setText(matKhauNhapLai);
                txtEmail.setText(Email);
                return true;
                }
            return false;
        }
        private void setLaiMau(){
            labTenDangNhap.setForeground(Color.BLACK);
            labTenCuaBan.setForeground(Color.BLACK);
            labMatKhau.setForeground(Color.BLACK);
            labMatKhauNhapLai.setForeground(Color.BLACK);
            labEmail.setForeground(Color.BLACK);
        }
        private boolean checkFomatEmail(String email){
       
        CheckInputEmail admin = new CheckInputEmail();
        if(!admin.validate(email.trim())) {
            labEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng!", 
                 "Thông báo!",JOptionPane.ERROR_MESSAGE);
            return false;  
        } 
        return true;
    }
    
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        
        // Check các thông tin khi nhập vào xem đúng fomat không?.....
        boolean flag = false;
        String tenNguoiChoi = txtTenCuaBan.getText();
        String tenDangNhap = txtTenDangNhap.getText();
        String matKhau =String.valueOf(txtMatKhau.getPassword());
        String matKhauNhapLai =String.valueOf(txtMatKhauNhapLai.getPassword());
        String email = txtEmail.getText();
        if(this.isLoiKhongDuThongtin(tenNguoiChoi, tenDangNhap, matKhau, matKhauNhapLai, email)){
             JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin", 
                 "Thông báo!",JOptionPane.ERROR_MESSAGE);
        }else{
            this.setLaiMau(); 
        }
        if(!this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau, matKhauNhapLai,email)){
             if(admin.nguoiChoiCoTonTaiHayKhong(tenDangNhap)){
                labTenDangNhap.setForeground(Color.red);
                JOptionPane.showMessageDialog(this, "Người chơi " + tenDangNhap +" đã tồn tại!", 
                     "Thông báo!",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(!this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau, matKhauNhapLai,email)){
            if(!matKhau.equals(matKhauNhapLai) && !admin.nguoiChoiCoTonTaiHayKhong(tenDangNhap)){
                labMatKhauNhapLai.setForeground(Color.red);
                JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không đúng!", 
                         "Thông báo!",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(!this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau, matKhauNhapLai,email)){
           if(matKhau.equals(matKhauNhapLai) && !admin.nguoiChoiCoTonTaiHayKhong(tenDangNhap)){
                 flag = this.checkFomatEmail(email); 
            }
        }
        
        // Bắt hết lỗi rồi thì mới đẩy thông tin đi để đợi xác nhận nưa!! :((
        if(flag){
            NguoiChoiChuaXacThuc adminChuaXacThuc = new NguoiChoiChuaXacThuc();
            NguoiChoiChuaXacThuc temp = new NguoiChoiChuaXacThuc(tenNguoiChoi, tenDangNhap, matKhau, email, false);
            adminChuaXacThuc.themMotNguoiChoiCXT(temp);
            JOptionPane.showMessageDialog(this, "Đã gửi bản đăng ký tới máy chủ.\n Vui lòng đợi được xác thực!", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       this.setVisible(false);
       ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void labDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDangNhapMousePressed
   
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labDangNhap;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labMatKhau;
    private javax.swing.JLabel labMatKhauNhapLai;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labTenCuaBan;
    private javax.swing.JLabel labTenDangNhap;
    private javax.swing.JLabel lablehuDangNHap;
    private javax.swing.JPanel panDangNhap;
    private javax.swing.JPanel panlChuDangNhap;
    private javax.swing.JPanel panlManHinhDangNhap;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauNhapLai;
    private javax.swing.JTextField txtTenCuaBan;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}

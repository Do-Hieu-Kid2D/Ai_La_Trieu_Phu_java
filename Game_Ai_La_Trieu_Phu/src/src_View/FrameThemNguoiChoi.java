package src_View;
import java.awt.Color;
import javax.swing.JOptionPane;
import src_module.*;

public class FrameThemNguoiChoi extends javax.swing.JFrame {
    public FrameThemNguoiChoi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labTenNguoiChoi = new javax.swing.JLabel();
        labTenDangNhap = new javax.swing.JLabel();
        labMatKhau = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTenNguoiChoi = new javax.swing.JTextField();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setText("THÊM NGƯỜI CHƠI");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(4, 1, 35, 35));

        labTenNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTenNguoiChoi.setText("Tên người chơi:");
        jPanel4.add(labTenNguoiChoi);

        labTenDangNhap.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labTenDangNhap.setText("Tên đăng nhập:");
        jPanel4.add(labTenDangNhap);

        labMatKhau.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMatKhau.setText("Mật khẩu: ");
        jPanel4.add(labMatKhau);

        labEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmail.setText("Emai: ");
        jPanel4.add(labEmail);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 30, 150, 210));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 21, 21));

        txtTenNguoiChoi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtTenNguoiChoi);

        txtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtTenDangNhap);

        txtMatKhau.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtMatKhau);

        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jPanel3.add(txtEmail);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 230));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 70, 70));

        btnThem.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/add-user-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        btnQuayLai.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/backNha.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        jPanel5.add(btnQuayLai);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 320, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private boolean isLoiKhongDuThongtin(String tenNguoiChoi, String tenDangNhap,String matKhau,String Email){
        if(tenNguoiChoi.equals("") || tenDangNhap.equals("")||
                matKhau.equals("") || Email.equals("")){
            
            if(tenNguoiChoi.equals("")){
                labTenNguoiChoi.setForeground(Color.red);
            }else{
                labTenNguoiChoi.setForeground(Color.BLACK);
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
            if(Email.equals("")){
                labEmail.setForeground(Color.red);
            }else{
                labEmail.setForeground(Color.BLACK);
            }  
           
            txtTenNguoiChoi.setText(tenNguoiChoi);
            txtTenDangNhap.setText(tenDangNhap);
            txtMatKhau.setText(matKhau);
            txtEmail.setText(Email);
            return true;
            }
        return false;
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
     private void setLaiMau(){
        labTenDangNhap.setForeground(Color.BLACK);
        labTenNguoiChoi.setForeground(Color.BLACK);
        labMatKhau.setForeground(Color.BLACK);
        labEmail.setForeground(Color.BLACK);
    }
     
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        boolean flag = false;
        String tenNguoiChoi = txtTenNguoiChoi.getText();
        String tenDangNhap= txtTenDangNhap.getText();
        String matKhau= txtMatKhau.getText();
        String email= txtEmail.getText();
         NguoiChoi admin = new NguoiChoi();
        if(this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau,email)){
             JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin", 
                 "Thông báo!",JOptionPane.ERROR_MESSAGE);
            }else{
             this.setLaiMau();
        }
        if(!this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau,email)){
             if(admin.nguoiChoiCoTonTaiHayKhong(tenDangNhap)){
                 labTenDangNhap.setForeground(Color.red);
                 JOptionPane.showMessageDialog(this, "Người chơi " + tenDangNhap +" đã tồn tại!", 
                     "Thông báo!",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(!this.isLoiKhongDuThongtin(tenNguoiChoi,tenDangNhap,matKhau,email) && !admin.nguoiChoiCoTonTaiHayKhong(tenDangNhap)){
              flag = this.checkFomatEmail(email); 
        }
                  
        if(flag){
            this.setLaiMau();
            NguoiChoi admin2 = new NguoiChoi();
            admin2.themMotNguoiChoi(new NguoiChoi(tenNguoiChoi, tenDangNhap, matKhau, email, 0));
            JOptionPane.showMessageDialog(this, "Thêm người chơi " +txtTenNguoiChoi.getText().toUpperCase()+" thành công!", 
                 "Thông báo!",JOptionPane.INFORMATION_MESSAGE);
            txtTenNguoiChoi.setText("");
            txtTenDangNhap.setText("");
            txtMatKhau.setText("");
            txtEmail.setText("");
        }
        
    }//GEN-LAST:event_btnThemActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labMatKhau;
    private javax.swing.JLabel labTenDangNhap;
    private javax.swing.JLabel labTenNguoiChoi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTenNguoiChoi;
    // End of variables declaration//GEN-END:variables
}

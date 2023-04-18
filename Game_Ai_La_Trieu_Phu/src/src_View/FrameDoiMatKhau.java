
package src_View;
import javax.swing.JOptionPane;
import src_module.*;
public class FrameDoiMatKhau extends javax.swing.JFrame {

    NguoiChoi NguoiChoiCanDoiMK ;
    ManHinhQuyenMatKhau manhinhPAPA;
    public FrameDoiMatKhau(NguoiChoi nguoiChoireal, ManHinhQuyenMatKhau mh)  {
        initComponents();
        NguoiChoiCanDoiMK = nguoiChoireal;
        manhinhPAPA = mh;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panDatLaiMatKhau = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThayDoiMatKhau = new javax.swing.JButton();
        txtMatKhauMoiNhapLai = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");

        panDatLaiMatKhau.setBackground(new java.awt.Color(204, 255, 204));
        panDatLaiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setText("ĐẶT LẠI MẬT KHẨU");
        jPanel1.add(jLabel3);

        panDatLaiMatKhau.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 400, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(2.0F);
        jSeparator2.setAlignmentY(2.0F);
        panDatLaiMatKhau.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Nhập mật khẩu mới:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Nhập lại mật khẩu:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnThayDoiMatKhau.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnThayDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/exchange.png"))); // NOI18N
        btnThayDoiMatKhau.setText("Thay đổi");
        btnThayDoiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThayDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel4.add(btnThayDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 40));

        txtMatKhauMoiNhapLai.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jPanel4.add(txtMatKhauMoiNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 40));

        txtMatKhauMoi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jPanel4.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 40));

        panDatLaiMatKhau.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 390, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panDatLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panDatLaiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThayDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiMatKhauActionPerformed
        String matKhau = String.valueOf(txtMatKhauMoi.getPassword());
        String matKhauNhapLai = String.valueOf(txtMatKhauMoiNhapLai.getPassword());
        if(matKhau.equals(matKhauNhapLai)){
            if(matKhauNhapLai.equals("")){
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu!", 
            "Thông báo!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            NguoiChoi admin = new NguoiChoi();
            NguoiChoiCanDoiMK.setMatKhau(matKhau);
            admin.xoaMotNguoiChoi(NguoiChoiCanDoiMK.getTenDangNhap());
            admin.themMotNguoiChoi(NguoiChoiCanDoiMK);
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu tài khoản "+
                NguoiChoiCanDoiMK.getTenDangNhap() +" thành công!", 
            "Thông báo!",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.dispose();
            manhinhPAPA.setVisible(false);
            ManHinhDangNhap mh = new ManHinhDangNhap();
            mh.setVisible(true);
            mh.setLocationRelativeTo(null);
            manhinhPAPA.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không đúng!", 
            "Thông báo!",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnThayDoiMatKhauActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThayDoiMatKhau;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panDatLaiMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauMoiNhapLai;
    // End of variables declaration//GEN-END:variables
}

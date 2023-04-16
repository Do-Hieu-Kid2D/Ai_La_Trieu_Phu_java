package src_View;
import javax.swing.JOptionPane;
import src_module.NguoiChoi;

public class FrameXoaNguoiChoi extends javax.swing.JFrame {
    public FrameXoaNguoiChoi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setText("XÓA NGƯỜI CHƠI");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 70, 70));

        btnXoa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/remove-user-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

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

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 330, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tên đăng nhập:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 170, 50));

        txtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        txtTenDangNhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
        // Bắt lỗi người chơi đó k tồn tại
        String tenDN = txtTenDangNhap.getText();
        NguoiChoi admin = new NguoiChoi();
        boolean isTenDangNhap = admin.nguoiChoiCoTonTaiHayKhong(tenDN);
        if(!isTenDangNhap){
            JOptionPane.showMessageDialog(this, "Người chơi này không tồn tại!", 
                 "Thông báo!",JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
        // Hỏi j đó
        Object[] options = { "yes", "no"};
        int luaChon = JOptionPane.showOptionDialog(
        this,
        "Bạn chắc chắn muốn xóa người chơi này không?",
        "Thông báo!",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]
        );
        if(luaChon == 0){
            String tendangNhap= txtTenDangNhap.getText();
            NguoiChoi admin2 = new NguoiChoi();
            admin2.xoaMotNguoiChoi(tendangNhap);
            JOptionPane.showMessageDialog(this, "Xóa người chơi "+ tendangNhap +" thành công!", 
                 "Thông báo!",JOptionPane.INFORMATION_MESSAGE);      
            txtTenDangNhap.setText(""); 
        }else{
            return;
        }
           
    }//GEN-LAST:event_btnXoaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}

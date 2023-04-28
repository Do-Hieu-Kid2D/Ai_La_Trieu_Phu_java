package src_View;

import javax.swing.JOptionPane;

public class ManHinhKhoiDong extends javax.swing.JFrame {

    public static ManHinhKhoiDong doiTuongManHinhKhoiDong;

    public ManHinhKhoiDong() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhKhoiDong = new javax.swing.JPanel();
        panl3NutKhoiDong = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 552));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panlManHinhKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 522));
        panlManHinhKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 522));
        panlManHinhKhoiDong.setOpaque(false);
        panlManHinhKhoiDong.setPreferredSize(new java.awt.Dimension(1000, 522));
        panlManHinhKhoiDong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panl3NutKhoiDong.setBackground(new java.awt.Color(0, 0, 0));
        panl3NutKhoiDong.setOpaque(false);
        panl3NutKhoiDong.setLayout(new java.awt.GridLayout(3, 1, 45, 60));

        btnDangNhap.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/log-in.png"))); // NOI18N
        btnDangNhap.setText(" Đăng Nhập");
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnDangNhap);

        btnDangKy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/write.png"))); // NOI18N
        btnDangKy.setText("   Đăng ký");
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnDangKy);

        btnThoat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/switch.png"))); // NOI18N
        btnThoat.setText("  Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnThoat);

        panlManHinhKhoiDong.add(panl3NutKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 230, 310));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panlManHinhKhoiDong.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panlManHinhKhoiDong);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed

        //Ấn vào nút đăng ký -> ẩn màn chính đi
        doiTuongManHinhKhoiDong.setVisible(false);
        // gọi màn hình đăng ký lên
        ManHinhDangKy doituongManHinhDangKy = new ManHinhDangKy();
        doituongManHinhDangKy.setLocationRelativeTo(null);
        doituongManHinhDangKy.setVisible(true);


    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        // Tương tự với đăng ký - đây là đăng nhập
        doiTuongManHinhKhoiDong.setVisible(false);
        ManHinhDangNhap doiTuongManHinhDangKy = new ManHinhDangNhap();
        doiTuongManHinhDangKy.setLocationRelativeTo(null);
        doiTuongManHinhDangKy.setVisible(true);

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        
        // Khi người chơi ấn thoát - show 1 dilog hỏi 
        Object[] options = {"yes", "no"};
        int selection = JOptionPane.showOptionDialog(
                this,
                "Bạn có muốn thoát hay không?",
                "Thông báo!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        if (selection == 0) {
            this.setVisible(false);
            this.dispose(); //Destroy the JFrame object
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                doiTuongManHinhKhoiDong = new ManHinhKhoiDong();
                doiTuongManHinhKhoiDong.setLocationRelativeTo(null);
                doiTuongManHinhKhoiDong.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JPanel panl3NutKhoiDong;
    private javax.swing.JPanel panlManHinhKhoiDong;
    // End of variables declaration//GEN-END:variables
}

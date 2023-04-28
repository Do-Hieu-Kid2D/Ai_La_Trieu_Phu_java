package src_View;

import javax.swing.JOptionPane;
import src_module.NguoiChoi;

public class ManHinhQuyenNguoiChoi extends javax.swing.JFrame {

    NguoiChoi nguoiChoiDaDangNhap;

    public ManHinhQuyenNguoiChoi(NguoiChoi nguoiChoiThat) {
        initComponents();
        nguoiChoiDaDangNhap = nguoiChoiThat;
        labTenNguoiChoi.setText(nguoiChoiDaDangNhap.getTenNguoiChoi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhKhoiDong = new javax.swing.JPanel();
        panl3NutKhoiDong = new javax.swing.JPanel();
        btnChoiNgay = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnIntu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labTenNguoiChoi = new javax.swing.JLabel();
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
        panl3NutKhoiDong.setLayout(new java.awt.GridLayout(4, 1, 45, 60));

        btnChoiNgay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnChoiNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/go.png"))); // NOI18N
        btnChoiNgay.setText("Chơi Ngay");
        btnChoiNgay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChoiNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiNgayActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnChoiNgay);

        btnDangXuat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/logout.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnDangXuat);

        btnThoat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/switch.png"))); // NOI18N
        btnThoat.setText(" Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnThoat);

        btnIntu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnIntu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/personal-information-icon.png"))); // NOI18N
        btnIntu.setText(" in Tư");
        btnIntu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntuActionPerformed(evt);
            }
        });
        panl3NutKhoiDong.add(btnIntu);

        panlManHinhKhoiDong.add(panl3NutKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 230, 410));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/user-icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        labTenNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        labTenNguoiChoi.setForeground(new java.awt.Color(255, 255, 255));
        labTenNguoiChoi.setText("UserName");
        jPanel1.add(labTenNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, 40));

        panlManHinhKhoiDong.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 90));

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

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

        // Người chơi muốn đăng xuất -> hỏi kỹ lại
        // Đăng xuất thì gọi thằng PaPa lên
        Object[] options = {"yes", "no"};
        int selection = JOptionPane.showOptionDialog(
                this,
                "Bạn có muốn đăng xuất hay không?",
                "Thông báo!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        if (selection == 0) {
            ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
            this.dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnChoiNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoiNgayActionPerformed

        // Khi người chơi chọn "chơi ngay" thì gọi màn chắc chưa để zui zẻ!
        ManHinhChoiGameChacChua manHinhChoiGame = new ManHinhChoiGameChacChua(nguoiChoiDaDangNhap);
        manHinhChoiGame.setLocationRelativeTo(null);
        manHinhChoiGame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChoiNgayActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed

        // Khi người chơi ấn thoát - show 1 dilog hỏi 
        // Thoát khác với đăng xuất là THOÁT -> đóng chương trình luôn 
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
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnIntuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntuActionPerformed
        InfoNguoiChoi ifo = new InfoNguoiChoi(nguoiChoiDaDangNhap);
        this.setVisible(false);
        ifo.setLocationRelativeTo(null);
        ifo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIntuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoiNgay;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnIntu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labTenNguoiChoi;
    private javax.swing.JPanel panl3NutKhoiDong;
    private javax.swing.JPanel panlManHinhKhoiDong;
    // End of variables declaration//GEN-END:variables
}

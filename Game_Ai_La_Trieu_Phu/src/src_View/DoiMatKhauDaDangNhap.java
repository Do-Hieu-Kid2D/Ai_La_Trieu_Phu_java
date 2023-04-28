package src_View;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import src_module.NguoiChoi;

public class DoiMatKhauDaDangNhap extends javax.swing.JFrame {

    private NguoiChoi nguoiChoi;

    public DoiMatKhauDaDangNhap(NguoiChoi nguoiChoi) {
        initComponents();
        this.nguoiChoi = nguoiChoi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhKhoiDong = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
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

        panDatLaiMatKhau.setBackground(new java.awt.Color(102, 255, 102));
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
        jPanel4.add(btnThayDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 40));

        txtMatKhauMoiNhapLai.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jPanel4.add(txtMatKhauMoiNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 40));

        txtMatKhauMoi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jPanel4.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Quay lại...");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, -1));

        panDatLaiMatKhau.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 290));

        panlManHinhKhoiDong.add(panDatLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 400, 370));

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

    private void btnThayDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiMatKhauActionPerformed
        String matKhau = String.valueOf(txtMatKhauMoi.getPassword());
        String matKhauNhapLai = String.valueOf(txtMatKhauMoiNhapLai.getPassword());
        if (matKhau.equals(matKhauNhapLai)) {
            if (matKhauNhapLai.equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu!",
                        "Thông báo!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            NguoiChoi admin = new NguoiChoi();
            nguoiChoi.setMatKhau(matKhau);
            admin.xoaMotNguoiChoi(nguoiChoi.getTenDangNhap());
            admin.themMotNguoiChoi(nguoiChoi);
            JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu tài khoản thành công!",
                    "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            InfoNguoiChoi ifo = new InfoNguoiChoi(nguoiChoi);
            ifo.setVisible(true);
            ifo.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không đúng!",
                    "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnThayDoiMatKhauActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        InfoNguoiChoi ifo = new InfoNguoiChoi(nguoiChoi);
        ifo.setVisible(true);
        ifo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThayDoiMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JPanel panDatLaiMatKhau;
    private javax.swing.JPanel panlManHinhKhoiDong;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauMoiNhapLai;
    // End of variables declaration//GEN-END:variables
}

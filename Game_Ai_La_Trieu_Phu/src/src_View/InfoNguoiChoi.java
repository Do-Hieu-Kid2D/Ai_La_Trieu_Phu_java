package src_View;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import src_module.CheckInputEmail;
import src_module.NguoiChoi;

public class InfoNguoiChoi extends javax.swing.JFrame {

    private NguoiChoi nguoiChoi;

    public InfoNguoiChoi(NguoiChoi nguoiChoi) {
        initComponents();
        this.nguoiChoi = nguoiChoi;
        this.canGiuaCell();
        this.LoadIntu(nguoiChoi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhKhoiDong = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabIntu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnThayDoi = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();
        btnXemBangThanhTich = new javax.swing.JButton();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setText("THÔNG TIN CỦA BẠN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btnQuayLai.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/quaylai.png"))); // NOI18N
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 50));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabIntu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tabIntu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabIntu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên người chơi", "Tên đăng nhập", "Mật khẩu", "Email", "Thành tích"
            }
        ));
        tabIntu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabIntu.setRowHeight(37);
        tabIntu.setRowMargin(5);
        jScrollPane1.setViewportView(tabIntu);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 60));

        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 40, 20));

        btnThayDoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/exchange.png"))); // NOI18N
        btnThayDoi.setText("Thay đổi mật khẩu");
        btnThayDoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });
        jPanel5.add(btnThayDoi);

        btnEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/exchange.png"))); // NOI18N
        btnEmail.setText("Thay đổi email");
        btnEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });
        jPanel5.add(btnEmail);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 410, 60));

        btnXemBangThanhTich.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXemBangThanhTich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/view-icon.png"))); // NOI18N
        btnXemBangThanhTich.setText("Điểm cao");
        btnXemBangThanhTich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemBangThanhTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemBangThanhTichActionPerformed(evt);
            }
        });
        jPanel4.add(btnXemBangThanhTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 210, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 350));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, 370));

        panlManHinhKhoiDong.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 650, 440));

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

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        ManHinhQuyenNguoiChoi mh = new ManHinhQuyenNguoiChoi(nguoiChoi);
        this.setVisible(false);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        DoiMatKhauDaDangNhap dmk = new DoiMatKhauDaDangNhap(nguoiChoi);
        this.setVisible(false);
        dmk.setVisible(true);
        dmk.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnThayDoiActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        String txtEmai = JOptionPane.showInputDialog(rootPane, "\n   Nhập email mới của bạn!   \n");
        if (txtEmai != null) {
            if (checkFomatEmail(txtEmai)) {
                NguoiChoi admin = new NguoiChoi();
                nguoiChoi.setEmail(txtEmai);
                admin.xoaMotNguoiChoi(nguoiChoi.getTenDangNhap());
                admin.themMotNguoiChoi(nguoiChoi);
                JOptionPane.showMessageDialog(this, "Thay đổi email thành công!",
                        "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
                InfoNguoiChoi ifo = new InfoNguoiChoi(nguoiChoi);
                this.setVisible(false);
                ifo.setVisible(true);
                ifo.setLocationRelativeTo(null);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Email không đúng định dạng!",
                    "Thông báo!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            return;
        }

    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnXemBangThanhTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemBangThanhTichActionPerformed
        NguoiChoi admin = new NguoiChoi();
        ArrayList<NguoiChoi> data = new ArrayList<>();
        data = admin.layTatCaNguoiChoi();
        int diemMax = 0;
        NguoiChoi kq = new NguoiChoi();
        for (NguoiChoi item : data) {
            if(item.getDiemSo()>diemMax){
                kq=item;
            }
        }
        
        JOptionPane.showMessageDialog(rootPane, "Người chơi điểm cao nhất hiện tại là:\n"
                + kq.getTenNguoiChoi()+": "+kq.getDiemSo()+" VNĐ\n","Thông báo!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnXemBangThanhTichActionPerformed

    private boolean checkFomatEmail(String email) {
        CheckInputEmail admin = new CheckInputEmail();
        if (!admin.validate(email.trim())) {
            return false;
        }
        return true;
    }

    public void LoadIntu(NguoiChoi nguoiChoi) {
        NguoiChoi admin = new NguoiChoi();
        NguoiChoi oke = admin.layNguoiChoiQuaTenDN(nguoiChoi.getTenDangNhap());
        DefaultTableModel model = (DefaultTableModel) tabIntu.getModel();
        String tenNguoiChoi = oke.getTenNguoiChoi();
        String tenDangNhap = oke.getTenDangNhap();
        String matKhau = oke.getMatKhau();
        String email = oke.getEmail();
        String diemSoString = oke.getDiemSo() + "";
        model.addRow(new Object[]{tenNguoiChoi, tenDangNhap, matKhau, email, diemSoString});
    }

    public void canGiuaCell() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabIntu.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabIntu.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabIntu.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tabIntu.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tabIntu.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JButton btnXemBangThanhTich;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JPanel panlManHinhKhoiDong;
    private javax.swing.JTable tabIntu;
    // End of variables declaration//GEN-END:variables
}

package src_View;

import javax.swing.JOptionPane;
import src_module.NguoiChoi;

public class FrameChuaTrieuPhu extends javax.swing.JFrame {

    String tienKhiTRaLoiDung;
    NguoiChoi nguoiChoi;
    boolean traLoiSai;
    String tienKhiTraLoiSai;
    ManHinhChoiGameThat mhPAPA;

    public FrameChuaTrieuPhu(NguoiChoi nguoiChoi, String tienThuong, int soCauDaVuotQua, boolean traLoiSai, ManHinhChoiGameThat mhPAPA) {
        initComponents();
        this.labTenNguoiChoi.setText(nguoiChoi.getTenNguoiChoi());
        this.tienKhiTRaLoiDung = tienThuong;
        this.nguoiChoi = nguoiChoi;
        this.traLoiSai = traLoiSai;
        this.mhPAPA = mhPAPA;
        if (traLoiSai) {
            if (soCauDaVuotQua < 5) {
                tienKhiTraLoiSai = "000 VNĐ";
                this.labTienThuong.setText(tienKhiTraLoiSai);
            }
            if (soCauDaVuotQua >= 5 && soCauDaVuotQua < 10) {
                tienKhiTraLoiSai = "1000.000 VNĐ";
                this.labTienThuong.setText(tienKhiTraLoiSai);
            }
            if (soCauDaVuotQua >= 10 && soCauDaVuotQua < 15) {
                tienKhiTraLoiSai = "14.000.000 VNĐ";
                this.labTienThuong.setText(tienKhiTraLoiSai);
            }
        } else {
            this.labTienThuong.setText(tienThuong + " VNĐ");
        }
        if(traLoiSai){
            
        labChu.setText("Bạn đã vượt qua " + soCauDaVuotQua + " câu hỏi! Số tiền thưởng " + tienKhiTraLoiSai);
        }else{
             labChu.setText("Bạn đã vượt qua " + soCauDaVuotQua + " câu hỏi! Số tiền thưởng " + tienKhiTRaLoiDung +" VNĐ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labTienThuong = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labChu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnoke = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labTenNguoiChoi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ai Là Trệu Phú");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        labTienThuong.setBackground(new java.awt.Color(255, 51, 51));
        labTienThuong.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        labTienThuong.setForeground(new java.awt.Color(255, 255, 255));
        labTienThuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTienThuong.setText("VND");
        jPanel3.add(labTienThuong);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 60, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 70, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 60, 60));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        labChu.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        labChu.setForeground(new java.awt.Color(51, 204, 0));
        labChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labChu.setText("Bạn chưa thể chinh phục 150.000.000! ");
        labChu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(labChu);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 500, 40));

        btnoke.setBackground(new java.awt.Color(255, 255, 153));
        btnoke.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnoke.setText("Oke!");
        btnoke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnoke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnoke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 140, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/user-icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 60));

        labTenNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labTenNguoiChoi.setForeground(new java.awt.Color(255, 255, 255));
        labTenNguoiChoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTenNguoiChoi.setText("nguoi choi");
        jPanel1.add(labTenNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 50, 190, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/trumCuoi.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 500, 410));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/fireworks-icon.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 60, 60));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokeActionPerformed
        if (traLoiSai) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chúng tôi sẽ cộng tiền thưởng " + tienKhiTraLoiSai + "  vào tài khoản của bạn :> !\n                           => Trở về màn hình chính! <=",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Chúng tôi sẽ cộng tiền thưởng " + tienKhiTRaLoiDung + " VNĐ vào tài khoản của bạn :> !\n                           => Trở về màn hình chính! <=",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        }
        this.setVisible(false);
        mhPAPA.setVisible(false);
        mhPAPA.dispose();
        ManHinhQuyenNguoiChoi mh = new ManHinhQuyenNguoiChoi(nguoiChoi);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnokeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnoke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labChu;
    private javax.swing.JLabel labTenNguoiChoi;
    private javax.swing.JLabel labTienThuong;
    // End of variables declaration//GEN-END:variables
}

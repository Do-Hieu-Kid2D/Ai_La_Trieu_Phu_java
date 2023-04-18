
package src_View;
import javax.swing.JOptionPane;
import src_module.NguoiChoi;

public class FrameTrieuPhu extends javax.swing.JFrame {

    NguoiChoi nguoiChoi;
    ManHinhChoiGameThat mhPAPA;
    public FrameTrieuPhu(NguoiChoi nc, ManHinhChoiGameThat mh) {
        initComponents();
        labTenNguoiChoi.setText(nc.getTenNguoiChoi());
        nguoiChoi = nc;
        mhPAPA = mh;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labTenNguoiChoi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ai Là Trệu Phú");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  150.000.000 VNĐ");
        jPanel3.add(jLabel4);

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

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CHÚC MỪNG BẠN! TRIỆU PHÚ CỦA CHÚNG TA");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel11);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 500, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Quá OKE :>");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JOptionPane.showMessageDialog(rootPane, 
                 "Chúng tôi sẽ cộng tiền thưởng 150.000.000 VNĐ vào tài khoản của bạn :> !\n                              => Trở về màn hình chính! <=",
                "Thông báo", JOptionPane.INFORMATION_MESSAGE);
       this.setVisible(false);
        mhPAPA.setVisible(false);
        mhPAPA.dispose();
        ManHinhQuyenNguoiChoi mh = new ManHinhQuyenNguoiChoi(nguoiChoi);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel labTenNguoiChoi;
    // End of variables declaration//GEN-END:variables
}

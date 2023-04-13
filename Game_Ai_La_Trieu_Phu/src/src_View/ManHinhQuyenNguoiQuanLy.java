
package src_View;

import javax.swing.JOptionPane;


public class ManHinhQuyenNguoiQuanLy extends javax.swing.JFrame {
    

    public ManHinhQuyenNguoiQuanLy() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panManHinhNguoiQuanLy = new javax.swing.JPanel();
        panQuyen = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panMauNenThaoTac = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panThaoTac = new javax.swing.JPanel();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 552));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panManHinhNguoiQuanLy.setMaximumSize(new java.awt.Dimension(1000, 522));
        panManHinhNguoiQuanLy.setMinimumSize(new java.awt.Dimension(1000, 522));
        panManHinhNguoiQuanLy.setOpaque(false);
        panManHinhNguoiQuanLy.setPreferredSize(new java.awt.Dimension(1000, 522));
        panManHinhNguoiQuanLy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panQuyen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panHeader.setBackground(new java.awt.Color(102, 255, 102));
        panHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255)));
        panHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("QUYỀN ADMIN!");
        panHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, -1));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton1.setText("Đăng xuất");
        panHeader.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 110, -1));

        panQuyen.add(panHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jSeparator1.setBackground(new java.awt.Color(102, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 204, 0));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        panQuyen.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 10));

        panMauNenThaoTac.setBackground(new java.awt.Color(102, 255, 102));
        panMauNenThaoTac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Thêm câu hỏi");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Quản lý người chơi");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        panMauNenThaoTac.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 30));

        panThaoTac.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        panThaoTac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panMauNenThaoTac.add(panThaoTac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 700, 340));

        panQuyen.add(panMauNenThaoTac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 380));

        panManHinhNguoiQuanLy.add(panQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 750, 460));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panManHinhNguoiQuanLy.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panManHinhNguoiQuanLy);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panManHinhNguoiQuanLy;
    private javax.swing.JPanel panMauNenThaoTac;
    private javax.swing.JPanel panQuyen;
    private javax.swing.JPanel panThaoTac;
    // End of variables declaration//GEN-END:variables
}

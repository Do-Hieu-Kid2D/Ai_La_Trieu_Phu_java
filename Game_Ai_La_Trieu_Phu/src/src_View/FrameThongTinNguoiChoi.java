package src_View;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import src_module.NguoiChoi;

public class FrameThongTinNguoiChoi extends javax.swing.JFrame {
    NguoiChoi nguoiChoiDaDangNhap;    
    
    public FrameThongTinNguoiChoi(NguoiChoi NC ) {
        initComponents();
        Font bigFont = new Font("Dialog", Font.BOLD, 14); 
        tabTatCaNguoiChoi.getTableHeader().setFont(bigFont);
        this.canGiuaCell();
        this.taiNguoiChoiLenTable();
        nguoiChoiDaDangNhap = NC;
        this.themMotDongTable(NC);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabTatCaNguoiChoi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setText("THÔNG TIN NGƯỜI CHƠI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btnQuayLai.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/quaylai.png"))); // NOI18N
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabTatCaNguoiChoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tabTatCaNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabTatCaNguoiChoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên người chơi", "Tên đăng nhập", "Mật khẩu", "Email", "Thành tích"
            }
        ));
        tabTatCaNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabTatCaNguoiChoi.setRowHeight(25);
        tabTatCaNguoiChoi.setRowMargin(5);
        jScrollPane1.setViewportView(tabTatCaNguoiChoi);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 320));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 610, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed
    
    
    public void themMotDongTable(NguoiChoi nguoiChoi){
        DefaultTableModel model = (DefaultTableModel) tabTatCaNguoiChoi.getModel();
        String tenNguoiChoi = nguoiChoi.getTenNguoiChoi();
        String tenDangNhap= nguoiChoi.getTenDangNhap();
        String matKhau=  nguoiChoi.getMatKhau();
        String email=  nguoiChoi.getEmail();
        String diemSoString=  nguoiChoi.getDiemSo()+"";
        model.addRow(new Object[]{tenNguoiChoi,tenDangNhap,matKhau,email,diemSoString});
    }
    public void taiNguoiChoiLenTable(){
        
        
        
    }
    
    private void canGiuaCell() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tabTatCaNguoiChoi.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tabTatCaNguoiChoi.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tabTatCaNguoiChoi.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tabTatCaNguoiChoi.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        tabTatCaNguoiChoi.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabTatCaNguoiChoi;
    // End of variables declaration//GEN-END:variables

}

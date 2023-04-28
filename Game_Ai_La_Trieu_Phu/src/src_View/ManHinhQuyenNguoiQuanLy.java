
package src_View;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import src_module.*;

public class ManHinhQuyenNguoiQuanLy extends javax.swing.JFrame {
    
    CauHoi adminCauHoi;
    public ManHinhQuyenNguoiQuanLy( NguoiQuanLy nguoiQuanLy) {
        initComponents();
        adminCauHoi = new CauHoi(); 
        Font bigFont = new Font("Dialog", Font.BOLD, 16); 
        tabNguoichoiCXT.getTableHeader().setFont(bigFont);
        this.canGiuaCell();
        this.taiNguoiChoiLenTable();
        tabNguoichoiCXT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        labTenAmind.setText(nguoiQuanLy.getTenNguoiQuanLy());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panManHinhNguoiQuanLy = new javax.swing.JPanel();
        panQuyen = new javax.swing.JPanel();
        labTenAmind = new javax.swing.JLabel();
        panHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panMauNenThaoTac = new javax.swing.JPanel();
        jtabQuyenNguoiQuanLy = new javax.swing.JTabbedPane();
        jtabCauHoi = new javax.swing.JPanel();
        btnThemCauHoi = new javax.swing.JButton();
        labCauHoi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCauHoi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        labDapAnDung = new javax.swing.JLabel();
        labDapAnSai1 = new javax.swing.JLabel();
        labDapAnSai2 = new javax.swing.JLabel();
        labDapAnSai3 = new javax.swing.JLabel();
        txtDapAnSai3 = new javax.swing.JTextField();
        txtDapAnSai2 = new javax.swing.JTextField();
        txtDapAnSai1 = new javax.swing.JTextField();
        txtDapAnDung = new javax.swing.JTextField();
        jtabNguoiChoi = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTatCaNguoiChoi = new javax.swing.JButton();
        btnThemNguoiChoi = new javax.swing.JButton();
        btnXoaNguoiChoi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnXacNhanNCXCT = new javax.swing.JButton();
        btnXoaNCCXT = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabNguoichoiCXT = new javax.swing.JTable();
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

        labTenAmind.setBackground(new java.awt.Color(102, 255, 102));
        labTenAmind.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        labTenAmind.setText("Admin");
        labTenAmind.setToolTipText("");
        labTenAmind.setFocusTraversalPolicyProvider(true);
        labTenAmind.setOpaque(true);
        panQuyen.add(labTenAmind, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        panHeader.setBackground(new java.awt.Color(102, 255, 102));
        panHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        panHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("QUYỀN ADMIN!");
        panHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, -1));

        btnDangXuat.setBackground(new java.awt.Color(102, 204, 0));
        btnDangXuat.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        panHeader.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 110, -1));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/Administrator-icon.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        panHeader.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        panQuyen.add(panHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jSeparator1.setBackground(new java.awt.Color(102, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 204, 0));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        panQuyen.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 10));

        panMauNenThaoTac.setBackground(new java.awt.Color(102, 255, 102));
        panMauNenThaoTac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        panMauNenThaoTac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtabQuyenNguoiQuanLy.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtabQuyenNguoiQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtabQuyenNguoiQuanLy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jtabCauHoi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtabCauHoi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabCauHoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemCauHoi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnThemCauHoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/add-icon.png"))); // NOI18N
        btnThemCauHoi.setText("Thêm câu hỏi");
        btnThemCauHoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCauHoiActionPerformed(evt);
            }
        });
        jtabCauHoi.add(btnThemCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, 40));

        labCauHoi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labCauHoi.setText("Câu hỏi:");
        jtabCauHoi.add(labCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        txtCauHoi.setColumns(20);
        txtCauHoi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCauHoi.setRows(5);
        jScrollPane1.setViewportView(txtCauHoi);

        jtabCauHoi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 500, 50));

        jPanel1.setLayout(new java.awt.GridLayout(4, 1, 5, 5));

        labDapAnDung.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labDapAnDung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labDapAnDung.setText("Đáp án đúng:");
        labDapAnDung.setToolTipText("");
        jPanel1.add(labDapAnDung);

        labDapAnSai1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labDapAnSai1.setText("Đáp án sai 1:");
        jPanel1.add(labDapAnSai1);

        labDapAnSai2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labDapAnSai2.setText("Đáp án sai 2:");
        jPanel1.add(labDapAnSai2);

        labDapAnSai3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labDapAnSai3.setText("Đáp án sai 3:");
        jPanel1.add(labDapAnSai3);

        jtabCauHoi.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 200));

        txtDapAnSai3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jtabCauHoi.add(txtDapAnSai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 500, 40));

        txtDapAnSai2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jtabCauHoi.add(txtDapAnSai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 500, 40));

        txtDapAnSai1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jtabCauHoi.add(txtDapAnSai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 500, 40));

        txtDapAnDung.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jtabCauHoi.add(txtDapAnDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 500, 40));

        jtabQuyenNguoiQuanLy.addTab("Quản lý câu hỏi", jtabCauHoi);

        jtabNguoiChoi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtabNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabNguoiChoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 40, 40));

        btnTatCaNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTatCaNguoiChoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/view-icon.png"))); // NOI18N
        btnTatCaNguoiChoi.setText("Tất cả người chơi");
        btnTatCaNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTatCaNguoiChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTatCaNguoiChoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnTatCaNguoiChoi);

        btnThemNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnThemNguoiChoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/add-user-icon.png"))); // NOI18N
        btnThemNguoiChoi.setText("Thêm người chơi");
        btnThemNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemNguoiChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNguoiChoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemNguoiChoi);

        btnXoaNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXoaNguoiChoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/remove-user-icon.png"))); // NOI18N
        btnXoaNguoiChoi.setText("Xóa người chơi");
        btnXoaNguoiChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNguoiChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNguoiChoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoaNguoiChoi);

        jtabNguoiChoi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 260, 270));

        jtabQuyenNguoiQuanLy.addTab("Quản lý người chơi", jtabNguoiChoi);

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 70, 0));

        btnXacNhanNCXCT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnXacNhanNCXCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/Ok-icon.png"))); // NOI18N
        btnXacNhanNCXCT.setText("XÁC NHẬN");
        btnXacNhanNCXCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhanNCXCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanNCXCTActionPerformed(evt);
            }
        });
        jPanel4.add(btnXacNhanNCXCT);

        btnXoaNCCXT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnXoaNCCXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/Close-icon.png"))); // NOI18N
        btnXoaNCCXT.setText("XÓA");
        btnXoaNCCXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNCCXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanNCXCTActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoaNCCXT);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, 50));

        tabNguoichoiCXT.setBorder(new javax.swing.border.MatteBorder(null));
        tabNguoichoiCXT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tabNguoichoiCXT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên người chơi", "Tên đăng nhập", "Mật khẩu", "Email"
            }
        ));
        tabNguoichoiCXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabNguoichoiCXT.setFocusCycleRoot(true);
        tabNguoichoiCXT.setFocusTraversalPolicyProvider(true);
        tabNguoichoiCXT.setGridColor(new java.awt.Color(102, 102, 102));
        tabNguoichoiCXT.setName(""); // NOI18N
        tabNguoichoiCXT.setRowHeight(25);
        tabNguoichoiCXT.setRowMargin(5);
        tabNguoichoiCXT.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tabNguoichoiCXT.setShowGrid(true);
        jScrollPane3.setViewportView(tabNguoichoiCXT);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 520, 230));

        jtabQuyenNguoiQuanLy.addTab("Xác nhận đăng ký", jPanel3);

        panMauNenThaoTac.add(jtabQuyenNguoiQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 370));

        panQuyen.add(panMauNenThaoTac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 380));

        panManHinhNguoiQuanLy.add(panQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 750, 460));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/nenVaoChoi.png"))); // NOI18N
        labNenManKhoiDong.setText("jLabel1");
        labNenManKhoiDong.setMaximumSize(new java.awt.Dimension(1000, 552));
        labNenManKhoiDong.setMinimumSize(new java.awt.Dimension(1000, 552));
        panManHinhNguoiQuanLy.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 552));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panManHinhNguoiQuanLy);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     private void canGiuaCell() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tabNguoichoiCXT.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tabNguoichoiCXT.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tabNguoichoiCXT.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tabNguoichoiCXT.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
    }
    public void themMotDongTable(NguoiChoiChuaXacThuc nguoiChoi){
        DefaultTableModel model = (DefaultTableModel) tabNguoichoiCXT.getModel();
        String tenNguoiChoi = nguoiChoi.getTenNguoiChoi();
        String tenDangNhap= nguoiChoi.getTenDangNhap();
        String matKhau=  nguoiChoi.getMatKhau();
        String email=  nguoiChoi.getEmail();
        model.addRow(new Object[]{tenNguoiChoi,tenDangNhap,matKhau,email});
    }
    public void taiNguoiChoiLenTable(){
        NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
        ArrayList<NguoiChoiChuaXacThuc> data = admin.layTatCaNguoiChoiCXT();
        for (NguoiChoiChuaXacThuc item : data) {
            themMotDongTable(item);
        }
    }
    
    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        
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
        if(selection == 0){
            ManHinhKhoiDong.doiTuongManHinhKhoiDong.setVisible(true);
            this.dispose();
        }else{
            return;
        }
                                     
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTatCaNguoiChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTatCaNguoiChoiActionPerformed
        FrameTatCaNguoiChoi frameTatCaNguoiChoi = new FrameTatCaNguoiChoi();
        frameTatCaNguoiChoi.setVisible(true);
        frameTatCaNguoiChoi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTatCaNguoiChoiActionPerformed
    private boolean batLoi(String noiDung, String dapAnDung,String dapAnSai1,String dapAnSai2,String dapAnSai3){
        if(noiDung.equals("") || dapAnDung.equals("")|| dapAnSai1.equals("") 
                || dapAnSai2.equals("") || dapAnSai3.equals("")){
            
            if(noiDung.equals("")){
                labCauHoi.setForeground(Color.red);
            }else{
                labCauHoi.setForeground(Color.BLACK);
            }
            if(dapAnDung.equals("")){
                labDapAnDung.setForeground(Color.red);
            }else{
                labDapAnDung.setForeground(Color.BLACK);
            }
            if(dapAnSai1.equals("")){
                labDapAnSai1.setForeground(Color.red);
            }else{
                labDapAnSai1.setForeground(Color.BLACK);
            }
            if(dapAnSai2.equals("")){
                labDapAnSai2.setForeground(Color.red);
            }else{
                labDapAnSai2.setForeground(Color.BLACK);
            }
            if(dapAnSai3.equals("")){
                labDapAnSai3.setForeground(Color.red);
            }else{
                labDapAnSai3.setForeground(Color.BLACK);
            }
            
            return true;
        }
        return false;
    }
    private void setLaiMau(){
        labCauHoi.setForeground(Color.BLACK);
        labDapAnDung.setForeground(Color.BLACK);
        labDapAnSai1.setForeground(Color.BLACK);
        labDapAnSai2.setForeground(Color.BLACK);
        labDapAnSai3.setForeground(Color.BLACK);

    }
    
    private void btnThemCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCauHoiActionPerformed
     
        String id = adminCauHoi.soLuongCauHoi();
        String noiDung = txtCauHoi.getText().trim();
        String dapAnDung = txtDapAnDung.getText().trim();
        String dapAnSai1 = txtDapAnSai1.getText().trim();
        String dapAnSai2 = txtDapAnSai2.getText().trim();
        String dapAnSai3 = txtDapAnSai3.getText().trim();
        if(this.batLoi(noiDung,dapAnDung,dapAnSai1,dapAnSai2,dapAnSai3)){
           JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin!", 
            "Thông báo!",JOptionPane.ERROR_MESSAGE);

        }else{
            this.setLaiMau();
            adminCauHoi.themMotCauHoi(new CauHoi(id, noiDung, dapAnDung, dapAnSai1, dapAnSai2, dapAnSai3));
            JOptionPane.showMessageDialog(this, "Thêm câu hỏi thành công!", 
                "Thông báo!",JOptionPane.INFORMATION_MESSAGE);
            txtCauHoi.setText("");
            txtDapAnDung.setText("");
            txtDapAnSai1.setText("");
            txtDapAnSai2.setText("");
            txtDapAnSai3.setText("");
        }
    }//GEN-LAST:event_btnThemCauHoiActionPerformed

    private void btnThemNguoiChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNguoiChoiActionPerformed
        FrameThemNguoiChoi frameThemNguoiChoi = new FrameThemNguoiChoi();
        frameThemNguoiChoi.setVisible(true);
        frameThemNguoiChoi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnThemNguoiChoiActionPerformed

    private void btnXoaNguoiChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNguoiChoiActionPerformed
        FrameXoaNguoiChoi frameXoaNguoiChoi = new FrameXoaNguoiChoi();
        frameXoaNguoiChoi.setVisible(true);
        frameXoaNguoiChoi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnXoaNguoiChoiActionPerformed

    private void btnXacNhanNCXCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanNCXCTActionPerformed
        
        // Lấy data từ dòng đang chọn lưu vào 1 mảng!
        int row = tabNguoichoiCXT.getSelectedRow();
        if(row<0){
            return;
        }
        DefaultTableModel model = (DefaultTableModel) this.tabNguoichoiCXT.getModel();
        String[] arrdata = new String[4]; 
        for(int i= 0 ; i<4 ;i++){
        arrdata[i] = tabNguoichoiCXT.getModel().getValueAt(row, i).toString();
        }
        model.removeRow(row);
        
        // Nếu xác nhận thì lưu Người chơi xuống file!
        String cmd = evt.getActionCommand();
        if(cmd.equals("XÁC NHẬN")){
            NguoiChoi adminNguoiChoi = new NguoiChoi();
            adminNguoiChoi.themMotNguoiChoi(new NguoiChoi(arrdata[0],arrdata[1],arrdata[2],arrdata[3],0));
            NguoiChoiChuaXacThuc adminChuaXacThuc = new NguoiChoiChuaXacThuc();
            adminChuaXacThuc.xoaMotNguoiChoiCXT(arrdata[1]);
        }else{
            NguoiChoiChuaXacThuc adminChuaXacThuc = new NguoiChoiChuaXacThuc();
            adminChuaXacThuc.xoaMotNguoiChoiCXT(arrdata[1]);
        }
    }//GEN-LAST:event_btnXacNhanNCXCTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnTatCaNguoiChoi;
    private javax.swing.JButton btnThemCauHoi;
    private javax.swing.JButton btnThemNguoiChoi;
    private javax.swing.JButton btnXacNhanNCXCT;
    private javax.swing.JButton btnXoaNCCXT;
    private javax.swing.JButton btnXoaNguoiChoi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jtabCauHoi;
    private javax.swing.JPanel jtabNguoiChoi;
    private javax.swing.JTabbedPane jtabQuyenNguoiQuanLy;
    private javax.swing.JLabel labCauHoi;
    private javax.swing.JLabel labDapAnDung;
    private javax.swing.JLabel labDapAnSai1;
    private javax.swing.JLabel labDapAnSai2;
    private javax.swing.JLabel labDapAnSai3;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labTenAmind;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panManHinhNguoiQuanLy;
    private javax.swing.JPanel panMauNenThaoTac;
    private javax.swing.JPanel panQuyen;
    private javax.swing.JTable tabNguoichoiCXT;
    private javax.swing.JTextArea txtCauHoi;
    private javax.swing.JTextField txtDapAnDung;
    private javax.swing.JTextField txtDapAnSai1;
    private javax.swing.JTextField txtDapAnSai2;
    private javax.swing.JTextField txtDapAnSai3;
    // End of variables declaration//GEN-END:variables
}

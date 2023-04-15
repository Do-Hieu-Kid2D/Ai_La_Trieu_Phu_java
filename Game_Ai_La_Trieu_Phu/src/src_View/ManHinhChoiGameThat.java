
package src_View;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import src_module.NguoiChoi;
import src_module.CauHoi;

public class ManHinhChoiGameThat extends javax.swing.JFrame {
     NguoiChoi nguoiChoiDaDangNhap;

    public ManHinhChoiGameThat(NguoiChoi nguoiChoiThat) {
        initComponents();
        canGiuaTXTLable(labCauHoiTriGia);
        canGiuaTXTLable(labTienCuaBan);
        nguoiChoiDaDangNhap = nguoiChoiThat;  
        labTenNguoiChoi.setText(nguoiChoiDaDangNhap.getTenNguoiChoi());
        this.taiCauHoiLen();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhChoiGameThat = new javax.swing.JPanel();
        panNguoiChoi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        labTenNguoiChoi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        labCauHoiTriGia = new javax.swing.JLabel();
        labTienCuaBan = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panTienThuong = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panCauHoi = new javax.swing.JPanel();
        panChuaCauHoi = new javax.swing.JPanel();
        labNoiDungCauHoi = new javax.swing.JLabel();
        panCauTraLoi = new javax.swing.JPanel();
        labCauA = new javax.swing.JLabel();
        labCauB = new javax.swing.JLabel();
        labCauC = new javax.swing.JLabel();
        labCauD = new javax.swing.JLabel();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panlManHinhChoiGameThat.setMaximumSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setMinimumSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setOpaque(false);
        panlManHinhChoiGameThat.setPreferredSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panNguoiChoi.setBackground(new java.awt.Color(255, 0, 153));
        panNguoiChoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));
        panNguoiChoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/user-icon.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 60));

        labTenNguoiChoi.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        labTenNguoiChoi.setText("UserName");
        jPanel1.add(labTenNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 30));

        panNguoiChoi.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jPanel2.setBackground(new java.awt.Color(248, 249, 178));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Câu hỏi trị giá:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labCauHoiTriGia.setBackground(new java.awt.Color(255, 204, 204));
        labCauHoiTriGia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labCauHoiTriGia.setText("1.000");
        labCauHoiTriGia.setOpaque(true);
        jPanel2.add(labCauHoiTriGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 40));

        labTienCuaBan.setBackground(new java.awt.Color(102, 204, 0));
        labTienCuaBan.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labTienCuaBan.setText("1.000");
        labTienCuaBan.setOpaque(true);
        jPanel2.add(labTienCuaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setText("Tiền của bạn:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/dungchoi-icon.png"))); // NOI18N
        jButton3.setText("Dừng chơi");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        panNguoiChoi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 240));

        jPanel4.setBackground(new java.awt.Color(248, 249, 178));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel23.setText("Trợ giúp:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/50-50.jpg"))); // NOI18N
        jButton1.setText("50/50");
        jButton1.setToolTipText("Loại bỏ hai đáp án sai");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/phone-icon.png"))); // NOI18N
        jButton2.setText("CALL");
        jButton2.setToolTipText("Gọi điện nhận tư vấn");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        panNguoiChoi.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 160));

        panlManHinhChoiGameThat.add(panNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 540));

        panTienThuong.setBackground(new java.awt.Color(204, 0, 153));
        panTienThuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 3));
        panTienThuong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("TIỀN THƯỞNG $");
        jLabel1.setOpaque(true);
        panTienThuong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 20));

        jPanel3.setBackground(new java.awt.Color(188, 45, 169));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(15, 1));

        jLabel2.setBackground(new java.awt.Color(234, 228, 41));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" 15.   150.000.000");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" 14.    85.000.000");
        jPanel3.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" 13.    40.000.000");
        jPanel3.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" 12.    30.000.000");
        jPanel3.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" 11.    22.000.000");
        jPanel3.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(234, 228, 41));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" 10.    14.000.000");
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" 9.     10.000.000");
        jPanel3.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" 8.      6.000.000");
        jPanel3.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" 7.      3.000.000");
        jPanel3.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" 6.      2.000.000");
        jPanel3.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(234, 228, 41));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" 5.      1.000.000");
        jLabel12.setOpaque(true);
        jPanel3.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" 4.        800.000");
        jPanel3.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" 3.        600.000");
        jPanel3.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" 2.        400.000");
        jPanel3.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" 1.        200.000");
        jPanel3.add(jLabel16);

        panTienThuong.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 480));
        panTienThuong.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 160, -1));

        panlManHinhChoiGameThat.add(panTienThuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 160, 540));

        panCauHoi.setOpaque(false);
        panCauHoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panChuaCauHoi.setBackground(new java.awt.Color(165, 43, 175));
        panChuaCauHoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labNoiDungCauHoi.setBackground(new java.awt.Color(153, 153, 255));
        labNoiDungCauHoi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labNoiDungCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labNoiDungCauHoi.setText("Câu hỏi: Demo song chưa>>?>??>?>>>>>>>>dư9d9qydgqcgc9hqw9h9wh9cwhc9hwq98hc98");
        labNoiDungCauHoi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labNoiDungCauHoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 5));
        labNoiDungCauHoi.setOpaque(true);
        panChuaCauHoi.add(labNoiDungCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 110));

        panCauHoi.add(panChuaCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 130));

        panCauTraLoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panCauTraLoi.setOpaque(false);
        panCauTraLoi.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        labCauA.setBackground(new java.awt.Color(153, 153, 255));
        labCauA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauA.setText("jLabel25");
        labCauA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauA.setOpaque(true);
        panCauTraLoi.add(labCauA);

        labCauB.setBackground(new java.awt.Color(153, 153, 255));
        labCauB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauB.setText("jLabel21");
        labCauB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauB.setOpaque(true);
        panCauTraLoi.add(labCauB);

        labCauC.setBackground(new java.awt.Color(153, 153, 255));
        labCauC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauC.setText("jLabel24");
        labCauC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauC.setOpaque(true);
        panCauTraLoi.add(labCauC);

        labCauD.setBackground(new java.awt.Color(153, 153, 255));
        labCauD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauD.setText("jLabel26");
        labCauD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauD.setOpaque(true);
        panCauTraLoi.add(labCauD);

        panCauHoi.add(panCauTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 530, 150));

        panlManHinhChoiGameThat.add(panCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 630, 320));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/anhChoigame.jpg"))); // NOI18N
        labNenManKhoiDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panlManHinhChoiGameThat.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panlManHinhChoiGameThat);

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    public static void canGiuaTXTLable(JLabel lb){
        // Hàm này để căn giữa chữ cho TXT trong lable
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setVerticalAlignment(SwingConstants.CENTER);
    }
    
    public void hienThongTin(JLabel lb, String txt){
        StringBuilder sb = new StringBuilder(64);
        sb.append("<html>").
            append(txt).
            append("</html>");
        lb.setText(sb.toString());
        
    }
    public void taiCauHoiLen(){
        CauHoi admind = new CauHoi();
        CauHoi cauHoiHienTai = admind.randomCauHoi();
        String noiDung = cauHoiHienTai.getNoiDung();
        String dapAnDung = cauHoiHienTai.getDapAnDung();
        String dapAnSai1 = cauHoiHienTai.getDapAnSai1();
        String dapAnSai2 = cauHoiHienTai.getDapAnSai2();
        String dapAnSai3 = cauHoiHienTai.getDapAnSai3();
//        System.out.println(noiDung);
//        System.out.println(dapAnDung);
//        System.out.println(dapAnSai1);
//        System.out.println(dapAnSai2);
//        System.out.println(dapAnSai3);
       
        this.hienThongTin(labNoiDungCauHoi, "Câu hỏi: "+ noiDung);
        this.hienThongTin(labCauA, "A. "+ dapAnDung);
        this.hienThongTin(labCauB, "B. "+ dapAnSai1);
        this.hienThongTin(labCauC, "C. "+ dapAnSai2);
        this.hienThongTin(labCauD, "D. "+ dapAnSai3);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labCauA;
    private javax.swing.JLabel labCauB;
    private javax.swing.JLabel labCauC;
    private javax.swing.JLabel labCauD;
    private javax.swing.JLabel labCauHoiTriGia;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labNoiDungCauHoi;
    private javax.swing.JLabel labTenNguoiChoi;
    private javax.swing.JLabel labTienCuaBan;
    private javax.swing.JPanel panCauHoi;
    private javax.swing.JPanel panCauTraLoi;
    private javax.swing.JPanel panChuaCauHoi;
    private javax.swing.JPanel panNguoiChoi;
    private javax.swing.JPanel panTienThuong;
    private javax.swing.JPanel panlManHinhChoiGameThat;
    // End of variables declaration//GEN-END:variables
}

package src_View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import src_module.NguoiChoi;
import src_module.CauHoi;
import src_module.PhatNhac;

public class ManHinhChoiGameThat extends javax.swing.JFrame {

    NguoiChoi adminNguoiChoi;
    CauHoi admindCauHoi;
    NguoiChoi nguoiChoiHienTai;
    CauHoi cauHoiHienTai;
    int SoTienDangCo_So;
    int soRamDom;
    Color colorMoveEdit;
    Color colorDefault;
    Color colorDung;
    Color colorSai;
    Color colorBorder;
    int soCauDaVuotQua = 0;
    boolean lockA;
    boolean lockB;
    boolean lockC;
    boolean lockD;
    FrameTrieuPhu trieuPhu;
    FrameChuaTrieuPhu chuaTrieuPhu;
    String soTienDangCo_String = "0";
    ArrayList<JLabel> thangTien = new ArrayList<>();
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;

    @SuppressWarnings("empty-statement")
    public ManHinhChoiGameThat(NguoiChoi nguoiChoiThat) {
        initComponents();
        canGiuaTXTLable(labCauHoiTriGia);
        canGiuaTXTLable(labTienCuaBan);
        adminNguoiChoi = new NguoiChoi();
        nguoiChoiHienTai = nguoiChoiThat;
        labTenNguoiChoi.setText(nguoiChoiHienTai.getTenNguoiChoi());
        admindCauHoi = new CauHoi();
        this.taiCauHoiLen();
        colorMoveEdit = labGetColor.getBackground();
        colorDefault = labNoiDungCauHoi.getBackground();
        colorSai = lbvien.getBackground();
        colorDung = labTienCuaBan.getBackground();
        colorBorder = panChuaCauHoi.getBackground();
        JLabel[] tempJLabel = new JLabel[]{thang1, thang2, thang3, thang4, thang5, thang6, thang7,
            thang8, thang9, thang10, thang11, thang12, thang13, thang14, thang15};
        this.setThangTien(tempJLabel);
        this.hienThiTien();
        this.setLaiBoder();
        timeFormat = new SimpleDateFormat("hh:mm:ss");
        dateFormat = new SimpleDateFormat("EEE, dd-MM-YYYY");

        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                String gio = timeFormat.format(Calendar.getInstance().getTime());
                txtGio.setText(gio);
                String day = dateFormat.format(Calendar.getInstance().getTime());
                txtNgay.setText(day);
            }
        }, 1, 1000);

        try {
            PhatNhac n = new PhatNhac();
            n.phatNhacdvn();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panlManHinhChoiGameThat = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtGio = new javax.swing.JLabel();
        txtNgay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panNguoiChoi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        labTenNguoiChoi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        labCauHoiTriGia = new javax.swing.JLabel();
        labTienCuaBan = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnDungCuocChoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btn5050 = new javax.swing.JButton();
        btnCall = new javax.swing.JButton();
        panTienThuong = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        thang15 = new javax.swing.JLabel();
        thang14 = new javax.swing.JLabel();
        thang13 = new javax.swing.JLabel();
        thang12 = new javax.swing.JLabel();
        thang11 = new javax.swing.JLabel();
        thang10 = new javax.swing.JLabel();
        thang9 = new javax.swing.JLabel();
        thang8 = new javax.swing.JLabel();
        thang7 = new javax.swing.JLabel();
        thang6 = new javax.swing.JLabel();
        thang5 = new javax.swing.JLabel();
        thang4 = new javax.swing.JLabel();
        thang3 = new javax.swing.JLabel();
        thang2 = new javax.swing.JLabel();
        thang1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panCauHoi = new javax.swing.JPanel();
        panChuaCauHoi = new javax.swing.JPanel();
        labNoiDungCauHoi = new javax.swing.JLabel();
        panCauTraLoi = new javax.swing.JPanel();
        labCauA = new javax.swing.JLabel();
        labCauB = new javax.swing.JLabel();
        labCauC = new javax.swing.JLabel();
        labCauD = new javax.swing.JLabel();
        lbvien = new javax.swing.JLabel();
        labGetColor = new javax.swing.JLabel();
        labNenManKhoiDong = new javax.swing.JLabel();
        labColorBoder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panlManHinhChoiGameThat.setMaximumSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setMinimumSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setOpaque(false);
        panlManHinhChoiGameThat.setPreferredSize(new java.awt.Dimension(1000, 560));
        panlManHinhChoiGameThat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtGio.setForeground(new java.awt.Color(255, 255, 255));
        txtGio.setText("Giờ");
        jPanel5.add(txtGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        txtNgay.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtNgay.setForeground(new java.awt.Color(255, 255, 255));
        txtNgay.setText("Ngày");
        jPanel5.add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 120, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AI LÀ TRIỆU PHÚ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 110, 20));

        panlManHinhChoiGameThat.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 80));

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

        btnDungCuocChoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDungCuocChoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/dungchoi-icon.png"))); // NOI18N
        btnDungCuocChoi.setText("Dừng chơi");
        btnDungCuocChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDungCuocChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDungCuocChoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnDungCuocChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        panNguoiChoi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 240));

        jPanel4.setBackground(new java.awt.Color(248, 249, 178));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel23.setText("Trợ giúp:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn5050.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn5050.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/5050.png"))); // NOI18N
        btn5050.setText("50/50");
        btn5050.setToolTipText("Loại bỏ hai đáp án sai");
        btn5050.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5050ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5050, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnCall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/phone-icon.png"))); // NOI18N
        btnCall.setText("CALL");
        btnCall.setToolTipText("Gọi điện nhận tư vấn");
        btnCall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallActionPerformed(evt);
            }
        });
        jPanel4.add(btnCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        panNguoiChoi.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 160));

        panlManHinhChoiGameThat.add(panNguoiChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 540));

        panTienThuong.setBackground(new java.awt.Color(204, 0, 204));
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

        thang15.setBackground(new java.awt.Color(234, 228, 41));
        thang15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        thang15.setForeground(new java.awt.Color(255, 255, 255));
        thang15.setText(" 15.   150.000.000");
        thang15.setName("thang15"); // NOI18N
        thang15.setOpaque(true);
        jPanel3.add(thang15);

        thang14.setBackground(new java.awt.Color(153, 0, 153));
        thang14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang14.setForeground(new java.awt.Color(255, 255, 255));
        thang14.setText(" 14.    85.000.000");
        thang14.setName("thang14"); // NOI18N
        thang14.setOpaque(true);
        jPanel3.add(thang14);

        thang13.setBackground(new java.awt.Color(153, 0, 153));
        thang13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang13.setForeground(new java.awt.Color(255, 255, 255));
        thang13.setText(" 13.    40.000.000");
        thang13.setName("thang13"); // NOI18N
        thang13.setOpaque(true);
        jPanel3.add(thang13);

        thang12.setBackground(new java.awt.Color(153, 0, 153));
        thang12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang12.setForeground(new java.awt.Color(255, 255, 255));
        thang12.setText(" 12.    30.000.000");
        thang12.setName("thang12"); // NOI18N
        thang12.setOpaque(true);
        jPanel3.add(thang12);

        thang11.setBackground(new java.awt.Color(153, 0, 153));
        thang11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang11.setForeground(new java.awt.Color(255, 255, 255));
        thang11.setText(" 11.    22.000.000");
        thang11.setName("thang11"); // NOI18N
        thang11.setOpaque(true);
        jPanel3.add(thang11);

        thang10.setBackground(new java.awt.Color(234, 228, 41));
        thang10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        thang10.setForeground(new java.awt.Color(255, 255, 255));
        thang10.setText(" 10.    14.000.000");
        thang10.setName("thang10"); // NOI18N
        thang10.setOpaque(true);
        jPanel3.add(thang10);

        thang9.setBackground(new java.awt.Color(153, 0, 153));
        thang9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang9.setForeground(new java.awt.Color(255, 255, 255));
        thang9.setText(" 9.     10.000.000");
        thang9.setName("thang9"); // NOI18N
        thang9.setOpaque(true);
        jPanel3.add(thang9);

        thang8.setBackground(new java.awt.Color(153, 0, 153));
        thang8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang8.setForeground(new java.awt.Color(255, 255, 255));
        thang8.setText(" 8.      6.000.000");
        thang8.setName("thang8"); // NOI18N
        thang8.setOpaque(true);
        jPanel3.add(thang8);

        thang7.setBackground(new java.awt.Color(153, 0, 153));
        thang7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang7.setForeground(new java.awt.Color(255, 255, 255));
        thang7.setText(" 7.      3.000.000");
        thang7.setName("thang7"); // NOI18N
        thang7.setOpaque(true);
        jPanel3.add(thang7);

        thang6.setBackground(new java.awt.Color(153, 0, 153));
        thang6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang6.setForeground(new java.awt.Color(255, 255, 255));
        thang6.setText(" 6.      2.000.000");
        thang6.setName("thang6"); // NOI18N
        thang6.setOpaque(true);
        jPanel3.add(thang6);

        thang5.setBackground(new java.awt.Color(234, 228, 41));
        thang5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        thang5.setForeground(new java.awt.Color(255, 255, 255));
        thang5.setText(" 5.      1.000.000");
        thang5.setName("thang5"); // NOI18N
        thang5.setOpaque(true);
        jPanel3.add(thang5);

        thang4.setBackground(new java.awt.Color(153, 0, 153));
        thang4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang4.setForeground(new java.awt.Color(255, 255, 255));
        thang4.setText(" 4.        800.000");
        thang4.setName("thang4"); // NOI18N
        thang4.setOpaque(true);
        jPanel3.add(thang4);

        thang3.setBackground(new java.awt.Color(153, 0, 153));
        thang3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang3.setForeground(new java.awt.Color(255, 255, 255));
        thang3.setText(" 3.        600.000");
        thang3.setName("thang3"); // NOI18N
        thang3.setOpaque(true);
        jPanel3.add(thang3);

        thang2.setBackground(new java.awt.Color(153, 0, 153));
        thang2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang2.setForeground(new java.awt.Color(255, 255, 255));
        thang2.setText(" 2.        400.000");
        thang2.setName("thang2"); // NOI18N
        thang2.setOpaque(true);
        jPanel3.add(thang2);

        thang1.setBackground(new java.awt.Color(153, 0, 153));
        thang1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        thang1.setForeground(new java.awt.Color(255, 255, 255));
        thang1.setText(" 1.        200.000");
        thang1.setName("thang1"); // NOI18N
        thang1.setOpaque(true);
        jPanel3.add(thang1);

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
        labNoiDungCauHoi.setText("Câu hỏi: ");
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
        labCauA.setText("A");
        labCauA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauA.setOpaque(true);
        labCauA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCauAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCauAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCauAMouseExited(evt);
            }
        });
        panCauTraLoi.add(labCauA);

        labCauB.setBackground(new java.awt.Color(153, 153, 255));
        labCauB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauB.setText("B");
        labCauB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauB.setOpaque(true);
        labCauB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCauBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCauBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCauBMouseExited(evt);
            }
        });
        panCauTraLoi.add(labCauB);

        labCauC.setBackground(new java.awt.Color(153, 153, 255));
        labCauC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauC.setText("C");
        labCauC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauC.setOpaque(true);
        labCauC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCauCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCauCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCauCMouseExited(evt);
            }
        });
        panCauTraLoi.add(labCauC);

        labCauD.setBackground(new java.awt.Color(153, 153, 255));
        labCauD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labCauD.setText("D");
        labCauD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 43, 175), 6, true));
        labCauD.setOpaque(true);
        labCauD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCauDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCauDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCauDMouseExited(evt);
            }
        });
        panCauTraLoi.add(labCauD);

        panCauHoi.add(panCauTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 530, 150));

        panlManHinhChoiGameThat.add(panCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 630, 320));

        lbvien.setBackground(new java.awt.Color(255, 102, 0));
        lbvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/clock-icon.png"))); // NOI18N
        panlManHinhChoiGameThat.add(lbvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, 30));

        labGetColor.setBackground(new java.awt.Color(224, 191, 224));
        panlManHinhChoiGameThat.add(labGetColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 80, 50));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/anhChoigame.jpg"))); // NOI18N
        labNenManKhoiDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panlManHinhChoiGameThat.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        labColorBoder.setBackground(new java.awt.Color(153, 153, 255));
        labColorBoder.setText("jLabel2");
        panlManHinhChoiGameThat.add(labColorBoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        getContentPane().add(panlManHinhChoiGameThat);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labCauAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauAMouseClicked
        if (!lockA) {
            String dataCauA = labCauA.getName();
            String cauTraLoi = dataCauA.replace("A. ", "");
            this.suLyCauTraLoi(cauTraLoi);
        }
    }//GEN-LAST:event_labCauAMouseClicked

    public void luuNguoiChoiXuong() {
        NguoiChoi nguoiThang = new NguoiChoi(nguoiChoiHienTai.getTenNguoiChoi(), nguoiChoiHienTai.getTenDangNhap(),
                nguoiChoiHienTai.getMatKhau(), nguoiChoiHienTai.getEmail(), SoTienDangCo_So);
        adminNguoiChoi.xoaMotNguoiChoi(nguoiThang.getTenDangNhap());
        adminNguoiChoi.themMotNguoiChoi(nguoiThang);
    }

    public void chuyenVeManQuyenNguoiChoi() {
        ManHinhQuyenNguoiChoi mh = new ManHinhQuyenNguoiChoi(nguoiChoiHienTai);
        mh.setVisible(true);
        mh.setLocationRelativeTo(null);
    }

    private void labCauAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauAMouseEntered
        labCauA.setBackground(colorMoveEdit);

    }//GEN-LAST:event_labCauAMouseEntered

    private void labCauAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauAMouseExited
        labCauA.setBackground(colorDefault);

    }//GEN-LAST:event_labCauAMouseExited

    private void labCauBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauBMouseExited
        labCauB.setBackground(colorDefault);
    }//GEN-LAST:event_labCauBMouseExited

    private void labCauBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauBMouseEntered
        labCauB.setBackground(colorMoveEdit);
    }//GEN-LAST:event_labCauBMouseEntered

    private void labCauCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauCMouseEntered
        labCauC.setBackground(colorMoveEdit);
    }//GEN-LAST:event_labCauCMouseEntered

    private void labCauCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauCMouseExited
        labCauC.setBackground(colorDefault);
    }//GEN-LAST:event_labCauCMouseExited

    private void labCauDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauDMouseExited
        labCauD.setBackground(colorDefault);
    }//GEN-LAST:event_labCauDMouseExited

    private void labCauDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauDMouseEntered
        labCauD.setBackground(colorMoveEdit);
    }//GEN-LAST:event_labCauDMouseEntered

    private void labCauBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauBMouseClicked
        if (!lockB) {
            String dataCauB = labCauB.getName();
            String cauTraLoi = dataCauB.replace("B. ", "");
            this.suLyCauTraLoi(cauTraLoi);
        }
    }//GEN-LAST:event_labCauBMouseClicked

    private void labCauDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauDMouseClicked
        if (!lockD) {
            String dataCauD = labCauD.getName();
            String cauTraLoi = dataCauD.replace("D. ", "");
            this.suLyCauTraLoi(cauTraLoi);
        }
    }//GEN-LAST:event_labCauDMouseClicked

    private void btn5050ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5050ActionPerformed
        if (soRamDom == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Máy tính đã bỏ đi 2 phương án sai là:\n\t                   B và D",
                    "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.labCauB.setText("");
            this.lockB = true;
            this.labCauD.setText("");
            this.lockD = true;
        } else if (soRamDom == 1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Máy tính đã bỏ đi 2 phương án sai là:\n\t                  A và C",
                    "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.labCauA.setText("");
            this.lockA = true;
            this.labCauC.setText("");
            this.lockC = true;
        } else if (soRamDom == 2) {
            JOptionPane.showMessageDialog(rootPane,
                    "Máy tính đã bỏ đi 2 phương án sai là:\n\t                   B và D",
                    "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.labCauB.setText("");
            this.lockB = true;
            this.labCauD.setText("");
            this.lockD = true;
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Máy tính đã bỏ đi 2 phương án sai là:\n                     A và C",
                    "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            this.labCauA.setText("");
            this.lockA = true;
            this.labCauC.setText("");
            this.lockC = true;
        }
        btn5050.setEnabled(false);
    }//GEN-LAST:event_btn5050ActionPerformed

    private void btnCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallActionPerformed
        String dapAnDung = cauHoiHienTai.getDapAnDung();
        String troGiup = "";
        if (soRamDom == 0) {
            troGiup = "A. " + dapAnDung;
        }
        if (soRamDom == 1) {
            troGiup = "B. " + dapAnDung;
        }
        if (soRamDom == 2) {
            troGiup = "C. " + dapAnDung;
        }
        if (soRamDom == 3) {
            troGiup = "D. " + dapAnDung;
        }
        JOptionPane.showMessageDialog(rootPane,
                "Người thân đã trợ giúp cho bạn câu trả lời là:\n   " + troGiup,
                "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCallActionPerformed

    private void labCauCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCauCMouseClicked
        if (!lockC) {
            String dataCauC = labCauC.getName();
            String cauTraLoi = dataCauC.replace("C. ", "");
            this.suLyCauTraLoi(cauTraLoi);
        }

    }//GEN-LAST:event_labCauCMouseClicked

    private void btnDungCuocChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungCuocChoiActionPerformed
        Object[] options = {"yes", "no"};
        int selection = JOptionPane.showOptionDialog(
                this,
                "Nếu bạn dừng lại, bạn sẽ nhận được " + soTienDangCo_String + " VNĐ\n  Bạn chấp nhận dừng cuộc chơi?",
                "Thông báo!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        if (selection == 0) {
            this.luuNguoiChoiXuong();
            this.setLaiCVaD();
            this.dungCuocChoiRoi(false);
            if (!trieuPhu.isDisplayable()) {
                this.setVisible(false);
                this.dispose();
            }
        } else {
            return;
        }

    }//GEN-LAST:event_btnDungCuocChoiActionPerformed

    public void cotMocQuanTrong() {
        if (soCauDaVuotQua == 4) {
            JOptionPane.showMessageDialog(rootPane, "   Bạn đã đến câu hỏi số 5,\n Đây là cột mốc quan trọng.\n Chúc bạn may mắn!",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (soCauDaVuotQua == 9) {
            JOptionPane.showMessageDialog(rootPane, "   Bạn đã đến câu hỏi số 10,\n Đây là cột mốc quan trọng.\n Chúc bạn may mắn!",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (soCauDaVuotQua == 14) {
            JOptionPane.showMessageDialog(rootPane,
                    "  Bạn đã đến câu hỏi CUỐI CÙNG.\n Liệu rằng hôm nay chúng ta có thể tìm được \"Ai là TRIỆU PHÚ\"!",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void suLyCauTraLoi(String cauTraLoi) {
        if (this.isDapAnDung(cauTraLoi)) {
            soCauDaVuotQua++;
            soTienDangCo_String = admindCauHoi.thangtienThuong_String[soCauDaVuotQua];
            SoTienDangCo_So = admindCauHoi.thangtienThuong_So[soCauDaVuotQua];
            if (soCauDaVuotQua < 15) {
                JOptionPane.showMessageDialog(rootPane, "Câu trả lời CHÍNH XÁC! \nChúc mừng bạn đã vượt qua câu hỏi số " + soCauDaVuotQua,
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            this.hienThiTien();
            if (soCauDaVuotQua == 15) {
                this.luuNguoiChoiXuong();
                this.setLaiCVaD();
                this.banLaTrieuPhu();
                if (!trieuPhu.isDisplayable()) {
                    this.setVisible(false);
                    this.dispose();
                }
            }
            this.taiCauHoiLen();
            this.setMauThangCauHoi();
            this.cotMocQuanTrong();
        } else {
            // SAI 
            labCauA.setBackground(colorSai);
            this.luuNguoiChoiXuong();
            this.setLaiCVaD();
            this.dungCuocChoiRoi(true);
            if (!trieuPhu.isDisplayable()) {
                this.setVisible(false);
                this.dispose();
            }
        }
    }

    private boolean isDapAnDung(String cauTraLoi) {
        String dapAnDung = cauHoiHienTai.getDapAnDung();
        if (dapAnDung.equals(cauTraLoi)) {
            return true;
        }
        return false;
    }

    public void hienThiTien() {
        labCauHoiTriGia.setText(admindCauHoi.thangtienThuong_String[soCauDaVuotQua + 1]);
        labTienCuaBan.setText(admindCauHoi.thangtienThuong_String[soCauDaVuotQua]);
    }

    public void setThangTien(JLabel[] data) {
        for (int i = 0; i < data.length; i++) {
            thangTien.add(data[i]);
        }
    }

    public void setMauThangCauHoi() {

        String tenThangCauHoiCanSet = "thang" + soCauDaVuotQua;
        for (JLabel item : thangTien) {
            if (item.getName().equals(tenThangCauHoiCanSet)) {
                item.setBackground(colorDung);
            }
        }
        if (soCauDaVuotQua == 5) {
            thang5.setBackground(Color.orange);
            thang5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/flag-green-icon.png")));
            thang5.setText(" 5.  1.000.000");
        }
        if (soCauDaVuotQua == 10) {
            thang10.setBackground(Color.orange);
            thang10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/flag-green-icon.png")));
            thang10.setText("10. 14.000.000");
        }
        if (soCauDaVuotQua == 15) {
            thang15.setBackground(Color.red);
            thang15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/flag-green-icon.png")));
            thang15.setText("15. 150.000.000");
        }

    }

    public void setLaiBoder() {
        labCauC.setBorder(BorderFactory.createLineBorder(colorBorder, 6));
        labCauA.setBorder(BorderFactory.createLineBorder(colorBorder, 6));
        labCauB.setBorder(BorderFactory.createLineBorder(colorBorder, 6));
        labCauD.setBorder(BorderFactory.createLineBorder(colorBorder, 6));

    }

    @Override
    protected void processFocusEvent(FocusEvent e) {
        super.processFocusEvent(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    private void setLaiCVaD(){
        labCauC.setText("");
        labCauD.setText("");
    }
    public static void canGiuaTXTLable(JLabel lb) {
        // Hàm này để căn giữa chữ cho TXT trong lable
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setVerticalAlignment(SwingConstants.CENTER);
    }

    public void hienThongTin(JLabel lb, String txt) {

        StringBuilder sb = new StringBuilder(64);
        sb.append("<html>").
                append(txt).
                append("</html>");
        lb.setText(sb.toString());
        lb.setName(txt);

    }

    public void banLaTrieuPhu() {
        trieuPhu = new FrameTrieuPhu(nguoiChoiHienTai, this);
        trieuPhu.setVisible(true);
        trieuPhu.setLocationRelativeTo(null);

    }

    public void dungCuocChoiRoi(boolean traLoiSai) {
        chuaTrieuPhu = new FrameChuaTrieuPhu(nguoiChoiHienTai, soTienDangCo_String, soCauDaVuotQua, traLoiSai, this);
        chuaTrieuPhu.setVisible(true);
        chuaTrieuPhu.setLocationRelativeTo(null);
    }

    public void taiCauHoiLen() {
        lockA = lockB = lockC = lockD = false;
        cauHoiHienTai = admindCauHoi.randomCauHoi();
        String noiDung = cauHoiHienTai.getNoiDung();
        String dapAnDung = cauHoiHienTai.getDapAnDung();
        String dapAnSai1 = cauHoiHienTai.getDapAnSai1();
        String dapAnSai2 = cauHoiHienTai.getDapAnSai2();
        String dapAnSai3 = cauHoiHienTai.getDapAnSai3();
        this.setLaiBoder();

        this.hienThongTin(labNoiDungCauHoi, "Câu hỏi: " + noiDung);
        Random rd = new Random();
        soRamDom = rd.nextInt(0, 4);
        if (soRamDom == 0) {
            this.hienThongTin(labCauA, "A. " + dapAnDung);
            this.hienThongTin(labCauB, "B. " + dapAnSai1);
            this.hienThongTin(labCauC, "C. " + dapAnSai2);
            this.hienThongTin(labCauD, "D. " + dapAnSai3);
        } else if (soRamDom == 1) {
            this.hienThongTin(labCauA, "A. " + dapAnSai1);
            this.hienThongTin(labCauB, "B. " + dapAnDung);
            this.hienThongTin(labCauC, "C. " + dapAnSai2);
            this.hienThongTin(labCauD, "D. " + dapAnSai3);
        } else if (soRamDom == 2) {
            this.hienThongTin(labCauA, "A. " + dapAnSai1);
            this.hienThongTin(labCauB, "B. " + dapAnSai2);
            this.hienThongTin(labCauC, "C. " + dapAnDung);
            this.hienThongTin(labCauD, "D. " + dapAnSai3);
        } else {
            this.hienThongTin(labCauA, "A. " + dapAnSai1);
            this.hienThongTin(labCauB, "B. " + dapAnSai2);
            this.hienThongTin(labCauC, "C. " + dapAnSai3);
            this.hienThongTin(labCauD, "D. " + dapAnDung);
        }

    }

//    public static void main(String[] args) {
//        NguoiChoi n = new NguoiChoi();
//            ManHinhChoiGameThat m = new ManHinhChoiGameThat(n);
//        m.setVisible(true);
//        m.setLocationRelativeTo(null);
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5050;
    private javax.swing.JButton btnCall;
    private javax.swing.JButton btnDungCuocChoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labCauA;
    private javax.swing.JLabel labCauB;
    private javax.swing.JLabel labCauC;
    private javax.swing.JLabel labCauD;
    public javax.swing.JLabel labCauHoiTriGia;
    private javax.swing.JLabel labColorBoder;
    private javax.swing.JLabel labGetColor;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JLabel labNoiDungCauHoi;
    private javax.swing.JLabel labTenNguoiChoi;
    public javax.swing.JLabel labTienCuaBan;
    private javax.swing.JLabel lbvien;
    private javax.swing.JPanel panCauHoi;
    private javax.swing.JPanel panCauTraLoi;
    private javax.swing.JPanel panChuaCauHoi;
    private javax.swing.JPanel panNguoiChoi;
    private javax.swing.JPanel panTienThuong;
    private javax.swing.JPanel panlManHinhChoiGameThat;
    private javax.swing.JLabel thang1;
    private javax.swing.JLabel thang10;
    private javax.swing.JLabel thang11;
    private javax.swing.JLabel thang12;
    private javax.swing.JLabel thang13;
    private javax.swing.JLabel thang14;
    private javax.swing.JLabel thang15;
    private javax.swing.JLabel thang2;
    private javax.swing.JLabel thang3;
    private javax.swing.JLabel thang4;
    private javax.swing.JLabel thang5;
    private javax.swing.JLabel thang6;
    private javax.swing.JLabel thang7;
    private javax.swing.JLabel thang8;
    private javax.swing.JLabel thang9;
    private javax.swing.JLabel txtGio;
    private javax.swing.JLabel txtNgay;
    // End of variables declaration//GEN-END:variables

}

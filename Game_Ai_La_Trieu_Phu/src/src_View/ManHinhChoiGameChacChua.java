
package src_View;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.ElementScanner14;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ManHinhChoiGameChacChua extends javax.swing.JFrame {


    public ManHinhChoiGameChacChua() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLoaiNguoiChoi = new javax.swing.ButtonGroup();
        panlManHinhDangNhap = new javax.swing.JPanel();
        panSanSangChua = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSanSang = new javax.swing.JButton();
        btnDoiXiu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labNenManKhoiDong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ai Là Triệu Phú");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panlManHinhDangNhap.setMaximumSize(new java.awt.Dimension(1000, 560));
        panlManHinhDangNhap.setMinimumSize(new java.awt.Dimension(1000, 560));
        panlManHinhDangNhap.setOpaque(false);
        panlManHinhDangNhap.setPreferredSize(new java.awt.Dimension(1000, 560));
        panlManHinhDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panSanSangChua.setToolTipText("");
        panSanSangChua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/Hoi-icon.png"))); // NOI18N
        panSanSangChua.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Bạn đã SẴN SÀNG để trở thành");
        panSanSangChua.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        btnSanSang.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnSanSang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/okay-icon.png"))); // NOI18N
        btnSanSang.setText("Sẵn sàng");
        btnSanSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanSangActionPerformed(evt);
            }
        });
        panSanSangChua.add(btnSanSang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 60));

        btnDoiXiu.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnDoiXiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/Stop-icon.png"))); // NOI18N
        btnDoiXiu.setText("Đợi xíu!");
        btnDoiXiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanSangActionPerformed(evt);
            }
        });
        panSanSangChua.add(btnDoiXiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("TRIỆU PHÚ?");
        panSanSangChua.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, -1));

        panlManHinhDangNhap.add(panSanSangChua, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 420, 190));

        labNenManKhoiDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_img/anhChoigame.jpg"))); // NOI18N
        panlManHinhDangNhap.add(labNenManKhoiDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));
        labNenManKhoiDong.getAccessibleContext().setAccessibleName("lableNenKhoiDong");

        getContentPane().add(panlManHinhDangNhap);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
public static void nhapNhay(JPanel pn){
    pn.setVisible(false);
    Timer timer = new Timer();	
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
             pn.setVisible(true);
        }
    };
    timer.schedule(task, 500);
}



    private void btnSanSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanSangActionPerformed
       
        String cmd = evt.getActionCommand(); 
        
        if(cmd.equals("Đợi xíu!")){
            // Khi đợi xíu - gọi hàm nhấp nháy để nháy cái pan câu hỏi này 0,5s
            this.nhapNhay(panSanSangChua);
        }       
        
       if(cmd.equals("Sẵn sàng")){  
           
        // Sẵn sàng thì vào màn chơi game chính:
        
        ManHinhChoiGameThat manHinhChoiGameThat = new ManHinhChoiGameThat();
        manHinhChoiGameThat.setLocationRelativeTo(null);
        manHinhChoiGameThat.setVisible(true);

        // And xóa cái cũ đi.
        this.dispose();
       }
  
    }//GEN-LAST:event_btnSanSangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiXiu;
    private javax.swing.JButton btnSanSang;
    private javax.swing.ButtonGroup groupLoaiNguoiChoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labNenManKhoiDong;
    private javax.swing.JPanel panSanSangChua;
    private javax.swing.JPanel panlManHinhDangNhap;
    // End of variables declaration//GEN-END:variables
}

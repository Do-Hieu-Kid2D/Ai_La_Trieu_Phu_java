
package src_module;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class NguoiChoi {
    static private String pathFoder = System.getProperty("user.dir")+"\\data_file";
    static private String pathFileData = pathFoder+"\\nguoiChoi.txt";
    private String tenNguoiChoi;
    private String tenDangNhap;
    private String matKhau;
    private String email;
    private int diemSo;

    public NguoiChoi(String tenNguoiChoi, String tenDangNhap, String matKhau, String email, int diemSo) {
        this.tenNguoiChoi = tenNguoiChoi;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.diemSo = diemSo;
    }

    public NguoiChoi(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public NguoiChoi() {
    }

    public boolean themMotNguoiChoi(NguoiChoi ng) {
        try {
            NguoiChoi admin = new NguoiChoi();
            if(admin.nguoiChoiCoTonTaiHayKhong(ng.getTenDangNhap())) {
                return false;
            }
            File f = new File(pathFoder);
            f.mkdir();
            FileWriter fw = new FileWriter(pathFileData,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ng.toString());
            bw.newLine();
            bw.flush();
            fw.flush();
            fw.close();
            bw.close();	
            return true;
        } catch (Exception e) {
             return false;
        }
    }

    public NguoiChoi soSanhTendnVaMatKhau(NguoiChoi nguoiChoi) {
        NguoiChoi kq =null;
        NguoiChoi admin = new NguoiChoi();
        ArrayList<NguoiChoi> data = new ArrayList<>();
        data = admin.layTatCaNguoiChoi();
        if(data == null){
            return null;
        }
        for (NguoiChoi item : data) {
            if(item.getTenDangNhap().equals(nguoiChoi.getTenDangNhap()) 
                    && item.getMatKhau().equals(nguoiChoi.getMatKhau())) {
                return item;
            }
        }
        return kq;
    }
    
    public NguoiChoi layNguoiChoiQuaTenDN(String tenDN) {
        NguoiChoi admin = new NguoiChoi();
        ArrayList<NguoiChoi> data = new ArrayList<>();
        data = admin.layTatCaNguoiChoi();
        if(data == null){
            return null;
        }
        for (NguoiChoi item : data) {
            if(item.getTenDangNhap().equals(tenDN)){
                return item;
            }
        }
        return null;
    }

    public ArrayList<NguoiChoi> layTatCaNguoiChoi(){
        NguoiChoi admin = new NguoiChoi();
        ArrayList<NguoiChoi> kq = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFileData,StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while(true) {
                line = br.readLine();
                if(line == null) {
                        break;
                }else {
                    String[] arrtxt = line.split("  ");					
                     String tenNguoiChoi = arrtxt[0];
                     String tenDangNhap = arrtxt[1];
                     String matKhau = arrtxt[2];
                     String email = arrtxt[3];
                     String diemSo_s = arrtxt[4];
                     int diemSo = Integer.parseInt(diemSo_s);
                     kq.add(new NguoiChoi(tenNguoiChoi, tenDangNhap, matKhau, email, diemSo));
                }
            }
            return kq;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean xoaMotNguoiChoi(String tenDN) {
        NguoiChoi admin = new NguoiChoi();
        boolean kq = false;
        ArrayList<NguoiChoi> data = new ArrayList<>();
        ArrayList<NguoiChoi> conLai = new ArrayList<>();
        data = admin.layTatCaNguoiChoi();

        for(NguoiChoi nguoiChoi : data) {
            if(nguoiChoi.getTenDangNhap().equals(tenDN)) {
                    kq= true;
                    continue;
            }else {
                    conLai.add(nguoiChoi);
            }
        }
        admin.capNhatCSDL(conLai);

        return kq;	
    }

    public void capNhatCSDL(ArrayList<NguoiChoi> nguoiChoi) {
        NguoiChoi admin = new NguoiChoi();
        admin.xoaTatCaNguoiChoi();
        for (NguoiChoi item : nguoiChoi) {
            admin.themMotNguoiChoi(item);
        }
    }

    public void xoaTatCaNguoiChoi() {
        try {
            File f = new File(pathFileData);
            PrintWriter writer = new PrintWriter(f);
            writer.print("");
            writer.close();
        } catch (IOException e) {
        }
    }

    public boolean nguoiChoiCoTonTaiHayKhong(String tenDN) {
        boolean kq = false;
        NguoiChoi admin = new NguoiChoi();
        ArrayList<NguoiChoi> data = new ArrayList<>();
        data = admin.layTatCaNguoiChoi();
        if(data == null) {
            return false;
        }
        for (NguoiChoi item : data) {
            if(item.getTenDangNhap().equals(tenDN)) {
                kq = true;
                break;
            }
        }
        return kq;
    }


    public String toString() {
        return  tenNguoiChoi+ "  " + tenDangNhap + "  " + matKhau + "  " + email + "  " + diemSo;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getTenNguoiChoi() {
        return tenNguoiChoi;
    }

    public void setTenNguoiChoi(String tenNguoiChoi) {
        this.tenNguoiChoi = tenNguoiChoi;
    }



    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }
    
    
//    public static void main(String[] args) {
//	
//	NguoiChoi ad = new NguoiChoi();
//        NguoiChoi c = new NguoiChoi("", "h2", "", "", 0);
//        System.out.println(ad.themMotNguoiChoi(c));
//               
//		
//	}
    
}
 


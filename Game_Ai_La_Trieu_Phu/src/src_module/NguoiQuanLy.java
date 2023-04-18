
package src_module;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class NguoiQuanLy {

    static private String pathFoder = System.getProperty("user.dir")+"\\data_file";
    static private String pathFileData = pathFoder+"\\nguoiQuanLy.txt";
    private String tenNguoiQuanLy;
    private String tenDangNhap;
    private String matKhau;

    public NguoiQuanLy(String tenNguoiQuanLy, String tenDangNhap, String matKhau) {
        this.tenNguoiQuanLy = tenNguoiQuanLy;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;

    }
     public NguoiQuanLy( String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;

    }

    public NguoiQuanLy() {
    }

    public void themMotNguoiQuanLy(NguoiQuanLy ng) {
        try {
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
        } catch (Exception e) {
        }
    }

    public NguoiQuanLy soSanhTendnVaMatKhau(NguoiQuanLy nguoiQuanLy) {
        NguoiQuanLy kq =null;
        NguoiQuanLy admin = new NguoiQuanLy();
        ArrayList<NguoiQuanLy> data = new ArrayList<>();
        data = admin.layTatCaNguoiQuanLy();
        for (NguoiQuanLy item : data) {
            if(item.getTenDangNhap().equals(nguoiQuanLy.getTenDangNhap()) 
                && item.getMatKhau().equals(nguoiQuanLy.getMatKhau())) {
                return item;
            }
        }
        return kq;		
    }
    
   

    public ArrayList<NguoiQuanLy> layTatCaNguoiQuanLy(){
        NguoiQuanLy admin = new NguoiQuanLy();
        ArrayList<NguoiQuanLy> kq = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFileData);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while(true) {
                line = br.readLine();
                if(line == null) {
                    break;
                }else {
                    String[] arrtxt = line.split("  ");					
                     String tenNguoiQuanLy = arrtxt[0];
                     String tenDangNhap = arrtxt[1];
                     String matKhau = arrtxt[2];
                     kq.add(new NguoiQuanLy(tenNguoiQuanLy, tenDangNhap, matKhau));
                }
                }
                return kq;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean NguoiQuanLyCoTonTaiHayKhong(String tenDN) {
        boolean kq = false;
        NguoiQuanLy admin = new NguoiQuanLy();
        ArrayList<NguoiQuanLy> data = new ArrayList<>();
        data = admin.layTatCaNguoiQuanLy();
        for (NguoiQuanLy item : data) {
            if(item.getTenDangNhap().equals(tenDN)) {
                kq = true;
                break;
            }
        }
        return kq;
    }

    public String getTenNguoiQuanLy() {
        return tenNguoiQuanLy;
    }

    public void setTenNguoiQuanLy(String tenNguoiQuanLy) {
        this.tenNguoiQuanLy = tenNguoiQuanLy;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return  tenNguoiQuanLy + "  " + tenDangNhap + "  " + matKhau;
    }
	
}

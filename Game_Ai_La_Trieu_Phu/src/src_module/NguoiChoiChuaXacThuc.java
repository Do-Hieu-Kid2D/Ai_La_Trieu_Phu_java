
package src_module;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NguoiChoiChuaXacThuc {
    static private String pathFoder = System.getProperty("user.dir")+"\\data_file";
    static private String pathFileData = pathFoder+"\\nguoiChoiChuaXacThuc.txt";
    private String tenNguoiChoi;
    private String tenDangNhap;
    private String matKhau;
    private String email;
    private boolean daXacThuc;


    public NguoiChoiChuaXacThuc(String tenNguoiChoi, String tenDangNhap, String matKhau, String email, boolean daXacThuc) {
        this.tenNguoiChoi = tenNguoiChoi;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.daXacThuc = daXacThuc;
    }


    public NguoiChoiChuaXacThuc() {	
    }


    public boolean themMotNguoiChoiCXT( NguoiChoiChuaXacThuc nguoiChoi){

        try {
            NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
            if(admin.nguoiChoiCXTCoTonTaiHayKhong(nguoiChoi.getTenDangNhap())) {
                return false;
            }
            File f = new File(pathFoder);
            f.mkdir();
            FileWriter fw = new FileWriter(pathFileData,true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(nguoiChoi.toString());
            bf.newLine();
            bf.flush();
            fw.flush();
            bf.close();
            fw.close();	
            return true;
        }catch (Exception e) {
            return false;
        }	
    }
    
    public boolean nguoiChoiCXTCoTonTaiHayKhong(String tenDN) {
        boolean kq = false;
        NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
        ArrayList<NguoiChoiChuaXacThuc> data = new ArrayList<>();
        data = admin.layTatCaNguoiChoiCXT();
        if(data == null) {
            return false;
        }
        for (NguoiChoiChuaXacThuc item : data) {
            if(item.getTenDangNhap().equals(tenDN)) {
                kq = true;
                break;
            }
        }
        return kq;
    }
    
    public ArrayList<NguoiChoiChuaXacThuc> layTatCaNguoiChoiCXT() {
        try {

            ArrayList<NguoiChoiChuaXacThuc> kq = new ArrayList<>();
            String line = null;
            FileReader fr = new FileReader(pathFileData);
            BufferedReader bf = new BufferedReader(fr);

            while(true) {
                line = bf.readLine();
                if(line==null) {
                        break;
                }
                String[] arrtxt = line.split("  ");
                String tenNguoiChoi = arrtxt[0];
                String tenDangNhap = arrtxt[1];
                String matKhau = arrtxt[2];
                String email  = arrtxt[3];
                String daXacThuc_S = arrtxt[4];
                boolean daXacThuc = daXacThuc_S.equals("true")?true:false;
                kq.add(new NguoiChoiChuaXacThuc(tenNguoiChoi, tenDangNhap, matKhau, email,daXacThuc));		
            }
            fr.close();
            bf.close();
            return kq;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean xacThucNguoiChoi(String tenDN) {
        boolean kq = false;
        NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
        ArrayList<NguoiChoiChuaXacThuc> data = new ArrayList<>();
        ArrayList<NguoiChoiChuaXacThuc> datakKQ = new ArrayList<>();
        data = admin.layTatCaNguoiChoiCXT();
        for (NguoiChoiChuaXacThuc item : data) {
            if(item.getTenDangNhap().equals(tenDN)) {
                item.setDaXacThuc(true);
                kq= true;
            }
            datakKQ.add(item);
        }
        capNhatCSDL(datakKQ);
        return kq;	
    }

    public void capNhatCSDL(ArrayList<NguoiChoiChuaXacThuc> nguoiChoi) {
            NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
            admin.xoaTatCaNguoiChoiCXT();
            for (NguoiChoiChuaXacThuc item : nguoiChoi) {
                    admin.themMotNguoiChoiCXT(item);
            }
    }

    public ArrayList<NguoiChoiChuaXacThuc> layNhungNguoiChoiDaXacThuc() {
        NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
        ArrayList<NguoiChoiChuaXacThuc> data = new ArrayList<>();
        ArrayList<NguoiChoiChuaXacThuc> dataKQOKE = new ArrayList<>();
        ArrayList<NguoiChoiChuaXacThuc> dataKQ = new ArrayList<>();
        data = admin.layTatCaNguoiChoiCXT();
        for (NguoiChoiChuaXacThuc item : data) {
            if(item.isDaXacThuc()) {
                dataKQOKE.add(item);
            }else {
                dataKQ.add(item);
            }
        }
        admin.capNhatCSDL(dataKQ);
        return dataKQOKE;
    }

    public boolean xoaMotNguoiChoiCXT(String tenDN) {
        boolean kq = false;
        NguoiChoiChuaXacThuc admin = new NguoiChoiChuaXacThuc();
        ArrayList<NguoiChoiChuaXacThuc> data = admin.layTatCaNguoiChoiCXT();
        ArrayList<NguoiChoiChuaXacThuc> conLai = new ArrayList<>();
        for (NguoiChoiChuaXacThuc item : data) {
            if(item.getTenDangNhap().equals(tenDN)) {
                kq = true;
                continue;
            }else {
                conLai.add(item);
            }	
        }
        capNhatCSDL(conLai);
        return kq;
    }

    public void xoaTatCaNguoiChoiCXT() {
        try {
            File f = new File(pathFileData);
            PrintWriter writer = new PrintWriter(f);
            writer.print("");
            writer.close();
        } catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return tenNguoiChoi+"  "+tenDangNhap +"  "+ matKhau   +"  "+ email +"  " + daXacThuc; 
    }



    public String getTenNguoiChoi() {
        return tenNguoiChoi;
    }

    public void setTenNguoiChoi(String tenNguoiChoi) {
        this.tenNguoiChoi = tenNguoiChoi;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDaXacThuc() {
        return daXacThuc;
    }

    public void setDaXacThuc(boolean daXacThuc) {
        this.daXacThuc = daXacThuc;
    }
    
//    public static void main(String[] args) {
//	
//	NguoiChoiChuaXacThuc ad = new NguoiChoiChuaXacThuc();
//        NguoiChoiChuaXacThuc c = new NguoiChoiChuaXacThuc("", "b2", "", "", false);
//        System.out.println(ad.themMotNguoiChoiCXT(c));
//               
//
//	}
}



package src_module;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class CauHoi {
    static public String[] thangtienThuong_String = {
        "0", "200.000", "400.000", "600.000", "800.000", "1.000.000", "2.000.000",
        "3.000.000", "6.000.000", "10.000.000", "14.000.000", "22.000.000", "30.000.000",
        "40.000.000", "85.000.000", "150.000.000","150.000.000"};
    static public int[] thangtienThuong_So = {
        0, 200000, 400000, 600000, 800000, 1000000, 2000000, 3000000, 6000000, 
        10000000, 14000000, 22000000, 30000000, 40000000, 85000000, 150000000};
    static private String pathFoder = System.getProperty("user.dir")+"\\data_file";
    static private String pathFileData = pathFoder+"\\cauHoi.txt";
    private String id;
    private String noiDung;
    private String dapAnDung;
    private String dapAnSai1;
    private String dapAnSai2;
    private String dapAnSai3;

    public CauHoi() {
        
    }
    
    public CauHoi(String id, String noiDung, String dapAnDung, String dapAnSai1, String dapAnSai2, String dapAnSai3) {
        this.id = id;
        this.noiDung = noiDung;
        this.dapAnDung = dapAnDung;
        this.dapAnSai1 = dapAnSai1;
        this.dapAnSai2 = dapAnSai2;
        this.dapAnSai3 = dapAnSai3;
    }

    public boolean themMotCauHoi(CauHoi ch) {
        try {
            CauHoi admin = new CauHoi();
            if(admin.CauHoiCoTonTaiHayKhong(ch.getId())) {
                return false;
            }
            File f = new File(pathFoder);
            f.mkdir();
            FileWriter fw = new FileWriter(pathFileData,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ch.toString());
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
    
    public String soLuongCauHoi(){
        int soLuong =0;
        CauHoi admin = new CauHoi();
        ArrayList<CauHoi> kq = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFileData);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while(true) {
                line = br.readLine();
                if(line == null) {
                    break;
                }else {
                    soLuong++;
                }
            }
            return soLuong+"";
        } catch (Exception e) {
        }
        return 0+"";
    }
    public ArrayList<CauHoi> layTatCaCauHoi(){
        CauHoi admin = new CauHoi();
        ArrayList<CauHoi> kq = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFileData);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while(true) {
                line = br.readLine();
                if(line == null) {
                    break;
                }else {
                    String[] arrtxt = line.split("    ");	
                    String id = arrtxt[0];
                    String noiDung = arrtxt[1];
                    String dapAnDung = arrtxt[2];
                    String dapAnSai1 = arrtxt[3];
                    String dapAnSai2 = arrtxt[4];
                    String dapAnSai3 = arrtxt[5];
                    kq.add(new CauHoi(id, noiDung, dapAnDung, dapAnSai1, dapAnSai2, dapAnSai3));
                }
            }
            return kq;
        } catch (Exception e) {
        }
        return null;
    }

    public boolean xoaMotCauHoi(String id) {
        CauHoi admin = new CauHoi();
        boolean kq = false;
        ArrayList<CauHoi> data = new ArrayList<>();
        ArrayList<CauHoi> conLai = new ArrayList<>();
        data = admin.layTatCaCauHoi();

        for(CauHoi item : data) {
            if(item.getId().equals(id)) {
                kq= true;
                continue;
            }else {
                conLai.add(item);
            }
        }
        admin.capNhatCSDL(conLai);

        return kq;	
    }

    public void capNhatCSDL(ArrayList<CauHoi> CauHoi) {
        CauHoi admin = new CauHoi();
        admin.xoaTatCaCauHoi();
        for (CauHoi item : CauHoi) {
            admin.themMotCauHoi(item);
        }
    }

    public void xoaTatCaCauHoi() {
        try {
            File f = new File(pathFileData);
            PrintWriter writer = new PrintWriter(f);
            writer.print("");
            writer.close();
        } catch (IOException e) {

        }
    }

    public boolean CauHoiCoTonTaiHayKhong(String id) {
        boolean kq = false;
        CauHoi admin = new CauHoi();
        ArrayList<CauHoi> data = new ArrayList<>();
        data = admin.layTatCaCauHoi();
        if(data == null) {
            return false;
        }
        for (CauHoi item : data) {
            if(item.getId().equals(id)) {
                kq = true;
                break;
            }
        }
        return kq;
    }
    public CauHoi layMotCauHoi(String id) {
        CauHoi kq = null;
        CauHoi admin = new CauHoi();
        ArrayList<CauHoi> data = new ArrayList<>();
        data = admin.layTatCaCauHoi();
        for (CauHoi item : data) {
            if(item.getId().equals(id)) {
                kq = item;
                break;
            }
        }
        return kq;
    }
    public boolean traLoiDung(String id, String dapAn) {
        CauHoi admin = new CauHoi();
        CauHoi cauHoi = admin.layMotCauHoi(id);
        if(cauHoi.getDapAnDung().equals(dapAn)) {
            return true;
        }else {
            return false;
        }		
    }

    public CauHoi randomCauHoi() {
        CauHoi admin = new CauHoi();
        ArrayList<CauHoi> data = new ArrayList<>();
        data = admin.layTatCaCauHoi();
        Random rd = new Random();
        int so = rd.nextInt(0, data.size());
        for (CauHoi item : data) {
            if(item.getId().equals(so+"")) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return  id + "    " + noiDung + "    " + dapAnDung + "    " + dapAnSai1 + "    " + dapAnSai2 + "    " + dapAnSai3 ;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNoiDung() {
        return noiDung;
    }
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    public String getDapAnDung() {
        return dapAnDung;
    }
    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }
    public String getDapAnSai1() {
        return dapAnSai1;
    }
    public void setDapAnSai1(String dapAnSai1) {
        this.dapAnSai1 = dapAnSai1;
    }
    public String getDapAnSai2() {
        return dapAnSai2;
    }
    public void setDapAnSai2(String dapAnSai2) {
        this.dapAnSai2 = dapAnSai2;
    }
    public String getDapAnSai3() {
        return dapAnSai3;
    }
    public void setDapAnSai3(String dapAnSai3) {
        this.dapAnSai3 = dapAnSai3;
    }
    
//    public static void main(String[] args) {
////	
//	CauHoi admin = new CauHoi();
//        System.err.println(admin.soLuongCauHoi());
////                
//		
//		
//}
//    

}

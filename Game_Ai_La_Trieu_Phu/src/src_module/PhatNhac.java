
package src_module;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PhatNhac {
	String workingDir = System.getProperty("user.dir");
	String vaoGame = workingDir+"\\Sound\\vaogame.wav";
	String ketThucK150 = workingDir+"\\Sound\\ketThucK150.wav";
	String choiGame = workingDir+"\\Sound\\nhacChoiGame.wav";
	String thang150 = workingDir+"\\Sound\\thang150tr.wav";
	String votayDung = workingDir+"\\Sound\\votaydung.wav";
	
	public void lenNhacVaoGame() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File(vaoGame);
		AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.start();
		
		String nv = scanner.next();
	}
	
	public void lenNhacChoiGame() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File(choiGame);
		AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.start();
		
		String nv = scanner.next();
	}
	
	public void lenNhacVoTay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File(votayDung);
		AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.start();
		
		String nv = scanner.next();
	}
	
	public void lenNhacKetThucSai() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File(ketThucK150);
		AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.start();
		
		String nv = scanner.next();
	}
	
	public void lenNhacWin150() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File(thang150);
		AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.start();
		
		String nv = scanner.next();
	}
        public static void main(String[] args) {
            try {
                PhatNhac p = new PhatNhac();
            p.lenNhacVaoGame();
            } catch (Exception e) {
            }
    }
	
	
}


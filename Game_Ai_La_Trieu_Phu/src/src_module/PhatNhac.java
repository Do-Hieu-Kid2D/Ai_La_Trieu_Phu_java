
package src_module;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PhatNhac {
        String workingDir = System.getProperty("user.dir")+"\\sound";
        String pathFile = workingDir+"\\kcgt.wav";
        String pathFile2 = workingDir+"\\chill.wav";
    public void phatNhackcgt() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File(pathFile);
        AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.start();

    }

    public void phatNhacdvn() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

            File file = new File(pathFile2);
            AudioInputStream inputStream  = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();

    }
    
//    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//        int i ;
//        if(i!=null){
//            
//        }
//
//    }
	
}


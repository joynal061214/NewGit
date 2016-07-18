package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class Jplayer {
    
static File toPlay;

    public Jplayer(File file)
    {
        file = toPlay;
        
        try
        {
            FileInputStream fis = new FileInputStream("Sleep Away.mp3");
            try
            {
            //    Player player = new Player(fis);
            //    player.play();
                AdvancedPlayer pl = new AdvancedPlayer(fis);
                pl.play();
                
                        
            }
            catch (JavaLayerException ex)
            {
                ex.printStackTrace();
            }
            
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
      }
    
    public static void main(String[] args)
    {
       Jplayer pl  = new Jplayer(toPlay);
        
        

//         try
//        {
//            FileInputStream fis = new FileInputStream("Sleep Away.mp3"); // this code will with wav file
//            AudioStream stream = new AudioStream(fis);
//            AudioPlayer.player.start(stream);
//            
//        }
//        catch (IOException iOException)
//        {
//            iOException.printStackTrace();
//        }
    }
 
    

}

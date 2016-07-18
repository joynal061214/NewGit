
package Classes;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.media.*;

public class JMFSound extends Object
        implements ControllerListener {

    File soundFile;
    //JDialog playingDialog;
    Player player;

    public JMFSound(File f)
            throws NoPlayerException, CannotRealizeException,
            MalformedURLException, IOException {
        soundFile = f;
//         prepare a dialog to display while playing
//		JOptionPane pane = new JOptionPane ("Client : " + strClient, JOptionPane.PLAIN_MESSAGE);
//		playingDialog = pane.createDialog (null, "Schedule Reminder");
//                playingDialog.pack();

        // get a player
        MediaLocator mediaLocator = new MediaLocator(soundFile.toURL());
        try {
            player = Manager.createRealizedPlayer(mediaLocator);
            player.addControllerListener(this);
            player.prefetch();
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //playingDialog.setVisible(true);
    }
    
    
    // ControllerListener implementation

    public void controllerUpdate(ControllerEvent e) {
        System.out.println(e.getClass().getName());
        if (e instanceof EndOfMediaEvent) {
            //playingDialog.setVisible(false);
            //System.exit (0);
            //player.setMediaTime(new Time(0));
            //player.start();
        }
    }
    

    public void stop() {
      
        player.stop();
    }
    
}
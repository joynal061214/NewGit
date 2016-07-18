
package Classes;

import java.io.FileInputStream;
import sun.audio.*;
public class SunAudioClip implements java.applet.AudioClip {
    private AudioData audiodata;
    private AudioDataStream audiostream;
    private ContinuousAudioDataStream continuousaudiostream;
    static int length; 

public SunAudioClip (String filename) throws java.io.IOException {
        FileInputStream fis = new FileInputStream (filename);
        AudioStream audioStream = new AudioStream (fis);
        audiodata = audioStream.getData();
        audiostream = null;
        continuousaudiostream = null;
    }
    public void play () {
        audiostream = new AudioDataStream (audiodata);
        AudioPlayer.player.start (audiostream);
    }
    public void loop () {
        continuousaudiostream = new ContinuousAudioDataStream (audiodata);
        AudioPlayer.player.start (continuousaudiostream);
    }
    public void stop () {
        if (audiostream != null)
            AudioPlayer.player.stop (audiostream);
        if (continuousaudiostream != null)
            AudioPlayer.player.stop (continuousaudiostream);
    }

}
import java.io.*;
import sun.audio.*;

class PlaySound{

public void playSound() 
{
  try
  {
    // get the sound file as a resource out of my jar file;
    // the sound file must be in the same directory as this class file.
    // the input stream portion of this recipe comes from a javaworld.com article.
    InputStream inputStream = getClass().getResourceAsStream("");
    AudioStream audioStream = new AudioStream(inputStream);
    AudioPlayer.player.start(audioStream);
  }
  catch (Exception e)
  {
    // a special way i'm handling logging in this application
    //if (debugFileWriter!=null) e.printStackTrace(debugFileWriter);
	System.out.println("Exception of Play Sound");
  }
}

}
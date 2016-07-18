
package HCI;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.Document;

/**
 * @author Joynal Abedin
 * 02-Aug-2013
 */


public class FileService {
    
      
    public byte[] readImageOldWay(File file) throws IOException    
    {    
      InputStream is = new FileInputStream(file);    
      long length = file.length();    
      if (length > Integer.MAX_VALUE)    
      {    
        System.out.println("File too large");    
      }    
          
      byte[] bytes = new byte[(int) length];    
      int offset = 0;    
      int numRead = 0;    
      while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)    
      {    
        offset += numRead;    
      }    
          
      if (offset < bytes.length)    
      {    
        throw new IOException("Could not completely read file " + file.getName());    
      }    
          
      is.close();    
//      for(int i=0;i<bytes.length;i++)    
//      {    
//          System.out.println(bytes[i]);    
//      }    
      return bytes;    
    }    

    void readImageOldWay(byte[] careDocs1)
    {
        byte[] buffer = careDocs1;

    // Wrap the bytes from the buffer into a new ByteArrayInputStream object.
    ByteArrayInputStream newStream = new ByteArrayInputStream(buffer);

    // Read the document from the input stream.
   
    }
      
    
     
}  


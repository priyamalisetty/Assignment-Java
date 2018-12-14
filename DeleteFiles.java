import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeleteFiles {
    public static void main(String[] args) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            File dir = new File(args[0]);
            File[] files=dir.listFiles();
            for (File f:files) {
                //System.out.println("the file name is: " + f.getName());
                //System.out.println(f.lastModified());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //System.out.println("after formatting" + sdf.format(f.lastModified()));
                if (sdf.format(f.lastModified()).compareTo(args[1])<0) {
                    System.out.println(f.getName());
                    //if(f.lastModified()
                    f.delete();
                }
            }

    }
}

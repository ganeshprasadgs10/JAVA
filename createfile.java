package Project9;
import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try{
            File obj = new File("C://Users/admin/Documents/20201CAI0018/file.txt");
        
        if(obj.createNewFile()){
            System.out.println("File created: "+obj.getName());
        }
        else{
            System.out.println("File already Exists");
        }
    }
    catch(IOException e){
        System.out.println("An error occured.");
        e.printStackTrace();
    }
}
}

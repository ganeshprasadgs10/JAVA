package Project8;
import java.io.File;
import java.util.Scanner;
public class createfolder {
    public static void main(String[] args) {
        System.out.println("Enter the path where you want to create a folder");
        Scanner s = new Scanner(System.in);
        String path = s.next();
        System.out.println("Enter the name of the desired a director");
        path = path+s.next();
        File f1 = new File(path);
        boolean bool = f1.mkdir();
        if(bool){
            System.out.println("Folder is created successfully");
        }
        else{
            System.out.println("Error found!");
        }
    }
}

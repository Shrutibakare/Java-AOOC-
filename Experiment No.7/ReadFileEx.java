import java.io.*;
public class ReadFileEx{
   public static void main(String[] args){
        try{
              File file =  new File("C:\\Users\\Shruti\\Desktop\\sample.txt");
BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("File Content:");
 while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
br.close();
}catch(Exception e){
System.out.println("Error reading file");
}
}
}

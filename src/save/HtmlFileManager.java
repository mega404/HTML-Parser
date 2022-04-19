package save;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HtmlFileManager {
    public static void create(String content, String path) throws IOException{
//        String[] template = readFile(CurrentDirectory.PATH + "template.html").split("#");
        File html = new File(path);
        FileWriter fw = new FileWriter(html);
//        fw.write(template[0] + content + template[1]);
        fw.write (content);
        fw.close();

    }
    public static String readFile(String path) throws IOException{
        String html = "";
        Scanner sc = new Scanner( new File(path));
        while(sc.hasNextLine()){
            html += sc.nextLine() + "\n";
        }
        return html;
    }
}

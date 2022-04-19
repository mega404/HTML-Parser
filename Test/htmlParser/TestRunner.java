import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import htmlParser.Grammer;
import save.CurrentDirectory;
import save.HtmlFileManager;

public class TestRunner {
    private static String path = CurrentDirectory.PATH + "Test\\htmlParser\\TestCases\\";
    public static String run(int n) throws Exception{
        System.out.println("TestCase " + n);
        String output = "";
        try {
            File fp= new File(path + n + "\\input.txt");
            FileReader fr = new FileReader(fp);
            Grammer.ReInit(fr);
            output = Grammer.input();
            System.out.println(output);
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return output;
    }
    public static String readFile(int n) throws IOException{
        return HtmlFileManager.readFile(path + n + "\\expectedOutput.html");
    }
}

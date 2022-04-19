import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import save.CurrentDirectory;
import save.HtmlFileManager;

public class GrammerGenerationTest {
    static private String path = CurrentDirectory.PATH + "Test\\htmlParser\\TestCases\\";  
    @Test
    public void Test1() throws Exception{
        String expected = "";
        try{
            expected = TestRunner.readFile(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        String actual = TestRunner.run(1);
        assertEquals(expected, actual);
        HtmlFileManager.create(actual, path + "1\\output.html");
    }
    @Test
    public void Test2() throws Exception{
        String expected = "";
        try{
            expected = TestRunner.readFile(2);
        }catch (Exception e){
            e.printStackTrace();
        }
        String actual = TestRunner.run(2);
        assertEquals(expected, actual);
        HtmlFileManager.create(actual, path + "2\\output.html");
    }
    @Test
    public void Test3() throws Exception{
        String expected = "";
        try{
            expected = TestRunner.readFile(3);
        }catch (Exception e){
            e.printStackTrace();
        }
        String actual = TestRunner.run(3);
        assertEquals(expected, actual);
        HtmlFileManager.create(actual, path + "3\\output.html");
    }
    @Test
    public void Test4() throws Exception{
        String expected = "";
        try{
            expected = TestRunner.readFile(4);
        }catch (Exception e){
            e.printStackTrace();
        }
        String actual = TestRunner.run(4);
        assertEquals(expected, actual);
        HtmlFileManager.create(actual, path + "4\\output.html");
    }
    @Test
    public void Test5() throws Exception{
        String expected = "";
        try{
            expected = TestRunner.readFile(5);
        }catch (Exception e){
            e.printStackTrace();
        }
        String actual = TestRunner.run(5);
        assertEquals(expected, actual);
        HtmlFileManager.create(actual, path + "5\\output.html");
    }
}

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import htmlParser.ParseException;
import htmlParser.TokenMgrError;

public class GrammarValidationTest {
    
    @Test
    public void Test6(){        
        TokenMgrError exception = assertThrows(htmlParser.TokenMgrError.class, () -> {TestRunner.run(6);});
        assertTrue(exception.getMessage().contains("Lexical error"));
        
        
    }
    @Test
    public void Test7(){
        TokenMgrError exception = assertThrows(htmlParser.TokenMgrError.class, () -> {TestRunner.run(7);});
        assertTrue(exception.getMessage().contains("line 2"));
    }
    @Test
    public void Test8(){
        ParseException exception = assertThrows(htmlParser.ParseException.class, () -> {TestRunner.run(8);});
        assertTrue(exception.getMessage().contains("line 3"));
    }
    @Test
    public void Test9(){
        ParseException exception = assertThrows(htmlParser.ParseException.class, () -> {TestRunner.run(9);});
        assertTrue(exception.getMessage().contains("line 2"));
    }
    @Test
    public void Test10(){
        ParseException exception = assertThrows(htmlParser.ParseException.class, () -> {TestRunner.run(10);});
        assertTrue(exception.getMessage().contains("line 5"));
    }
    @Test
    public void Test11(){        
        assertDoesNotThrow(() -> {TestRunner.run(11);});    
    }
    @Test
    public void Test12(){
        assertDoesNotThrow(() -> {TestRunner.run(12);});    

    }
    @Test
    public void Test13(){
        assertDoesNotThrow(() -> {TestRunner.run(13);});    

    }
    @Test
    public void Test14(){
        assertDoesNotThrow(() -> {TestRunner.run(14);});    

    }
    @Test
    public void Test15(){
        assertDoesNotThrow(() -> {TestRunner.run(15);});    

    }

    
}

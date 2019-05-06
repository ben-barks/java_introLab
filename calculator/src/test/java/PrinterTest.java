import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printerPaper;
    Printer printerToner;

    @Before
    public void before(){
        printerPaper = new Printer(100, 200);
        printerToner = new Printer(200, 100);
    }

    @Test
    public void getPaper(){
        assertEquals(100, printerPaper.getPaper());
    }

    @Test
    public void getToner(){
        assertEquals(200, printerPaper.getToner());
    }

    @Test
    public void printSuccessfully(){
        String printOutput = printerToner.print(20, 4);
        assertEquals(120, printerToner.getPaper());
        assertEquals(20, printerToner.getToner());
        assertEquals("Pages printed.", printOutput);
    }

    @Test
    public void printUnsuccessfully(){
        String printOutput = printerToner.print(20, 6);
        assertEquals(200, printerToner.getPaper());
        assertEquals(100, printerToner.getToner());
        assertEquals("Refill required!", printOutput);
    }

    @Test
    public void printError(){
        String printOutput = printerToner.print(20, -7);
        assertEquals(200, printerToner.getPaper());
        assertEquals(100, printerToner.getToner());
        assertEquals("Error!", printOutput);
    }

    @Test
    public void canRefillPaper(){
        printerToner.print(20, 3);
        printerToner.refillPaper();
        printerToner.refillToner();
        assertEquals(200, printerToner.getPaper());
        assertEquals(200, printerToner.getToner());
    }

}

package yesterday.nonono;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestCal 
{
    /**
     * Rigorous Test :-)
     */
	  @Test
	    public void AddTest()
	    {
	    	Cal x = new Cal();
	        assertEquals( 3,x.Add(1, 2) );
	    }
	    @Test
	    public void SubTest()
	    {
	    	Cal x = new Cal();
	        assertEquals( -1,x.Sub(1, 2) );
	    }
}

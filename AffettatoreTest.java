

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AffettatoreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AffettatoreTest
{
    /**
     * Default constructor for test class AffettatoreTest
     */
    public AffettatoreTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        Affettatore affettat1 = new Affettatore("Ciao a tutti", ", \t\n\r\f");
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("Ciao", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("a", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("tutti", affettat1.nextToken());
        assertEquals(false, affettat1.hasMoreTokens());
    }
    
     @Test
    public void testCsvESpazi()
    {
        Affettatore affettat1 = new Affettatore("Ciao, a, tutti,100", ", \t\n\r\f");
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("Ciao", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("a", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("tutti", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("100", affettat1.nextToken());
        assertEquals(false, affettat1.hasMoreTokens());
    }
    
    @Test
    public void testCsvConDoppiApici()
    {
        Affettatore affettat1 = new Affettatore("\"Ciao\",\"con virgola, a\", \"tutti\"");
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("Ciao", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("con virgola, a", affettat1.nextToken());
        assertEquals(true, affettat1.hasMoreTokens());
        assertEquals("tutti", affettat1.nextToken());
        assertEquals(false, affettat1.hasMoreTokens());
    }
}


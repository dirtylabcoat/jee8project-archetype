#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ping.control;

import ${package}.ping.entity.Ping;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class PingServiceTest {

    private static final String PING_MSG = "ping";

    private PingService pingService;

    @Before
    public void setUp() {
        this.pingService = new PingService();
    }

    @Test
    public void testPing() {
        Ping ping = this.pingService.getPing();
        assertEquals(ping.getMessage(), PING_MSG);
    }

}

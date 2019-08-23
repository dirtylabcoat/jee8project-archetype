#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ping.control;

import ${package}.ping.entity.Ping;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PingServiceTest {

    private static final String PING_MSG = "PONG";

    @Mock
    private PingService mockPingService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(mockPingService.getPing()).thenReturn(new Ping(PING_MSG));
    }

    @Test
    public void testPing() {
        Ping ping = this.mockPingService.getPing();
        assertEquals(ping.getMessage(), PING_MSG);
    }

}

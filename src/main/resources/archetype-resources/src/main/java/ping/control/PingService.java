#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ping.control;

import javax.ejb.Stateless;
import ${package}.ping.entity.Ping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class PingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PingService.class.getName());

    public Ping getPing() {
        LOGGER.info("I was pinged.");
        return new Ping("ping");
    }

}

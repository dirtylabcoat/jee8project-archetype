#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ping.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ${package}.ping.entity.Ping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Stateless
public class PingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PingService.class.getName());

    @Inject
    @ConfigProperty(name = "ping.msg")
    private String pingMsg;

    public Ping getPing() {
        LOGGER.info("I was pinged.");
        return new Ping(pingMsg);
    }

}

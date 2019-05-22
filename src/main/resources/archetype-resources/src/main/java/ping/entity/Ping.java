#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ping.entity;

import java.io.Serializable;

public class Ping implements Serializable {

    private static final long serialVersionUID = -3967966380769970693L;

    private String message;

	public Ping() {
	}

    public Ping(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

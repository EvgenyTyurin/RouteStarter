package evgenyt.fuse;

import org.apache.camel.Exchange;

/**
 * Starts one route from another
 * @author tey
 *
 */

public class RouteStarter {
	
	public void start(Exchange exchange) {
		try {
			exchange.getContext().startRoute("_routeManualStartup");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

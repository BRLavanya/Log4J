package Alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("debugging mode");
		if (5 > 2) {
			log.info("object present");
		} else {
			log.error("no object present");
		}
		log.fatal("fatal error");
		log.error("error log");
	}

}


public class Utils{

	public static void runLoggers(Logger[] loggers, String message){
		for(Logger logger: loggers){
			logger.log(message);
		}
		
		//static metot bellekte yeri sabittir. Her seferinde kullanmak zorunda olduðumuz metotlar için kullanýrýz
		//javada üst classlar static tanýmlanamaz. Ancak iç class olutþturulursa static tanýmlanabilir.
	}
}

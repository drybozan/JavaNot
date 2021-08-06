
public class Utils{

	public static void runLoggers(Logger[] loggers, String message){
		for(Logger logger: loggers){
			logger.log(message);
		}
		
		//static metot bellekte yeri sabittir. Her seferinde kullanmak zorunda oldu�umuz metotlar i�in kullan�r�z
		//javada �st classlar static tan�mlanamaz. Ancak i� class olut�turulursa static tan�mlanabilir.
	}
}

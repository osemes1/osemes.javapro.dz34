import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {

    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) {
        LogExample logExample = new LogExample();
        logExample.doSomething();
    }

    public void doSomething() {
        logger.info("Це логування інформації");
        logger.warn("Це логування попередження");
        logger.error("Це логування помилки");

        try {
            int result = 10 / 0; // Генерація помилки
        } catch (ArithmeticException e) {
            logger.error("Сталася помилка при обчисленні: {}", e.getMessage());
        }
    }
}

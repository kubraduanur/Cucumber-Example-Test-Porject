package mpapi.helpers;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LogUtils {

    private static final Logger LOGGER = LogManager.getLogger(LogUtils.class);
    private static final StringBuilder sb = new StringBuilder();

    private LogUtils() {
    }

    @Step("{0}")
    public static void logInfo(final String message) {
        try {
            sb.append(message);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            LOGGER.info(aioobe);
        }
        LOGGER.info(message);
    }

    @Step("{0}")
    public static void logError(final String message) {
        try {
            sb.append(message);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            LOGGER.error(aioobe);
        }
        LOGGER.error(message);
    }

    @Step("{0}")
    public static void logDebug(final String message) {
        try {
            sb.append(message);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            LOGGER.debug(aioobe);
        }
        LOGGER.debug(message);
    }

    @Step("{0}")
    public static void logWarn(final String message) {
        try {
            sb.append(message);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            LOGGER.warn(aioobe);
        }
        LOGGER.warn(message);
    }

    @Step("{0}")
    public static void logFatal(final String message) {
        try {
            sb.append(message);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            LOGGER.fatal(aioobe);
        }
        LOGGER.fatal(message);
    }
}

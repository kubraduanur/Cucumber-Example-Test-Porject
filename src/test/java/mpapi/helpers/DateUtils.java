package mpapi.helpers;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import static mpapi.helpers.LogUtils.logInfo;
import static java.lang.String.format;

public final class DateUtils {

    private DateUtils() {
    }

    public static Timestamp getSysTimeForDb(String date) {
        LocalDateTime now = LocalDateTime.now();
        if ("SYSDATE".equals(date)) {
            return Timestamp.valueOf(now);
        }
        String sign = date.substring(7, 8);
        String dayPlus = date.substring(8);
        if ("+".equals(sign)) {
            return Timestamp.valueOf(now.plusDays(Long.parseLong(dayPlus)));
        } else {
            return Timestamp.valueOf(now.minusDays(Long.parseLong(dayPlus)));
        }
    }

    public static long getMilliFromDate(LocalDateTime dateTime) {
        logInfo(format("Date: %s", dateTime.atZone(ZoneId.of("GMT")).toInstant().toEpochMilli()));
        return dateTime.atZone(ZoneId.of("UTC+03:00")).toInstant().toEpochMilli();
    }

    public static long getMilliFromDateWithGMT(LocalDateTime dateTime) {
        logInfo(format("Date: %s", dateTime.atZone(ZoneId.of("GMT")).toInstant().toEpochMilli()));
        return dateTime.atZone(ZoneId.of("GMT")).toInstant().toEpochMilli();

    }

    public static String simpleDateFormatted(String date) {
        if (date.length() == 19) {
            return date + ".000";
        }else if (date.length() == 21) {
            return date + "00";
        } else if (date.length() == 22) {
            return date + "0";
        } else if (date.length() == 24 || date.length() == 25 || date.length() == 26) {
            return date.substring(0,23);
        }
        else {
            return date;
        }
    }

    public static LocalDateTime convertLongToLocalDate(long date) {
        return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
    public static long convertStringToEpochTime(String date) {
        if (date.length() == 19) {
            date = date + ".000";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        TimeZone timezone = TimeZone.getDefault();
        try {
            Date dates = sdf.parse(date);
            if (timezone.getID().equals("Europe/Istanbul")) {
                return dates.toInstant().plus(Duration.ofHours(3)).toEpochMilli();
            } else {
                return dates.toInstant().toEpochMilli();
            }


        } catch (ParseException pe) {
            return 0L;
        }
    }
    public static boolean isLocale() {
        TimeZone timezone = TimeZone.getDefault();
        return timezone.getID().equals("Europe/Istanbul");
    }
    public static long getLongNowDateTime() {
        if (isLocale()) {
            return getMilliFromDateWithGMT(LocalDateTime.now().minusHours(3));
        } else {
            return getMilliFromDateWithGMT(LocalDateTime.now().minusHours(0));
        }
    }

    public static long addDayToLongDate(long date, int day) {
        return date + (day * 86400000L);
    }

    public static String convertDateLongToStringForUTC(long date) {
        if (isLocale()) {
            return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).toLocalDateTime().minusHours(3).toString()
                    .replace("T", " ");
        } else {
            return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).toLocalDateTime().toString()
                    .replace("T", " ");
        }
    }
    public static LocalDateTime convertLongToLocalDateForTurkeyTimeZone(long date) {
        if (isLocale()) {
            return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).toLocalDateTime();
        } else {
            return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).plusHours(3).toLocalDateTime();
        }

    }



    public static long getNowDateTimeForUTC() {
        if (isLocale()) {
            return LocalDateTime.now().minusHours(3).atZone(ZoneId.of("GMT")).toInstant().toEpochMilli();
        }
        return LocalDateTime.now().atZone(ZoneId.of("GMT")).toInstant().toEpochMilli();
    }
    public static boolean isTazminToogleOpen() {
        return true;
    }
}

package com.martins.gustavo.bcaserver.util;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class ValidationUtil {

    private ValidationUtil() {
    }

    public static Boolean isBlankOrNull(String word) {
        return isBlankOrNull((Object) word);
    }

    public static <T> Boolean isNullOrLessThan(String string, Integer lessThan) {
        if (string == null) {
            return Boolean.TRUE;
        } else {
            return string.length() < lessThan ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static Boolean isBlankOrNull(Object object) {
        if (object == null) {
            return Boolean.TRUE;
        } else {
            String objString = object.toString().trim();
            return objString.isEmpty();
        }
    }

    public static <T> Boolean isNullOrEmpty(Enum<?> enumObj) {
        if (enumObj == null) {
            return Boolean.FALSE;
        } else {
            return enumObj.toString().trim().isEmpty() ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    public static <T> Boolean isNullOrEmpty(Collection<T> collection) {
        return isNullOrLessThan(collection, 1);
    }

    public static <T> Boolean isNullOrLessThan(Collection<T> collection, Integer lessThan) {
        if (collection == null) {
            return Boolean.TRUE;
        } else {
            return collection.size() < lessThan ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static <T, K> Boolean isNullOrEmpty(Map<T, K> map) {
        return isNullOrLessThan(map, 1);
    }

    public static <T, K> Boolean isNullOrLessThan(Map<T, K> map, Integer lessThan) {
        if (map == null) {
            return Boolean.TRUE;
        } else {
            return map.size() < lessThan ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static <T> Boolean isNullOrEmpty(T[] array) {
        return isNullOrLessThan(array, 1);
    }

    public static <T> Boolean isNullOrLessThan(T[] array, Integer lessThan) {
        if (array == null) {
            return Boolean.TRUE;
        } else {
            return array.length < lessThan ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static Boolean isNullOrLessThan(Number number, Integer lessThan) {
        if (number == null) {
            return Boolean.TRUE;
        } else {
            return number.doubleValue() < (double) lessThan ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static Boolean isBetween(Number lowerNumber, Number numberBetween, Number greaterNumber) {
        return numberBetween.doubleValue() > lowerNumber.doubleValue() && numberBetween.doubleValue() < greaterNumber.doubleValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean isInPercentWildcard(String string) {
        return !string.startsWith("%") && !string.endsWith("%") ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean isBetween(Date date, Date start, Date end) {
        return start.compareTo(date) * date.compareTo(end) > 0;
    }

    public static Long compareDates(Date d1, Date d2) {
        long date = d1.getTime() - d2.getTime() + 3600000L;
        return date / 86400000L;
    }
}

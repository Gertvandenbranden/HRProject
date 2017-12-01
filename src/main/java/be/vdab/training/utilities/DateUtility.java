package be.vdab.training.utilities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateUtility {

    public final static LocalDate convertDateToLocalDate(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }

    public final static long convertLocalDateToEpoch(LocalDate localdate) {
        ZoneId zoneId = ZoneId.systemDefault(); //ZoneId.of("Europe/Oslo")
        return localdate.atStartOfDay(zoneId).toEpochSecond();
    }

    public final static Date convertLocalDateToDate(LocalDate localdate){
        return java.sql.Date.valueOf(localdate);
    }
}



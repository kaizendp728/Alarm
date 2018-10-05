package com.kaizendp.alarm;

import java.util.Date;

public class Alarm {
    private Date dateTimeAlarm;
    private Date dateTimeSleep;

    public Date getDateTimeAlarm() {
        return dateTimeAlarm;
    }

    public void setDateTimeAlarm(Date dateTimeAlarm) {
        this.dateTimeAlarm = dateTimeAlarm;
    }

    public Date getDateTimeSleep() {
        return dateTimeSleep;
    }

    public void setDateTimeSleep(Date dateTimeSleep) {
        this.dateTimeSleep = dateTimeSleep;
    }

    public Alarm(Date dateTimeAlarm, Date dateTimeSleep) {
        this.dateTimeAlarm = dateTimeAlarm;
        this.dateTimeSleep = dateTimeSleep;
    }
}

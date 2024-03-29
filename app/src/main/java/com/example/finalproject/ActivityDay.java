package com.example.finalproject;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
public class ActivityDay implements Serializable {
    private MyDate myDate;
    private boolean isUsed;
    private ArrayList<myItemActivity> daySchedule;
    public ActivityDay(){
        isUsed=false;
        daySchedule=new ArrayList<>();
    }
    public void initdaySchedule(){daySchedule=new ArrayList<>();}
    public void setDate(MyDate date) {
        this.myDate = date;
    }
    public void activateDate(){
        this.isUsed=true;
    }
    public void setDaySchedule(ArrayList<myItemActivity> daySchedule) {
        this.daySchedule = daySchedule;
    }
    public MyDate getDate()
    {
        return this.myDate;
    }
    //public String getStringDate(){return myDate.getDayOfMonth()+'/'+myDate.getMonth()+'/'+myDate.getYear();}
    public ArrayList<myItemActivity> getDaySchedule()
    {
        return this.daySchedule;
    }
    public int getSizeOfSchedule(){return daySchedule.size();}
    public void addingItemIntoDaySchedule(myItemActivity itemsin){daySchedule.add(daySchedule.size(),itemsin);}
    public void setItemInDaySchedule(int position,myItemActivity tmp){daySchedule.set(position,tmp);}
}

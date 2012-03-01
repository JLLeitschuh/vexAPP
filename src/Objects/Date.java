/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author jonathanleitschuh
 */
public class Date implements Serializable {
    private int day;
    private int monthNumber;
    private String month;
    private int year;
    
    public void setDay(int DAY){
        this.day = DAY;
    }
    public int getDay(){
        return day;
    }
    
    public void setMonth(int MONTHNUMBER){
        this.monthNumber = MONTHNUMBER;
        
        if (MONTHNUMBER == 1) {
            this.month = "January";
        }
        else if (MONTHNUMBER == 2) {
            this.month = "February";
        }
        else if (MONTHNUMBER == 3) {
            this.month = "March";
        }
        else if (MONTHNUMBER == 4) {
            this.month = "April";
        }
        else if (MONTHNUMBER == 5) {
            this.month = "May";
        }
        else if (MONTHNUMBER == 6) {
            this.month = "June";
        }
        else if (MONTHNUMBER == 7) {
            this.month = "July";
        }
        else if (MONTHNUMBER == 8) {
            this.month = "August";
        }
        else if (MONTHNUMBER == 9) {
            this.month = "September";
        }
        else if (MONTHNUMBER == 10) {
            this.month = "October";
        }
        else if (MONTHNUMBER == 11) {
            this.month = "November";
        }
        else if (MONTHNUMBER == 12) {
            this.month = "December";
        }
    }
    public String getMonth(){
        return month;
    }
    
    public int getMonthNumber(){
        return monthNumber;
    }
    
    public void setYear(int YEAR){
        this.year = YEAR;
    }
    public int getYear(){
        return year;
    }
    
}
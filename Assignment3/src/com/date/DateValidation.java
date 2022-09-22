package com.date;

public class DateValidation {
	private int dd,mm,yyyy;
	boolean valid=true;
	public DateValidation(int dd,int mm,int yyyy){
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;}
	
private boolean validateDate(){	
	if(yyyy>9999) {
		return false;
	}
	if(mm<1||mm>12) {
		return  false;
	}
	if(mm==2) {
			if(yyyy%4==0 ||(yyyy%100==0 && yyyy%400==0)) {
				if(dd>29) {
					return false;
				}
			}  else if(dd>28) {
					return false;
				}
			}
	if((mm<=7 && mm%2==1)||(mm>7 && mm%2==0)){
			if(dd>31 ||dd<=0) {
				return false;
			}
		}
		if((mm<=7 && mm%2==0)||(mm>7 && mm%2==1)){
			if(dd>30 || dd<=0) {
				return false;
			}
		}
	return true;
}
   void isValid() {
	   if(validateDate()) {
		   System.out.println(dd+"/"+mm+"/"+yyyy+" is a valid date");
	   }else {
	   System.out.println(dd+"/"+mm+"/"+yyyy+" is not a valid date");}
	   
   }
	}

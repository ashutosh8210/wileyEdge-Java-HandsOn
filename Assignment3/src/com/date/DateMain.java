package com.date;

public class DateMain {

	public static void main(String[] args) {
		DateValidation dateValid1=new DateValidation(15, 6, 2022);
		DateValidation dateValid2=new DateValidation(31, 6, 2022);
		DateValidation dateValid3=new DateValidation(29, 2, 2020);
		DateValidation dateValid4=new DateValidation(29, 2, 2021);
		DateValidation dateValid5=new DateValidation(31, 07, 2022);
		DateValidation dateValid6=new DateValidation(40, 6, 2022);
		
		dateValid1.isValid();
		dateValid2.isValid();
		dateValid3.isValid();
		dateValid4.isValid();
		dateValid5.isValid();
		dateValid6.isValid();

	}

}

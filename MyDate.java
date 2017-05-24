import java.util.Scanner;

public class MyDate {
	private int year;
	private int month;
	private int day;

	private static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };
	private static String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int year, int month, int day) {
		setDate(year, month, day);
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static boolean isValidDate(int year, int month, int day) {
		boolean monthAndyear = (year >= 1 && year <= 9999) && (month >= 1 && month <= 12);
		boolean validDay = false;

		if (month == 2) {
			if (isLeapYear(year))
				validDay = day <= 29;
			else
				validDay = day <= 28;
		} else
			validDay = day <= daysInMonths[month - 1];

		return monthAndyear && validDay;
	}

	public static int getDayOfWeek(int year, int month, int day) {

		/*
		 * http://introcs.cs.princeton.edu/java/12types/DayOfWeek.java.html
		 * Copied from this website
		 */
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + (31 * m0) / 12) % 7;

		return d0;

	}

	public void setDate(int year, int month, int day) throws IllegalArgumentException {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else
			throw new IllegalArgumentException("Invalid year, month, or day!");
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) throws IllegalArgumentException {
		boolean monthAndyear = (year >= 1 && year <= 9999) && (month >= 1 && month <= 12);
		boolean validDay = false;

		if (month == 2) {
			if (isLeapYear(year))
				validDay = day == 29;
			else
				validDay = day == 28;
		} else
			validDay = daysInMonths[month - 1] == day;

		if (monthAndyear && validDay)
			this.day = day;
		else
			throw new IllegalArgumentException("Invalid day");
	}

	public void setMonth(int month) throws IllegalArgumentException {
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			throw new IllegalArgumentException("Invalid month");
	}

	public void setYear(int year) throws IllegalArgumentException {
		if (year >= 1 && year <= 9999)
			this.year = year;
		else
			throw new IllegalArgumentException("Invalid year");
	}

	@Override
	public String toString() {

		return strDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
	}

	public MyDate nextDay() {
		int limit;

		if (month == 2) {
			if (isLeapYear(year))
				limit = 29;
			else
				limit = 28;
		} else
			limit = daysInMonths[month - 1];

		if (day >= limit) {
			nextMonth();
		} else
			day++;
		return this;
	}

	public MyDate nextMonth() {
		int limit;

		if (month == 2) {
			if (isLeapYear(year))
				limit = 29;
			else
				limit = 28;
		} else
			limit = daysInMonths[month - 1];
		
		if (month == 12) {
			month = 1;
			day = 1;
			nextYear();
		} else if (day == limit) {
			day = 1;
			month++;
		} else {
			month++;
			day = daysInMonths[month - 1];
		}
		return this;

	}

	public MyDate nextYear() throws IllegalStateException {
		if (year >= 9999)
			throw new IllegalStateException("Year out of range!");
		if (isLeapYear(year) && month == 2 && day == 29) {
			day = 28;
		}
		year++;
		return this;
	}

	public MyDate previousYear() throws IllegalStateException {
		if (year == 1)
			throw new IllegalStateException("Year out of range!");
		if (isLeapYear(year) && month == 2 && day == 29) {
			day = 28;
		}
		year--;
		return this;
	}

	public MyDate previousMonth() {
		if (month == 1) {
			month = 12;
			previousYear();
		} else
			month--;

		day = daysInMonths[month - 1];

		return this;
	}

	public MyDate previousDay() {
		int limit;
		if (month == 1) {
			day = 31;
			previousMonth();
			previousYear();
		}

		if (month == 2) {
			if (isLeapYear(year))
				limit = 29;
			else
				limit = 28;
		} else
			limit = daysInMonths[month - 2];

		if (day == 1) {
			day = limit;
			previousMonth();
		} else {
			day--;
		}

		return this;
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		System.out.println("Type year, month, and day");

		MyDate date;

		try {
			date = new MyDate(in.nextInt(), in.nextInt(), in.nextInt());
			in.close();
		} catch (IllegalArgumentException except) {
			System.out.println("Wrong date given");
			except.printStackTrace();
			return;
		}
		
		
		while (true) {
			date.nextDay();
			System.out.println(date);
			Thread.sleep(100);
		}
		
	}
}

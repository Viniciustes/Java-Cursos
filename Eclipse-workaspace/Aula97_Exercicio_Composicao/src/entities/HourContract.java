package entities;

import java.util.Date;

public class HourContract {

	private Date date;

	private Double valuePerHour;

	private Integer hours;

	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPerHour() {
		return valuePerHour;
	}

	public void setPerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double totalValue() {
		return hours * valuePerHour;
	}

}

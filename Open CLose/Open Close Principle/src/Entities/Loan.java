package Entities;

import java.util.Calendar;
import java.util.Date;

public class Loan {
	private Person person;
	private WorksOfArt worksOfArt;
	private Date date;
	private Date endDate;
	private Date deliveryDate;
	private double lateFee;
	private int qtdRenovation;
	
	public Loan(Person person, WorksOfArt workOfArt) {
		if (workOfArt.isAvailable()) {
			this.person = person;
			this.worksOfArt = workOfArt;
			this.date = Calendar.getInstance().getTime();
			this.endDate = this.addThreeDays(this.date);
			this.lateFee = 10.00;
			this.qtdRenovation = 3;
			workOfArt.setAvailable(false);
		} else {
			throw new RuntimeException("Obra não disponível para empréstimo!");
		}
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public WorksOfArt getWorksOfArt() {
		return worksOfArt;
	}

	public void setWorksOfArt(WorksOfArt worksOfArt) {
		this.worksOfArt = worksOfArt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getLateFee() {
		return lateFee;
	}

	public int getQtdRenovation() {
		return qtdRenovation;
	}
	
	public boolean renewBorrow() {
		if (this.qtdRenovation > 0) {
			this.qtdRenovation--;
			this.endDate = this.addThreeDays(this.endDate);
			return true;
		} else {
			throw new RuntimeException("Não é possível renovar o empréstimo!");
		}
	}
	
	public void finalizeBorrow() {
		deliveryDate = Calendar.getInstance().getTime();
		if (deliveryDate.getTime() > endDate.getTime()) {
			System.out.println("Empréstimo finalizado com multa por atraso no valor de R$ " + this.lateFee);
		} else {
			System.out.println("Empréstimo finalizando sem multa por atraso.");
		}
		this.worksOfArt.setAvailable(true);
		this.qtdRenovation = 0;
	}
	
	private Date addThreeDays(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		return calendar.getTime();
	}

	@Override
	public String toString() {
		return "Loan [person=" + person + ", worksOfArt=" + worksOfArt + ", date=" + date + ", endDate=" + endDate
				+ ", lateFee=" + lateFee + ", qtdRenovation=" + qtdRenovation + "]";
	}

}

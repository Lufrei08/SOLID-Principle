package Entities;

import java.util.Calendar;
import java.util.Date;

public class Loan {
	private Person person;
	private Book book;
	private Date date;
	private Date endDate;
	private Date deliveryDate;
	private double latefee;
	private int qtdRenovation;

	public Loan(Person person, Book book) {
		if (book.isAvaliable()) {
			this.person = person;
			this.book = book;
			this.date = Calendar.getInstance().getTime();
			this.endDate = this.addThreeDays(this.date);
			this.latefee = 10.00;
			this.qtdRenovation = 3;
			book.setAvaliable(false);
		} else {
			throw new RuntimeException("Obra não disponível para empréstimo");
		}
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
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

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getLatefee() {
		return latefee;
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

	private Date addThreeDays(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		return calendar.getTime();
	}

	public void finalizeBorrow() {
		deliveryDate = Calendar.getInstance().getTime();
		if (deliveryDate.getTime() > endDate.getTime()) {
			System.out.println("Empréstimo finalizado com multa por atraso no valor de R$ " + this.latefee);
		} else {
			System.out.println("Empréstimo finalizando sem multa por atraso.");
		}
		this.book.setAvaliable(true);
		this.qtdRenovation = 0;
	}

	@Override
	public String toString() {
		return "Loan [person=" + person + ", book=" + book + ", date=" + date + ", endDate=" + endDate
				+ ", deliveryDate=" + deliveryDate + ", latefee=" + latefee + ", qtdRenovation=" + qtdRenovation + "]";
	}

}
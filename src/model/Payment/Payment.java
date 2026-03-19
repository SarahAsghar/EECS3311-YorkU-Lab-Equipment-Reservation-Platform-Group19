package model.Payment;

import java.util.Random;

public class Payment {

	private String paymentId;
	private double amount;
	private PaymentMethod method;
	private PaymentStatus status;
	private CreditCardPaymentStrategy creditStrategy;
	private DebitCardPaymentStrategy debitStrategy;
	private InstitutionalAccountPaymentStrategy IAPStrategy;
	private ResearchGrantPaymentStrategy RGPStrategy;
	
	public Payment(double amt, PaymentMethod method, PaymentStatus status, CreditCardPaymentStrategy strategy) {
		Random idNum = new Random(System.currentTimeMillis() % 1000);
		this.paymentId = Integer.toString(idNum.nextInt());
		this.amount = amt;
		this.method = method;
		this.status = status;
		this.creditStrategy = strategy;
	}
	
	public Payment(double amt, PaymentMethod method, PaymentStatus status, DebitCardPaymentStrategy strategy) {
		Random idNum = new Random(System.currentTimeMillis() % 1000);
		this.paymentId = Integer.toString(idNum.nextInt());
		this.amount = amt;
		this.method = method;
		this.status = status;
		this.debitStrategy = strategy;
	}
	
	public Payment(double amt, PaymentMethod method, PaymentStatus status, InstitutionalAccountPaymentStrategy strategy) {
		Random idNum = new Random(System.currentTimeMillis() % 1000);
		this.paymentId = Integer.toString(idNum.nextInt());
		this.amount = amt;
		this.method = method;
		this.status = status;
		this.IAPStrategy = strategy;
	}
	
	public Payment(double amt, PaymentMethod method, PaymentStatus status, ResearchGrantPaymentStrategy strategy) {
		Random idNum = new Random(System.currentTimeMillis() % 1000);
		this.paymentId = Integer.toString(idNum.nextInt());
		this.amount = amt;
		this.method = method;
		this.status = status;
		this.RGPStrategy = strategy;
	}
	
	public void processPayment() {
		
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public PaymentStatus getStatus() {
		return status;
	}



	public void setStatus(PaymentStatus status) {
		this.status = status;
	}



	public String getPaymentId() {
		return paymentId;
	}



	public PaymentMethod getMethod() {
		return method;
	}

	public CreditCardPaymentStrategy getCreditStrategy() {
		return creditStrategy;
	}

	public void setCreditStrategy(CreditCardPaymentStrategy creditStrategy) {
		this.creditStrategy = creditStrategy;
	}

	public DebitCardPaymentStrategy getDebitStrategy() {
		return debitStrategy;
	}

	public void setDebitStrategy(DebitCardPaymentStrategy debitStrategy) {
		this.debitStrategy = debitStrategy;
	}

	public InstitutionalAccountPaymentStrategy getIAPStrategy() {
		return IAPStrategy;
	}

	public void setIAPStrategy(InstitutionalAccountPaymentStrategy iAPStrategy) {
		IAPStrategy = iAPStrategy;
	}

	public ResearchGrantPaymentStrategy getRGPStrategy() {
		return RGPStrategy;
	}

	public void setRGPStrategy(ResearchGrantPaymentStrategy rGPStrategy) {
		RGPStrategy = rGPStrategy;
	}
	
	
	
}

package model.Payment;

import java.lang.Exception;
public class PaymentFactory {
	
	public PaymentFactory() {
		
	}
	
	public Payment createPayment(PaymentMethod method) throws Exception {
		
		if(method == PaymentMethod.CREDIT_CARD) {
			return new Payment(0.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		}else if(method == PaymentMethod.DEBIT_CARD) {
			return new Payment(0.00, PaymentMethod.DEBIT_CARD, PaymentStatus.PENDING, new DebitCardPaymentStrategy());
		}else if(method == PaymentMethod.INSTITUTIONAL_ACCOUNT) {
			return new Payment(0.00, PaymentMethod.INSTITUTIONAL_ACCOUNT, PaymentStatus.PENDING, new InstitutionalAccountPaymentStrategy());				
		}else if(method == PaymentMethod.RESEARCH_GRANT) {
			return new Payment(0.00, PaymentMethod.RESEARCH_GRANT, PaymentStatus.PENDING, new ResearchGrantPaymentStrategy());
		}else {
			throw new Exception("Invalid Payment Method");
		}
		
		
		
	}
}

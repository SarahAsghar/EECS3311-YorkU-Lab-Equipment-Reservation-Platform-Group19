package Test;

import org.junit.*;
import model.Payment.*;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTestCases {

	@Test
	void paymentSetAmountTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setAmount(10.00);
		
		assertEquals(10.00, p.getAmount());
	}
	
	@Test
	void paymentGetAmountTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		Double amt = p.getAmount();
		
		assertEquals(20.00, amt);
	}
	
	@Test
	void paymentGetStatusTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		PaymentStatus s = p.getStatus();
		
		assertEquals(PaymentStatus.PENDING, s);
	}
	
	@Test
	void paymentSetStatusTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setStatus(PaymentStatus.FORFEITED);
		
		assertEquals(PaymentStatus.FORFEITED, p.getStatus());
	}
	
	@Test
	void paymentGetMethodTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		PaymentMethod m = p.getMethod();
		
		assertEquals(PaymentMethod.CREDIT_CARD, m);
	}
	
	@Test
	void paymentGetCreditCardPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		CreditCardPaymentStrategy strategy = p.getCreditStrategy();
		
		assertNotNull(strategy);
	}
	
	@Test
	void paymentSetCreditCardPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setCreditStrategy(new CreditCardPaymentStrategy());
		
		assertEquals(new CreditCardPaymentStrategy(), p.getCreditStrategy());
	}
	
	@Test
	void paymentGetDebitCardPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		DebitCardPaymentStrategy strategy = p.getDebitStrategy();
		
		assertNotNull(strategy);
	}
	
	@Test
	void paymentSetDebitCardPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setDebitStrategy(new DebitCardPaymentStrategy());
		
		assertEquals(new DebitCardPaymentStrategy(), p.getDebitStrategy());
	}
	
	@Test
	void paymentGetIAPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		InstitutionalAccountPaymentStrategy strategy = p.getIAPStrategy();
		
		assertNotNull(strategy);
	}
	
	@Test
	void paymentSetIAPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setIAPStrategy(new InstitutionalAccountPaymentStrategy());
		
		assertEquals(new InstitutionalAccountPaymentStrategy(), p.getIAPStrategy());
	}
	
	@Test
	void paymentGetResearchGrantPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		ResearchGrantPaymentStrategy strategy = p.getRGPStrategy();
		
		assertNotNull(strategy);
	}
	
	@Test
	void paymentSetResearchGrantPaymentStrategyTest(){
		Payment p = new Payment(20.00, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING, new CreditCardPaymentStrategy());
		p.setRGPStrategy(new ResearchGrantPaymentStrategy());
		
		assertEquals(new ResearchGrantPaymentStrategy(), p.getRGPStrategy());
	}
	
	
}

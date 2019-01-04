package prob03;

public class Money {

	private int amount;
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
	public Money() {
		
	}
	public Money(int amount) {
		this.amount = amount;
	}
    
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Money add(Money money) {
		Money obj = new Money();
		obj.setAmount(amount + money.getAmount());
		return obj;
	}
	public Money minus(Money money) {
		Money obj = new Money();
		obj.setAmount(amount - money.getAmount());
		return obj;
	}
	public Money multiply(Money money) {
		Money obj = new Money();
		obj.setAmount(amount * money.getAmount());
		return obj;
	}
	public Money devide(Money money) {
		Money obj = new Money();
		obj.setAmount(amount / money.getAmount());
		return obj;
	}
}

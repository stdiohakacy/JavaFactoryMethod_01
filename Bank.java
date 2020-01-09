package creational.FactoryMethod;

public interface Bank {
	String getBankName();
}

class VietcomBank implements Bank{
	@Override
	public String getBankName() {
		return "VietcomBank";
	}
}

class TPBank implements Bank{
	@Override
	public String getBankName() {
		return "TPBank";
	}
}
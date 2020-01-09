package creational.FactoryMethod._01;

public class BankFactory {
	private BankFactory() {}
	
	public static final Bank getBank(Type type) throws IllegalAccessException {
		switch (type) {
		case TPBANK:
			return new TPBank();
		case VIETCOMBANK:
			return new VietcomBank();
		default:
			throw new IllegalAccessException("This bank type is unsupported");
		}
	}
}

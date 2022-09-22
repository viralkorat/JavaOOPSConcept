
public class Son extends Father {

	String education;

	public Son(String education, String address) {
		super(address);
		this.education = education;
	}

	@Override
	public String toString() {
		return "Son [education=" + education + ", address=" + address + "]";
	}

}

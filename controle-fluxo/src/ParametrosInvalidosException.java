
public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	String msg;
	
	public ParametrosInvalidosException(String msg) {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
	
	

}

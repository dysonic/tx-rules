package txrules;

public class TxRule implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String txName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTxName() {
		return txName;
	}

	public void setTxName(String txName) {
		this.txName = txName;
	}
	
}

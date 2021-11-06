public class Guitar
{
	private String serialNumber;
	private float price;
	private String builder;
	private String backWood;
	private String topWood;
	private String model;

	public Guitar(){
		this.serialNumber = "none";
		this.price = 0;
		this.builder = "none";
		this.model = "none";
		this.backWood = "none";
		this.topWood = "none";
	}

	public Guitar(String serialNumber, float price, 
		String builder, String model, String backWood, String topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public float getPrice() {
		return this.price;
	}

	public String getBuilder() {
		return this.builder;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBackWood() {
		return this.backWood;
	}

	public String getTopWood() {
		return this.topWood;
	}

	public void setSerialNumber(String id) {
		this.serialNumber = id;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public void setTopWood(String topWood ) {
		this.topWood = topWood;
	}

	public void createSound() {
		System.out.format("{serial number: %s; price: %.3f USD; builder: %s; top wood: %s; back wood: %s}\n",
			this.serialNumber, this.price, this.builder, this.topWood, this.backWood);
	}
}
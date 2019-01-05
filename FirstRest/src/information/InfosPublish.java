package information;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//klasa, której pola formatowane s¹ na JSON lub XML i publikowane
@XmlRootElement(name = "AverageRates")
public class InfosPublish {
	private String name;
	private String code;
	private String table;
	private int days;
	private double averageMid;
	private double averageBid;
	private double averageAsk;

	public InfosPublish(Currencies currencies) {
		name = currencies.getName();
		code = currencies.getCode();
		table = currencies.getTable();
		days = currencies.getAmountOfDays();
		averageMid = currencies.getAverageMid();
		averageBid = currencies.getAverageBid();
		averageAsk = currencies.getAverageAsk();

	}

	public InfosPublish() {

	}

	@XmlElement(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "Code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement(name = "Table")
	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	@XmlElement(name = "DaysCounted")
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@XmlElement(name = "AverageMid")
	public double getAverageMid() {
		return averageMid;
	}

	public void setAverageMid(double averageMid) {
		this.averageMid = averageMid;
	}

	@XmlElement(name = "AverageBid")
	public double getAverageBid() {
		return averageBid;
	}

	public void setAverageBid(double averageBid) {
		this.averageBid = averageBid;
	}

	@XmlElement(name = "AverageAsk")
	public double getAverageAsk() {
		return averageAsk;
	}

	public void setAverageAsk(double averageAsk) {
		this.averageAsk = averageAsk;
	}

}

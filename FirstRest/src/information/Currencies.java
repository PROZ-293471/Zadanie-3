package information;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//Klasa do marshallingu danych pobranych ze strony NBP w XML
@XmlRootElement(name = "ExchangeRatesSeries")
public class Currencies {

	private String name;
	private String code;
	private String table;
	private List<Rate> rates = new ArrayList<Rate>();

	public Currencies() {

	}

	public Currencies(String name, String code, String table, List<Rate> rates) {
		super();
		this.name = name;
		this.code = code;
		this.table = table;
		this.rates = rates;
	}

	@XmlElement(name = "Currency")
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

	@XmlElementWrapper(name = "Rates")
	@XmlElement(name = "Rate")
	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public int getAmountOfDays() {
		return rates.size();
	}

	public double getAverageMid() {

		double average = 0.0;
		for (Rate x : rates) {
			average = average += x.getMid();
		}
		if (average > 0.0) {
			average /= rates.size();
			average = average * 10000;
			average = Math.round(average);
			average = average / 10000;
		}

		return average;
	}

	public double getAverageBid() {

		double average = 0.0;
		for (Rate x : rates) {
			average = average += x.getBid();
		}
		if (average > 0.0) {
			average /= rates.size();
			average = average * 10000;
			average = Math.round(average);
			average = average / 10000;
		}

		return average;
	}

	public double getAverageAsk() {

		double average = 0.0;
		for (Rate x : rates) {
			average = average += x.getAsk();
		}
		if (average > 0.0) {
			average /= rates.size();
			average = average * 10000;
			average = Math.round(average);
			average = average / 10000;
		}

		return average;
	}

}

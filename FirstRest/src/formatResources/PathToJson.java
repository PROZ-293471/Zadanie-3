package formatResources;

import javax.xml.bind.JAXBException;

import com.google.gson.Gson;

import information.Currencies;
import information.CurrenciesCreator;
import information.InfosPublish;
import proz.WebClient;

//na podstawie danych ze œcie¿ki wprowadzanej przez u¿ytkownika tworzy rz¹dane informacje w formacie JSON

public class PathToJson {

	public static String getJson(String table, String code, int topCount) throws JAXBException {
		WebClient wc = new WebClient(table, code, topCount);
		Currencies currencies = CurrenciesCreator.createCurrencies(wc.getXmlAnswer());
		InfosPublish infos = new InfosPublish(currencies);
		Gson gson = new Gson();
		String json = gson.toJson(infos); // convert
		return json;
	}
}

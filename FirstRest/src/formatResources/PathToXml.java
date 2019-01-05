package formatResources;

import javax.xml.bind.JAXBException;

import information.Currencies;
import information.CurrenciesCreator;
import information.InfosPublish;
import proz.WebClient;

// na podstawie danych ze œcie¿ki wprowadzanej przez u¿ytkownika tworzy rz¹dane informacje w formacie XML
public class PathToXml {
	public static String getXml(String table, String code, int topCount) throws JAXBException {
		WebClient wc = new WebClient(table, code, topCount);
		Currencies currencies = CurrenciesCreator.createCurrencies(wc.getXmlAnswer());
		InfosPublish xmlInfos = new InfosPublish(currencies);
		return InfosToXml.getXml(xmlInfos);
	}
}

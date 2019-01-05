package information;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import information.Currencies;
import information.Rate;

// tworzy nowy obiekt klasy currencies na podstawie Stringu - informacji w formacie XML
public class CurrenciesCreator {

	public static Currencies createCurrencies(String xmlAnswer) throws JAXBException {
		JAXBContext jContext = JAXBContext.newInstance(Currencies.class, Rate.class);
		Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
		StringReader reader = new StringReader(xmlAnswer);
		Currencies currencies = (Currencies) unmarshallerObj.unmarshal(reader);
		return currencies;
	}
}

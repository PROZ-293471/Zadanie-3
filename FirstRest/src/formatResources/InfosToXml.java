package formatResources;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import information.InfosPublish;

// zamienia klasê InfosPublish na format XML
public class InfosToXml {

	public static String getXml(InfosPublish xmlInfos) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(InfosPublish.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(xmlInfos, sw);
		String xmlString = sw.toString();
		return xmlString;
	}
}

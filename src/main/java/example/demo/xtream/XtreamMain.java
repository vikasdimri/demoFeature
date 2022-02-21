package example.demo.xtream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XtreamMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        String xmlString = objToXmlString();

        XStream xstream = new XStream(new StaxDriver());
        /*xstream.autodetectAnnotations(true);*/
        XStream.setupDefaultSecurity(xstream);
        xstream.fromXML(xmlString);

        /*if(xml.address==null){
            System.out.println("==================NULL==========================");
        }else {
            System.out.println("==================Not NULL==========================");
        }*/
    }

    private static String objToXmlString() {
        XStream xstream = new XStream();
        xstream.autodetectAnnotations(true);
        XtreamXmlSample sample = new XtreamXmlSample("Vikas","Dimri");
        String dataXml = xstream.toXML(sample);
        System.out.println(dataXml);
        return dataXml;
    }
}

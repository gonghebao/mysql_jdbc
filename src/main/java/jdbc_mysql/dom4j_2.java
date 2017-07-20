package jdbc_mysql;


import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.*;

public class dom4j_2 {

	public static void main(String[] args) {
		SAXReader s = new SAXReader();
		try {
			Document d = s.read("xml.xml");
		    Element e = d.getRootElement();
		    List<Element> list= e.elements();
		    for(Element el : list){
		    	System.out.println(el.getName());
		    }
		} catch (DocumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}

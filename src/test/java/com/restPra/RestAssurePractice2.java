
package com.restPra;

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class RestAssurePractice2 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://www.dneonline.com";
		
		String req = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "  <soap:Body>\r\n"
				+ "    <Multiply xmlns=\"http://tempuri.org/\">\r\n"
				+ "      <intA>2</intA>\r\n"
				+ "      <intB>5</intB>\r\n"
				+ "    </Multiply>\r\n"
				+ "  </soap:Body>\r\n"
				+ "</soap:Envelope>";
		String xmlString ="<?xml version=\"1.0\"?>\r\n"
				+ "<catalog>\r\n"
				+ "   <book id=\"bk101\">\r\n"
				+ "      <author>Gambardella, Matthew</author>\r\n"
				+ "      <title>XML Developer's Guide</title>\r\n"
				+ "      <genre>Computer</genre>\r\n"
				+ "      <price>44.95</price>\r\n"
				+ "      <publish_date>2000-10-01</publish_date>\r\n"
				+ "      <description>An in-depth look at creating applications \r\n"
				+ "      with XML.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk102\">\r\n"
				+ "      <author>Ralls, Kim</author>\r\n"
				+ "      <title>Midnight Rain</title>\r\n"
				+ "      <genre>Fantasy</genre>\r\n"
				+ "      <price>5.95</price>\r\n"
				+ "      <publish_date>2000-12-16</publish_date>\r\n"
				+ "      <description>A former architect battles corporate zombies, \r\n"
				+ "      an evil sorceress, and her own childhood to become queen \r\n"
				+ "      of the world.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk103\">\r\n"
				+ "      <author>Corets, Eva</author>\r\n"
				+ "      <title>Maeve Ascendant</title>\r\n"
				+ "      <genre>Fantasy</genre>\r\n"
				+ "      <price>5.95</price>\r\n"
				+ "      <publish_date>2000-11-17</publish_date>\r\n"
				+ "      <description>After the collapse of a nanotechnology \r\n"
				+ "      society in England, the young survivors lay the \r\n"
				+ "      foundation for a new society.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk104\">\r\n"
				+ "      <author>Corets, Eva</author>\r\n"
				+ "      <title>Oberon's Legacy</title>\r\n"
				+ "      <genre>Fantasy</genre>\r\n"
				+ "      <price>5.95</price>\r\n"
				+ "      <publish_date>2001-03-10</publish_date>\r\n"
				+ "      <description>In post-apocalypse England, the mysterious \r\n"
				+ "      agent known only as Oberon helps to create a new life \r\n"
				+ "      for the inhabitants of London. Sequel to Maeve \r\n"
				+ "      Ascendant.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk105\">\r\n"
				+ "      <author>Corets, Eva</author>\r\n"
				+ "      <title>The Sundered Grail</title>\r\n"
				+ "      <genre>Fantasy</genre>\r\n"
				+ "      <price>5.95</price>\r\n"
				+ "      <publish_date>2001-09-10</publish_date>\r\n"
				+ "      <description>The two daughters of Maeve, half-sisters, \r\n"
				+ "      battle one another for control of England. Sequel to \r\n"
				+ "      Oberon's Legacy.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk106\">\r\n"
				+ "      <author>Randall, Cynthia</author>\r\n"
				+ "      <title>Lover Birds</title>\r\n"
				+ "      <genre>Romance</genre>\r\n"
				+ "      <price>4.95</price>\r\n"
				+ "      <publish_date>2000-09-02</publish_date>\r\n"
				+ "      <description>When Carla meets Paul at an ornithology \r\n"
				+ "      conference, tempers fly as feathers get ruffled.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk107\">\r\n"
				+ "      <author>Thurman, Paula</author>\r\n"
				+ "      <title>Splish Splash</title>\r\n"
				+ "      <genre>Romance</genre>\r\n"
				+ "      <price>4.95</price>\r\n"
				+ "      <publish_date>2000-11-02</publish_date>\r\n"
				+ "      <description>A deep sea diver finds true love twenty \r\n"
				+ "      thousand leagues beneath the sea.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk108\">\r\n"
				+ "      <author>Knorr, Stefan</author>\r\n"
				+ "      <title>Creepy Crawlies</title>\r\n"
				+ "      <genre>Horror</genre>\r\n"
				+ "      <price>4.95</price>\r\n"
				+ "      <publish_date>2000-12-06</publish_date>\r\n"
				+ "      <description>An anthology of horror stories about roaches,\r\n"
				+ "      centipedes, scorpions  and other insects.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk109\">\r\n"
				+ "      <author>Kress, Peter</author>\r\n"
				+ "      <title>Paradox Lost</title>\r\n"
				+ "      <genre>Science Fiction</genre>\r\n"
				+ "      <price>6.95</price>\r\n"
				+ "      <publish_date>2000-11-02</publish_date>\r\n"
				+ "      <description>After an inadvertant trip through a Heisenberg\r\n"
				+ "      Uncertainty Device, James Salway discovers the problems \r\n"
				+ "      of being quantum.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk110\">\r\n"
				+ "      <author>O'Brien, Tim</author>\r\n"
				+ "      <title>Microsoft .NET: The Programming Bible</title>\r\n"
				+ "      <genre>Computer</genre>\r\n"
				+ "      <price>36.95</price>\r\n"
				+ "      <publish_date>2000-12-09</publish_date>\r\n"
				+ "      <description>Microsoft's .NET initiative is explored in \r\n"
				+ "      detail in this deep programmer's reference.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk111\">\r\n"
				+ "      <author>O'Brien, Tim</author>\r\n"
				+ "      <title>MSXML3: A Comprehensive Guide</title>\r\n"
				+ "      <genre>Computer</genre>\r\n"
				+ "      <price>36.95</price>\r\n"
				+ "      <publish_date>2000-12-01</publish_date>\r\n"
				+ "      <description>The Microsoft MSXML3 parser is covered in \r\n"
				+ "      detail, with attention to XML DOM interfaces, XSLT processing, \r\n"
				+ "      SAX and more.</description>\r\n"
				+ "   </book>\r\n"
				+ "   <book id=\"bk112\">\r\n"
				+ "      <author>Galos, Mike</author>\r\n"
				+ "      <title>Visual Studio 7: A Comprehensive Guide</title>\r\n"
				+ "      <genre>Computer</genre>\r\n"
				+ "      <price>49.95</price>\r\n"
				+ "      <publish_date>2001-04-16</publish_date>\r\n"
				+ "      <description>Microsoft Visual Studio 7 is explored in depth,\r\n"
				+ "      looking at how Visual Basic, Visual C++, C#, and ASP+ are \r\n"
				+ "      integrated into a comprehensive development \r\n"
				+ "      environment.</description>\r\n"
				+ "   </book>\r\n"
				+ "</catalog>";
		
		Response resp = given().body(req).contentType("text/xml")//.auth().oauth2(DEFAULT_BODY_ROOT_PATH)//.basic(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
		.when().post("/calculator.asmx")
		.then().log().all().extract().response();
		
		XmlPath xp = new XmlPath(xmlString);
		System.out.println(xp.getList("catalog.book"));
		
	}
	
}
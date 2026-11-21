package aulas.xml;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class EscreverExemplo2 {
    public static void main(String[] args) throws Exception  {
        
        // carregar um arquivo existente
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();        
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse( new File("./arquivo.xml") );
        
        // raiz
        Element raiz = doc.getDocumentElement();
        
        // elementos
        Element paiB = doc.createElement( "pai_B" );
        paiB.setAttribute("atributo1", "value");
        paiB.setAttribute("atributo2", "value");
        
        Element filhoB1 = doc.createElement( "filho_B1" );
        filhoB1.setAttribute("atributo1", "value");
        filhoB1.setAttribute("atributo2", "value");
        filhoB1.setTextContent( "conteudo" );
        
        Element filhoB2 = doc.createElement( "filho_B2" );
        filhoB2.setAttribute("atributo1", "value");
        filhoB2.setAttribute("atributo2", "value");
        
        Element netoB2 = doc.createElement( "neto_B2" );
        netoB2.setAttribute("atributo1", "value");
        netoB2.setAttribute("atributo2", "value");
        netoB2.setTextContent( "conteudo" );
        
        filhoB2.appendChild( netoB2 );
                
        paiB.appendChild( filhoB1 );
        paiB.appendChild( filhoB2 );
        
        raiz.appendChild( paiB );
        
        // salvar
        FileOutputStream output = new FileOutputStream("./arquivo.xml");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        String xsl = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"><xsl:output method=\"xml\" omit-xml-declaration=\"yes\" indent=\"yes\"/><xsl:strip-space elements=\"*\"/><xsl:template match=\"node()|@*\"><xsl:copy><xsl:apply-templates select=\"node()|@*\"/></xsl:copy></xsl:template></xsl:stylesheet>";
        InputStream inputStream = new ByteArrayInputStream( xsl.getBytes(StandardCharsets.UTF_8) );
        Source xslt = new StreamSource( inputStream );
        Transformer transformer = transformerFactory.newTransformer(xslt);
        
        DOMSource source = new DOMSource( doc );
        StreamResult result = new StreamResult( output );
        
        transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty( OutputKeys.ENCODING,"UTF-8" );
        transformer.transform( source, result );

    }
}

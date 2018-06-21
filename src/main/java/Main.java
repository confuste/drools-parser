import drools.DroolsParser;
import drools.LanguageLevel;
import org.drools.compiler.compiler.DroolsParserException;

/**
 * Created by alex on 21/6/18.
 */
public class Main {

    public static void main(String[] args) {

        String drl = "package com.sample\r\n " +
                "\r\nimport com.sample.DroolsTest.Message;\r\n " +
                "\r\n\r\nrule \"Hello World\"\r\n\t" +
                "@author(\"=Alejandro\")\r\n\t" +
                "@metadato_propio(\"Section 103 RTA 1988\")\r\n\t" +
                "@mimetadata(\"hola\")\r\n\tsalience 42\r\n" +
                "when\r\n        " +
                "m : Message((true==true) , (status == Message.HELLO) , status == Message.HELLO, myMessage : message )\r\n    " +
                "$binding: Persona(a,b,c); \r\n"+
                "then\r\n        " +
                "System.out.println( myMessage );\r\n" +
                "m.setMessage( \"Goodbye cruel world\" );\r\n" +
                " m.setStatus( Message.GOODBYE );\r\n" +
                "update( m );\r\n" +
                "end\r\n\r\n" +

                "rule \"GoodBye\"\r\n" +
                "@author(\"Fuster\")\r\n\tsalience 12\r\n " +
                "when\r\n" +
                "Message((false == false) || status == Message.GOODBYE || myMessage : message )\r\n" +
                "then\r\n" +
                "System.out.println( myMessage );" +
                "\r\nend\r\n";

        try {
            DroolsParser droolsParser = new DroolsParser.Builder(drl)
                                                        .languageLevel(LanguageLevel.DRL6)
                                                        .build();
        } catch (DroolsParserException e) {
            e.printStackTrace();
        }


    }
}

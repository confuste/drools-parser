package drools;

import org.drools.compiler.compiler.DrlParser;
import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.lang.descr.PackageDescr;


/**
 * Class to configure the Drools Parser.
 */
public class DroolsParser {

    private LanguageLevel languageLevel;
    private String text;
    private DrlParser parser;
    private PackageDescr pkgDescr;

    /**
     * Builder constructor to be abe to add new configurations in the future.
     */
    /* How to construct a new DroolsParser? Something like that:
     DroolsParser = new DroolsParser.Builder(rulesTxt)
                                    .languageLevel(LanguageLevel.DRL6)
                                    .build();
     */
    public static class Builder {

        private final String text;
        private LanguageLevel languageLevel;


        public Builder(String text){
            this.text = text;
        }

        public Builder languageLevel(LanguageLevel languageLevel){
            this.languageLevel = languageLevel;
            return this;
        }

        public DroolsParser build() throws DroolsParserException {
            return new DroolsParser(this);
        }
    }

    private DroolsParser(Builder builder) throws DroolsParserException {
        this.text = builder.text;
        this.languageLevel = (builder.languageLevel != null) ? builder.languageLevel : LanguageLevel.DRL6;
        this.parser = new DrlParser(this.languageLevel.getLanguageLevel(languageLevel));
        this.pkgDescr = parser.parse( null, this.text);
    }

    protected PackageDescr getPackageDescr(){
        return pkgDescr;
    }
}

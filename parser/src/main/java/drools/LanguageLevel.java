package drools;

import org.kie.internal.builder.conf.LanguageLevelOption;

/**
 * Created by alex on 21/6/18.
 */
public enum LanguageLevel {

    DRL5,
    DRL6;

    public LanguageLevelOption getLanguageLevel(LanguageLevel languageLevel){

        LanguageLevelOption languageLevelOption;

        switch (languageLevel) {
            case DRL5:
                languageLevelOption = LanguageLevelOption.DRL5;
                break;
            default:
                languageLevelOption = LanguageLevelOption.DRL6;
                break;
        }

        return languageLevelOption;
    }

}

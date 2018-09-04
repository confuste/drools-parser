package drools;

import org.kie.internal.builder.conf.LanguageLevelOption;

/**
 * Enum class to specify every language level that Drools can allow.
 */
public enum LanguageLevel {

    DRL5,
    DRL6;

    /**
     * Get the correct Language Level through our enum type
     */
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

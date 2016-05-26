package com.atuts.patterns.mediator.langugae;

/**
 * Convert english language to french
 *
 */
public class EnglishToFrenchConverter implements LanguageConverter {
    public String convert(String msg) {
        if("Hi all".equalsIgnoreCase(msg)){
            return "salut à tous";
        }

        return msg;
    }
}

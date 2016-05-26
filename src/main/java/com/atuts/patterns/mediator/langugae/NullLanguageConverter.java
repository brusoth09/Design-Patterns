package com.atuts.patterns.mediator.langugae;

/**
 * Class to convert not existing or same language conversion scenario
 *
 */
public class NullLanguageConverter implements LanguageConverter {
    public String convert(String msg) {
        return msg;
    }
}

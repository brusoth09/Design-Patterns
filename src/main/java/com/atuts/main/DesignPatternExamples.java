package com.atuts.main;

import com.atuts.patterns.factory.FactoryPattern;
import com.atuts.patterns.strategy.StrategyPattern;
import com.atuts.patterns.template.TemplatePattern;

/**
 * Explains Each and every design patterns
 *
 */
public class DesignPatternExamples {
    public static void main(String[] args) {
        DesignPatternExamples examples = new DesignPatternExamples();
        //examples.showStrategyDesignPattern();
        //examples.showTemplateDesignPattern();
        examples.showFactoryDesignPattern();
    }

    /**
     * Call Strategy Pattern
     *
     */
    private void showStrategyDesignPattern() {
        new StrategyPattern().testPattern();
    }

    /**
     * Call Template pattern
     *
     */
    private void showTemplateDesignPattern() {
        new TemplatePattern().testPattern();
    }

    /**
     * Call factory design pattern
     *
     */
    private void showFactoryDesignPattern() {
        new FactoryPattern().testPattern();
    }
}

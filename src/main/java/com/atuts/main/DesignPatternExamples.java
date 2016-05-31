package com.atuts.main;

import com.atuts.patterns.chain_of_responsibility.CORDesignPattern;
import com.atuts.patterns.factory.FactoryPattern;
import com.atuts.patterns.mediator.mediator.MediatorPattern;
import com.atuts.patterns.observer.generic.GenericObserverPattern;
import com.atuts.patterns.observer.java.JavaObserverPattern;
import com.atuts.patterns.observer.pull.PullObserverPattern;
import com.atuts.patterns.strategy.StrategyPattern;
import com.atuts.patterns.template.TemplatePattern;

/**
 * Explains Each and every design patterns
 */
public class DesignPatternExamples {
    public static void main(String[] args) {
        DesignPatternExamples examples = new DesignPatternExamples();
        //examples.showStrategyDesignPattern();
        //examples.showTemplateDesignPattern();
        //examples.showFactoryDesignPattern();
        //examples.showGenericObserverPattern();
        //examples.showPullObserverPattern();
        //examples.showJavaObserverPattern();
        //examples.showMediatorDesignPattern();
        examples.showCORDesignPattern();
    }

    /**
     * Call java observer pattern
     */
    private void showJavaObserverPattern() {    new JavaObserverPattern().testPattern(); }

    /**
     * Call pull observer pattern
     */
    private void showPullObserverPattern() {    new PullObserverPattern().testPattern(); }

    /**
     * Call generic observer pattern
     */
    private void showGenericObserverPattern() {
        new GenericObserverPattern().testPattern();
    }

    /**
     * Call Strategy Pattern
     */
    private void showStrategyDesignPattern() {
        new StrategyPattern().testPattern();
    }

    /**
     * Call Template pattern
     */
    private void showTemplateDesignPattern() {
        new TemplatePattern().testPattern();
    }

    /**
     * Call factory design pattern
     */
    private void showFactoryDesignPattern() {
        new FactoryPattern().testPattern();
    }

    /**
     * call mediator design pattern
     */
    private void showMediatorDesignPattern(){ new MediatorPattern().testPattern();}

    /**
     * call chain of responsibility pattern
     */
    private void showCORDesignPattern(){    new CORDesignPattern().testPattern();}
}

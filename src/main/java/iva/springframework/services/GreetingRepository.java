package iva.springframework.services;

/**
 * Created By iVa on 2/16/2021.
 */
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
package tests.simple;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegativeTests {

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void test00() {
        assertTrue(false);
    }

    @Test
    void test01() {
        assertTrue(false);
    }

    @Test
    void test02() {
        assertTrue(false);
    }

    @Test
    void test03() {
        assertTrue(false);
    }

}
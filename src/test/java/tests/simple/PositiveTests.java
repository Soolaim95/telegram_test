package tests.simple;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveTests {

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void test00() {
        assertTrue(true);
    }

    @Test
    void test01() {
        assertTrue(true);
    }

    @Test
    void test02() {
        assertTrue(true);
    }

    @Test
    void test03() {
        assertTrue(true);
    }

    @Test
    void test04() {
        assertTrue(true);
    }

    @Test
    void test05() {
        assertTrue(true);
    }

    @Test
    void test06() {
        assertTrue(true);
    }
}
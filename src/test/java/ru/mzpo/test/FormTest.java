package ru.mzpo.test;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class FormTest {
}

@Test

        /*@Test - это как пример из другого проекта
void shouldNotBuyDeclinedCard() {
    val page = new PaymentMethod();
    val payment = page.goToCreditPage();
    payment.inputData(DataHelper.getDeclinedCard());
    payment.getFailedNotification();
    assertEquals("DECLINED", SQLHelper.getCreditRequestStatus());





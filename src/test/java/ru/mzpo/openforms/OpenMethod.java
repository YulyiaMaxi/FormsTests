
package ru.mzpo.openforms;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.input.InPutFeedBack; //импортируем класс, к которому будем обращаться при создании метода открытия формы

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class OpenMethod {

    public final SelenideElement feedBackButton = $$(".top-sta feedback").findBy(text("Обратная связь"));


    public InPutFeedBack openFeedBack() {
        feedBackButton.click();
        return new InPutFeedBack();
    }
}
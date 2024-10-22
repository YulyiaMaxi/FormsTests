package ru.mzpo.openforms;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.input.InPutFeedBack; //импортируем класс, к которому будем обращаться при создании метода открытия формы
import ru.mzpo.input.inPutWrite2Us;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class OpenMethodWrite2Us {

    public final SelenideElement feedBackButton = $$(".top-sta feedback").findBy(text("Обратная связь"));


    public inPutWrite2Us openWrite2Us() {
        feedBackButton.click();
        return new inPutWrite2Us();
    }
}
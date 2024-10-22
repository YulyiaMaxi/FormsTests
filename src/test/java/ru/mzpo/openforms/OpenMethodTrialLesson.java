package ru.mzpo.openforms;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.input.InPutTrialLesson; //импортируем класс, к которому будем обращаться при создании метода открытия формы

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class OpenMethodTrialLesson {

    public final SelenideElement TrialLessonButton = $$(".fa fa-plus").findBy(text("Подробнее"));


    public InPutTrialLesson openFeedBack() {
        TrialLessonButton.click();
        return new InPutTrialLesson();
    }
}

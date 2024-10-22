package ru.mzpo.openforms;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.input.InPutCallBack; //импортируем класс, к которому будем обращаться при создании метода открытия формы

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class OpenMethodCallBack {

    public final SelenideElement callBackButton = $$(".top-sta callback").findBy(text("Заказать звонок"));


    public InPutCallBack openCallBack() {
        callBackButton.click();
        return new InPutCallBack();
    }
}
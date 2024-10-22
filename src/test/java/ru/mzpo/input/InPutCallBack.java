
package ru.mzpo.input;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.forms.CallBack; //импортируем класс, к которомубудем обращаться
import java.time.Duration;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class InPutCallBack {

    //создаем привязка элементов формы с их значением в коде

    private final SelenideElement heading = $$("h4").find(exactText("ЗАКАЗАТЬ ОБРАТНЫЙ ЗВОНОК"));
    private final SelenideElement formNameField = $(byText("Введите Ваше имя")).parent().$("[class=\"form-control\"]");
    private final SelenideElement formTelField = $(byText("912 345-67-89")).parent().$("[class=\"form-control masked\"]");
    private final SelenideElement sendButton = $$("btn btn-mzpo btn-lg").find(exactText(" Заказать звонок "));  //??? пробелы или \n?
    private final SelenideElement modalWindow = $$("modal-body text-center answer-modal").find(exactText("Ваша заявка принята. Скоро с вами свяжется наш менеджер"));
    private final SelenideElement closeModalWindow = $$("close").first();

    public InPutCallBack() {
        heading.shouldBe(visible);
    }
    // заполняем поля формы и отправляем заявку

    public void inputDataCallBack(CallBack callBack) {
        formNameField.setValue(callBack.getName());
        formTelField.setValue(callBack.getTel());

// отправляем форму
        sendButton.click();
    }

    // проверяем сообщение об отправке
    public void getModalWindow() {
        modalWindow.shouldBe(visible, Duration.ofSeconds(15));
        closeModalWindow.click();
    }
}



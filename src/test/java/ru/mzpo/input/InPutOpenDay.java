
package ru.mzpo.input;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.forms.OpenDay;

import java.time.Duration;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InPutOpenDay {
    public inputDataOpenDay;

    //создаем привязка элементов формы с их значением в коде

    private final SelenideElement formNameField = $(byText("Имя")).parent().$("[class=\"t-input js-tilda-rule t-input_bbonly\"]");
    private final SelenideElement formSurnameField = $(byText("Фамилия")).parent().$("[class=\"t-input js-tilda-rule t-input_bbonly\"]");
    private final SelenideElement formTelField = $(byText("(999) 999-99-99")).parent().$("[class=\"t-input t-input-phonemask\"]");
    private final SelenideElement formEmailField = $(byText("email")).parent().$("[class=\"t-input js-tilda-rule t-input_bbonly\"]");
    private final SelenideElement sendButton = $$("t-submit").find(exactText("\n" +
            "Записаться "));  //??? пробелы или \n?
    private final SelenideElement modalWindow = $$("js-successbox t-form__successbox t-text t-text_md").find(exactText("Вы зарегистрированы на мероприятие"));
    private final SelenideElement checkBox = $$("t-checkbox__indicator").first();
    private final SelenideElement closeModalWindow = $$("t-popup__close-icon").first();

    public InPutOpenDay() {
    }

       // заполняем поля формы и отправляем заявку

    public void inputDataOpenDay() {
        formNameField.setValue(OpenDay.getName());
        formSurnameField.setValue(openDay.getSurname());
        formEmailField.setValue(openDay.getEmail());
        formTelField.setValue(openDay.getTel());
        sendButton.click();

// отправляем форму
        checkBox.click();
    }

    // проверяем сообщение об отправке
    public void getModalWindow() {
        modalWindow.shouldBe(visible, Duration.ofSeconds(15));
        closeModalWindow.click();
    }
}

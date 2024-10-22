
package ru.mzpo.input;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.forms.CallBack; //импортируем класс, к которомубудем обращаться
import ru.mzpo.forms.TrialLesson;

import java.time.Duration;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InPutTrialLesson {

    //создаем привязка элементов формы с их значением в коде

    private final SelenideElement heading = $$("h1").find(exactText("Бесплатный пробный урок"));
    private final SelenideElement formNameField = $(byText("Введите Ваше имя")).parent().$("[class=\"form-control\"]");
    private final SelenideElement formSurnameField = $(byText("Введите вашу фамилию")).parent().$("[class=\"form-control\"]");
    private final SelenideElement formEmailField = $$("name").find(exactText("email"));
    private final SelenideElement formTelField = $(byText("912 345-67-89")).parent().$("[class=\"form-control masked\"]");
    private final SelenideElement sendButton = $$("btn btn-red").find(exactText("Зарегистрироваться"));
    private final SelenideElement modalWindow = $$("modal-body text-center answer-modal").find(exactText("Ваша заявка принята. Скоро с вами свяжется наш менеджер"));
    private final SelenideElement closeModalWindow = $$("close").first();

    public InPutTrialLesson() {
        heading.shouldBe(visible);
    }
    // заполняем поля формы и отправляем заявку

    public void inputDataTrialLesson(TrialLesson trialLesson) {
        formNameField.setValue(trialLesson.getName());
        formSurnameField.setValue(trialLesson.getSurname());
        formEmailField.setValue(trialLesson.getEmail());
        formTelField.setValue(trialLesson.getTel());

// отправляем форму
        sendButton.click();
    }

    // проверяем сообщение об отправке
    public void getModalWindow() {
        modalWindow.shouldBe(visible, Duration.ofSeconds(15));
        closeModalWindow.click();
    }
}
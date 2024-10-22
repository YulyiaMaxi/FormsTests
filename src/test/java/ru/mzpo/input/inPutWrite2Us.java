
package ru.mzpo.input;

import com.codeborne.selenide.SelenideElement;
import ru.mzpo.forms.Write2Us;

import java.time.Duration;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class inPutWrite2Us{

    //создаем привязка элементов формы с их значением в коде

    private final SelenideElement heading = $(byText(" НАПИШИТЕ НАМ! ")).parent().$("[class=\"text-center fs-30 uppercase bold mb-20\"]");
    private final SelenideElement formNameField = $(byText("Введите Ваше имя")).parent().$("[class=\"form-control\"]");
    private final SelenideElement formEmailField = $(byText("Введите Ваш e-mail")).parent().$("[class=\"form-control\"]");
    private final SelenideElement formTelField = $(byText("912 345-67-89")).parent().$("[class=\"form-control masked\"]");
    private final SelenideElement formMessageField = $(byText("Введите сообщение")).parent().$("[class=\"form-control h-130\"]");
    private final SelenideElement sendButton = $$("btn btn-mzpo w-100p").find(exactText("Отправить"));
    private final SelenideElement modalWindow = $$("modal-body text-center answer-modal").find(exactText("Ваша заявка принята. Скоро с вами свяжется наш менеджер"));
    private final SelenideElement closeModalWindow = $$("close").first();


    public void inPutWrite2Us() {
        heading.shouldBe(visible);
    }
    //     heading.shouldBe(visible);
  //  }
    // заполняем поля формы и отправляем заявку

    public void inputWrite2Us (Write2Us write2Us) {
        formNameField.setValue(write2Us.getName());
        formEmailField.setValue(write2Us.getEmail());
        formTelField.setValue(write2Us.getTel());
        formMessageField.setValue(write2Us.getMessage());
// отправляем форму
        sendButton.click();
    }

    // проверяем сообщение об отправке
    public void getModalWindow() {
        modalWindow.shouldBe(visible, Duration.ofSeconds(15));
        closeModalWindow.click();
    }
}

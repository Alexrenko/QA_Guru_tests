import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Browsers.SAFARI;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = SAFARI;

        open("https://dadata.ru/#authorization_popup");
        $("#signin-popup").shouldHave(text("Войдите или зарегистрируйтесь"));
        $("[name=login-email]").setValue("alex.renko@mail.ru");
        $("[name=login-password]").setValue("918273ru");
        $(".button.popup__button").click();
    }

    @Test
    void unsuccessfulLoginTest() {

    }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Parameter;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop()  {
        Configuration.holdBrowserOpen = true;
        //открыть главную страницу
        open("https://github.com/");

        //ввести в поле поиска selenide и нажать enter
        $("[class~='header-search-button'] span[data-target='qbsearch-input.inputButtonText']").click();
        $("input[name='query-builder-test']").setValue("selenide").pressEnter();

        //кликнуть на первый репозиторий из списка найденных
        $$("div[data-testid='results-list'] div").first().$("a").click();

        //проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));
    }
}

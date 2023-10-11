import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void solntsevShouldBeTheTopContributor() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://github.com";
        //Открыть страницу репозитория Selenide
        open("/selenide/selenide");
        //open("/", AuthenticationType.BASIC, )
        //Подвести мышку к первому аватару блока contributors
        $(".BorderGrid").$(Selectors.byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li").first().hover();
        //Проверка: во вскплывающем окне есть Andrei Solntsev
        $("section[aria-label='User login and name']")
                .shouldHave(Condition.text("Andrei Solntsev"));
        //$$(".Popover").findBy(Condition.visible)
        //        .shouldHave(Condition.text("Andrei Solntsev"));
    }
}

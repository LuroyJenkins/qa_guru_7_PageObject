package pages.components;

import com.codeborne.selenide.SelenideElement;

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableResultComponent {
    SelenideElement tableResultFrame = $(".table-responsive");

    public void tableLinesCheck(Map<String, String[]> tableMatches) {
        for (Map.Entry<String, String[]> entry : tableMatches.entrySet()) {
            for (String value : entry.getValue())
                tableResultFrame.$(byText(entry.getKey())).parent().shouldHave(text(value));
        }
    }
}

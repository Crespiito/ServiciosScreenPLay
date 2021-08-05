package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/administraciondecuentas/obtener_token.feature",
        glue = {"stepdefinitions", "hooks", "datatype"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class GenerateTokenRunner {
}

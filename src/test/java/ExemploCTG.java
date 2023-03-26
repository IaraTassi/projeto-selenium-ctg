import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ExemploCTG {


    @Test
    @DisplayName("Quando pegar o site principal, então devo ver o título viniciuspessoni")

    public void verificaHomePage () {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        String basePage = "https://viniciuspessoni.com/";

        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "";

        driver.get(basePage);

        tituloEncontrado = driver.findElement(By.cssSelector("#et-boc > div > div > div.et_pb_section.et_pb_section_0.et_section_regular > div.et_pb_row.et_pb_row_0 > div > div.et_pb_module.et_pb_text.et_pb_text_0.et_pb_text_align_left.et_pb_bg_layout_light > div > h1")).getText();

        System.out.println("título Encontrado"+tituloEncontrado);

        assertThat(tituloEncontrado, containsString(tituloEsperado));

        driver.close();

    }

}

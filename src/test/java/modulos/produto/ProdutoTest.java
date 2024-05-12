package modulos.produto;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.*;
import telas.LoginTela;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@DisplayName("Mobile Product Test Module")
public class ProdutoTest {

    private AndroidDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Google Pixel 3")
                .setPlatformName("Android")
                .setUdid("192.168.56.105:5555")
                .setAppPackage("com.lojinha")
                .setAppActivity("com.lojinha.ui.MainActivity")
                .setApp("/Users/alexandro/Projects/LojinhaAndroidNativa/lojinha-nativa-bugada.apk");

        this.app = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), options
        );

        this.app.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterEach
    public void afterEach(){
       app.quit();
    }

    @DisplayName("Not allowed product value")
    @Test
    public void testNotAllowedProductValueValidation() {
        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaAdicaoProduto()
                .preencherNomeProduto("iPhone")
                .preencherValorProduto("700001") // .preencherCoresProduto("preto , branco")
                .submissaoComErro()
                .obterMensagemDeErro();

        // Assert invalid value message
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }
}

package telas;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FormularioAdicaoProdutoTela extends  BaseTela{

    public FormularioAdicaoProdutoTela(AndroidDriver app) {
        super(app);
    };


    public  FormularioAdicaoProdutoTela preencherNomeProduto(String produtoNome) {
        app.findElement(AppiumBy.id("com.lojinha:id/productName")).click();
        app.findElement(AppiumBy.id("com.lojinha:id/productName")).findElement(AppiumBy.id("com.lojinha:id/editText")).sendKeys(produtoNome);
        return this;
    };

    public FormularioAdicaoProdutoTela preencherValorProduto(String produtoValor) {
        app.findElement(AppiumBy.id("com.lojinha:id/productValue")).click();
        app.findElement(AppiumBy.id("com.lojinha:id/productValue")).findElement(AppiumBy.id("com.lojinha:id/editText")).sendKeys(produtoValor);
        return this;
    };

    public FormularioAdicaoProdutoTela preencherCoresProduto(String produtoCores) {
        app.findElement(AppiumBy.id("com.lojinha:id/productColors")).click();
        app.findElement(AppiumBy.id("com.lojinha:id/productColors")).findElement(AppiumBy.id("com.lojinha:id/editText")).sendKeys(produtoCores);
        return this;
    }

    public FormularioAdicaoProdutoTela submissaoComErro() {
        app.findElement(AppiumBy.id("com.lojinha:id/saveButton")).click();
        return this;
    };

    public String obterMensagemDeErro() {
        return capturarToast();
    }
}

package telas;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ListagemDeProdutosTela extends  BaseTela{

    public ListagemDeProdutosTela(AndroidDriver app) {
        super(app);
    };

    public FormularioAdicaoProdutoTela abrirTelaAdicaoProduto() {
        app.findElement(AppiumBy.id("com.lojinha:id/floatingActionButton")).click();
        return new FormularioAdicaoProdutoTela(app);
    };
}

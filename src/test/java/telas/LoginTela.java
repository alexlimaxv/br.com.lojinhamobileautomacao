package telas;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginTela extends BaseTela{

    public LoginTela(AndroidDriver app) {
        super(app);
    };

    public LoginTela preencherUsuario(String usuario){
        app.findElement(AppiumBy.id("com.lojinha:id/user")).click();
        app.findElement(AppiumBy.id("com.lojinha:id/user")).findElement(AppiumBy.id("com.lojinha:id/editText")).sendKeys(usuario);
        return  this;
    };

    public LoginTela preencherSenha(String senha){
        app.findElement(AppiumBy.id("com.lojinha:id/password")).click();
        app.findElement(AppiumBy.id("com.lojinha:id/password")).findElement(AppiumBy.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    };

    public ListagemDeProdutosTela submeterLogin(){
        app.findElement(AppiumBy.id("com.lojinha:id/loginButton")).click();
        return new ListagemDeProdutosTela(app);
    }
}

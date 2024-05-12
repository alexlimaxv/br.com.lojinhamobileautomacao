package telas;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BaseTela {
    protected AndroidDriver app;

    public BaseTela(AndroidDriver app) {
        this.app = app;
    };

    public String capturarToast() {
        return app.findElement(AppiumBy.xpath("//android.widget.Toast")).getText();
    }
}

package Task2;

public interface RemoteWebDriver extends TakesScreenshot,WebDriver{
    void navigate();

}
interface TakesScreenshot {
    void getScreenshot();
}
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate in Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Gets a Screenshot in Chrome");
    }

    @Override
    public void open() {
        System.out.println("Opens a page in Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closes a page in Chrome");
    }

    @Override
    public String getTitle() {
        return "Page title in Chrome";
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate in FireFox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Gets a Screenshot in FireFox");
    }

    @Override
    public void open() {
        System.out.println("Opens a page in FireFox");
    }

    @Override
    public void close() {
        System.out.println("Closes a page in FireFox");
    }

    @Override
    public String getTitle() {
        return "Page title in FireFox";
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate in Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Gets a Screenshot in Safari");
    }

    @Override
    public void open() {
        System.out.println("Opens a page in Safari");
    }

    @Override
    public void close() {
        System.out.println("Closes a page in Safari");
    }

    @Override
    public String getTitle() {
        return "Page title in Safari";
    }
}
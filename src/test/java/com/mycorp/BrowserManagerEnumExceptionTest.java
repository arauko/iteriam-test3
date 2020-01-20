package com.mycorp;

import io.github.bonigarcia.wdm.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

@RunWith(JUnit4.class)
public class BrowserManagerEnumExceptionTest {

    @Test(expected = IllegalStateException.class)
//    @Ignore
    public void shouldCheckOfThrowException(){
        BrowserManagerEnum of = BrowserManagerEnum.of( "chrome" );
        Assert.assertEquals( BrowserManagerEnum.CHROME, of );
        Assert.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof ChromeDriverManager );
        Assert.assertTrue( of.getDriver() instanceof ChromeDriver);
    }

    @Test(expected = WebDriverException.class)
//    @Ignore
    public void shouldCheckOfFirefoxException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "firefox" );
        Assert.assertEquals( BrowserManagerEnum.FIREFOX, of );
        Assert.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assert.assertTrue( of.getDriver() instanceof FirefoxDriver);
    }

    @Test(expected = IllegalStateException.class)
//    @Ignore
    public void shouldCheckOfEdgeException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "edge" );
        Assert.assertEquals( BrowserManagerEnum.EDGE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof EdgeDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof EdgeDriverManager );
        Assert.assertTrue( of.getDriver() instanceof EdgeDriver);
    }

    @Test(expected = IllegalStateException.class)
//    @Ignore
    public void shouldCheckOfIEException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "ie" );
        Assert.assertEquals( BrowserManagerEnum.IE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof InternetExplorerDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof InternetExplorerDriverManager );
        Assert.assertTrue( of.getDriver() instanceof InternetExplorerDriver);
    }

    @Test(expected = WebDriverException.class)
//    @Ignore
    public void shouldCheckOfMarionetteException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "marionette" );
        Assert.assertEquals( BrowserManagerEnum.MARIONETTE, of );
        Assert.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assert.assertTrue( of.getDriver() instanceof FirefoxDriver);
    }

    @Test(expected = IllegalStateException.class)
//    @Ignore
    public void shouldCheckOfOperaException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "opera" );
        Assert.assertEquals( BrowserManagerEnum.OPERA, of );
        Assert.assertTrue( of.getBrowserManager() instanceof OperaDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof OperaDriverManager );
        Assert.assertTrue( of.getDriver() instanceof OperaDriver);
    }

    @Test(expected = IllegalStateException.class)
//    @Ignore
    public void shouldCheckOfPhantomJSException() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "phantomjs" );
        Assert.assertEquals( BrowserManagerEnum.PHANTOMJS, of );
        Assert.assertTrue( of.getBrowserManager() instanceof PhantomJsDriverManager);
        Assert.assertTrue( of.getBrowserManager( "1" ) instanceof PhantomJsDriverManager );
        Assert.assertTrue( of.getDriver() instanceof PhantomJSDriver);
    }

}

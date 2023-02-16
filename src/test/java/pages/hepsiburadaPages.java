package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.List;

public class hepsiburadaPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;



    By populerKategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Popüler Kategoriler\")");
    By erkekGiyimButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Erkek Giyim\")");
    By filtreleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By uygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By urunleriGorButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ürünleri Gör (15)\")");
    By siralaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sırala\")");
    By urun = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Pierre Cardin Erkek Suni Deri Mont\")");
    By sepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/product_detail_add_to_cart_text\")");
    By alisveriseDevamEtButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Alışverişe devam et\")");
    By textAramaButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/iv_toolbar_search\")");
    By textGirisi = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/etSearchBox\")");
    By arama = MobileBy.AndroidUIAutomator("new UiSelector().text(\"deri eldiven\")");
    By popup= MobileBy.AndroidUIAutomator("new UiSelector().text(\"100 TL üzeri kargo bedava\")");
    By filtrelemeSonucu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ürünleri Gör (262)\")");
    By eldivenBedeni = MobileBy.AndroidUIAutomator("new UiSelector().text(\"L\")");
    By sepetKontrol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"onboarding_item_list\")");
    public hepsiburadaPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoriButonu() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/navigation_bar_item_small_label_view\")"));
        elementiIndexIleSecme.get(0).click();

    }

    public void populerKategoriButonu() {
        driver.findElement(populerKategorilerButonu).click();
    }

    public void erkekGiyim() {
        driver.findElement(erkekGiyimButonu).click();
    }

    public void filtreleme() {
        driver.findElement(filtreleButonu).click();
    }

    public void markaFiltrele() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvFilterName\")"));
        elementiIndexIleSecme.get(1).click();
    }

    public void markaSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvMultiSelection\")"));
        elementiIndexIleSecme.get(0).click();
        elementiIndexIleSecme.get(4).click();
        elementiIndexIleSecme.get(6).click();
    }

    public void uygulaButonu() {
        driver.findElement(uygulaButonu).click();
    }

    public void bedenFiltrele() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvFilterName\")"));
        elementiIndexIleSecme.get(5).click();
    }

    public void bedenSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/cbMultiSelection\")"));
        elementiIndexIleSecme.get(4).click();
    }

    public void fiyatAraligiFiltresi() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvFilterName\")"));
        elementiIndexIleSecme.get(2).click();
    }

    public void fiyatAraligiSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/cbMultiSelection\")"));
        elementiIndexIleSecme.get(7).click();
    }

    public void urunleriGorButonu() {
        driver.findElement(urunleriGorButonu).click();
    }

    public void siralaButonu() {
        driver.findElement(siralaButonu).click();
    }

    public void siralamaSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/radioButton\")"));
        elementiIndexIleSecme.get(4).click();
    }

    public void uruneTikla() {
        driver.findElement(urun).click();
    }
    public void popupOnay() {
        driver.findElement(popup).click();
    }

    public void sepeteEkle() {
        driver.findElement(sepeteEkleButonu).click();
    }


    public void alisveriseDevamEt() {
        driver.findElement(alisveriseDevamEtButonu).click();
    }

    public void aramaTexti() {
        driver.findElement(textAramaButonu).click();
    }

    public void textGir() {
        driver.findElement(textGirisi).sendKeys("Deri Eldiven");
    }

    public void aramaButonu() {
        driver.findElement(arama).click();
    }

    public void cinsiyetFiltresi() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvFilterName\")"));
        elementiIndexIleSecme.get(6).click();
    }

    public void cinsiyetSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/cbMultiSelection\")"));
        elementiIndexIleSecme.get(0).click();
    }
    public void filtrelenenUrun() {
        driver.findElement(filtrelemeSonucu).click();
    }
    public void eldiveniSepeteEkle() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/atcb_product_list_item_add_to_cart\")"));
        elementiIndexIleSecme.get(0).click();
    }
    public void eldivenBedeni() {
        driver.findElement(eldivenBedeni).click();
    }

    public void sepetimeGit() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/navigation_bar_item_small_label_view\")"));
        elementiIndexIleSecme.get(1).click();
    }

    public void sepetteUrunKontrolu() {
        elementHelper.checkVisible(sepetKontrol);
    }
}
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hepsiburadaPages;
import util.DriverFactory;

public class hepsiburadaStepDefinitions {
    hepsiburadaPages hepsiburadaPages = new hepsiburadaPages(DriverFactory.getDriver());
    @Given("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        hepsiburadaPages.kategoriButonu();
    }

    @When("Populer kategorilere tiklanir")
    public void populerKategorilereTiklanir() {
        hepsiburadaPages.populerKategoriButonu();
    }

    @When("Erkek giyim secilir")
    public void erkekGiyimSecilir() {
        hepsiburadaPages.erkekGiyim();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {
        hepsiburadaPages.filtreleme();
    }

    @When("Marka filtrelemesine tiklanir")
    public void markaFiltrelemesineTiklanir() {
        hepsiburadaPages.markaFiltrele();
    }

    @When("Markalar secilir")
    public void markalarSecilir() {
        hepsiburadaPages.markaSec();
    }

    @When("Uygula butonuna tiklanir")
    public void uygulaButonunaTiklanir() {
        hepsiburadaPages.uygulaButonu();
    }

    @When("Beden filtrelemesine tiklanir")
    public void bedenFiltrelemesineTiklanir() {
        hepsiburadaPages.bedenFiltrele();
    }

    @When("Beden secilir")
    public void bedenSecilir() {
        hepsiburadaPages.bedenSec();
    }

    @When("Fiyat araligi filtrelemesine tiklanir")
    public void fiyatAraligiFiltrelemesineTiklanir() {
        hepsiburadaPages.fiyatAraligiFiltresi();
    }

    @When("Fiyat araligi secilir")
    public void fiyatAraligiSecilir() {
        hepsiburadaPages.fiyatAraligiSec();
    }

    @When("Urunleri gor butonuna tiklanir")
    public void urunleriGorButonunaTiklanir() {
        hepsiburadaPages.urunleriGorButonu();
    }

    @When("Sirala butonuna tiklanir")
    public void siralaButonunaTiklanir() {
        hepsiburadaPages.siralaButonu();
    }

    @When("Siralama secilir")
    public void siralamaSecilir() {
        hepsiburadaPages.siralamaSec();
    }

    @When("Urune tiklanir")
    public void uruneTiklanir() {
        hepsiburadaPages.uruneTikla();
    }
    @When("Popup onaylanir")
    public void popupOnaylanir() {
        hepsiburadaPages.popupOnay();
    }

    @When("Sepete ekle butonuna tiklanir")
    public void sepeteEkleButonunaTiklanir() {
        hepsiburadaPages.sepeteEkle();
    }

    @When("Alisverise devam et butonuna tiklanir")
    public void alisveriseDevamEtButonunaTiklanir() {
        hepsiburadaPages.alisveriseDevamEt();
    }

    @When("Arama textine tiklanir")
    public void aramaTextineTiklanir() {
        hepsiburadaPages.aramaTexti();
    }

    @When("Deri eldiven yazilir")
    public void deriEldivenYazilir() {
        hepsiburadaPages.textGir();
    }

    @When("Arama aratilir")
    public void aramaAratilir() {
        hepsiburadaPages.aramaButonu();
    }

    @When("Cinsiyet filtrelemesine tiklanir")
    public void cinsiyetFiltrelemesineTiklanir() {
        hepsiburadaPages.cinsiyetFiltresi();
    }

    @When("Cinsiyet secilir")
    public void cinsiyetSecilir() {
        hepsiburadaPages.cinsiyetSec();
    }

    @When("Filtrelenen urunleri gor")
    public void filtrelenenUrunleriGor(){
        hepsiburadaPages.filtrelenenUrun();
    }
    @When("Eldiven sepete ekle butonuna tiklanir")
    public void eldivenSepeteEkleButonunaTiklanir() {
        hepsiburadaPages.eldiveniSepeteEkle();
    }
    @When("Beden secimi yapilir")
    public void bedenSecimiYapilir() {
        hepsiburadaPages.eldivenBedeni();
    }

    @When("Sepetime tiklanir")
    public void sepetimeTiklanir() {
        hepsiburadaPages.sepetimeGit();
    }

    @Then("Sepete urunlerin geldiginin kontrolu yapilir")
    public void sepeteUrunlerinGeldigininKontroluYapilir() {
        hepsiburadaPages.sepetteUrunKontrolu();
    }



}

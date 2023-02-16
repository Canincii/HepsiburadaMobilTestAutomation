# HepsiburadaMobilTestAutomation

ConfigReader sınıfı :
- Java sınıfıdır ve bu sınıf bir "config.properties" dosyasını yüklemek için tasarlanmıştır.
-"initialize_Properties" metodu, "config.properties" dosyasını "FileInputStream" aracılığıyla okuyacak ve Properties nesnesine yükleyecektir. 
Eğer dosya bulunamazsa, "FileNotFoundException" gösterilir. Eğer dosya okunamadıysa, "IOException" gösterilir.
-"getProperties" metodu, okunan Properties nesnesini döndürür.

DriverFactory sınıfı:
-Tarayıcı türüne göre, DesiredCapabilities nesnesi oluşturulur ve tarayıcı türüne göre belirli özellikler (örneğin, platformName, udid, appPackage, appActivity) atanır.
Daha sonra, URL "http://0.0.0.0:4723/wd/hub" üzerinden bir AppiumDriver nesnesi oluşturulur ve tarayıcı tarafından yapılacak beklemeler için bir zaman sınırı belirlenir.
Son olarak, oluşturulan AppiumDriver nesnesi döndürülür.

ElementHelper sınıfı :
-Bu sınıf, bir Appium sürücüsü için element helper metodları sağlar. 
Bu sınıf, Appium sürücüsü, WebDriver beklemesi ve Actions (web tarayıcısı üzerinde işlem yapmak için kullanılan bir sınıf) nesnelerini örnekler.
-presenceElement metodu: Belirtilen anahtarın bulunabildiği bir WebElement döndürür.
-findElement metodu: presenceElement metodunu çağırarak, belirtilen anahtarı kullanarak bir WebElement bulur.
-click metodu: findElement metodunu kullanarak belirtilen anahtardaki elementi tıklar.
-sendKeys metodu: findElement metodunu kullanarak belirtilen anahtardaki elemente belirtilen text'i gönderir.
-checkVisible metodu: Belirtilen anahtarla birlikte belirtilen elementin bulunabildiğini bekler.

Hooks Sınıfı : 
-@Before annotation'ı, her test metodu çalıştırılmadan önce otomatik olarak çağrılır ve önceden ayarlanmış yapılandırma veya ayarlar için kullanılır. 
Bu projede, before() metodu, hangi tarayıcıyı kullanacağına dair bilgileri elde etmek için TestNG'in Reporter sınıfını kullanarak XML dosyasından bilgi okur, 
ardından ConfigReader sınıfı kullanılarak proje ayarlarını yükledi ve ardından DriverFactory sınıfını kullanarak seçilen tarayıcı 
için sürücüyü başlattı.

@After annotation'ı ise her test metodu tamamlandıktan sonra otomatik olarak çağrılır ve kaynakları serbest bırakmak ve temizlemek için kullanılır. 
Bu projede after() metodu, sürücüyü kapatmak için driver.quit() metodunu kullandım.

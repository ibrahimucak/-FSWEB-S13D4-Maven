#  Java Encapsulation

Bu projede, Point adında iki boyutlu bir noktayı temsil eden bir sınıf oluşturduk. Bu sınıf, iki nokta arasındaki uzaklığı hesaplamamızı sağlayan çeşitli distance metotları içeriyor. Uygulamada, farklı noktalara olan uzaklıkları bulmak için üç farklı distance metodunun overload edilmesi hedeflenmiştir.

distance(): Hiçbir parametre almazsa, (0,0) noktasına olan uzaklığı hesaplar.
distance(Point p): Başka bir Point objesi aldığında, mevcut noktayla bu nokta arasındaki uzaklığı hesaplar.
distance(int a, int b): (a, b) koordinatlarına olan uzaklığı bulur.
Bu metotlar, uzaklık hesaplaması için Öklid Mesafesi kullanır. Formül, iki nokta arasındaki farkların karelerinin toplamının karekökü alınarak hesaplanır (√((xB - xA)² + (yB - yA)²)). Java'da karekök hesaplaması için Math.sqrt fonksiyonundan yararlanılmıştır.
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

Bu sınıfla, Point nesneleri arasındaki mesafeleri esnek ve doğru bir şekilde hesaplamak için kullanışlı bir araç elde ettik.



### Player Sınıfı
 
Bu projede, temel bir oyun karakteri yönetimi sistemi oluşturdum. Ana sınıfımız Player olup, bu sınıf oyuncunun ismini (name), sağlık yüzdesini (healthPercentage), ve silahını (Weapon) içeriyor. Weapon sınıfı, farklı hasar ve saldırı hızlarına sahip silahları tanımlayan bir enum olarak yapılandırıldı.

Player sınıfının içindeki değişkenler dışarıdan erişilemez, böylece veri güvenliği sağlandı. Bu sınıfın bir yapıcı metodu (constructor) ile değişkenleri ilk başta ayarlamak mümkün.
Sağlık yüzdesi (%100 ile %0 arasında) otomatik olarak sınırlandırılarak, olası hatalar minimize edildi.
Player sınıfı ayrıca, sağlık değerini döndüren (healthRemaining), aldığı hasarı düşen (loseHealth), ve sağlık iksirleriyle iyileştiren (restoreHealth) metotları içerir.
Sağlık %0’a düştüğünde, oyuncunun oyundan elendiği mesajı iletilir.
Bu yapıyla, oyuncuların sağlık durumlarını ve silah özelliklerini kolayca yönetebilir ve oyunun mantığını geliştirmek için temel bir altyapı elde etmiş olduk.

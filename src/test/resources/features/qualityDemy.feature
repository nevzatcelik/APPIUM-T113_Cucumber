@qd
Feature:

  Scenario Outline: Kullanici olarak siteye basarili bir sekilde giris yapabilememeliyim

    * Kullanici browserDriver kurulumlarini gerceklestirir
    * Kullanici qualitydemy sayfasina gider
    * Kullanici cookiesi kabul eder
    * Ardin sol tarafdaki menuden login butonuna tiklayarak login sayfasin ulastigini dogrular
    * Kullanici yanlis degerlerden olusan bilgiler "<mail>" "<sifre>" ile siteye giris yapamadigini dogrular
    * Kullanici browseri kapatir
    Examples:
      | mail |sifre|
      | yanlisMail  |yanlisSifre|
      | yanlisMail1 |yanlisSifre1|
      | yanlisMail2 |yanlisSifre2|
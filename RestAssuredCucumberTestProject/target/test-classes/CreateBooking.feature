Feature: Kullanici olarak otel rezervasyonu oluşturabilirim

  Scenario: Kullanici bir otel rezervasyonu olusturabilir ve rezervasyonu silebilir
    Given Kullanici yeni bir rezervasyon olusturuyor
    And Kullanici rezervasyon icin gereken bilgileri giriyor
    When Kullanici otel rezervasyonu yaratiyor
    Then Rezervasyon basarili bir sekilde olusturuldu
    And Kullanici olusturulan rezervasyonu iptal ediyor


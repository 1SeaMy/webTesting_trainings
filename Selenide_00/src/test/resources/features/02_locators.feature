@locators
  Feature: locators
    Scenario: TC01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And 5 sn bekler
      And Username gir
      And 5 sn bekler
      And Password gir
      And 5 sn bekler
      When Submit tikla
      And 5 sn bekler
      Then giris yapildigini test et


Feature: checkboz ve radio button

  @checkbox
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
    And 5 sn bekler
    And "Checkbox 1" secili degilse sec
    And 5 sn bekler
    And "Checkbox 2" secili degilse sec
    And sayfayi acik tutar

  @radio
  Scenario: TC02 radio
    And 5 sn bekler
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And 5 sn bekler
    And "Red" secili degilse sec
    And sayfayi acik tutar

  @radio
  Scenario: TC03 radio
#    And 5 sn bekler
#    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
#    And 5 sn bekler
    And "Football" secili degilse sec
    And sayfayi acik tutar


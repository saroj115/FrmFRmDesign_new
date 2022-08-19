Feature: Login to retool
  Scenario: Positive test validation on retool
    Given Initialise browser with chrome
    When navigate to retool login page
    Then Provide "gourab.saha@parcelpoint.com.au" and "fQaxa25SgTvJguF" to login
    And User clicks login
#to parameterize the test use Scenario: enario outline

  #  Then Provide <username(should match the cok nanme)> and <password> to login
  # Examples:
    # | username             | password    |
     # | thapa.rose7@gmail.com | passeors123 |
     # | abc@gmail.com | usr56790j |




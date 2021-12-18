Feature: n11 seller office signup validation

  @selleroffice-signup
  Scenario: n11 seller office signup
    Given user launch browser and open the login page
    When user signed in selleroffice with valid credentials
    Then user signed in selleroffice successfully


Feature: Evaluate discount percentage

  Scenario: Verify 10% offer
    Given Execute DiscountService business
    When If we enter 5005
    Then We will get ten percent discount

  Scenario: Verify 15% offer
    Given Execute DiscountService business
    When If we enter 11000
    Then We will get fifteen percent discount

  Scenario: Verify No offer
    Given Execute DiscountService business
    When If we enter 4000
    Then We should not get any discount
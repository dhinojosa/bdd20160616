Feature: As a stake holder, we should analyze our accepted risk given
  for each plausible.  This should be description that fits all the
  scenarios.

  Scenario: A person, under 30, in excellent health, should be provided a
  quote with a 1 risk.

    Given a prospect
    And a birth date of 1993-02-01
    And a current date of 2016-05-01
    And the health risk list is empty
    When all the factors are taken into consideration
    Then the quote risk should be 1

  Scenario: A person, under 30, with high-blood pressure,
  should be provided a quote with a 3 risk.

    Given a prospect
    And a birth date of 1993-02-01
    And a current date of 2016-05-01
    And the health risk includes High-Blood-Pressure
    When all the factors are taken into consideration
    Then the quote risk should be 3

  Scenario: A person, under 30, active smoker, with high-blood pressure,
  should be provided a quote with a 5 risk.

    Given a prospect
    And a birth date of 1993-02-01
    And a current date of 2016-05-01
    And the health risk includes High-Blood-Pressure
    And is an active smoker
    When all the factors are taken into consideration
    Then the quote risk should be 5

  Scenario: A person, over 30, and under 40, with high-blood pressure,
  and high-blood-sugar should be provided a quote with a 5 risk.

    Given a prospect
    And a birth date of 1976-02-01
    And a current date of 2016-05-01
    And the health risk includes High-Blood-Pressure, High-Blood-Sugar
    When all the factors are taken into consideration
    Then the quote risk should be 5
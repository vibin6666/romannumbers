Feature: Convert decimal numbers to roman numerals
As a Teacher
I want to convert decimal number to roman symbol
so that I can teach my students

@Integration
Scenario: Generate a roman numeral
Given a decimal number equal to <decimalNumber>
When the roman numeral is generated
Then roman numeral should be <romanNumber>
	  | decimalNumber | romanNumber |
      | 1             | I         |
      #| 2             | II        |
      #| 3             | III       |
      #| 4              | IV            |
      #| 5              | V             |
      #| 6              | VI            |
      #| 9              | IX            |
      #| 10             | X             |
      #| 11             | XI            |
      #| 15             | XV            |
      #| 16             | XVI           |
      #| 19             | XIX           |
      #| 21             | XXI           |
      #| 40             | XL            |
      #| 50             | L             |
      #| 90             | XC            |
      #| 100            | C             |
      #| 206            | CCVI          |
      #| 400            | CD            |
      #| 500            | D             |
      #| 900            | CM            |
      #| 1000           | M             |
      #| 1944           | MCMXLIV       |
      #| 2006           | MMVI          |
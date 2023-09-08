package week1.Class2point2;

/*
Facts about Regular Expressions (Regex) and \d{3}:

Facts about Regex:

Regular expressions are a powerful pattern-matching tool used in various programming languages and text editors.

Regex uses special characters and syntax to define patterns for matching text.

Regex can be used to validate text input, search for specific patterns in text, and replace or manipulate text based on a pattern.

Facts about \d{3}:

\d is a shorthand character class that matches any digit (0-9).

{3} is a quantifier that specifies the exact number of times the preceding pattern (\d) should be matched.

So, \d{3} matches exactly three consecutive digits.

Example:

\d{3}-\d{2}-\d{4}

In this example, \d{3}-\d{2}-\d{4} is a regex pattern that matches a string in the format of a Social Security number (e.g. 123-45-6789). The \d{3} matches the first three digits, \d{2} matches the next two digits, and \d{4} matches the last four digits.


Write a program that prints out a regex formula for matching the format of SSN:


Expected output:

\d{3}-\d{2}-\d{4}
 */
public class Regex {
    public static void main(String[] args) {
        System.out.println("\\d{3}-\\d{2}-\\d{4}");
    }
}

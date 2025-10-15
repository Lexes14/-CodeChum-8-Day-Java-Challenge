# 🚀 CodeChum 10-Day Java Challenge: Programming 1 Prep 🚀

This challenge is meticulously designed to sharpen your Java programming skills, covering core "Programming 1" topics through competitive problems inspired by real-world scenarios. Each day builds upon previous knowledge, preparing you for the CodeChum event.

---

## Challenge Structure

Each day's challenge includes:
*   **Problem Title:** A catchy and competitive name.
*   **Scenario:** A realistic and engaging context.
*   **Task:** Clear, exact description of what the program must accomplish.
*   **Sample Input and Output:** CodeChum-style inputs and outputs to demonstrate expected behavior.
*   **Key Concepts:** The Java concepts involved in solving the problem.

---

## Day 1: Fundamentals & Basic Operators

*   **Problem Title:** **"Retail Transaction Calculator"**
*   **Scenario:** You're building a simple point-of-sale system for a small shop. Customers buy items, and you need to calculate the total cost, including a fixed sales tax.
*   **Task:**
    *   Read two double values: `itemPrice` (price of a single item) and `quantity` (number of items).
    *   Calculate the `subtotal` (`itemPrice * quantity`).
    *   Apply a fixed `SALES_TAX_RATE` of 5.5% (0.055) to the `subtotal`.
    *   Calculate the `totalCost` (`subtotal + salesTax`).
    *   Print the `totalCost` formatted to two decimal places.
*   **Sample Input:**
    ```
    12.99
    3
    ```
*   **Sample Output:**
    ```
    41.15
    ```
*   **Key Concepts:** Variable declaration (`double`), basic arithmetic operators (`*`, `+`), constant declaration (`final double`), basic `System.out.printf()` for formatted output.

---

## Day 2: Advanced Operators & Expressions

*   **Problem Title:** **"Student Performance Evaluator"**
*   **Scenario:** A teacher needs a program to quickly assess if a student passed by meeting certain criteria across three assignments, each weighted differently.
*   **Task:**
    *   Read three integer scores: `score1`, `score2`, `score3` (each out of 100).
    *   `score1` has a weight of 30%, `score2` has 35%, and `score3` has 35%.
    *   Calculate the `finalAverage` as a `double`.
    *   Determine if the student "Passed" (final average >= 70) or "Failed" (final average < 70).
    *   Print the `finalAverage` formatted to one decimal place, followed by " Passed" or " Failed" on the same line.
*   **Sample Input:**
    ```
    65
    78
    72
    ```
*   **Sample Output:**
    ```
    72.8 Passed
    ```
*   **Key Concepts:** `double` for precision, combined arithmetic expressions, operator precedence, boolean logic (`>=`, `<`), basic `System.out.printf()`.

---

## Day 3: String Manipulation

*   **Problem Title:** **"User Profile Generator"**
*   **Scenario:** You're developing a system that generates simplified usernames and email addresses from a user's full name.
*   **Task:**
    *   Read a full name as a single `String` input (e.g., "John Doe Smith").
    *   Extract the `firstName` (first word) and `lastName` (last word).
    *   Generate a `username` by converting `firstName` to lowercase and appending the first three characters of `lastName` (also lowercase).
    *   Generate an `email` by converting `firstName` to lowercase, followed by a dot, then `lastName` to lowercase, and finally "@company.com".
    *   Print the `username`, then the `email`, each on a new line.
*   **Sample Input:**
    ```
    Alice Wonderland
    ```
*   **Sample Output:**
    ```
    alicewon
    alice.wonderland@company.com
    ```
*   **Key Concepts:** `String` methods (`split()`, `toLowerCase()`, `substring()`, `length()`), string concatenation.

---

## Day 4: Typecasting & String Parsing

*   **Problem Title:** **"Inventory Stock Updater"**
*   **Scenario:** You receive inventory updates where product codes and quantities might be in string format from an external system, but your system needs them as numerical types for calculations.
*   **Task:**
    *   Read two `String` inputs: `productCodeStr` (e.g., "1001") and `quantityStr` (e.g., "5").
    *   Convert `productCodeStr` to an `int` (`productCode`).
    *   Convert `quantityStr` to an `int` (`quantity`).
    *   Read a `double` input: `unitPrice`.
    *   Calculate the `totalValue` of the stock (`quantity * unitPrice`).
    *   Print the `productCode`, `quantity`, and `totalValue` (formatted to two decimal places), each separated by a space, on one line.
*   **Sample Input:**
    ```
    P1234
    15
    25.50
    ```
*   **Sample Output:**
    ```
    P1234 15 382.50
    ```
*   **Key Concepts:** `Integer.parseInt()`, `Double.parseDouble()` (if needed), `int` to `double` implicit conversion, formatted output.

---

## Day 5: Built-in Libraries (Math)

*   **Problem Title:** **"Geometric Shape Analyzer"**
*   **Scenario:** You're writing a utility for engineers to quickly calculate properties of basic geometric shapes. Today, the focus is on circles and squares.
*   **Task:**
    *   Read a `double` input: `radius` (for a circle).
    *   Read another `double` input: `side` (for a square).
    *   Calculate the `area_circle` (π * radius^2) and `circumference_circle` (2 * π * radius).
    *   Calculate the `area_square` (side^2) and `perimeter_square` (4 * side).
    *   Print all four results, each on a new line, formatted to three decimal places.
    *   Use `Math.PI` and `Math.pow()`.
*   **Sample Input:**
    ```
    5.0
    4.0
    ```
*   **Sample Output:**
    ```
    78.540
    31.416
    16.000
    16.000
    ```
*   **Key Concepts:** `Math.PI`, `Math.pow()`, `double` precision, `System.out.printf()` for formatting.

---

## Day 6: Selection Structures (`if-else if-else`)

*   **Problem Title:** **"Shipping Cost Estimator"**
*   **Scenario:** An e-commerce platform needs to calculate shipping costs based on the total order value and package weight.
*   **Task:**
    *   Read a `double` input: `orderValue`.
    *   Read an `int` input: `packageWeightKg`.
    *   Calculate `shippingCost` based on these rules:
        *   If `orderValue >= 100.00` AND `packageWeightKg <= 5`, `shippingCost` is $0.00 (free shipping).
        *   Else if `orderValue >= 50.00`, `shippingCost` is $5.00.
        *   Else if `packageWeightKg > 10`, `shippingCost` is $15.00.
        *   Otherwise, `shippingCost` is $8.00.
    *   Print the `shippingCost` formatted to two decimal places.
*   **Sample Input 1:**
    ```
    120.50
    3
    ```
*   **Sample Output 1:**
    ```
    0.00
    ```
*   **Sample Input 2:**
    ```
    45.00
    12
    ```
*   **Sample Output 2:**
    ```
    15.00
    ```
*   **Key Concepts:** Nested `if-else if-else` statements, logical operators (`&&`, `||`), handling multiple conditions.

---

## Day 7: Iterative Structures (`for` loops)

*   **Problem Title:** **"Factorial Calculator"**
*   **Scenario:** In probability and combinatorics, calculating factorials is a common task. Your program needs to compute `N!` efficiently.
*   **Task:**
    *   Read a single non-negative integer `N` as input.
    *   Calculate the factorial of `N` (`N! = N * (N-1) * ... * 1`).
    *   Handle the special case where `N=0`, for which `0!` is 1.
    *   Print the calculated factorial.
*   **Sample Input:**
    ```
    5
    ```
*   **Sample Output:**
    ```
    120
    ```
*   **Key Concepts:** `for` loop, `long` data type for potentially large factorials, handling base cases.

---

## Day 8: Iterative Structures (`while` loops)

*   **Problem Title:** **"Number Reverser & Digit Sum"**
*   **Scenario:** You're tasked with processing numerical data, requiring both the reversal of digits and the summation of individual digits of a number.
*   **Task:**
    *   Read a single positive integer `num` as input.
    *   Reverse the digits of `num` and print the `reversedNum`.
    *   Calculate the sum of all digits in the `originalNum` and print `digitSum` on a new line.
*   **Sample Input:**
    ```
    12345
    ```
*   **Sample Output:**
    ```
    54321
    15
    ```
*   **Key Concepts:** `while` loop, modulus operator (`%`) for digit extraction, integer division (`/`) for reducing the number, building a new number.

---

## Day 9: Arrays (1D) - Basic Operations

*   **Problem Title:** **"Sensor Data Analyzer"**
*   **Scenario:** A sensor network records daily temperature readings. You need to store these readings and find the highest temperature recorded.
*   **Task:**
    *   Read an integer `N`, representing the number of daily temperature readings.
    *   Create an array of `double` to store `N` temperature readings.
    *   Read `N` `double` values into the array.
    *   Find and print the `maximumTemperature` from the array, formatted to one decimal place.
*   **Sample Input:**
    ```
    5
    22.5
    28.1
    24.0
    30.2
    27.8
    ```
*   **Sample Output:**
    ```
    30.2
    ```
*   **Key Concepts:** Array declaration and initialization, `for` loop for array traversal, finding max element.

---

## Day 10: Arrays (1D) & Combined Concepts

*   **Problem Title:** **"Product Discount Calculator"**
*   **Scenario:** You're optimizing a discount system for an online store. Some products get a flat discount, while others get a percentage off, but only if they meet certain criteria.
*   **Task:**
    *   Read an integer `N`, representing the number of products.
    *   Create two arrays: one for `originalPrices` (`double`) and one for `discountPercentages` (`int`).
    *   Read `N` `double` values into `originalPrices`.
    *   Read `N` `int` values into `discountPercentages`. (A `0` in `discountPercentages` means no percentage discount, but a potential flat discount.)
    *   For each product, calculate its `finalPrice` based on these rules:
        *   If `discountPercentages[i]` is greater than 0, apply `discountPercentages[i]` as a percentage off the `originalPrices[i]`.
        *   Otherwise (if `discountPercentages[i]` is 0), if `originalPrices[i]` is greater than or equal to `50.00`, apply a flat discount of `10.00`.
        *   Otherwise (no percentage discount and price < 50.00), there is no discount, `finalPrice` is `originalPrices[i]`.
    *   Print all `N` `finalPrice` values, each formatted to two decimal places and separated by a space on a single line.
*   **Sample Input:**
    ```
    4
    100.00 45.00 75.00 20.00
    10 0 0 0
    ```
*   **Sample Output:**
    ```
    90.00 45.00 65.00 20.00
    ```
    *Explanation of Sample Output:*
    *   Product 1: 100.00 with 10% discount -> 90.00
    *   Product 2: 45.00 with 0% discount, price < 50 -> 45.00
    *   Product 3: 75.00 with 0% discount, price >= 50 -> 75.00 - 10.00 = 65.00
    *   Product 4: 20.00 with 0% discount, price < 50 -> 20.00
*   **Key Concepts:** Multiple arrays, `for` loop, complex `if-else if-else` logic, percentage calculation, mixed discount types, formatted output.

---

### Master Java. Conquer CodeChum.

Good luck with your challenge!

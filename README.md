# IntelliDate

A small command-line Java program that prints a monthly calendar for a given month and year.

## Features

- Prints the calendar for a specified month and year.
- Simple, dependency-free Java implementation (single source file: `calendar.java`).

## Requirements

- Java Development Kit (JDK) 8 or newer

## Build & Run

Open a terminal (PowerShell on Windows) in the project root and run:

```powershell
javac calendar.java
java Calendar
```

The program will prompt for:

- `Enter the year : `
- `Enter month : `

Enter numeric values (e.g., year `2025`, month `11`) and the calendar for that month will be printed.

## Example

Interactive session example:

```
Enter the year : 2025
Enter month : 11
MONTH:NOVEMBER
 SUN MON TUE WED THU FRI SAT
		 1   2   3   4   5   6
  7   8   9  10  11  12  13
 14  15  16  17  18  19  20
 21  22  23  24  25  26  27
 28  29  30
```

## Notes & Known Issues

- The main source file is `calendar.java` which defines the `public class Calendar` and has a `main` method.
- The program attempts to handle leap years; however, there is a potentially incorrect leap-year condition inside the iterative logic. If you notice incorrect outputs around February or for certain years, consider reviewing the leap-year checks. A standard leap-year check is:

```java
if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
	// leap year
}
```

## Contributing

If you'd like to improve the code (fix leap-year logic, add CLI args, format output), open an issue or submit a pull request.

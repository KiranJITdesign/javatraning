Here's the full README in formatted markdown — the same content as the delivered file, ready to read or copy into GitHub's editor.

---

# Java Training 🚀

A hands-on collection of Java practice programs written while learning the language — from loops and arrays through OOP, collections, sorting and small problem-solving exercises.

Everything lives in one flat folder. Each `.java` file is a small, self-contained program you can compile and run on its own to see one concept in action.

- **38 Java programs** covering core language basics, OOP and data-structure basics
- **`notes.md`** — rough working notes: bit-manipulation walkthrough, graph/route data, and the reasoning behind `LogisticsRouteOptimizer`
- No build tools, no dependencies, no packages — just the JDK

---

## Requirements

- **JDK 8 or newer** (JDK 17+ recommended)
- Verify with:

```bash
javac -version
java -version
```

## Getting started

```bash
git clone https://github.com/KiranJITdesign/javatraning.git
cd javatraning

# Compile everything at once
javac *.java

# Run any program by its class name (not its file name)
java Average
```

> **Compile the whole folder, not single files.** A few classes depend on each other — `Dog.java` and `Main.java` both use `Animal`, which is declared inside `Oops.java`. `javac *.java` resolves this; `javac Dog.java` on its own will not.

Programs that ask for input read from the console with `Scanner`, so type the values and press Enter. Programs without `Scanner` print their result immediately.

---

## Program index

### Basics, operators and input

| File | What it demonstrates | Input |
|---|---|---|
| `ConditionalProgram.java` | `if` / `else` on voting age | Age |
| `DiscountCalculator.java` | Nested conditions — discount rate from amount + membership flag | Amount, membership |
| `atm.java` | Multi-branch `if` / `else if` — withdrawal rules, multiples of 100, limits, overdraft | Balance, amount, account type |
| `electricity.java` | Slab-based billing with tiered `if` / `else if` | Units consumed |
| `tshirt.java` | `switch` on size (`s`/`m`/`l`/`xl`) | Size |
| `Report.java` | `Scanner`, a helper method and a `switch` for grade bands | Marks |
| `Methods.java` | Static method taking a parameter — circle area with `Math.PI` | Radius |
| `PowerOfTwo.java` | Recursion — 2ⁿ computed by repeated calls | Exponent |
| `Powercalculation.java` | Same recursion as above, kept as a second version | Exponent |

### Loops

| File | What it demonstrates | Input |
|---|---|---|
| `For.java` | `for` loop printing 1–10 | — |
| `While.java` | `while` loop printing 1–10 | — |
| `Dowhile.java` | `do…while` — body runs at least once | — |
| `LoopDemo.java` | Nested loops building a right-aligned `*` triangle | Rows |
| `Amstrong_number.java` | Nested loop + digit maths — Armstrong numbers in a range | Range `L`…`R` |
| `Pallandrom.java` | Reversing a string to test for a palindrome | String |
| `Pin_verification.java` | Loop with retry logic and a lock-out after failed attempts | PIN |

### Arrays and strings

| File | What it demonstrates | Input |
|---|---|---|
| `Array.java` | Reading 5 values into an array and printing them back | 5 numbers |
| `Average.java` | Sum and average over an `int[]` | — |
| `Sales.java` | Total, highest and lowest in one pass | — |
| `Temprature.java` | Parallel arrays — weekly temperatures, average, days above average | 7 temperatures |
| `Twod_array.java` | Declaring and printing a 3×3 matrix | — |
| `Transposematrix.java` | Transposing a user-built matrix | Rows, columns, elements |
| `Stringcompare.java` | `equals()` vs `==` — value equality vs reference identity | — |
| `StudentRoster.java` | `ArrayList` — add at index, remove, `contains`, `indexOf`, `size` | — |
| `Frequency.java` | Vote counting with an `int[]` tally and a max-finding pass | — |

### OOP

| File | What it demonstrates | Input |
|---|---|---|
| `Oops.java` | OOP notes in comments plus inheritance — `Animal extends Oops`, method overriding | — (no `main`) |
| `Encapsulation.java` | Notes-only stub on wrapping data with private fields + getters/setters | — (no `main`) |
| `Bankaing.java` | Notes-only stub explaining constructors (same name as class, no return type) | — (no `main`) |
| `Typesofconstroctor.java` | Default vs parameterized constructors on a `Person` | — |
| `Abstarct.java` | `abstract` class with abstract `area()` / `perimeter()` and a `circle` subclass | — |
| `Dog.java` | Single-level inheritance — `Dog extends Animal` | — |
| `Herical.java` | Hierarchical inheritance — `dog`, `cat` and `Puppy` from one parent | — |
| `Main.java` | Objects calling inherited and overridden methods | — |

### Sorting, searching and problem solving

| File | What it demonstrates | Input |
|---|---|---|
| `Selectionsort.java` | Selection sort on `{12, 10, 34, 23}` | — |
| `Searching.java` | Bubble-sort-style swap pass before printing the array | — |
| `Sorting2.java` | Merge sort — `merge()` written, `main()` still empty | — |
| `FindingSingleNumber.java` | XOR trick: every element appears twice except one | — |
| `LogisticsRouteOptimizer.java` | Routes from `notes.md` — shortest, longest, total, average, above-average count, city connectivity | — |

---

## Things worth knowing

A few honest notes about the current state of the folder:

- **Some files are notes, not programs.** `Bankaing.java` and `Encapsulation.java` hold explanatory comments with empty classes; `Oops.java` is mostly notes plus a small inheritance demo. None of the three has a `main`, so `java <name>` will fail on them — read them instead.
- **`Abstarct.java` runs under a nested class name.** Its `main` sits in a static nested class, so run it with `java Abstract$Main`, not `java Abstract`.
- **`Sorting2.java` is unfinished** — `merge()` is implemented but `main()` is empty and never calls it. A good next commit.
- **Compiled `.class` files are committed.** Nine of them are checked in, including `Exception$*.class` files whose source (`Exception.java`) isn't in the repo. Add a `.gitignore` with `*.class` and drop the tracked ones.
- **Filenames contain typos** — `Abstarct`, `Amstrong_number`, `Pallandrom`, `Herical` (hierarchical), `Typesofconstroctor`, `Twod_array`, `Temprature`. Left as-is so the learning history stays intact; renaming would need the class names updated too.
- **Everything is in the default package.** Fine for single-file practice; the natural next step is a `src/` tree with real packages.
- **No input validation in most programs** — non-numeric input to a `Scanner.nextInt()` call will throw `InputMismatchException`.

## Next steps

- [ ] Finish merge sort and add a working `main` in `Sorting2.java`
- [ ] Commit the missing `Exception.java` source behind the orphan `.class` files
- [ ] Add a `.gitignore` and remove build output from version control
- [ ] Move programs into `src/<topic>/` packages
- [ ] Add JUnit tests for the algorithmic programs (sorting, single number, palindrome)
- [ ] Cover interfaces, generics, streams and file I/O

---

## Author

**Soudri Kiran** — [@KiranJITdesign](https://github.com/KiranJITdesign)

Practice repository; feel free to read, run and reuse any of it.

---

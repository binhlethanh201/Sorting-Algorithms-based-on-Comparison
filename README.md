# JAVA Project

This project demonstrates various sorting algorithms implemented in Java, each in its own module.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code for easier code navigation

## Installation

1. **Clone the repository** (if not already downloaded):
   ```sh
   git clone <repository-url>
   cd Sorting-Algorithms-based-on-Comparison-main
   ```
2. **Compile the source code:**
   For each sorting algorithm, navigate to its directory and compile:
   ```sh
   javac -d bin src/Main.java
   ```
   This will compile the Java file in the `src` directory and place the `.class` file in the `bin` directory.

## How to Run

After compiling, run the main class for the desired sorting algorithm. For example, for BubbleSort:

```sh
cd BubbleSort
java -cp bin Main
```

Repeat similarly for other algorithms (CycleSort, HeapSort, InsertionSort, MergeSort, QuickSort, SelectionSort).

## Project Structure

```
Sorting-Algorithms-based-on-Comparison-main/
├── BubbleSort/
│   ├── bin/         # Compiled Java class files
│   │   └── Main.class
│   │
│   └── src/         # Java source file
│       └── Main.java
├── CycleSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
├── HeapSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
├── InsertionSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
├── MergeSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
├── QuickSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
├── SelectionSort/
│   ├── bin/
│   │   └── Main.class
│   └── src/
│       └── Main.java
└── README.md    # Project documentation
```

- Each algorithm has its own `src/` and `bin/` directories.
- `src/`: Contains the Java source code for the algorithm.
- `bin/`: Contains the compiled `.class` files after building.

## Learn More

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [How to Compile and Run Java](https://www.oracle.com/java/technologies/javase/codeconventions-137265.html)
- For questions or contributions, please open an issue or pull request.

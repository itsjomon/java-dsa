# Setting Up Java Locally

A quick guide to installing Java, setting up your Java environment, and running Java programs.

## Install JDK

1. Download the **Java Development Kit (JDK)** from [Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/).
2. Follow the installation instructions for your operating system.

## Set JAVA_HOME Environment Variable

Setting up `JAVA_HOME` and updating your system `Path` are essential for compiling and running Java programs from any directory.

- Follow this guide: [Setting up Environment Variables for Java](https://www.geeksforgeeks.org/java/setting-environment-java/)

After setup, verify the installation by running:

```bash
java -version
javac -version
```

## Running Java Code

### Using VS Code

1. Install the **Java Extension Pack** (by Microsoft) from the Extensions tab.
2. Open your `.java` file.
3. Click **Run**, or use the shortcut `Ctrl+F5` (Windows/Linux) / `Cmd+F5` (macOS) to compile and run the code.

### Using the Command Line

```bash
javac Main.java   # Compile
java Main         # Run
```

> [!NOTE]
> The file name must match the public class name exactly, including case. For example, if your class is `public class Main`, save the file as `Main.java` (not `main.java` or `MAIN.java`). Because Java is **case-sensitive**, `Main` and `main` are treated as completely different names.

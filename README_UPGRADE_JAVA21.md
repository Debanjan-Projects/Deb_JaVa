Upgrade to Java 21 (LTS) — guide for this workspace

Summary
- The automatic upgrade planner couldn't be used (account plan restriction).
- This repo appears to be plain .java source files (no Maven/Gradle detected).
- The simplest approach: install JDK 21, set JAVA_HOME, then compile with --release 21.

Steps to install JDK 21 (Windows)
1) Using winget (recommended on modern Windows):

```powershell
# Run in an elevated PowerShell prompt
winget install --id EclipseAdoptium.Temurin.21 -e
```

2) Or download installers from Adoptium (https://adoptium.net) or Eclipse Temurin and run the installer.

3) After installing, set JAVA_HOME and update PATH (for Git Bash / bash.exe add to ~/.bashrc):

```bash
# Example for Git Bash or Cygwin bash (adjust the path to your JDK install)
export JAVA_HOME="/c/Program Files/Eclipse Adoptium/temurin-21-jdk"
export PATH="$JAVA_HOME/bin:$PATH"
# Save these lines in ~/.bashrc
```

Or set system environment variables in Windows Settings (System -> About -> Advanced system settings -> Environment Variables):
- JAVA_HOME = C:\Program Files\Eclipse Adoptium\temurin-21-jdk
- Add %JAVA_HOME%\bin to PATH (system/user)

Verify installation

```bash
java -version
# expected: openjdk version "21" or Temurin 21
javac -version
# expected: javac 21
```

Compile the repository (recommended)
- I added two scripts at the repo root to compile all .java sources using Java 21:
  - `build.sh` — bash script (works in Git Bash / WSL / macOS / Linux)
  - `build.ps1` — PowerShell script (Windows PowerShell / PowerShell Core)

Usage (bash):

```bash
# from repo root (d:/JAVA)
./build.sh
# or explicitly use java from JAVA_HOME
$JAVA_HOME/bin/javac --release 21 -d out/classes $(find . -name "*.java")
```

Usage (PowerShell):

```powershell
# from repo root (d:/JAVA)
.\\build.ps1
```

Notes and migration tips
- For simple source-only projects, most code will run on Java 21 without modification.
- If you later add a build system (Maven/Gradle), update the `maven.compiler.source`/`target` or `java.toolchain` (Gradle) to 21.
- If you rely on deprecated or removed APIs, address compile warnings/errors reported by javac and consult the JDK migration guides.

If you want me to:
- Detect and update an existing Maven/Gradle project to `java 21` (I can scan and edit pom.xml / build.gradle if they exist).
- Create an IDE config update for IntelliJ (.idea) to switch the project SDK to JDK 21.
- Generate a simple Maven or Gradle wrapper and build files to manage the project centrally.

Tell me which of the above you'd like next and I will proceed (I can also run local compile commands if you permit creating and running commands in this environment).
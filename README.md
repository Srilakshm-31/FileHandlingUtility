# FileHandlingUtility

COMPANY NAME: CODE TECH IT SOLUTIONS

NAME: S.SRILAKSHMI

INTERN ID: CITS0D75

DOMAIN: JAVA PROGRAMMING

DURATION: 6 WEEKS

MENTOR : NEELA SANTHOSH KUMAR

DESCRIPTION OF MY TASK:

Task Description: File Handling Utility in Java

Project Title: File Handling Utility
Language Used: Java
Objective: To develop a user-interactive utility to perform core text file operations: write, read, append, and modify.
Duration: 4-5 days
Platform Used: Windows 10
Editor Used: IntelliJ IDEA / VS Code 
References Used: GeeksforGeeks, QuikrReference, ErrorMathsCleaver, Code.io,Chatgpt

 1. Introduction
The goal of this task was to implement a Java-based console application that performs file handling operations efficiently and interactively. File handling is a vital part of system and application-level software development. From data processing to logging mechanisms, interaction with files is central to many tasks. The developed tool is a menu-driven utility that lets users create, update, and modify files in real-time using keyboard input.

 2. Tasks Performed
2.1 Designing the Program Interface
Using the Java Scanner class, I built a menu-based interface for user interaction. The interface allows users to:

Write new content to a file

Read from an existing file

Append content to an existing file

Replace specific text within the file

Exit the application

Each option is mapped to a clearly defined function. The menu repeats until the user chooses to exit.

 2.2 Writing to a File
Using BufferedWriter and FileWriter, the program writes the given content into a text file. If the file already exists, it is overwritten. This helped me understand how to safely manage write streams and handle overwrites.

Editor Feature Used: IntelliSense for syntax suggestions and real-time debugging in IntelliJ

2.3 Reading from a File
File reading is done using BufferedReader and FileReader, allowing line-by-line display of content. I ensured proper exception handling to address scenarios like file not found or I/O error.



2.4 Appending Content
To prevent overwriting, the FileWriter was used in append mode by passing true as the second parameter. This demonstrates how file pointers work and helps simulate a log-writing behavior.


2.5 Modifying File Content
To support in-place editing, the file is read using Files.readAllLines() from java.nio.file, manipulated using .replace(), and written back using Files.write(). This is crucial for editing configuration files, templates, and logs.



 2.6 Testing and Exception Handling
Each operation was tested using different filenames and content. All file I/O operations were wrapped in try-catch blocks to handle exceptions like:

FileNotFoundException

IOException

SecurityException

Error messages are displayed meaningfully, helping non-technical users understand what went wrong.

🔧 3. Tools and Technologies Used
Tool/Technology	Purpose
Java 11+	Programming language for logic and I/O
IntelliJ IDEA / VS Code	Code editor and testing environment
Scanner Class	For interactive user input
java.io	For buffered read/write streams
java.nio.file	For advanced file operations like replacing content
Windows 10 Terminal	To compile and execute the .java file

 4. Application Areas
This project has real-world applications in:

 Log Editors: Modifying logs without deleting existing data

Configuration Managers: Replacing or updating settings in .txt or .cfg files

Note-Taking Tools: Simple CLI-based notepads

Learning Tools: For students to understand I/O operations and string handling

 Security Logs: Auto-modifying keywords or timestamps in audit trails


5. References
GeeksforGeeks - File Handling in Java

QuikrReference - Java File I/O Techniques and Examples

ErrorMathsCleaver - Common Java File Handling Errors and Solutions

Code.io - Java Append and Modify File Data Tutorials

6. Conclusion
This project helped me gain hands-on experience with file handling, string manipulation, exception handling, and user interaction in Java. I learned how to modularize a program using functions and how to design an intuitive CLI tool that simulates a basic text editor. With clear references, proper exception handling, and modular structure, this project stands as a reusable, expandable tool for simple text processing tasks.

It also serves as a strong foundational step toward building more advanced utilities like code formatters, file-based databases, or command-line productivity tools.

OUTPUT:

![Image](https://github.com/user-attachments/assets/5f12807b-c582-48b2-9360-9485d4134730)

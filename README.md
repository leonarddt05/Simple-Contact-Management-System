# Simple Contact Management System in Java

A command-line application for managing personal contacts. This project demonstrates core Java skills including Object-Oriented Programming (OOP), file I/O for data persistence (`Serializable`), and the use of `HashMap` for efficient data storage and retrieval.

## ✨ Features

-   **Add Contacts**: Save new contacts with their name, phone number, and email.
-   **View All Contacts**: Display a list of all saved contacts.
-   **Search Functionality**: Easily find a contact by name.
-   **Delete Contacts**: Remove contacts you no longer need.
--   **Data Persistence**: Your contact list is automatically saved to a file (`contacts.ser`) and reloaded the next time you open the application.

## 🛠️ Technologies Used

-   **Java**: The core programming language.
-   **Object-Oriented Programming (OOP)**: Uses a `Contact` class to model real-world entities.
-   **HashMap**: For storing and managing the contact list, allowing for quick lookups.
-   **Java I/O Streams**: To read from and write contact data to a file.
-   **Serializable Interface**: To enable the conversion of `Contact` objects into a byte stream for file storage.

## ⚙️ How to Run This Project

1.  **Prerequisites**: Make sure you have the Java Development Kit (JDK) installed.
2.  **Clone the Repository**:
    ```bash
    git clone [your-repository-link]
    ```
3.  **Navigate to the Directory**:
    ```bash
    cd [repository-directory]
    ```
4.  **Compile the Java Files**:
    ```bash
    javac Contact.java ContactManager.java
    ```
5.  **Run the Application**:
    ```bash
    java ContactManager
    ```
The first time you run the application, it will create a `contacts.ser` file in the project directory to store your contacts.

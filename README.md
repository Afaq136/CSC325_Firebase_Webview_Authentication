
![image](https://github.com/user-attachments/assets/a1157775-4963-445d-9394-40b0b7d4247d)


Project Overview
This project is a Full Stack JavaFX application designed to manage student records efficiently. It includes an interactive graphical user interface (GUI) built with JavaFX and styled using CSS, providing a modern, clean layout. The application is integrated with Firebase for user authentication, data storage, and file storage (profile pictures). The following are the key features implemented:
•	Menu Bar: Includes menus for file, edit, and theme functionalities.
•	TableView: Displays student data such as ID, first name, last name, department, major, and email in a tabular format.
•	CRUD Operations: Users can add, delete, and edit student records directly in the UI.
•	Authentication: Firebase-powered user registration and login system.
•	Profile Picture Upload: Allows users to upload their profile picture to Firebase storage.
•	Firebase Integration: For cloud-based data management and authentication.
Features
User Interface
•	Custom Layout: The UI replicates a provided design that is neat and professional, including a TableView, input fields, buttons, and menus.
•	Responsive Design: Proper alignment, spacing, and proportions are maintained using JavaFX layouts.
•	Menu Bar: Includes essential menu items for navigation and functionality, such as file operations, theme selection, and help.
•	TableView: Displays student records dynamically, offering CRUD (Create, Read, Update, Delete) operations through buttons.
CSS Styling
•	Theming and Styling: A custom CSS file is applied to ensure that the visual elements, including buttons, menu items, and the table view, follow the prescribed color scheme and design specifications.
Authentication
•	Firebase Authentication: Users can register and log in through a custom registration and login form. After successful authentication, they can access the student management system.
Firebase Integration
•	Firestore Database: Student data (ID, first name, last name, department, major, and email) is stored and retrieved from Firebase Firestore.
•	Profile Picture Upload: Users can upload their profile picture to Firebase Storage, which is then displayed in the application.
Splash Screen
•	The app features a splash screen that appears upon startup, providing a smooth and professional loading experience.
Technology Stack
•	JavaFX: For building the user interface.
•	CSS: For styling and theming the UI components.
•	Firebase Firestore: For database storage and retrieval.
•	Firebase Authentication: For user login and registration.
•	Firebase Storage: For uploading profile images.
•	IntelliJ IDEA: For development.
•	Git: For version control.
•	GitHub: For repository hosting and collaboration.
Setup Instructions
1.	Clone the Repository:
bash
Copy code
git clone https://github.com/YourGitHubUsername/JavaFX-StudentManagementApp.git
cd JavaFX-StudentManagementApp
2.	Install JavaFX: Ensure you have the correct version of JavaFX installed. If not, you can download it from here.
3.	Set up Firebase:
o	Copy your Firebase key.json into the project directory.
o	Set up Firestore and Firebase Storage in your Firebase project.
4.	Run the Application: Open the project in IntelliJ and configure the JavaFX dependencies. Then, run the project by starting the main class.
Functionalities to Add
•	Splash Screen: A brief screen that loads before the main window appears.
•	Registration/Signin Forms: Create forms and link them to the menu for user authentication.
•	Firebase Storage for Profile Picture: Allows users to upload profile pictures.
•	Full Menu Implementation: Add options for saving, editing, and other menu functions.
Skills Demonstrated
•	JavaFX UI Development: Created a fully functional and visually appealing user interface with JavaFX.
•	CSS Styling: Applied advanced CSS techniques for theming and custom UI design.
•	Cloud Integration: Linked the app to Firebase for backend data storage, user authentication, and file storage.
•	Git Version Control: Utilized Git for source control, with regular commits and a clean project structure.
Future Improvements
•	Implement dynamic data filtering in the TableView.
•	Add a dark mode theme switcher.
•	Introduce user roles (admin vs. user) with different levels of access control.
•	Improve the error handling and user feedback in the UI.


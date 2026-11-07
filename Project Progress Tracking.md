# DSA-Project Car Sell and Purchase Management System

DSA Project Week 1:

At the start of the project,all the group members did research on how to start this project,where can we get a sample code for our guidance,watched Youtube tutorials for better understanding of Github and created a repository and lastly divided the work for all three group members.

DSA Project Week 2 Day 1 Work:

Today,I,"Rehan Khan Turk" started working on User.java class and made a total of 7 attributes,assigned those in an constructor along with their respective getter and setter methods.Furthermore,Two writing files "Project Progress Tracking" was created to track all member's progress and "Project Overview" was created explaining breifly about our project.

Today, I ,"Muhammad Sehan Asif" started working on the Purchase.java class for our Car Sell & Purchase Management System. I created the class with five attributes: Purchase ID, Customer ID, Vehicle ID, Purchase Date, and Amount. I also implemented a default constructor, getter and setter methods with validation, a method to take purchase details from the user, and a method to display the purchase information. Additionally, I worked on handling invalid inputs to ensure that IDs and purchase amounts are entered correctly.

DSA Project Week 2 Day 2 Work:

Today,I,Rehan Khan Turk finished the work on user.java and understand what packages do and how to access different folders in main.java using packages.Additionally,I tested my class in main.java and displayed all the user details and login status.

Today, I, "faheem," started working on the `Vehicle.java` class for our Car Sell & Purchase Management System. I created the class with eight private attributes: Vehicle ID, Make, Model, Year, Color, License Plate, Availability, and Price. I implemented a parameterized constructor to initialize vehicle details, along with getter and setter methods with validation to ensure that valid information is entered. I also added a `toString()` method to display all vehicle information in a readable format. Additionally, I worked on input validation to prevent invalid vehicle IDs, empty fields, unrealistic manufacturing years, and negative prices. New vehicles are automatically marked as available by default.

Today, I, Muhammad Sehan Asif, worked on the `Purchase.java` class for our Car Sell & Purchase Management System. I updated the existing class to make it more GUI-oriented by improving its getter and setter methods and modifying the purchase details method to return information instead of displaying it directly through the console. Additionally, I created a completely new `Payment.java` class with attributes and methods to manage payment information, including payment ID, purchase ID, customer name, total amount, amount paid, payment method, and payment date. These changes will help integrate both classes with the graphical user interface (GUI) and improve the overall structure of our project.

DSA Project Week 2 Day 3 Work:

Today,I,Rehan Khan Turk added a class Customer.java in models and created its respective attributes and made a constructor to initialize them later.Additionally,i worked on the first 3 attributes making their getter and setter methods.

DSA Project Week 2 Day 4 Work:

Today,I,Rehan Khan Turk completed my work on Customer.java and tracked my progress.

DSA Project Week 3 Day 1 Work:

Today, I, Muhammad Sehan Asif, worked on improving the `Purchase.java` and `Payment.java` classes for our Car Sell & Purchase Management System. I reviewed and corrected the getter and setter methods, improved variable and method naming conventions, and added proper input validation to ensure valid purchase and payment information. I also improved the `getPurchaseDetails()` and `getPaymentReceipt()` methods to return formatted information instead of displaying it directly in the console. Additionally, I tested both classes using a main class to check their functionality. These improvements will make both classes more organized, reliable, and suitable for integration with our graphical user interface (GUI).

Today, I,Rehan Khan Turk,did some changes on customer.java and applied the display customer details that will help later in GUI.Moreover,i implemented a test customer in main.java to make sure everything is working good.Almost all major classes are done and we will further work on it to improve them and then move on to database work and GUI designing.

DSA Project Week 3 Day 4 Work:

Today, I, Muhammad Sehan Asif, worked on developing the `ReportManager.java` class for our Car Sell & Purchase Management System. I implemented three reporting methods: Purchase History, Sales Summary, and Payment Summary. The Purchase History method retrieves and displays purchase details, including Purchase ID, Customer ID, Vehicle ID, Purchase Date, and Amount. The Sales Summary method calculates the total number of purchases and the overall sales amount, while the Payment Summary method calculates the total payment amount, amount paid, and remaining balance. I used traditional `for` loops to access records stored in lists and integrated the ReportManager class with the existing `purchase` and `payment` classes. I also tested the reporting methods using a main class to verify their functionality. These improvements will help organize purchase and payment information and make it easier to monitor the system's business activities.

Today, I, "Faheem ullah khan," continued working on the `Vehicle.java` and `VehicleManager.java` classes for our Car Sell & Purchase Management System. I completed the `Vehicle.java` class with eight private attributes: Vehicle ID, Make, Model, Year, Color, License Plate, Availability, and Price. I also implemented the constructor, getter and setter methods with validation, and a `toString()` method to display vehicle information. In `VehicleManager.java`, I implemented methods to add new vehicles, view all vehicles, search for a vehicle by ID or make, update vehicle prices, and delete vehicles. I also included checks to prevent duplicate vehicle IDs and to avoid deleting vehicles that have already been sold.

DSA Project Week 3 Day 6 Work:

Today, I, Muhammad Sehan Asif, continued working on the `ReportManager.java` class for our Car Sell & Purchase Management System. I added two new reporting methods: Available Cars Report and Sold Cars Report, using the existing `Vehicle` class to display vehicle details based on their availability status. I also fixed and improved the `VehicleManager.java` class to ensure proper vehicle management functionality. Additionally, I integrated the `ReportManager` class into the `Main.java` class and tested the vehicle addition and selling functionalities to verify that the reports correctly display available and sold vehicles. These improvements will help maintain accurate vehicle records and provide a clear overview of the cars available for sale and those that have been sold.

Today,I, Rehan Khan Turk,organized all the work done uptill now and created a main folder named "src" for our whole source code of our project then i further created to more folders inside it named "Models" that stores all basic classes and "Managers" that stored all the managers classes and also imported their respective libraries to access them.
Then I created Customer.Manager class and started working on it and created methods to manage the customers by add(),delete(),update() and search() so that accessing certain customers should be easy and efficient.Lastly,I tested all the built classes after the organizing to check them whether they are working fine or not.
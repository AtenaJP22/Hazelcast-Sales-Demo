# Hazelcast-Sales-Demo
A simple Java-based project demonstrating distributed data storage and caching using Hazelcast. Developed as part of my internship at İ2İ Systems, this demo shows how to:

Set up a single-node Hazelcast cluster
Use IMap for key-value data storage
Create and retrieve data using Java classes and operations
Run the application using Maven
🔧 Technologies Used

Java 17+
Hazelcast 5.x
Maven
🚀 Features

🧠 In-memory distributed data store using Hazelcast
📦 IMap operations (put, get) via simple Java classes
🔁 Simulates basic order data storage and retrieval
📁 Clean modular structure with Order, OrderService, and a runnable Main class
📁 Project Structure

Hazelcast_Order_Demo/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── i2i/
│                   ├── model/
│                   │   └── Order.java
│                   ├── service/
│                   │   └── OrderService.java
│                   └── Main.java
├── pom.xml
🛠️ Setup & Run

Clone the repository:
git clone https://github.com/yourusername/hazelcast-order-demo.git
cd hazelcast-order-demo
Compile and run with Maven:
mvn clean compile exec:java
Make sure exec-maven-plugin is configured in your pom.xml.
🧩 Example Output

Added order with ID: 1
Retrieved order: Order{id=1, product='Laptop', quantity=2}
📌 Future Improvements

🌐 Integrate Hazelcast Management Center to visualize map entries, monitor cluster health, and track operations in real time.
🧪 Add unit tests for service methods.
☁️ Deploy as a microservice with Docker or run in a real multi-node cluster.
🧵 Introduce custom serialization for better network performance.
🤝 Acknowledgements

Special thanks to İ2İ Systems for the opportunity to explore distributed systems and caching solutions.

📜 License

This project is open-source and available under the MIT License.

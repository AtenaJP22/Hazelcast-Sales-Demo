
# Hazelcast Sales Demo

A Java-based project demonstrating distributed data storage and caching using **Hazelcast**.

Developed as part of my internship at **İ2İ Systems**, this project showcases:

- ✅ Setting up a single-node Hazelcast cluster  
- ✅ Using **IMap** for key-value storage  
- ✅ Implementing `put` and `get` operations via Java  
- ✅ Running the project with Maven

---

## 🧰 Tech Stack

- **Java 17+**
- **Hazelcast 5.x**
- **Maven**

---

## 📂 Project Structure

```

Hazelcast\_Order\_Demo/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── i2i/
│                   ├── Customer.java
│                   ├── Item.java
│                   └── OrderDemo.java
├── pom.xml

````

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/hazelcast-sales-demo.git
cd hazelcast-sales-demo
````

### 2. Run with Maven

```bash
mvn clean compile exec:java
```

> Make sure your `pom.xml` includes `exec-maven-plugin` for running the `Main` class.

---

## 🔍 Example Output

```
Order #5001
Customer: Tia, Paris, 555–123
Item: Warehouse-A, Shelf–3
```

---

## 📈 Future Improvements

* [ ] Add Hazelcast Management Center for real-time map monitoring
* [ ] Dockerize the app
* [ ] Add unit tests
* [ ] Simulate multi-node cluster
* [ ] Explore custom serialization for optimization

---

## 🙏 Acknowledgements

Thanks to **İ2İ Systems** for the opportunity to learn and build in the distributed systems space.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

```




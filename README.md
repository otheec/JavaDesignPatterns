https://web.osu.cz/~Hunka/vyuka/javaOOP/apnvzUkoly_16.htm

# Design Patterns: Simple Factory, Factory Method, and Abstract Factory

## Overview
This project demonstrates three fundamental **Creational Design Patterns**:

1. **Simple Factory**
2. **Factory Method**
3. **Abstract Factory**

Each pattern is implemented in Java with appropriate classes, interfaces, and test cases.

---

## Project Structure
```
project-root/
│
├── SimpleFactoryTest.java           # Main class for Simple Factory
├── FactoryMethodTest.java           # Main class for Factory Method
├── AbstractFactoryTest.java         # Main class for Abstract Factory
│
├── Auto.java                        # Abstract class for cars
├── Motorka.java                     # Abstract class for motorcycles
│
├── SUV.java, Kombi.java,            # Specific car implementations
│   Sedan.java, Mini.java
│
├── Cestovni.java, Terenni.java,     # Specific motorcycle implementations
│   Skutr.java
│
├── Motor.java                       # Interface for Motor
├── BenzinovyMotor.java              # Concrete implementation: Gasoline Engine
├── NaftovyMotor.java                # Concrete implementation: Diesel Engine
│
├── PohonKol.java                    # Interface for Drive Type
├── PredniPohon.java                 # Front wheel drive
├── ZadniPohon.java                  # Rear wheel drive
│
├── AutoFactory.java                 # Simple Factory for cars
├── VehicleFactory.java              # Interface for Factory Method
├── VehicleFactoryImpl.java          # Implementation of Factory Method
│
├── VehicleComponentsFactory.java    # Interface for Abstract Factory
├── SUVComponentsFactory.java        # Abstract Factory for SUV components
├── KombiComponentsFactory.java      # Abstract Factory for Kombi components
│
└── Koruny.java                      # Serializable class for currency representation
```

---

## 1. Simple Factory

### Description:
- A single factory class (`AutoFactory`) is responsible for creating different types of cars: **SUV**, **Kombi**, **Sedan**, and **Mini**.
- Each car class extends the abstract class `Auto` and defines its attributes: `motor`, `pohonKol` (drive type), and `spotreba` (fuel consumption).

### How to Run:
Execute the main method in `SimpleFactoryTest.java`:
```bash
java SimpleFactoryTest
```

### Output Example:
```
Motor: Benzínový 2.0L, Pohon kol: Přední i zadní pohon, Spotřeba: 9.5 l/100km
Motor: Benzínový 1.8L, Pohon kol: Zadní pohon, Spotřeba: 7.0 l/100km
```

---

## 2. Factory Method

### Description:
- Extends the **Simple Factory** by introducing motorcycles.
- The `VehicleFactory` interface defines methods to create cars and motorcycles.
- `VehicleFactoryImpl` implements the interface and supports creation of **SUV**, **Kombi**, and **Motorka** types like **Cestovní**, **Terénní**, and **Skútr**.

### How to Run:
Execute the main method in `FactoryMethodTest.java`:
```bash
java FactoryMethodTest
```

### Output Example:
```
Motor: Naftový 1.6L, Pohon kol: Přední pohon, Spotřeba: 6.5 l/100km
Typ motorky: Terénní, Motor: Benzínový 450cc
```

---

## 3. Abstract Factory

### Description:
- Introduces abstract factories for creating car components (`Motor` and `PohonKol`).
- **Interfaces**:
  - `Motor`: Implemented by `BenzinovyMotor` (Gasoline) and `NaftovyMotor` (Diesel).
  - `PohonKol`: Implemented by `PredniPohon` (Front Drive) and `ZadniPohon` (Rear Drive).
- Specific factories like `SUVComponentsFactory` and `KombiComponentsFactory` produce components for respective car types.

### How to Run:
Execute the main method in `AbstractFactoryTest.java`:
```bash
java AbstractFactoryTest
```

### Output Example:
```
SUV - Motor: Benzínový motor, Pohon: Přední pohon
Kombi - Motor: Naftový motor, Pohon: Zadní pohon
```

---

## Technologies Used
- **Java 8 or higher**
- **Object-Oriented Programming (OOP)** principles
- **Creational Design Patterns**

---

## How to Compile and Run

### 1. Compile the Java Files
```bash
javac *.java
```

### 2. Run the Main Classes
For **Simple Factory**:
```bash
java SimpleFactoryTest
```

For **Factory Method**:
```bash
java FactoryMethodTest
```

For **Abstract Factory**:
```bash
java AbstractFactoryTest
```

---

## Conclusion
This project demonstrates how to effectively use **Simple Factory**, **Factory Method**, and **Abstract Factory** design patterns to manage object creation and enhance flexibility and scalability in a program.

Each pattern serves a specific purpose:
- **Simple Factory** centralizes object creation.
- **Factory Method** delegates object creation to subclasses.
- **Abstract Factory** provides families of related objects.


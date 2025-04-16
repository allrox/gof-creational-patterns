# GoF Creational Patterns
## Singleton Pattern

**The Singleton Pattern ensures a class has only one instance and provides a global access point to it.** This pattern is commonly used to control access to resources that must be shared across an entire application, such as configuration managers, loggers, or—in our analogy—design systems.

---

## 🔧 Project: Design System as a Singleton
In this example, we model a **Design System** (something you're already familiar with as a UX Designer) using the Singleton pattern.

This guarantees that all parts of an application rely on the same set of design tokens like colors, typography, and spacing—similar to how your design team expects consistency across components and screens.

---

## 🤖 Logical Structure

### 🔹 `DesignSystem.java` (Singleton Class)
- Contains private static instance
- Has a private constructor to block external instantiation
- Offers `getInstance()` static method for controlled access
- Holds internal references to design tokens: `ColorPalette`, `Typography`, and `Spacing`

### 🔹 `ColorPalette.java`, `Typography.java`, `Spacing.java`
- Represent design tokens
- Are loaded once when the singleton instance is created

### 🔹 `Main.java`
- Demonstrates the singleton in action
- Accesses the Design System instance multiple times
- Validates that all references point to the same object

---

## 🔄 How it works

1. The `DesignSystem` class restricts its instantiation using a private constructor
2. Its `getInstance()` method lazily initializes and stores the single instance
3. Any part of the system can call `DesignSystem.getInstance()` to get the shared reference
4. A demonstration in `Main.java` confirms both variables reference the same object

---

## 📊 Output Sample
```
Getting design system instance...
Primary color: #0D47A1
Secondary color: #FF6F00
Background color: #F5F5F5
Font family: Inter
Base font size: 16
Heading font size: 24
Large spacing: 16

Now let's check if both instances are really the same...
Are both instances the same? true
The meaning is that both instances are the same object in memory and any update will propagate through the system.
```

---

## ✅ Why use Singleton?

| Benefit | Description |
|--------|-------------|
| 🧡 Single source of truth | All design tokens are managed from one instance only |
| 🔐 Controlled instantiation | Ensures consistency by avoiding multiple object creation |
| ⚖️ Predictable behavior | All changes or reads affect the same shared object |
| 🎓 Educational analogy | Easy to understand for UX professionals by relating to Design System |

---

## 🥇 When to Use Singleton
- When you need **exactly one instance** of a class
- When global access is required to shared state
- When consistency and centralized control are critical (e.g., logs, configs, themes)

---

## 🔵 Summary Table

| Order | File                  | Role                                         | Notes                                  |
|-------|------------------------|----------------------------------------------|----------------------------------------|
| 1     | `DesignSystem.java`   | Singleton class, manages global design rules | Central hub of style tokens            |
| 2     | `ColorPalette.java`   | Contains color values                        | Used internally by the singleton       |
| 3     | `Typography.java`     | Contains typography definitions              | Used internally by the singleton       |
| 4     | `Spacing.java`        | Contains spacing values                      | Used internally by the singleton       |
| 5     | `Main.java`           | Demonstrates singleton behavior              | Verifies shared state across instances |

---

## 🚀 Key Takeaway
> The Singleton pattern is to code what the Design System is to UX:
> A **single, shared source of truth** used across all parts of the system for consistency, control and scalability.

---

#AllRox #DesignPatterns #Java #Singleton #SoftwareEngineering #DesignSystem


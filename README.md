# Selenium Java Test Automation Framework

A end-to-end UI test automation framework built with **Selenium WebDriver**, **Java**, and **TestNG**, following the **Page Object Model (POM)** design pattern. The suite automates a full user journey — login, navigation, dynamic form submission, and record verification — against a live practice application.

---

## 🚀 What This Project Demonstrates

- **Page Object Model (POM)** architecture for maintainable, reusable test code
- **TestNG** suite orchestration with dependency-chained test execution (`dependsOnMethods`)
- **Explicit waits** (`WebDriverWait` + `ExpectedConditions`) to handle dynamic UI elements, animations, and race conditions
- Handling of **real `<select>` dropdowns** via Selenium's `Select` class
- Safe, idempotent **checkbox interaction patterns** (state-checked before clicking)
- **Multi-tab/window handling** — switching WebDriver context to a newly opened browser tab
- **XPath and locator strategy** — prioritizing `id`, falling back to structured XPath for nested/dynamic elements
- **Data-driven test credentials** — test user login pulled from a **MySQL database via JDBC**, rather than hardcoded in source
- **ExtentReports** integration for rich, interactive HTML test reporting
- **Screenshot-on-failure**, automatically captured and embedded directly into the ExtentReports HTML report via a custom TestNG listener
- **CI/CD pipeline via GitHub Actions** — automated test execution on push, using `actions/checkout` and `actions/setup-java`
- Clean **Git hygiene** — proper `.gitignore`, correctly scoped repository (yes, this includes catching and fixing a misconfigured Git root before it shipped credentials — see `Lessons Learned` below 😅)

---

## 🧱 Tech Stack

| Category | Tools |
|---|---|
| Language | Java 21 |
| Test Framework | TestNG |
| Automation | Selenium WebDriver 4.45 |
| Build Tool | Maven |
| Database | MySQL (JDBC) — data-driven test credentials |
| Reporting | ExtentReports (with embedded failure screenshots) |
| CI/CD | GitHub Actions |
| IDE | IntelliJ IDEA |
| Version Control | Git / GitHub |

---

## 📁 Project Structure

```
src/test/java/
├── Pages/                  # Page Object classes — locators + actions only
│   ├── Homepage.java
│   ├── LoginFormPage.java
│   ├── DashboardPage.java
│   ├── LearningMaterialPage.java
│   ├── BasicFormPage.java
│   └── SubmissionRecordPage.java
├── TestRunners/            # Test classes — orchestrate Page Object calls
│   ├── LoginFlowTests.java
│   └── BasicFormTests.java
├── Utils/                  # Shared setup/teardown, browser factory
│   ├── Base.java
│   └── BrowserFactory.java
├── ExtentReport/           # Custom TestNG listener — HTML report + failure screenshots
│   └── ExtentReportManager.java
└── testng.xml              # Suite definition — execution order & method inclusion

.github/workflows/          # CI/CD pipeline — runs the suite on push via GitHub Actions
```

---

## ✅ Test Flow Covered

1. Launch browser → land on homepage
2. Click Login → authenticate with test credentials
3. Verify landing page content
4. Navigate: nav dropdown → Learning Materials → Basic Form tab
5. Fill out a multi-field form:
   - Text inputs (name, email, age)
   - Real `<select>` dropdowns (gender, country, experience)
   - Checkboxes (skills, newsletter, terms)
   - Textarea (comments)
6. Validate → Submit
7. Navigate to Submissions → open a record (opens in a **new tab** — handled via window switching)
8. Verify the submission record page loaded correctly

---

## 🏃 Running the Suite

```bash
mvn clean test
```

Or run directly via `testng.xml` in IntelliJ (right-click → Run).

**Note:** test credentials are pulled from a MySQL database at runtime — update the connection details in the DB utility class to point at your own instance before running locally.

---

## 📊 Reporting

Every run generates a rich **ExtentReports HTML report**, wired in via a custom TestNG listener. On any test failure, a **screenshot is automatically captured at the point of failure** and embedded directly into the report — no need to dig through console logs to see what the browser actually looked like when something broke.

---

## ⚙️ CI/CD

The suite runs automatically via **GitHub Actions** on push, using:
- `actions/checkout` — pulls the repo into the runner
- `actions/setup-java` — provisions the correct JDK version

This means the full end-to-end suite is validated in a clean environment on every push, not just locally.

---

## 🧠 Lessons Learned (the honest version)

This project wasn't built in a straight line — and that's kind of the point. A few real debugging wins along the way:

- Diagnosed and fixed a `NullPointerException` caused by Java's field-initializer execution order (fields resolve *before* constructor body — a subtle but important JVM behavior)
- Traced an `ElementClickInterceptedException` down to a transient success toast overlapping a nav button, and fixed it with a targeted `invisibilityOfElementLocated` wait instead of a blind `Thread.sleep()`
- Caught a **misplaced `.git` repository** rooted in the Windows user profile folder before it could push SSH keys and personal files to GitHub — diagnosed via Git's parent-directory lookup behavior, cleaned up safely
- Refactored from `@BeforeMethod` to `@BeforeClass`/`dependsOnMethods` to move from "fresh login every test" to a controlled, ordered single-session flow

---

## 👤 Author

**Thapelo Segwe**
QA Automation Student — WeThinkCode_ & Ndosi Test Automation Bootcamp
[GitHub](https://github.com/Thapelosegwe11)

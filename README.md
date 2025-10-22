# DivineData Server ⚙️

**Ktor Backend for the DivineData Emotional Bible Companion**  
Empowering the DivineData app with scripture, emotion analysis, and AI-powered reflections.

---

### ✨ Overview
DivineData Server is a **Ktor-based backend** that integrates:
- The **ESV Bible API** for retrieving accurate scripture passages.  
- A **Lightweight LLM (Large Language Model)** for generating emotional insights and reflections.  
- A unified **RESTful API** consumed by the [DivineData Android App](https://github.com/valentineRutto/divinedata-app).

It processes user emotion inputs, retrieves relevant verses, and returns AI-generated responses — helping users connect emotion with faith.

---

### 🧩 Key Features
- `/api/v1/chat` → Accepts user emotion + message, returns AI + verse reflection  
- `/api/v1/verse` → Fetches scripture by topic or emotion  
- Modular **Ktor architecture** with clean plugin setup  
- **JSON serialization**, **DI ready**, and **dotenv** configuration  
- Secure integration with external APIs

---

### 🏗️ Tech Stack
- **Ktor (Server Framework)**
- **Kotlinx Serialization (JSON)**
- **ESV API Integration**
- **OpenAI / Gemini (LLM Integration)**
- **Gradle KTS**
- **Docker Ready (Optional)**

---

### 🌐 Related Repository
📱 Native Android App → [DivineData Android (Native)](https://github.com/valentineRutto/divinedata-app)

---

### 💫 Vision
> “Connecting emotion, scripture, and reflection through intelligent design.”  
> DivineData bridges the gap between human feeling and divine wisdom — one verse at a time.


### Architecture
```
Android App (Native)
↓
HTTPS
↓
Ktor Backend Server
├── /api/v1/chat
│     ├─ Accepts: user emotion, message
│     ├─ Calls: LLM (local or external, e.g., OpenAI, Gemini)
│     ├─ Calls: ESV API for scripture
│     ├─ Combines: AI response + relevant verse
│     └─ Returns: JSON
│
└── /api/v1/verse
├─ Fetches: verse by topic or random
└─ Returns: ESV data
```

## Building & Running

To build or run the project, use one of the following tasks:

| Task                                    | Description                                                          |
| `./gradlew run`                         | Run the server                                                       |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```


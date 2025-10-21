# divinedata-server

This server serve the divinedata gpt and follow the below architecture:
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

## Building & Running

To build or run the project, use one of the following tasks:

| Task                                    | Description                                                          |
| `./gradlew run`                         | Run the server                                                       |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```


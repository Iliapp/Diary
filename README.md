
# 1. 🚀 PgAdmin - How to Run

Link
```
http://localhost:5050
```


# Run

```
docker-compose up -d

OR

    docker-compose up --build
```


# Stop

```
docker-compose down
```


# 2. 📂 Project Structure

src/main/java/com/ilya/backend/

├── controller/ -> REST controllers (API endpoints)

├── model/ -> Entities (Entry, User, Tag…)

├── repository/  -> Database access (JPA Repositories)

└── service/   -> Business logic


# 3. 🌐 API Endpoints
- GET /entries → get all diary entries
- GET /entries/{id} → get one entry by ID
- POST /entries → create a new entry
- PUT /entries/{id} → update an entry
- DELETE /entries/{id} → delete an entry





# 6. 👨‍💻 User Guide
1.Start the application
```
Run the project with Docker (docker-compose up -d).
```

2.Open the app in browser 

By default, the app runs on:
```
👉 http://localhost:8080/entries
```

3.Add a new entry
- Click the + Add New Entry button.

- Fill in the title, content, and mood.

- Save it.


4.View entries

- All entries appear in the list.

- Each entry shows title, text, mood (with emoji), and created date.

5.Edit an entry

- Click Edit next to an entry.
- Change the text or mood.
- Save changes.

6.Delete an entry
```
Click Delete next to the entry you want to remove.
```






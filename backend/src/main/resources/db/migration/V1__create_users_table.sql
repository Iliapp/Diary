CREATE TABLE users (
                       id  UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                       email CITEXT UNIQUE NOT NULL,
                       display_name_name TEXT NOT NULL,
                       password_hash TEXT NOT NULL,
                       created_at TIMESTAMP DEFAULT now()

);

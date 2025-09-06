CREATE TABLE entries (
                         id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                         user_id UUID REFERENCES users(id) ON DELETE CASCADE,
                         title TEXT NOT NULL,
                         content TEXT NOT NULL,
                         mood SMALLINT CHECK(mood BETWEEN 1 AND 5),
                         is_archived BOOLEAN DEFAULT FALSE,
                         created_at TIMESTAMP DEFAULT now(),
                         updated_at TIMESTAMP DEFAULT now()





);
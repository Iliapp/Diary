CREATE TABLE entries_tags (
                              id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                              entry_id UUID REFERENCES entries(id) ON DELETE CASCADE,
                              tag_id UUID REFERENCES tags(id) ON DELETE CASCADE,
                              created_at TIMESTAMP DEFAULT now()

);
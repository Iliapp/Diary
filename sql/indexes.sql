--1 For quick sorting by date

CREATE INDEX created_at_idxt ON entries (created_at)

--2 For quick sorting if there are users

CREATE INDEX user_id_idxt ON entries (user_id)



--3 For quick sorting by text

CREATE INDEX entries_text_idx ON entries
    USING GIN (to_tsvector('english', title || ' ' || content));
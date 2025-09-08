-- 1. User for the application

CREATE USER app_user WITH PASSWORD 'your_password_here';


-- 2.Disable rights for everyone (PUBLIC)
REVOKE ALL ON SCHEMA public FROM PUBLIC;


-- 3. We only allow access to the created user

GRANT USAGE ON SCHEMA public TO app_user;          -- ACCESS FOR SCHEMAS
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO app_user;


--4.
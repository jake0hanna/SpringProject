-- User data
INSERT INTO Users (id, name, password) VALUES (1, 'John Doe', 'password123');
INSERT INTO Users (id, name, password) VALUES (2, 'Jane Doe', 'password456');
INSERT INTO Users (id, name, password) VALUES (3, 'Jim Doe', 'password789');

-- TodoItem data
-- User John Doe
INSERT INTO TodoItem (id, user_id, title, description) VALUES (1, 1, 'Buy groceries', 'Milk, Eggs, Bread');
INSERT INTO TodoItem (id, user_id, title, description) VALUES (2, 1, 'Walk the dog', NULL);
-- User Jane Doe
INSERT INTO TodoItem (id, user_id, title, description) VALUES (3, 2, 'Finish report', 'Due tomorrow');
INSERT INTO TodoItem (id, user_id, title, description) VALUES (4, 2, 'Book flight', 'Flight to New York');
-- User Jim Doe
INSERT INTO TodoItem (id, user_id, title, description) VALUES (5, 3, 'Gym', 'At 7 AM');

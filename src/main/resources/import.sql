-- Insert Genres
INSERT INTO genre (id, name) VALUES (1, 'Action');
INSERT INTO genre (id, name) VALUES (2, 'Drama');
INSERT INTO genre (id, name) VALUES (3, 'Comedy');

-- Insert Movies
INSERT INTO movie (id, title, description, image_url, genre_id) VALUES (1, 'Inception', 'A mind-bending thriller about dreams within dreams.', 'inception.jpg', 1);
INSERT INTO movie (id, title, description, image_url, genre_id) VALUES (2, 'The Godfather', 'A story about an Italian-American crime family.', 'godfather.jpg', 2);
INSERT INTO movie (id, title, description, image_url, genre_id) VALUES (3, 'Superbad', 'A hilarious high school comedy.', 'superbad.jpg', 3);

-- Insert Users
INSERT INTO users (id, username, password, email, role) VALUES (1, 'john_doe', 'password123', 'john@example.com', 'USER');
INSERT INTO users (id, username, password, email, role) VALUES (2, 'admin_user', 'adminpassword', 'admin@example.com', 'ADMIN');

-- Insert Rooms
INSERT INTO room (id, name) VALUES (1, 'Room A');
INSERT INTO room (id, name) VALUES (2, 'Room B');

-- Insert Seats
INSERT INTO seat (id, seat_number, room_id) VALUES (1, 'A1', 1);
INSERT INTO seat (id, seat_number, room_id) VALUES (2, 'A2', 1);
INSERT INTO seat (id, seat_number, room_id) VALUES (3, 'B1', 2);
INSERT INTO seat (id, seat_number, room_id) VALUES (4, 'B2', 2);

-- Insert Showtimes
INSERT INTO showtime (id, start_time, end_time, movie_id, room_id) VALUES (1, '2025-03-01 14:00:00', '2025-03-01 16:00:00', 1, 1);
INSERT INTO showtime (id, start_time, end_time, movie_id, room_id) VALUES (2, '2025-03-02 18:00:00', '2025-03-02 20:00:00', 2, 2);

-- Insert Reservations
INSERT INTO reservation (id, reservation_date, user_id, showtime_id) VALUES (1, '2025-02-20 12:00:00', 1, 1);
INSERT INTO reservation (id, reservation_date, user_id, showtime_id) VALUES (2, '2025-02-21 14:00:00', 2, 2);

-- Insert Reservation_Seat Mapping
INSERT INTO reservation_seat (reservation_id, seat_id) VALUES (1, 1);
INSERT INTO reservation_seat (reservation_id, seat_id) VALUES (1, 2);
INSERT INTO reservation_seat (reservation_id, seat_id) VALUES (2, 3);
INSERT INTO reservation_seat (reservation_id, seat_id) VALUES (2, 4);

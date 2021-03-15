INSERT INTO paintings (id, url, name) VALUES
(1, '/sternennacht.jpeg', 'Sternennacht'),
(2, '/selbstbild.jpg', 'Selbstbild'),
(3, 'https://upload.wikimedia.org/wikipedia/commons/e/e0/VanGogh-Irises_2.jpg', 'Irises'),
(4, 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Vincent_Van_Gogh_0010.jpg/800px-Vincent_Van_Gogh_0010.jpg', 'Sonnenblumen'),
(5, 'https://upload.wikimedia.org/wikipedia/commons/6/60/Vincent_van_Gogh_-_Field_with_Poppies_%281889%29.jpg', 'Field with Poppies'),
(6, 'https://upload.wikimedia.org/wikipedia/commons/d/db/The_Potato_Eaters_-_Lithography_by_Vincent_van_Gogh.jpg', 'The potato eaters'),
(7, 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Starry_Night_Over_the_Rhone.jpg/1024px-Starry_Night_Over_the_Rhone.jpg', 'Stary night over Rhone');

INSERT INTO tags (id, name) VALUES
(1, 'fröhlich'),
(2, 'düster'),
(3, 'positiv');

INSERT INTO paintings_tags (painting_id, tag_id) VALUES
(1, 2),
(2, 2),
(3, 1),
(4, 3),
(5, 1),
(5, 3),
(6, 2),
(7, 2),
(7, 3);

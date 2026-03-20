-- ============================================================
--  Test Data Script - Table: movies
--  Entity  : Movie.java
--  DB      : PostgreSQL
--  Enums   :
--    Genre          -> ACTION, ADVENTURE, ANIMATION, COMEDY, CRIME,
--                      DOCUMENTARY, DRAMA, FANTASY, HORROR, MUSICAL,
--                      MYSTERY, ROMANCE, SCIENCE_FICTION, THRILLER, WESTERN
--    Classification -> G, PG, PG_13, R, NC_17, A_21
-- ============================================================

INSERT INTO movies (mv_title,           mv_duration, mv_genre,         mv_classification, mv_release_date, mv_is_available) VALUES
-- ACTION
('Mad Max: Fury Road',                  120,         'ACTION',         'R',               '2015-05-15',    TRUE),
('John Wick',                           101,         'ACTION',         'R',               '2014-10-24',    TRUE),

-- ADVENTURE
('Indiana Jones: Raiders of the Lost Ark', 115,      'ADVENTURE',      'PG',              '1981-06-12',    TRUE),
('The Mummy',                           125,         'ADVENTURE',      'PG_13',           '1999-05-07',    FALSE),

-- ANIMATION
('The Lion King',                       88,          'ANIMATION',      'G',               '1994-06-24',    TRUE),
('Spirited Away',                       125,         'ANIMATION',      'PG',              '2001-07-20',    TRUE),

-- COMEDY
('The Grand Budapest Hotel',            99,          'COMEDY',         'R',               '2014-03-28',    TRUE),
('Superbad',                            113,         'COMEDY',         'R',               '2007-08-17',    FALSE),

-- CRIME
('The Godfather',                       175,         'CRIME',          'R',               '1972-03-24',    TRUE),
('Pulp Fiction',                        154,         'CRIME',          'R',               '1994-10-14',    TRUE),

-- DOCUMENTARY
('Planet Earth II',                     60,          'DOCUMENTARY',    'G',               '2016-11-06',    TRUE),
('13th',                                100,         'DOCUMENTARY',    'PG_13',           '2016-10-07',    FALSE),

-- DRAMA
('The Shawshank Redemption',            142,         'DRAMA',          'R',               '1994-09-23',    TRUE),
('Forrest Gump',                        142,         'DRAMA',          'PG_13',           '1994-07-06',    TRUE),

-- FANTASY
('The Lord of the Rings: Fellowship',   178,         'FANTASY',        'PG_13',           '2001-12-19',    TRUE),
('Pan''s Labyrinth',                    118,         'FANTASY',        'R',               '2006-10-11',    FALSE),

-- HORROR
('Get Out',                             104,         'HORROR',         'R',               '2017-02-24',    TRUE),
('Hereditary',                          127,         'HORROR',         'R',               '2018-06-08',    FALSE),

-- MUSICAL
('La La Land',                          128,         'MUSICAL',        'PG_13',           '2016-12-09',    TRUE),
('The Greatest Showman',                105,         'MUSICAL',        'PG',              '2017-12-20',    TRUE),

-- MYSTERY
('Knives Out',                          130,         'MYSTERY',        'PG_13',           '2019-11-27',    TRUE),
('Gone Girl',                           149,         'MYSTERY',        'R',               '2014-10-03',    FALSE),

-- ROMANCE
('Pride & Prejudice',                   129,         'ROMANCE',        'PG',              '2005-11-23',    TRUE),
('The Notebook',                        123,         'ROMANCE',        'PG_13',           '2004-06-25',    TRUE),

-- SCIENCE_FICTION
('Interstellar',                        169,         'SCIENCE_FICTION','PG_13',           '2014-11-07',    TRUE),
('Blade Runner 2049',                   164,         'SCIENCE_FICTION','R',               '2017-10-06',    FALSE),

-- THRILLER
('Parasite',                            132,         'THRILLER',       'R',               '2019-05-30',    TRUE),
('Prisoners',                           153,         'THRILLER',       'R',               '2013-09-20',    TRUE),

-- WESTERN
('The Good, the Bad and the Ugly',      178,         'WESTERN',        'NC_17',           '1966-12-23',    FALSE),
('Django Unchained',                    165,         'WESTERN',        'R',               '2012-12-25',    TRUE);


delete from entities;
delete from textures;

insert into textures (NAME, FILENAME) values ('Wall01', 'goswall.jpg');
insert into textures (NAME, FILENAME) values ('Wall02', 'goswall1.jpg');
insert into textures (NAME, FILENAME) values ('Wall03', 'goswall2.jpg');
insert into textures (NAME, FILENAME) values ('Floor', 'gsfloor.jpg');
insert into textures (NAME, FILENAME) values ('Brick', 'nkbrick.jpg');
insert into textures (NAME, FILENAME) values ('Door', 'nkdoor.jpg');
insert into textures (NAME, FILENAME) values ('Wooden plank', 'Wdplnk.jpg');
insert into textures (NAME, FILENAME) values ('Wet brick', 'wetbrick.jpg');
insert into textures (NAME, FILENAME) values ('Wet concrete', 'wetconcr.jpg');

insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 1', 1, 2, 0, 0);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 1', 2, 4, 0, 0);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 1', 3, 0, 0, 0);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 2', 1, 2, 0, 4);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 2', 2, 4, 0, 4);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Corridor wall 2', 3, 0, 0, 4);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor floor', 4, 0, -0.95, 2, 0.05);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor floor', 4, 2, -0.95, 2, 0.05);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor floor', 4, 4, -0.95, 2, 0.05);

insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor ceiling', 5, 0, 0.95, 2, 0.05);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor ceiling', 5, 2, 0.95, 2, 0.05);
insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS, Y_SIZE) values ('Corridor ceiling', 5, 4, 0.95, 2, 0.05);

insert into entities (NAME, TEXTURE_ID, X_POS, Y_POS, Z_POS) values ('Door', 6, 6, 0, 0);



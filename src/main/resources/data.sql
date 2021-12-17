

--CREATE TRIGGER new_kind_of_works_AFTER_INSERT BEFORE INSERT ON kind_of_work
--FOR EACH ROW
--    SET NEW.start_price = NEW.start_price + NEW.start_price * 0.38
--;

INSERT INTO roles(id, name)
values (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN')
ON DUPLICATE KEY UPDATE name = values(name);

INSERT INTO owners(id, fio, passport, phone)
VALUES  (1, "Лазарев Августин Мэлорович", "4459 595088", "+7(764)593-85-85"),
        (2, "Носков Устин Наумович", "4618 352722", "+7(335)613-39-39"),
        (3, "Максимов Аввакуум Арсеньевич", "4486 980433", "+7(022)936-61-37"),
        (4, "Кулаков Виталий Николаевич", "4088 326141", "+7(285)842-19-97");


INSERT INTO castles(id, brand, info, model,  year)
VALUES  (1, "Замки от Шлепы", null, "Flopper",  2010),
        (2, "Castles from Floppa", null, "100X",  2017),
        (3, "Amogus", null, "200CASTLE", 2012);

INSERT INTO kind_of_work(id, description, guarantee, lead_time, name, start_price)
VALUES  (1, "Надувание замка", 120, 2, "Надуть", 800),
        (2, "Обслуживание", 60, 1, "Обслуживание", 500),
        (3, "Ремонт замка", 365, 10, "Ремонт", 4000);

INSERT INTO orders(	id, date, castle_id, owner_id)
VALUES  (1, "2020-02-12 17:20:06.226", 3, 2),
        (2, "2020-02-13 14:10:06.226", 3, 1),
        (3, "2020-03-01 10:20:44.239", 2, 4),
        (4, "2020-03-05 17:20:06.226", 1, 3);

INSERT INTO order_work(id, price, work_id, order_id)
VALUES  (1, 1239, 1, 1),
        (2, 600, 2, 1),
        (3, 5048, 3, 1),
        (4, 400, 2, 2),
        (5, 1000, 1, 3),
        (6, 3500, 3, 4)
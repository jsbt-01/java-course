START TRANSACTION;

update clinics set name = 'UPDATED_NAME_1' where id = 1; -- deduct / minus

update clinics set name = 'updated_name_2' where id = 2; -- deposit / plus

ROLLBACK;  # Do Commit or rollback
COMMIT;
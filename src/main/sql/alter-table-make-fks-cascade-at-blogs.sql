USE blogs;


ALTER TABLE blogs
DROP CONSTRAINT FK_created_by;

ALTER TABLE blogs
ADD CONSTRAINT FK_created_by
FOREIGN KEY (created_by)
REFERENCES users(id)
ON DELETE CASCADE;


ALTER TABLE blogs
DROP CONSTRAINT FK_category_id;

ALTER TABLE blogs
ADD CONSTRAINT FK_category_id
FOREIGN KEY (category_id)
REFERENCES categories(id)
ON DELETE CASCADE;
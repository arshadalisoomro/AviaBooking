-- Table: "Users"

-- DROP TABLE "User";

CREATE TABLE "User"
(
  user_id serial NOT NULL,
  "Name" character varying(20),
  "Password" character varying(20),
  role character varying(10),
  CONSTRAINT user_id PRIMARY KEY (user_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "User"
  OWNER TO postgres;

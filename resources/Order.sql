-- Table: "Order"

-- DROP TABLE "Order";

CREATE TABLE "Order"
(
  order_id integer NOT NULL,
  user_id integer,
  "Type_of_order" character varying,
  flight character(5),
  CONSTRAINT order_id PRIMARY KEY (order_id),
  CONSTRAINT flight FOREIGN KEY (flight)
      REFERENCES "Flight" ("Flight") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT user_id FOREIGN KEY (user_id)
      REFERENCES "User" (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Order"
  OWNER TO postgres;
-- Table: "Recurrence"

-- DROP TABLE "Recurrence";

CREATE TABLE "Recurrence"
(
  rec_id serial NOT NULL,
  "Start_period" date,
  "End_period" date,
  "Flight" character(5),
  "Departure_time" time with time zone,
  "Arrival_time" time with time zone,
  "Mon" boolean,
  "Tue" boolean,
  "Wed" boolean,
  "Thu" boolean,
  "Fri" boolean,
  "Sat" boolean,
  "Sun" boolean,
  CONSTRAINT rec_id PRIMARY KEY (rec_id),
  CONSTRAINT "Recurrence_Flight_fkey" FOREIGN KEY ("Flight")
      REFERENCES "Flights" ("Flight") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Recurrence"
  OWNER TO postgres;

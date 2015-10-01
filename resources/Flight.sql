-- Table: "Flights"

-- DROP TABLE "Flights";

CREATE TABLE "Flight"
(
  "Flight" character(5) NOT NULL,
  "Departure_city" character varying(30),
  "Arrival_city" character varying(30),
  "Plane" character varying(20),
  "Available_seats" integer,
  "Class" character(1),
  CONSTRAINT "Flight_key" PRIMARY KEY ("Flight")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Flight"
  OWNER TO postgres;

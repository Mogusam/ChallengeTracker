SET default_with_oids = false;

CREATE TABLE IF NOT EXISTS public.challenge_template
(
    Template_Id serial,
    Template_Name character varying(255) NOT NULL,
    Template_Description character varying NOT NULL,
    Template_Settings jsonb NOT NULL,
    CONSTRAINT PK_Template_Id PRIMARY KEY (Template_Id)
);

CREATE TABLE IF NOT EXISTS public.challenge
(
    Challenge_Id serial,
    Template_Id serial,
    Start_Date date NOT NULL,
    End_Date date NOT NULL,
    Access character varying(50) NOT NULL,
    Stop_Strategy character varying(50) NOT NULL,
    State character varying(50) NOT NULL,
    Moderated character varying(50) NOT NULL,
    Challenge_Settings jsonb NOT NULL,
    CONSTRAINT PK_Challenge_Id PRIMARY KEY (Challenge_Id),
    CONSTRAINT FK_Template_Id FOREIGN KEY (Template_Id)
        REFERENCES public.challenge_template (Template_Id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS public.user
(
    User_Id serial,
    First_Name character varying(255) NOT NULL,
    Second_Name character varying(255) NOT NULL,
    Email character varying(255) NOT NULL,
    User_Name character varying(255) NOT NULL,
    Password character varying(255) NOT NULL,
    Role character varying(50) NOT NULL,
    CONSTRAINT PK_User_Id PRIMARY KEY (User_Id),
    CONSTRAINT Unique_User_Name UNIQUE (User_Name)
);

CREATE TABLE IF NOT EXISTS public.user_challenge
(
    User_Id serial,
    Challenge_Id serial,
    User_Challenge_Role character varying(255) NOT NULL,
    User_Challenge_State character varying(50) NOT NULL,
    CONSTRAINT PK_User_Id_Challenge_Id PRIMARY KEY (User_Id, Challenge_Id),
    CONSTRAINT FK_User_Id FOREIGN KEY (User_Id)
        REFERENCES public.user (User_Id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT FK_Challenge_Id FOREIGN KEY (Challenge_Id)
        REFERENCES public.challenge (Challenge_Id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
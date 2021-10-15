-- begin DEMOTASK_PERSON
create table DEMOTASK_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME longvarchar not null,
    FIRST_NAME longvarchar not null,
    PATRONYMIC_NAME longvarchar,
    EMAIL varchar(1000) not null,
    --
    primary key (ID)
)^
-- end DEMOTASK_PERSON

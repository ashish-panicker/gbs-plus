create table app_users (
    id bigint not null,
    created_date date not null,
    user_enabled boolean not null,
    user_password varchar(255) not null,
    user_name varchar(255) not null,
    primary key (id)
);

alter table app_users add constraint UK_cdpifjw6dh83f6du6wxeo1xip unique (user_name);

create sequence hibernate_sequence start with 100 increment by 10;
CREATE DATABASE DATN
USE DATN
Go
CREATE TABLE roles
(
    role_id int IDENTITY (1, 1) NOT NULL,
    name    varchar(255),
    CONSTRAINT pk_roles PRIMARY KEY (role_id)
)
GO

GO
CREATE TABLE categories
(
    id              bigint IDENTITY (1, 1) NOT NULL,
    category_name   varchar(255),
    category_status bit,
    CONSTRAINT pk_categories PRIMARY KEY (id)
)
GO
CREATE TABLE users
(
    id           bigint IDENTITY (1, 1) NOT NULL,
    username     varchar(255),
    password     varchar(255),
    email        varchar(255),
    address      varchar(255),
    phone_number int,
    gender       bit,
    full_name    varchar(255),
    status       bit,
    CONSTRAINT pk_users PRIMARY KEY (id)
)
GO

ALTER TABLE users
    ADD CONSTRAINT uc_users_email UNIQUE (email)
GO

ALTER TABLE users
    ADD CONSTRAINT uc_users_phonenumber UNIQUE (phone_number)
GO

ALTER TABLE users
    ADD CONSTRAINT uc_users_username UNIQUE (username)
GO
CREATE TABLE user_role
(
    user_role_id bigint IDENTITY (1, 1) NOT NULL,
    user_id      bigint,
    role_id      int,
    CONSTRAINT pk_user_role PRIMARY KEY (user_role_id)
)
GO

ALTER TABLE user_role
    ADD CONSTRAINT FK_USER_ROLE_ON_ROLE FOREIGN KEY (role_id) REFERENCES roles (role_id)
GO

ALTER TABLE user_role
    ADD CONSTRAINT FK_USER_ROLE_ON_USER FOREIGN KEY (user_id) REFERENCES users (id)
GO
CREATE TABLE vouchers
(
    id                  bigint IDENTITY (1, 1) NOT NULL,
    voucher_create_date date,
    voucher_start_date  date,
    voucher_end_date    date,
    voucher_count       bigint,
    voucher_discount    float(53),
    voucher_type        int,
    voucher_status      bit,
    CONSTRAINT pk_vouchers PRIMARY KEY (id)
)
GO
CREATE TABLE order_status
(
    id          bigint NOT NULL,
    name        varchar(255),
    description varchar(255),
    create_date date,
    update_date date,
    CONSTRAINT pk_order_status PRIMARY KEY (id)
)
GO
CREATE TABLE orders
(
    order_id        bigint IDENTITY (1, 1) NOT NULL,
    order_code      varchar(255),
    order_email     varchar(255),
    phone_number    int,
    customer_name   varchar(255),
    order_address   varchar(255),
    total_price     float(53),
    description     varchar(255),
    ship_date       datetime,
    payment         varchar(255),
    user_id         bigint,
    voucher_id      bigint,
    order_status_id bigint,
    CONSTRAINT pk_orders PRIMARY KEY (order_id)
)
GO

ALTER TABLE orders
    ADD CONSTRAINT uc_orders_order_email UNIQUE (order_email)
GO

ALTER TABLE orders
    ADD CONSTRAINT uc_orders_ordercode UNIQUE (order_code)
GO

ALTER TABLE orders
    ADD CONSTRAINT uc_orders_phonenumber UNIQUE (phone_number)
GO

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_ORDER_STATUS FOREIGN KEY (order_status_id) REFERENCES order_status (id)
GO

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id)
GO

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_VOUCHER FOREIGN KEY (voucher_id) REFERENCES vouchers (id)
GO

CREATE TABLE products
(
    id           bigint IDENTITY (1, 1) NOT NULL,
    product_code varchar(255),
    create_date  date,
    description  varchar(255),
    status       bit,
    cate_id      bigint,
    voucher_id   bigint,
    CONSTRAINT pk_products PRIMARY KEY (id)
)
GO

ALTER TABLE products
    ADD CONSTRAINT uc_products_productcode UNIQUE (product_code)
GO

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_CATE FOREIGN KEY (cate_id) REFERENCES categories (id)
GO

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_VOUCHER FOREIGN KEY (voucher_id) REFERENCES vouchers (id)
GO

CREATE TABLE product_accessories
(
    id                            bigint IDENTITY (1, 1) NOT NULL,
    pa_model                      varchar(255),
    pa_function                   varchar(255),
    pa_output                     varchar(255),
    pa_connection_jack            varchar(255),
    pa_maximum_charging_current   varchar(255),
    pa_size                       bigint,
    pa_technology                 varchar(255),
    pa_manafaceture               varchar(255),
    pa_brand                      varchar(255),
    pa_company                    varchar(255),
    pa_battery_life               varchar(255),
    pa_charging_case_battery_life varchar(255),
    pa_charging_port              varchar(255),
    pa_audio_technology           varchar(255),
    pa_compatibility              varchar(255),
    pa_convenience                varchar(255),
    pa_connection_technology      varchar(255),
    pa_control                    varchar(255),
    pa_mass                       varchar(255),
    cate_id                       bigint,
    CONSTRAINT pk_product_accessories PRIMARY KEY (id)
)
GO

ALTER TABLE product_accessories
    ADD CONSTRAINT FK_PRODUCT_ACCESSORIES_ON_CATE FOREIGN KEY (cate_id) REFERENCES categories (id)
GO
CREATE TABLE images
(
    id           bigint IDENTITY (1, 1) NOT NULL,
    img_url      varchar(255),
    create_date  date,
    img_type     varchar(255),
    image_status bit,
    product_id   bigint,
	pa_id		 bigint,
    CONSTRAINT pk_images PRIMARY KEY (id)
)
GO
ALTER TABLE images
    ADD CONSTRAINT FK_IMAGES_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id)
GO
ALTER TABLE images
    ADD CONSTRAINT FK_IMAGES_ON_PRODUCT_ACCESSORIES FOREIGN KEY (pa_id) REFERENCES product_accessories (id)
CREATE TABLE options
(
    option_id              bigint IDENTITY (1, 1) NOT NULL,
    option_name            varchar(255),
    option_code            varchar(255),
    option_status          bit,
    product_id             bigint,
    product_accessories_id bigint,
    CONSTRAINT pk_options PRIMARY KEY (option_id)
)
GO

ALTER TABLE options
    ADD CONSTRAINT FK_OPTIONS_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id)
GO

ALTER TABLE options
    ADD CONSTRAINT FK_OPTIONS_ON_PRODUCTACCESSORIES FOREIGN KEY (product_accessories_id) REFERENCES product_accessories (id)
GO
CREATE TABLE option_values
(
    option_value_id      bigint IDENTITY (1, 1) NOT NULL,
    option_value         varchar(255),
    option_values_status bit,
    option_id            bigint,
    CONSTRAINT pk_option_values PRIMARY KEY (option_value_id)
)
GO

ALTER TABLE option_values
    ADD CONSTRAINT FK_OPTION_VALUES_ON_OPTION FOREIGN KEY (option_id) REFERENCES options (option_id)
GO

CREATE TABLE product_details
(
    product_detail_id                  bigint IDENTITY (1, 1) NOT NULL,
    product_name                       varchar(255),
    product_screen_technology          varchar(255),
    product_resolution                 varchar(255),
    product_code                       varchar(255),
    product_cam_resolution             varchar(255),
    product_film                       varchar(255),
    product_flash_light                varchar(255),
    product_feature                    varchar(255),
    product_cpu                        varchar(255),
    product_cpu_speed                  varchar(255),
    product_gpu                        varchar(255),
    product_ram                        varchar(255),
    product_capacity                   varchar(255),
    product_phonebook                  varchar(255),
    product_mobile_network             varchar(255),
    product_gps                        varchar(255),
    product_bluetooth                  varchar(255),
    product_battery_capacity           varchar(255),
    product_battery_type               varchar(255),
    product_support_charging           varchar(255),
    product_technology_the_battery     varchar(255),
    product_advanced_security          varchar(255),
    [product_waterproof and dustproof] varchar(255),
    product_design                     varchar(255),
    product_materials                  varchar(255),
    product_size                       varchar(255),
    product_mass                       varchar(255),
    product_release_time               varchar(255),
    product_quantity                   int,
    product_id                         bigint,
    CONSTRAINT pk_product_details PRIMARY KEY (product_detail_id)
)
GO

ALTER TABLE product_details
    ADD CONSTRAINT FK_PRODUCT_DETAILS_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES products (id)
GO
CREATE TABLE option_container
(
    oc_id             bigint IDENTITY (1, 1) NOT NULL,
    product_detail_id bigint,
    option_id         bigint,
    option_value_id   bigint,
    CONSTRAINT pk_option_container PRIMARY KEY (oc_id)
)
GO

ALTER TABLE option_container
    ADD CONSTRAINT FK_OPTION_CONTAINER_ON_OPTION FOREIGN KEY (option_id) REFERENCES options (option_id)
GO

ALTER TABLE option_container
    ADD CONSTRAINT FK_OPTION_CONTAINER_ON_OPTION_VALUE FOREIGN KEY (option_value_id) REFERENCES option_values (option_value_id)
GO

ALTER TABLE option_container
    ADD CONSTRAINT FK_OPTION_CONTAINER_ON_PRODUCT_DETAIL FOREIGN KEY (product_detail_id) REFERENCES product_details (product_detail_id)
GO
CREATE TABLE order_details
(
    id             bigint IDENTITY (1, 1) NOT NULL,
    price          float(53),
    quantity       bigint,
    price_discount float(53),
    order_id       bigint,
    CONSTRAINT pk_order_details PRIMARY KEY (id)
)
GO

ALTER TABLE order_details
    ADD CONSTRAINT FK_ORDER_DETAILS_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (order_id)
GO

DROP TABLE order_details
DROP TABLE product_details
DROP TABLE option_container
DROP TABLE option_values
DROP TABLE options
DROP TABLE images
DROP TABLE product_accessories
DROP TABLE products
DROP TABLE orders
DROP TABLE vouchers
DROP TABLE order_status
DROP TABLE user_role
DROP TABLE users
DROP TABLE categories
DROP TABLE roles
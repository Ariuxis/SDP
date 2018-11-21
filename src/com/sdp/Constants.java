package com.sdp;

public class Constants {

//  Constants that denotes the URL used for the database connection.
    public static String MYSQL_URL = "jdbc:mysql://localhost:3306/" ;
    public static String DATABASE_URL = "SDPJC";
    public static String JDBC_URL = MYSQL_URL + DATABASE_URL;

//  Constant that denotes the driver used for the database connection.
    public static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

//  Credentials of the admin of SDPJC database.
    public static String SDPJC_USER = "sdpjc";
    public static String SDPJC_PASS = "351F90B485180";
}

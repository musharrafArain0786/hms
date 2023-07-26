package com.hms.constants;

public class ERoleConstants {

    public static final String  ROLE_ADMIN = "hasRole('ADMIN')";

    public static final String  ROLE_MODERATOR = "hasRole('MODERATOR')";

    public static final String  ROLE_USER = "hasRole('MODERATOR')";

    public static final String  ROLE_ADMIN_OR_MODERATOR = "hasRole('ADMIN') or hasRole('MODERATOR')";

    public static final String  ROLE_MODERATOR_OR_USER = "hasRole('MODERATOR') or hasRole('USER')";
}

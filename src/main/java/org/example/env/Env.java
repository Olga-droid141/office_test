package org.example.env;

import org.aeonbits.owner.ConfigFactory;
import org.example.env.config.DBConfig;

public class Env {

    public static class DB {
        public static final DBConfig DB_CONFIG = ConfigFactory.create(DBConfig.class);

    }
}

package org.example.db.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.example.env.config.DBConfig;

import javax.sql.DataSource;

@Slf4j
@UtilityClass
public class DataSourceProvider {

    public static DataSource getH2DataSource(DBConfig config) {
        log.info("H2 datasource");

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(config.h2JdbcUrl());
        hikariConfig.setConnectionTimeout(30000);
        hikariConfig.setPoolName("H2");
        hikariConfig.setAutoCommit(true);
        hikariConfig.setKeepaliveTime(50000);

        log.info("H2 настроена");
        return new HikariDataSource(hikariConfig);
    }
}

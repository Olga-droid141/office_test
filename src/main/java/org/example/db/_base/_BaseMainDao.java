package org.example.db._base;

import lombok.extern.slf4j.Slf4j;
import org.example.db.dao.DataSourceProvider;
import org.example.env.Env;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.ColumnMappers;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

@Slf4j
public class _BaseMainDao {
    protected Jdbi jdbi;

    public _BaseMainDao() {
        log.info("Инициализация базового DAO");

        jdbi = Jdbi.create(DataSourceProvider.getH2DataSource(Env.DB.DB_CONFIG));
        jdbi.installPlugin(new SqlObjectPlugin());
        jdbi.getConfig(ColumnMappers.class).setCoalesceNullPrimitivesToDefaults(false);

        log.info("Базовый Dao готов");
    }
}

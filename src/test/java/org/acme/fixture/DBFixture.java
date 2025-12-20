package org.acme.fixture;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
//import org.testcontainers.containers.PostgreSQLContainer;

import java.util.HashMap;
import java.util.Map;

public class DBFixture implements QuarkusTestResourceLifecycleManager {
//    private static PostgreSQLContainer<?> db;
//
//    static {
//        // Увеличиваем тайм-аут для pull Docker образов
//        System.setProperty("testcontainers.pull.timeout", "120000"); // 120 сек
//    }

    @Override
    public Map<String, String> start() {
//        db = new PostgreSQLContainer<>("postgres:16-alpine")
//                .withDatabaseName("testdb")
//                .withUsername("testuser")
//                .withPassword("testpass")
//                .withInitScript("database/init-database.sql");
//        db.start();

        Map<String, String> conf = new HashMap<>();
//        conf.put("quarkus.datasource.db-kind", "postgresql");
//        // Преобразуем JDBC URL в реактивный URL
//        String reactiveUrl = String.format("vertx-reactive:postgresql://%s:%d/%s",
//                db.getHost(),
//                db.getFirstMappedPort(),
//                db.getDatabaseName());
//        conf.put("quarkus.datasource.reactive.url", reactiveUrl);
//        conf.put("quarkus.datasource.username", db.getUsername());
//        conf.put("quarkus.datasource.password", db.getPassword());
        return conf;
    }

    @Override
    public void stop() {
//        if (db != null) db.stop();
    }
}

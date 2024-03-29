package org.spacetravel;


import org.spacetravel.dbutils.flyway.DatabaseMigrationService;

public class Main {
    public static void main(String[] args) {
        DatabaseMigrationService.doMigrate();
    }
}
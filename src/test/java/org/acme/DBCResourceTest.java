package org.acme;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.acme.fixture.DBFixture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(DBFixture.class)
class DBCResourceTest {
    /**
     * Group A
     **/
    @Test
    @DisplayName("dbc_achievement: /dbc/getAchievement/6")
    void getAchievement() {
        Response response = given()
                .when().get("/dbc/getAchievement/6");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Level 10", response.jsonPath().getString("titleLangEnus"));
    }

    @Test
    @DisplayName("dbc_achievement_criteria: /dbc/getAchievementCriteria/34")
    void getAchievementCriteria() {
        Response response = given()
                .when().get("/dbc/getAchievementCriteria/34");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Reach level 10", response.jsonPath().getString("descriptionLangEnus"));
    }

    @Test
    @DisplayName("dbc_areagroup: /dbc/getAreaGroup/34")
    void getAreaGroup() {
        Response response = given()
                .when().get("/dbc/getAreaGroup/34");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(1977, response.jsonPath().getInt("areaid1"));
    }

    @Test
    @DisplayName("dbc_areatable: /dbc/getAreaTable/34")
    void getAreaTable() {
        Response response = given()
                .when().get("/dbc/getAreaTable/34");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Echo Ridge Mine", response.jsonPath().getString("areaNameLangEnus"));
    }

    @Test
    @DisplayName("dbc_areatrigger: /dbc/getAreaTrigger/45")
    void getAreaTrigger() {
        Response response = given()
                .when().get("/dbc/getAreaTrigger/45");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(-798.4290161132812, response.jsonPath().getFloat("y"));
    }

    @Test
    @DisplayName("dbc_auctionhouse: /dbc/getAuctionHouse/1")
    void getAuctionHouse() {
        Response response = given()
                .when().get("/dbc/getAuctionHouse/1");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Stormwind Auction House", response.jsonPath().getString("nameLangEnus"));
    }

    /**
     * Group B
     **/
    @Test
    @DisplayName("dbc_bankbagslotprices: /dbc/getBankBagSlotPrices/1")
    void getBankBagSlotPrices() {
        Response response = given()
                .when().get("/dbc/getBankBagSlotPrices/1");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(1000, response.jsonPath().getInt("cost"));
    }

    @Test
    @DisplayName("dbc_bannedaddons: /dbc/getBannedAddons/1")
    void getBannedAddons() {
        Response response = given()
                .when().get("/dbc/getBannedAddons/1");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(3649838548L, response.jsonPath().getLong("nameMd5_1"));
    }

    @Test
    @DisplayName("dbc_barbershopstyle: /dbc/getBarbershopStyle/3")
    void getBarbershopStyle() {
        Response response = given()
                .when().get("/dbc/getBarbershopStyle/3");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Long", response.jsonPath().getString("displaynameLangEnus"));
    }

    @Test
    @DisplayName("dbc_battlemasterlist: /dbc/getBattlemasterList/1")
    void getBattlemasterList() {
        Response response = given()
                .when().get("/dbc/getBattlemasterList/1");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Alterac Valley", response.jsonPath().getString("nameLangEnus"));
    }

    @Test
    @DisplayName("healthcheck: /hello")
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }
}
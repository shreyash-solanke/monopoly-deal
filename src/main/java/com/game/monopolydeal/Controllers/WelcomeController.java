package com.game.monopolydeal.Controllers;

import com.game.monopolydeal.Entities.CardsData;
import com.game.monopolydeal.Entities.CardsDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static java.lang.System.Logger.Level.*;

@RestController
public class WelcomeController {

    private static final System.Logger LOGGER = System.getLogger("c.f.b.DefaultLogger");

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CardsDataRepo cardsRepo;

    @GetMapping("/welcome")
    public List<CardsData> welcome() {

//        String sql = "select * from cards_data;";

//        int result = jdbcTemplate.update(sql, "Ravi Kumar", "ravi.kumar@gmail.com", "ravi2021");

//        jdbcTemplate.query(sql, new RowCallbackHandler() {
//            public void processRow(ResultSet resultSet) throws SQLException {
//                int count = 1;
//                do {
//                    String payload = resultSet.getString(2);
//                    LOGGER.log(INFO, "My result " + payload, count++);
//                } while (resultSet.next());
//            }
//        });


            List<CardsData> listUsers = cardsRepo.findAll();

            return listUsers;


    }
}
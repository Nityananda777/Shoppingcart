package com.dbs.shoppingcartservice;

import com.dbs.shoppingcartservice.service.ShoppingItemSelectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartServiceApplication implements CommandLineRunner {
  private static Logger log = LoggerFactory.getLogger(ShoppingCartServiceApplication.class);

  @Autowired
  private ShoppingItemSelectService shoppingItemSelectService;

  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartServiceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    log.info("..Welcome to Mini Shopping cart.. ");

    shoppingItemSelectService.simulateBatchItemSelect();

    log.info(". . . . . . . . . . . . . . . . . . . . . . . . . . . .  ");
  }
}

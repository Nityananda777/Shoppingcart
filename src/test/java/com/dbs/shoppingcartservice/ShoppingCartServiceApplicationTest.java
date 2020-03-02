package com.dbs.shoppingcartservice;

import com.dbs.shoppingcartservice.service.ShoppingItemSelectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartServiceApplicationTest {

  @Autowired
  ShoppingCartServiceApplication shoppingCartServiceApplication;

  @MockBean
  ShoppingItemSelectService shoppingItemSelectService;

  @Test
  public void run_test_call() {
    verify(shoppingItemSelectService, times(1)).simulateBatchItemSelect();
  }
}
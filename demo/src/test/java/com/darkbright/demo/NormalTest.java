package com.darkbright.demo;

import com.darkbright.demo.domain.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-05-08 00:13
 **/
public class NormalTest {
  private static final Logger log = LoggerFactory.getLogger(NormalTest.class);


  public static void main(String[] args) throws JsonProcessingException {
    ArrayList<User> users = new ArrayList<>();

    User user1 = new User("bright1","xxx");
    User user2 = new User("bright2","xxx");
    User user3 = new User("bright3","xxx");
    User user4 = new User("bright4","xxx");
    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);

    ObjectMapper mapper = new ObjectMapper();
    log.debug(mapper.writeValueAsString(users));

  }
}

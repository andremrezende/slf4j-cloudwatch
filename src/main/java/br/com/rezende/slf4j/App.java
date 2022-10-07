package br.com.rezende.slf4j;

import br.com.rezende.slf4j.log.LoggerProxy;

public class App {
  private static final LoggerProxy logger = LoggerProxy.getLogger(App.class);

  public static void main(String[] args) {
    logger.debug("Hello World!");
  }
}

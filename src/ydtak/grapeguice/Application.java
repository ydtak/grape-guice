package ydtak.grapeguice;

import ydtak.grapeguice.juice.Fruit;
import ydtak.grapeguice.juice.FruitFactory;
import ydtak.grapeguice.juice.Juice;
import ydtak.grapeguice.juice.Juicy;

import javax.inject.Inject;

public class Application {

  private final Juicy juicy;
  private final Fruit fruit;
  private final Juice juice;

  @Inject
  public Application(Juicy juicy, FruitFactory fruitFactory, Juice juice) {
    this.juicy = juicy;
    this.fruit = fruitFactory.create("grape");
    this.juice = juice;
  }

  public void run() {
    // Prints "juicy grape"
    System.out.println(juice.get());

    // Prints "juicy"
    System.out.println(juicy.get());

    // Print "juicy grape"
    System.out.println(fruit.get());
  }
}

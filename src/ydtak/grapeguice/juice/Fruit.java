package ydtak.grapeguice.juice;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

@AutoFactory(allowSubclasses = true)
public class Fruit {

  private final String name;
  private final Juicy juicy;

  public Fruit(
      @Provided Juicy juicy,
      String name) {
    this.juicy = juicy;
    this.name = name;
  }

  public String get() {
    return juicy.get() + " " + name;
  }
}

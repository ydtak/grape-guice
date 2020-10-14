package ydtak.guiceexample.juice;

import javax.inject.Inject;

public class GrapeJuice implements Juice {

  private final Juicy juicy;

  @Inject
  public GrapeJuice(Juicy juicy) {
    this.juicy = juicy;
  }

  @Override
  public String get() {
    return juicy.get() + " grape";
  }
}

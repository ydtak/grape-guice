package ydtak.guiceexample;

import com.google.inject.AbstractModule;
import ydtak.guiceexample.juice.Juice;
import ydtak.guiceexample.juice.GrapeJuice;

public class ApplicationModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Juice.class).to(GrapeJuice.class);
  }
}

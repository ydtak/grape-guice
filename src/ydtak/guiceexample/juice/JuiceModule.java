package ydtak.guiceexample.juice;

import com.google.inject.AbstractModule;

public class JuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Juice.class).to(GrapeJuice.class);
  }
}

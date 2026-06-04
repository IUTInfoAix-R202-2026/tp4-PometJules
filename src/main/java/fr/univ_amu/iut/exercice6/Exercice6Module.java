package fr.univ_amu.iut.exercice6;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

/**
 * Module Guice de l'exercice 6 : configure les liaisons (bindings) avancées.
 *
 * <p>Trois mécanismes : un singleton partagé ({@link JournalActivite}), et deux implémentations de
 * {@link Notifieur} distinguées par un nom ({@code @Named}).
 */
public class Exercice6Module extends AbstractModule {

  @Override
  protected void configure() {
    // Une seule instance de JournalActivite pour toute l'application (scope singleton).
    bind(JournalActivite.class).in(Singleton.class);

    // Deux implémentations de la MÊME interface, départagées par leur nom.
    bind(Notifieur.class).annotatedWith(Names.named("console")).to(NotifieurConsole.class);
    bind(Notifieur.class).annotatedWith(Names.named("silencieux")).to(NotifieurSilencieux.class);
  }
}

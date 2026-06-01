package fr.univ_amu.iut.exercice2;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CompteurViewModel {

  private final Compteur compteur;

  private final StringProperty message = new SimpleStringProperty();

  public CompteurViewModel(Compteur compteur) {
    this.compteur = compteur;

    // TODO exercice 2 : lier `message` à la valeur du compteur.
    message.bind(Bindings.concat("Compteur à ", compteur.valeurProperty()));
  }

  public StringProperty messageProperty() {
    return message;
  }

  public void incrementerCommand() {
    // TODO exercice 2 : déléguer au modèle.
    compteur.incrementer();
  }

  public void decrementerCommand() {
    // TODO exercice 2 : déléguer au modèle.
    compteur.decrementer();
  }

  public void reinitialiserCommand() {
    // TODO exercice 2 : déléguer au modèle.
    compteur.reinitialiser();
  }
}

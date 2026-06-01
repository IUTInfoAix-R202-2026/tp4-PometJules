package fr.univ_amu.iut.exercice1;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MessageViewModel {

  private final Message message;

  private final StringProperty texte = new SimpleStringProperty();
  private final StringProperty apercu = new SimpleStringProperty();

  public MessageViewModel(Message message) {
    this.message = message;

    // TODO exercice 1 : câbler le ViewModel.
    //
    // 1. Initialiser la propriété `texte` avec la valeur actuelle du modèle
    texte.set(message.getTexte());
    // 2. Quand `texte` change, recopier la nouvelle valeur dans le modèle
    texte.addListener((obs, ancien, nouveau) -> message.setTexte(nouveau));
    // 3. Lier `apercu` à une version dérivée de `texte`
    apercu.bind(Bindings.concat("Aperçu : ", texte));
  }

  public StringProperty texteProperty() {
    return texte;
  }

  public StringProperty apercuProperty() {
    return apercu;
  }
}

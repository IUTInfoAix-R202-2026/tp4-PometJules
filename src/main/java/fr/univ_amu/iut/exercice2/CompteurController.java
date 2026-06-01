package fr.univ_amu.iut.exercice2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CompteurController {

  private final CompteurViewModel viewModel;

  @FXML private Label labelCompteur;

  public CompteurController(CompteurViewModel viewModel) {
    this.viewModel = viewModel;
  }

  @FXML
  private void initialize() {
    // TODO exercice 2 : lier le texte du label au message du ViewModel.
    labelCompteur.textProperty().bind(viewModel.messageProperty());
  }

  @FXML
  private void surIncrementer() {
    // TODO exercice 2 : appeler la commande du ViewModel.
    viewModel.incrementerCommand();
  }

  @FXML
  private void surDecrementer() {
    // TODO exercice 2 : appeler la commande du ViewModel.
    viewModel.decrementerCommand();
  }

  @FXML
  private void surReinitialiser() {
    // TODO exercice 2 : appeler la commande du ViewModel.
    viewModel.reinitialiserCommand();
  }
}

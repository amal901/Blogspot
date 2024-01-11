@blogspot
Feature: Je souhaite tester leBlogspot
  En tant que utilisateur je souhaite se connecter a l application Blogspot

  Background: 
    Given Je me connecte sur l application Blogspot

  @inscription
  Scenario: Inscription a l application Blogspot
    When Je saisis Name "Amal"
    And Je saisis Email "amal@gmail.com"
    And Je saisis Phone "99999999"
    And Je saisis Adresse "Rue 4314 N3"
    And Je coche la case Female
    Then La case Female est coché
    When Je coche la case Monday
    Then la case Monday est coché
    When Je Choisis le country Germany
    And je choisis la couleur Blue
    And Je saisis la date "12/13/2023"
    When je clique sur la pagination
    Then Le produit saffiche "Product 6"
    And Le carre de la page 2 est bleu "#007bff"
    And Je coche product 2 dans pagination tableau
    Then la case sera selectionnee

  @recherche
  Scenario: Effectuer une recherche avec le terme Hello
    When Je saisis dans le champ de recherche "Hello"
    And Je clique sur le bouton de recherche
    Then le lien "Hello" s affiche
    When je clique sur Hello
    Then La page wikipedia s affiche

    @BrowserAndconfirmationAlert
  Scenario: Confirmation d une fenetre et d une alerte
  	When Je clique sur New Browser Window
  	Then Le site web Opencart s affiche
  	When Je clique sur le bouton Confirm Alert dans Automation practice
  	And Je clique sur le bouton OK
  	Then le message "You pressed OK!" s affiche
  	
  	 @annulationAlert
  Scenario: Annulation d une alerte
  	When Je clique sur le bouton Confirm Alert
  	And Je clique sur le bouton annuler
  	Then le message "You pressed Cancel!" s affiche pour annuller
  	
  	@doubleClick
  	Scenario: doubleClick
  	When Je double clique sur copy text
  	Then le message "Hello World!" s affiche dans Field2
  	
  	@frame
  	Scenario: frame
  	When Je choisis un job
  	Then le job "Automation Engineer" est selectionné
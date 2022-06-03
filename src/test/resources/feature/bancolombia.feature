#language: en
#autora:Monica
@Cucumber
Feature: hacer reto de automatizacion
  As a usuario de Bancolombia
  I deseo solicitar una inversion
  to validar el pdf generado


  Scenario:Ingresar a la pagina de Bancolombia y solicitar una inversion

    Given que Moni esta en la pagina de Bancolombia
    When  ella solicita una inversion
    Then ella valida el pdf generado



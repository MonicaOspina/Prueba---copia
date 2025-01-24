#language: en
#autora:Monica
@Cucumber
Feature: hacer reto de automatizacion
  As a usuario de Banistmo
  I deseo realizar una compra
  to validar que no sea mayor a 400


  Scenario:Ingresar a la pagina y realizra compra

    Given que Moni esta en la pagina de compras
    When  ella solicita productos
    Then ella valida el precio sea menor a 400




@hu
Feature:
  como usuario
  quieros poder ingresar a la pagina de Demoblaze
  para poder agregegar productos al carrito de compras

Background:

  Given que estoy en la pagina

  @cp1
  Scenario: validar que estoy en la pagina demoblase
    Then puedo validar que estoy en la pagina correcta

 @cp2
 Scenario: agregar producto al carrito por categoria telefono

  When selecciono la categoria telefono y clic en el producto
   Then vere en el carrito de compra el producto agregado

 @cp3
  Scenario: agregar producto al carrito por categoria Ordenadores portatiles
   When en la categoria Ordenadores portatiles y clic en el producto
   Then en el carrito vere el producto agregado

 @cp4
 Scenario: agregar producto al carrito por categoria monitores
    When en la categoria monitores y clic en el producto
    Then vere el producto agregado en el carrito

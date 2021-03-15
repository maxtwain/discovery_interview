<h1>Changelog</h1>

<br>
<h3>Created class by replacing inner class:</h3>

* ShoeStore from inner class ShoesStore,
* Shoe from inner class Shoes
* AdidasShoe from inner class AdidasShoes
* NikeShoe from inner class NikeShoes
	
  Reason: To follow the Single Responsibility Principle.  One class should do one thing.
<br>
<h3>Removed inner class:</h3>

* SalesPerson

	Reason:  The class is unnecessary.  Salesperson names are already saved in the array contained in the ShoeStore class.  ShoeStore methods can also be called directly in the main method.  Directly calling ShoeStore methods from main makes the code easier to understand.
<br>
<h3>Removed instance:</h3>

* Interview interview = new Interview(); from the Interview class.
	
  Reason:  This is unused code.
<br>
<h3>Changed class name:</h3>

* ShoesStore to ShoeStore
* Shoes to Shoe
* AdidasShoes to AdidasShoe
* NikeShoes to NikeShoe
	
  Reason:  Stores that sell shoes are typically referred to as shoe stores rather than shoes stores.  Shoes, AdidasShoes, and NikeShoes are classes which represent a single shoe rather than multiple shoes. 
<br>
<h3>Changed variable name:</h3>

* successFulSalesPersons to sucessfulSalespeople from class ShoeStore
* secondtBuyerBuys to secondBuyerBuys from class Interview
	
  Reason:  Successful is not two words, and thus should not have camel casing on the last syllable.  Sales persons is also incorrect.  The singular form is salesperson, which is one word rather than two.  The plural form is salespeople.  Salespeople is also one word rather than two.  secondt is likely a typo.
<br>
<h3>Changed method name:</h3>

* printNamesOfSuccessfulSalesPersons to printNamesOfSuccessfulSalespeople from class ShoeStore
* renewInventory to recordSale from class ShoeStore
	
  Reason:  Salesperson is one word.  The plural form of salesperson is salespeople.  This is also one word.  The method name renewInventory suggests a method that would add items to the current inventory, but this method instead removes items as it records a sale.  I changed the name to better fit what it does.
<br>
<h3>Modified constructor:</h3>

* of the Shoe class
* of the ShoeStore class
	
  Reason:  The Shoe constructor now assigns a value to the String color instance variable.  The ShoeStore class now may be assigned values from the main method or another data source.
<br>
<h3>Added the private access modifier to instance variables:</h3>

* totalAdidasShoes from the ShoeStore class,
* totalNikeShoes from the ShoeStore class,
* shoesSold from the ShoeStore class,
* sucessfulSalespeople from the ShoeStore class,
	
  Reason:  Encapsulation is now provided.
<br>
<h3>Added the final keyword to instance variables:</h3>

* color from the Shoe class,
* shoesSold from the ShoeStore class,
* sucessfulSalespeople from the ShoeStore class
	
  Reason:  These variables do not have setters.  It is useful to designate them as final to ensure they are used appropriately.
<br>
<h3>Modified method:</h3>

* recordSale from the class ShoeStore
	
  Reason:  Where a successful salesperson had been added for every shoe sold, now a successful salesperson can only be added once per sale.  Where a successful salesperson had been added whether or not they already were recorded, now they are only recorded if they are not currently recorded.
<br>
<h3>Created a test:</h3>

* recordSale from the class ShoeStore
	
  Reason:  To automate testing for the method which this application is based around.



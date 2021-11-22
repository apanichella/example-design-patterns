# Problem description

We want to implement the wire transfer between bank accounts. To succesfully complete the transfer, there are multiple security and validation checks that need to be performed:

* Authentication + Authorization
* Validate the IBAN of the recipient
* Verify that sender has sufficient balance
* ...

Let's use the **chain-of-responsibility** pattern to implement this scenario. The chain  receives the request and pass it along the chain until one (or more) objects (validators) handle it.
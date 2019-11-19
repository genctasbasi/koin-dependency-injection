# Koin dependency injection sample project
### by Genc Tasbasi

This is a simple yet fun sample app to demonstrate how effective and easy-to-use the Koin is. It took me literally 30 minutes to create the whole app, with no prior knowledge (or idea) of Koin.

It's a simple state-machine where user controls some actions for a car. Car class is injected with 3 components (engine, pedals and transmission). Each of these components are also injected with a singleton StateController object which sets the state of the car (ie moving, breaks on, stopped, parked).

As you will see since we have the dependency inversion, it's very easy to test our components separately.

In the project we're also using a ViewModel, which is also injected to the Activity.
 
 ![Search screen](http://escapp.co.uk/projects/shared_resources/koin_dependency_injection_screenshot.png)
 ![Details screen](http://escapp.co.uk/projects/shared_resources/koin_dependency_injection_diagram.png)

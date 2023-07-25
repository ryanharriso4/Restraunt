# Restraunt

// HOW TO RUN THE PROGRAM //
 - Download Ant
 - Open Command Prompt/ Terminal
 - Navigate to Restraunt directory
 - Use the keyword ant to build the file( Make sure that you have the "build.xml" file in the directory )
 - Type "Java Store.RestrauntRunner"



// ADDING ITEMS TO THE PROGRAM //
 - Create a new item that inherets from either Food( like hotdogs or burgers) or Item( Basically just drinks)
 - Update the appropriate options ArrayList in Restraunt( ex. burgerOptions for burgers)
 - Then everything should work
   

// PURPOSE OF THE PROJECT //

I originally made this project with the intent of learning a little bit more about the factory design pattern. I think for my first time using a factory I did decently well, however I had one huge issue with my program. In the program I coupled every sub menu(burgers, hotdogs, drinks) into the factory method instead of having sub menus as apart of the Restraunt class. This was a huge issue when I started to consider a gui. I realized that I would want all of my gui elements in a single class rather than split between factory and Restraunt. This means if I wanted to create a gui I would need  to refactor my code quite a bit. However in hindsight it this mistake is pretty obvious because each class has its purpose and I gave factory part of Restraunts purpose. This created an unnecessary dependency in my code and made it alot less editable. Basically make sure classes and methods do their task and their task only. 

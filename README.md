# MyExercise_2

## Inverse Dependencies
        Used the same program to try the Dependency inversion. 
        The ProcessEmpdataImpl implements the Interface to carry out relevant operations.
        The ProcessEmpdataImpl is now extensible by adding more functionality by the adding more operations
        in the interface. 
        In this example, the higherlevel and lowerlevel depends on the abstraction layer, however the flow naturally 
        from high to low. 
        
        The main dependes on the abstraction(ProcessEmpdatav2) and lowerclasses will implement the needed methods. As 
        many as functionality can be added in the abstraction. 
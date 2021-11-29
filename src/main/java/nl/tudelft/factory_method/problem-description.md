# Problem description

We want to develop a system that needs to **converts** (serialize) a **Song** into its a string representation using a specific **string format** (XML and JSON). We also want to **de-serialize** JSON and XML strings back to instances of the Song class. 

We want to allow **multiple formats** (XML and JSON) but we also want to design the code such that we can **add more formats** in the future.


Let's use the **factory method** pattern to implement this scenario. 

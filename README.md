# FragmentFactoryApp
Fragment Factory and instantiate, FragmentFactory that the framework provides to instantiate a new instance of your fragment. There may be many fragments. To use any custom constructor, you must instead create a custom FragmentFactory subclass and then override FragmentFactory.instantiate. You can then override the FragmentManager's default factory with your custom factory, which is then used to instantiate your fragments.

Android App for manage and initialize custom fragments with constructor. Using Dagger Hilt.

# Libraries used:
Hilt

# build.gradle
<img width="720" alt="Screen Shot 2022-08-24 at 17 56 40" src="https://user-images.githubusercontent.com/62509948/186451672-43ab45e2-b088-45b6-a30a-36c0e0898765.png">

# build.gradle(app)
<img width="330" alt="Screen Shot 2022-08-24 at 17 57 19" src="https://user-images.githubusercontent.com/62509948/186451848-5fe15501-5123-41f7-bee7-acb919ee8219.png">
<img width="617" alt="Screen Shot 2022-08-24 at 17 57 34" src="https://user-images.githubusercontent.com/62509948/186451912-143e74c8-a058-4fbc-9e69-3624c27c7a35.png">

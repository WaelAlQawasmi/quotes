# Quotes
## what this app does?
My app  consist from two methods the first methode  read  quote from API  and store it  json file
if the internet disconnect it read from json file, in case the app in first time 
run without internet  ( json file empty)  it will use the Second methode it will read from other json file and show to to to
new random quote every time you run the app

## I used
- GSON library to deal with json file
- java.net to create simple http request
- file to te rad , write and create files
- buffer  to read from file and read response
## The tests

I create two test to check that the app run well as planned to run
one of test to the first methode and author test to the second methode
## How install it?
- by put this dependency in the dependency of the project and build the project
>implementation 'com.google.code.gson:gson:2.9.0'

- put the absolute bath of json file in File object 
- that's all  ^_^ .










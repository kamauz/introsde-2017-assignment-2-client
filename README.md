# introsde-2017-assignment-2-client
Client repository for the second assignment of introsde2017 
Marco Michelotti, marco.michelotti-1@studenti.unitn.it
http://sde2.herokuapp.com

## Structure
The project is divided into 5 packages
- `assign2client`: to start the client test
- `lib`: to define the client requests
- `model`: to define java object structures for the incoming data

The are two additional files:
- `build.xml` to create ant functions
- `ivy.xml` to import the dependencies

## Tasks
The client is meant to request commands to the server

## Deployment steps
- Clone the repository
- Go to inside the directory
- Start ant command to build the war file
```
ant execute.test-client
```

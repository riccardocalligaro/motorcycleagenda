# Motorcycle manager

An application made for keeping information about your motorcycle.


## Starting from the concept

This app is intened for people who want to keep info about their motorcycle veichle and have a centralized place for reminders and expiries.

## Main functionalities

- A centralized dashboard where the user can see the status of the motorcyle componets
- Add an intervention for a component (ex. oil change)
- See history of interventions
- Add type of internvention and component
- Automated reminders (ex. car insurance)
- Centralized place where to see reminders

## Pages

- Home
- History
- Interventions
- Reminders
- Settings
  
I chsoe the bottom navigation bar for navigating around pages.


## Tables in the database

### Veichles
```json
"id":1,
"manufacturer": "Kawasaki",
"model": "Versys 1000"
"license_plate": "ep443za"
```

### Interventions
type is a foreign key for the types table
```json
"id":1,
"type": 2, 
"model": "Versys 1000"
"license_plate": "ep443za"
```


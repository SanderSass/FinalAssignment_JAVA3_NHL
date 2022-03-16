# StartDocument for reset Java Finals application - Train station

Startdocument of:

- Dung Do Xuan, 

- Sander Siimann, 4767667

## Problem Description

This project consists of multiple methods to manage the train system. The following functionalities will be:

- Book the train ticket with two options
- Order the meal with two options
- Shows the list of passengers per ticket class
- Shows

### Classes

- TrainStation
- TrainCompany
- Trip
- Train
- Person
  - Passenger
  - Conductor
  - Operator
- Ticket
  - FirstClassTicket
  - SecondClassTicket
- Meal
  - NormalMeal
  - SpecialMeal

### Input & Output

In this section the in- and output of the application will be described.

#### Input

In the table below all the input (that the user has to input in order to make the application work) are described.

| Case                    | Type     | Conditions            |
| ----------------------- | -------- | --------------------- |
| Meal name               | String   | not empty             |
| Meal price              | integer  | price > 1             |
| Meal drink              | String   | not empty             |
| Ticket departure        | DateTime | not empty             |
| Ticket arrive           | DateTime | not empty             |
| Ticket price            | double   | price > 1             |
| Passenger name          | String   | not empty             |
| Passenger birth         | Date     | not empty             |
| Operator name           | String   | not empty             |
| Operator birth          | Date     | not empty             |
| Conductor name          | String   | not empty             |
| Conductor birth         | Date     | not empty             |
| Trip registrationNumber | String   | not empty             |
| Trip departure          | Date     | not empty             |
| Trip isCancelled?       | Boolean  | Trip cancelled = True |
| Trip distance           | double   | distance > 1          |
| Trip isComplete?        | boolean  | Trip arrived = True   |
| Trip destination        | String   | not empty             |
| Company name            | String   | not empty             |
| Station name            | String   | not empty             |
| Station location:       | String   | not empty             |



#### Output

| Case                                    | Type                 |
| --------------------------------------- | -------------------- |
| List of meals:                          | ArrayList<Meal>      |
| List of ticket types                    | ArrayLisy<Ticket>    |
| Passengers from certain trips           | ArrayList<Passenger> |
| Employees from Companies                | HashSet<Employees>   |
| Specific Station with list of companies | HashSet<Station>     |
| The profit of the the company           | double               |
| The expenses of the company             | double               |
| The trip cost                           | double               |
| The total train cost with many trips    | double               |
| Available seats                         | HashSet<Train>       |

#### Calculations

| Case                             | Calculation                                                  |
| -------------------------------- | ------------------------------------------------------------ |
| The company profit               | The sum of all ticket prices subtracted the total expenses.  |
| The company expenses             | The sum of employees salary and train cost.                  |
| The cost of the trip             | The sum of trip distance times the price of electricity per km. |
| The available seats at the train | The sum of booked ticket subtracted the total seats of the train. |



#### Remarks

- Input will be validated.
- Only the main class will contain System.out.println.
- Unit test will be provided.

## Class Diagram

![](https://i.imgur.com/NkGIdR9.png)

## Test plan

In this section the testcases will be described to test the application.

### Test Data

In the following table you'll find all the data that is needed for testing.

#### NormalMeal

| ID         | Input                               | Code                           |
| ---------- | ----------------------------------- | ------------------------------ |
| normalMeal | price: 15, portion: 1, drink: Juice | new NormalMeal(15, 2, "Juice") |

#### SpecialMeal

| ID         | Input                              | Code                          |
| ---------- | ---------------------------------- | ----------------------------- |
| normalMeal | price: 22, portion: 2, drink: Wine | new NormalMeal(22, 2, "Wine") |

#### FirstClass

| ID          | Input                                                        | Code                                                         |
| ----------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| firstClass1 | trip: emmeZwolle, departureTime: 22-03-2022 13:00:00, martijn | new FirstClass(emmenZwolle, 22-03-2022 13:00:00, martijn)    |
| firstClass2 | trip: groningenAmsterdam, departureTime: 23-03-2022 12:00:00, jan | new FirstClass(groningenAmsterdam, 23-03-2022 12:00:00, jan) |
| firstClass3 | trip: rotterdamUtrecht, departureTime: 24-03-2022 11:00:00, sam | new FirstClass(rotterdamUtrecht, 24-03-2022 11:00:00, sam)   |

#### SecondClass

| ID           | Input                                                        | Code                                                         |
| ------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| secondClass1 | trip: emmeZwolle, departureTime: 22-03-2022 13:00:00, tom    | new SecondClass(emmenZwolle, 22-03-2022 13:00:00, tom)       |
| secondClass2 | trip: groningenAmsterdam, departureTime: 23-03-2022 12:00:00, sander | new SecondClass(emmenZwolle, 23-03-2022 12:00:00, sander)    |
| secondClass3 | trip: rotterdamUtrecht, departureTime: 24-03-2022 11:00:00, tommy | new SecondClass(rotterdamUtrecht, 24-03-2022 11:00:00, tommy) |

#### Trip

| ID                 | Input                                                        | Code                                                         |
| ------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| emmenZwolle        | train: blauwnet, tripID: A1, date: 22-03-2022, cancelled: false, distance: 70, complete: false, destination: Zwolle | new Trip(blauwnet, "A1", 22-03-2022, false, 70, false, "Zwolle") |
| groningenAmsterdam | train: NS, tripID: B1, date: 23-03-2022, cancelled: true, distance: 120, complete: false, destination: Amsterdam | new Trip(NS, "B1", 23-03-2022, true, 120, false, "Amsterdam") |
| rotterdamUtrecht   | train: NS, tripID: B2, date: 24-03-2022, cancelled: false, distance: 100, complete: true, destination: Utrecht | new Trip(NS, "B2", 24-03-2022, false, 100, true, "Utrecht")  |

#### Blauwnet

| ID       | Input                                                        | Code                                                    |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------- |
| blauwnet | brand: Blauwnet, model: AB-1, capasity: 200, hasAssignedTrip: TRUE, electricityPerKm: 5, numberOfFirstClassSeat: 50, numberOfSecondClassSeat: 150. | new Blauwnet("Blauwnet", "AB-1", 200, TRUE, 5, 50, 150) |

#### NS

| ID   | Input                                                        | Code                                        |
| ---- | ------------------------------------------------------------ | ------------------------------------------- |
| NS   | brand: NS, model: BC-1, capasity: 220, hasAssignedTrip: TRUE, electricityPerKm: 4, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 160. | new NS("NS", "BC-1", 210, TRUE, 4, 60, 150) |

#### Passenger

| ID      | Input                                | Code                               |
| ------- | ------------------------------------ | ---------------------------------- |
| martijn | name: Martijn, dateOfBirth: 11-11-90 | new Passenger("Martijn", 11-11-90) |
| jan     | name: Jan, dateOfBirth: 12-11-90     | new Passenger("Martijn", 12-11-90) |
| tom     | name: Tom, dateOfBirth: 13-11-90     | new Passenger("Martijn", 13-11-90) |
| sander  | name: Sander, dateOfBirth: 14-11-90  | new Passenger("Martijn", 14-11-90) |
| tommy   | name: Tommy, dateOfBirth: 15-11-90   | new Passenger("Martijn", 15-11-90) |
| sam     | name: Sam, dateOfBirth: 16-11-90     | new Passenger("Martijn", 16-11-90) |

#### Operator

| ID     | Input                               | Code                             |
| ------ | ----------------------------------- | -------------------------------- |
| thomas | name: Thomas, dateOfBirth: 11-11-91 | new Operator("Thomas", 11-11-91) |
| caspar | name: Caspar, dateOfBirth: 12-11-91 | new Operator("Caspar", 12-11-91) |
| frank  | name: Frank, dateOfBirth: 13-11-91  | new Operator("Frank", 13-11-91)  |

#### Conductor

| ID    | Input                              | Code                             |
| ----- | ---------------------------------- | -------------------------------- |
| chris | name: Chris, dateOfBirth: 11-11-92 | new Conductor("Chris", 11-11-92) |
| carl  | name: Carl, dateOfBirth: 12-11-92  | new Conductor("Carl", 12-11-92)  |
| pepe  | name: Pepe, dateOfBirth: 13-11-92  | new Conductor("Pepe", 13-11-92)  |

#### Company

| ID               | Input               | Code                           |
| ---------------- | ------------------- | ------------------------------ |
| companyEmmen     | name: Emmen N.V     | new Company("Chris", 11-11-92) |
| companyGroningen | name: Groningen N.V | new Company("Carl", 12-11-92)  |
| companyRotterdam | name: Rotterdam N.V | new Company("Pepe", 13-11-92)  |

#### Station

| ID        | Input                                         | Code                                           |
| --------- | --------------------------------------------- | ---------------------------------------------- |
| emmen     | name: Emmen Station, location: Emmen          | new Station("Emmen Station", "Emmen")          |
| groningen | name: Groningen Station, location: Groningen  | new Station("Groningen Station", "Groningen")  |
| rotterdam | name: Rotterdam Centraal, location: Rotterdam | new Station("Rotterdam Centraal", "Rotterdam") |
| zwolle    | name: Zwolle Station, location: Zwolle        | new Station("Zwolle Station", "Zwolle")        |
| amsterdam | name: Amsterdam Centraal, location: Amsterdam | new Station("Amsterdam Centraal", "Amsterdam") |
| utrecht   | name: Utrecht Centraal, location: Utrecht     | new Station("Utrecht Centraal", "Utrecht")     |



### Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

# StartDocument for Java Finals application resit - Train station

Startdocument of:

- Tung Do Xuan, 4679687

- Sander Siimann, 4767667

## Problem Description

- A train station application that allows the following: 
  - A passenger can sign up with their name and date of birth.
  - A passenger can purchase a ticket and buy a meal for their trip. 
  - A ticket can show departure, arrival date, price, what type of meal, and whether it is a first or a second class. •    
  - A meal contains 2 options for special and normal meal with portion and drink.
  - A train station can show all the trips, the profits, expenses, all trip history and add train company. 
  - A train company can book a ticket, get trip history, add employees, refund tickets, schedule trips, find all employees and cancel the flight.
  - A trip can add passengers, get trip costs and check ticket availability. 
  - A train can calculate the cost of the train according to its total distance and fuel consumption.  
  - An employee can see their salary and it differs between roles (Train conductor, conductor assistance, server).

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

#### Calculations

| Case                 | Calculation                                                  |
| -------------------- | ------------------------------------------------------------ |
| The company profit   | The sum of all ticket prices subtracted the total expenses   |
| The company expenses | The sum of employees salary and train cost                   |
| The cost of the trip | The sum of trip distance times the price of electricity per km |



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
| normalMeal | price: 15, portion: 1, drink: Juice | new normalMeal(15, 2, "Juice") |

#### SpecialMeal

| ID          | Input                              | Code                           |
| ----------- | ---------------------------------- | ------------------------------ |
| specialMeal | price: 20, portion: 2, drink: Wine | new SpecialMeal(22, 2, "Wine") |

#### FirstClass

| ID          | Input                                      | Code                                                 |
| ----------- | ------------------------------------------ | ---------------------------------------------------- |
| firstClass1 | trip: emmenZwolle, 1300, passenger1        | new FirstClass(emmenZwolle, 1300, passenger1)        |
| firstClass2 | trip: GroningenAmsterdam, 8000, passenger2 | new FirstClass(GroningenAmsterdam, 8000, passenger2) |

#### SecondClass

| ID           | Input                                      | Code                                                 |
| ------------ | ------------------------------------------ | ---------------------------------------------------- |
| secondClass1 | trip: emmenZwolle, 1300, passenger3        | new FirstClass(emmenZwolle, 1300, passenger3)        |
| secondClass2 | trip: GroningenAmsterdam, 8000, passenger4 | new FirstClass(GroningenAmsterdam, 8000, passenger4) |

#### Trip

| ID                 | Input                                                        | Code                                        |
| ------------------ | ------------------------------------------------------------ | ------------------------------------------- |
| emmenZwolle        | train: train1, tripID: A1, date: 02-03-2022, cancelled: false, distance: 50, complete: false, destination: Zwolle | new Trip(train1, "A1", 02-03-2022, false, ) |
| groningenAmsterdam | train: train2, tripID: A2, date: 02-03-2022, cancelled: false, distance: 70, complete: false, destination: Amsterdam | new Trip(ns1, "A1", 02-03-2022, false,      |

#### Passenger

| ID         | Input                                     | Code                                 |
| ---------- | ----------------------------------------- | ------------------------------------ |
| passenger1 | name: Tom, dateOfBirth: 12/03/2004        | new Passenger("Tom",12032004)        |
| passenger2 | name: Sander, dateOfBirth: 12/03/2004     | new Passenger("Sander",12032004)     |
| passenger3 | name: Konstantin, dateOfBirth: 12/03/2004 | new Passenger("Konstantin",12032004) |



#### Operator

| ID        | Input                                         | Code                                     |
| --------- | --------------------------------------------- | ---------------------------------------- |
| operator1 | name: Operator One, dateOfBirth: 22/12/1923   | new Operator("Operator One", 22121923)   |
| operator2 | name: Operator Two, dateOfBirth: 22/12/1923   | new Operator("Operator Two", 22121923)   |
| operator3 | name: Operator Three, dateOfBirth: 22/12/1923 | new Operator("Operator Three", 22121923) |

#### Conductor

| ID         | Input                                          | Code                                       |
| ---------- | ---------------------------------------------- | ------------------------------------------ |
| conductor1 | name: Conductor One, dateOfBirth: 22/12/1923   | new Conductor("Conductor One", 22121923)   |
| conductor2 | name: Conductor Two, dateOfBirth: 22/12/1923   | new Conductor("Conductor Two", 22121923)   |
| conductor3 | name: Conductor Three, dateOfBirth: 22/12/1923 | new Conductor("Conductor Three", 22121923) |

#### Company

| ID       | Input               | Code                         |
| -------- | ------------------- | ---------------------------- |
| company1 | name: Company One   | new Company("Company One")   |
| company2 | name: Company Two   | new Company("Company Two")   |
| company3 | name: Company Three | new Company("Company Three") |

#### Station

| ID        | Input                                        | Code                                          |
| --------- | -------------------------------------------- | --------------------------------------------- |
| emmen     | name: Emmen Station, location: Emmen         | new Station("Emmen Station", "Emmen")         |
| zwolle    | name: Zwolle Station, location: Zwolle       | new Station("Zwolle Station", "Zwolle")       |
| groningen | name: Groningen Station, location: Groningen | new Station("Groningen Station", "Groningen") |
| amsterdam | name: Amsterdam Station, location: Amsterdam | new Station("Amsterdam Station", "Amsterdam") |

#### Train

| ID        | Input                                                        | Code                                                  |
| --------- | ------------------------------------------------------------ | ----------------------------------------------------- |
| blauwnet1 | brand: Blauwnet, model: AB-1, capacity: 200, hasAssignedTrip: False, electricityPerKm: 4, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 150. | new Train("Blauwnet", "AB-1", 200, False, 4, 60, 150) |
| ns1       | brand: NS, model: BC-1, capacity: 220, hasAssignedTrip: False, electricityPerKm: 5, numberOfFirstClassSeat: 70, numberOfSecondClassSeat: 150. | new Train("NS", "BC-1", 220, False, 5, 70, 150)       |



### Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

#### getAllTrips

|  #   |          Action           | Expected output |
| :--: | :-----------------------: | :-------------: |
|  1   |   `emmen.getAllTrips()`   | ArrayList<Trip> |
|  2   |  `zwolle.getAllTrips()`   | ArrayList<Trip> |
|  3   | `groningen.getAllTrips()` | ArrayList<Trip> |
|  4   | `amsterdam.getAllTrips()` | ArrayList<Trip> |

#### addCompany

|  #   |            Action            | Expected output |
| :--: | :--------------------------: | :-------------: |
|  1   | `emmen.addCompany(company1)` | ArrayList<Trip> |
|  2   | `emmen.addCompany(company2)` | ArrayList<Trip> |
|  3   | `emmen.addCompany(company3)` | ArrayList<Trip> |

#### getTripHistory

|  #   |              Action              | Expected output |
| :--: | :------------------------------: | :-------------: |
|  1   | `emmen.getTripHistory(company1)` | ArrayList<Trip> |
|  2   | `emmen.getTripHistory(company2)` | ArrayList<Trip> |
|  3   | `emmen.getTripHistory(company3)` | ArrayList<Trip> |

#### bookTicket

|  #   |                 Action                  |    Expected output     |
| :--: | :-------------------------------------: | :--------------------: |
|  1   |   `company1.bookTicket(firstClass1)`    | Ticket has been booked |
|  2   |   `company2.bookTicket(firstClass2)`    | Ticket has been booked |
|  3   | ```company1.bookTicket(secondClass1)``` | Ticket has been booked |
|  4   |   `company2.bookTicket(secondClass2)`   | Ticket has been booked |

#### getSalary

|  #   |            Action            | Expected output |
| :--: | :--------------------------: | :-------------: |
|  1   |   `operator1.getSalary()`    |                 |
|  2   |   `operator2.getSalary()`    |                 |
|  3   | ```conductor1.getSalary()``` |                 |
|  4   |   `conductor2.getSalary()`   |                 |

#### addEmployee

|  #   |                Action                | Expected output |
| :--: | :----------------------------------: | :-------------: |
|  1   |  `company1.addEmployee(operator1)`   |                 |
|  2   |  `company1.addEmployee(operator2)`   |                 |
|  3   |  `company2.addEmployee(conductor1)`  |                 |
|  4   | ``company2.addEmployee(conductor1)`` |                 |

#### refundTickets

|  #   |                Action                | Expected output |
| :--: | :----------------------------------: | :-------------: |
|  1   |  `company1.addEmployee(operator1)`   |                 |
|  2   |  `company1.addEmployee(operator2)`   |                 |
|  3   |  `company2.addEmployee(conductor1)`  |                 |
|  4   | ``company2.addEmployee(conductor1)`` |                 |

#### scheduleTrip

|  #   |                    Action                     | Expected output |
| :--: | :-------------------------------------------: | :-------------: |
|  1   |     `company1.scheduleTrip(emmenZwolle)`      |                 |
|  2   |  `company1.scheduleTrip(groningenAmsterdam)`  |                 |
|  3   |     `company2.scheduleTrip(emmenZwolle)`      |                 |
|  4   | ``company2.scheduleTrip(groningenAmsterdam)`` |                 |

#### findEmployee

|  #   |               Action                |   Expected output   |
| :--: | :---------------------------------: | :-----------------: |
|  1   | `company1.findEmployee(operator1)`  | ArrayList<Employee> |
|  2   | `company1.findEmployee(operator2)`  | ArrayList<Employee> |
|  3   | `company1.findEmployee(conductor3)` | ArrayList<Employee> |
|  4   | `company1.findEmployee(conductor4)` | ArrayList<Employee> |

#### getProfits

|  #   |                    Action                    | Expected output |
| :--: | :------------------------------------------: | :-------------: |
|  1   | `company1.getProfits(12/02/2022,19/02/2022)` |                 |

#### getExpenses

|  #   |                    Action                     | Expected output |
| :--: | :-------------------------------------------: | :-------------: |
|  1   | `company1.getExpenses(12/02/2022,19/02/2022)` |                 |

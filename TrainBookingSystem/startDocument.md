# StartDocument for Java Finals application resit - Train station

Startdocument of:

- Tung Do Xuan, 4679687

- Sander Siimann, 4767667

## Problem Description

- A train station application that allows the following: 
  - A passenger can sign up with their name and date of birth.
  - A passenger can purchase a ticket and buy a meal for their trip. 
  - A ticket can show departure, arrival date, price, what type of meal, and whether it is a first or a second class.   
  - A meal contains 2 options for special and normal meal with portion and drink.
  - A train station can show all the trips, the profits, expenses, all trip history and add train company. 
  - A train company can book a ticket, get trip history, add employees, refund tickets, schedule trips, find all employees and cancel the flight.
  - A company can add passengers, get trip costs and check ticket availability. (Through the company)
    - A company can calculate the cost of the train according to its total distance and electricity consumption. (The company/train station should calculate the cost) 
  - An employee can see their salary and it differs between roles (Train conductor, conductor assistance, server).

### Input & Output

In this section the in- and output of the application will be described.

#### Input

In the table below all the input (that the user has to input in order to make the application work) are described.

| Case              | Type          | Conditions                                        |
| ----------------- | ------------- | ------------------------------------------------- |
| Meal name         | String        | string >= 5                                       |
| Meal price        | integer       | price >= 1                                        |
| Meal drink        | String        | string >= 5                                       |
| Ticket departure  | LocalDateTime | LocalDateTime <= time <= LocalDateTime + 6 Months |
| Ticket arrive     | LocalDateTime | LocalDateTime <= time <= LocalDateTime + 6 Months |
| Ticket price      | double        | price >= 5                                        |
| Passenger name    | String        | string >= 1                                       |
| Passenger birth   | LocalDate     | time <= LocalDate                                 |
| Operator name     | String        | string >= 1                                       |
| Operator birth    | LocalDate     | time <= LocalDate                                 |
| Conductor name    | String        | string >=  1                                      |
| Conductor birth   | LocalDate     | time <= LocalDate                                 |
| Trip id           | String        | string >= 4                                       |
| Trip departure    | LocalDate     | LocalDateTime <= time <= LocalDateTime + 6 Months |
| Trip isCancelled? | boolean       | not empty                                         |
| Trip distance     | double        | distance > 1                                      |
| Trip isComplete?  | boolean       | not empty                                         |
| Trip destination  | String        | string >= 4                                       |
| Company name      | String        | string >= 4                                       |
| Station name      | String        | string >= 4                                       |
| Station location: | String        | string >= 4                                       |



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

![](https://i.imgur.com/a4pIvuJ.png))

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

| ID                      | Input                                                        | Code                                                       |
| ----------------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| emmenZwolle             | train: train1, tripID: A1, departureDate: 01-02-2022, cancelled: false, distance: 50, complete: false, destination: Zwolle | new Trip(blauwnet1, "A1", 01-02-2022, false, 'Zwolle' )    |
| groningenAmsterdam      | train: train2, tripID: A2, departureDate: 03-04-2022, cancelled: false, distance: 70, complete: false, destination: Amsterdam | new Trip(blauwnet2, "A1", 03-04-2022, false, 'Amsterdam')  |
| ultretchLeewarden       | train: train2, tripID: A2, departureDate: 05-06-2022, cancelled: false, distance: 70, complete: false, destination: Leeuwarden | new Trip(blauwnet3, "A1", 05-06-2022, false, 'Leeuwarden') |
| rotterdamNieuwAmsterdam | train: train2, tripID: A2, departureDate: 07-08-2022, cancelled: false, distance: 70, complete: false, destination: NiewAmsterdam | new Trip(ns1, "A1", 07-08-2022, false, 'NiewAmsterdam')    |
| emmenAmsterdam          | train: train2, tripID: A2, departureDate: 09-10-2022, cancelled: false, distance: 70, complete: false, destination: Amsterdam | new Trip(ns2, "A1", 09-10-2022, false, 'Amsterdam')        |
| ultretchAmsterdam       | train: train2, tripID: A2, departureDate: 10-11-2022, cancelled: false, distance: 70, complete: false, destination: Amsterdam | new Trip(ns3, "A1", 10-11-2022, false, 'Amsterdam')        |
| rotterdamAmsterdam      | train: train2, tripID: A2, departureDate: 02-12-2022, cancelled: false, distance: 70, complete: false, destination: Amsterdam | new Trip(ns3, "A1", 02-12-2022, false, 'Amsterdam')        |

#### Passenger

| ID         | Input                                     | Code                                 |
| ---------- | ----------------------------------------- | ------------------------------------ |
| passenger1 | name: Tom, dateOfBirth: 12/03/2004        | new Passenger("Tom",12032004)        |
| passenger2 | name: Sander, dateOfBirth: 12/03/2004     | new Passenger("Sander",12032004)     |
| passenger3 | name: Konstantin, dateOfBirth: 12/03/2004 | new Passenger("Konstantin",12032004) |
| passenger4 | name: TomTom, dateOfBirth: 12/03/2004     | new Passenger("TomTom",12032009)     |
| passenger5 | name: SassPass, dateOfBirth: 12/03/1980   | new Passenger("TomTom",12031980)     |



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

| ID             | Input                                                  | Code                                                    |
| -------------- | ------------------------------------------------------ | ------------------------------------------------------- |
| emmen          | name: Emmen Station, location: Emmen                   | new Station("Emmen Station", "Emmen")                   |
| zwolle         | name: Zwolle Station, location: Zwolle                 | new Station("Zwolle Station", "Zwolle")                 |
| groningen      | name: Groningen Station, location: Groningen           | new Station("Groningen Station", "Groningen")           |
| amsterdam      | name: Amsterdam Station, location: Amsterdam           | new Station("Amsterdam Station", "Amsterdam")           |
| ultretch       | name: Ultretch Station, location: Ultretch             | new Station("Ultretch Station", "Ultretch")             |
| leeuwarden     | name: Leeuwarden Station, location: Leeuwarden         | new Station("Leeuwarden Station", "Leeuwarden")         |
| rotterdam      | name: Rotterdam Station, location: Rotterdam           | new Station("Rotterdam Station", "Rotterdam")           |
| nieuwAmsterdam | name: NieuwAmsterdam Station, location: NieuwAmsterdam | new Station("NieuwAmsterdam Station", "NieuwAmsterdam") |

#### Train

| ID        | Input                                                        | Code                                                  |
| --------- | ------------------------------------------------------------ | ----------------------------------------------------- |
| blauwnet1 | brand: Blauwnet, model: AB-1, capacity: 200, hasAssignedTrip: False, electricityPerKm: 10, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 150. | new Train("Blauwnet", "AB-1", 200, False, 4, 60, 150) |
| blauwnet2 | brand: Blauwnet, model: AB-2, capacity: 250, hasAssignedTrip: False, electricityPerKm: 5, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 150. | new Train("Blauwnet", "AB-2", 250, False, 4, 60, 150) |
| blauwnet3 | brand: Blauwnet, model: AB-3, capacity: 300, hasAssignedTrip: False, electricityPerKm: 2, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 150. | new Train("Blauwnet", "AB-3", 300, False, 4, 60, 150) |
| ns1       | brand: NS, model: BC-1, capacity: 220, hasAssignedTrip: False, electricityPerKm: 15, numberOfFirstClassSeat: 70, numberOfSecondClassSeat: 150. | new Train("NS", "BC-1", 220, False, 5, 70, 150)       |
| ns2       | brand: NS, model: BC-2, capacity: 260, hasAssignedTrip: False, electricityPerKm: 10, numberOfFirstClassSeat: 70, numberOfSecondClassSeat: 150. | new Train("NS", "BC-2", 260, False, 5, 70, 150)       |
| ns3       | brand: NS, model: BC-3, capacity: 280, hasAssignedTrip: False, electricityPerKm: 7, numberOfFirstClassSeat: 70, numberOfSecondClassSeat: 150. | new Train("NS", "BC-3", 280, False, 5, 70, 150)       |



### Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

#### getAllTrips

|  #   |          Action           |                    Expected output                    |
| :--: | :-----------------------: | :---------------------------------------------------: |
|  1   |   `emmen.getAllTrips()`   |              emmenZwolle, emmenAmsterdam              |
|  2   |  `zwolle.getAllTrips()`   |                      emmenZwolle                      |
|  3   | `groningen.getAllTrips()` |                  groningenAmsterdam                   |
|  4   | `amsterdam.getAllTrips()` | emmenAmsterdam, ultretchAmsterdam, rotterdamAmsterdam |

#### addCompany

|  #   |              Action              | Expected output |
| :--: | :------------------------------: | :-------------: |
|  1   |   `emmen.addCompany(company1)`   |    company1     |
|  2   | `amsterdam.addCompany(company2)` |    company2     |
|  3   | `groningen.addCompany(company3)` |    company3     |
|  4   | `groningen.addCompany(company4)` |    company4     |

#### getTripHistory

|  #   |                Action                |                    Expected output                     |
| :--: | :----------------------------------: | :----------------------------------------------------: |
|  1   |   `emmen.getTripHistory(company1)`   |              emmenZwolle, emmenAmsterdam               |
|  2   | `amsterdam.getTripHistory(company2)` | emmmenAmsterdam, ultretchAmsterdam, rotterdamAmsterdam |
|  3   | `groningen.getTripHistory(company3)` |                   groningenAmsterdam                   |

#### bookTicket

|  #   |                 Action                  | Expected output |
| :--: | :-------------------------------------: | :-------------: |
|  1   |   `company1.bookTicket(firstClass1)`    |   firstClass1   |
|  2   |   `company2.bookTicket(firstClass2)`    |   firstClass2   |
|  3   | ```company1.bookTicket(secondClass1)``` |  secondClass1   |
|  4   |   `company2.bookTicket(secondClass2)`   |  secondClass2   |

#### getSalary

|  #   |            Action            | Expected output |
| :--: | :--------------------------: | :-------------: |
|  1   |   `operator1.getSalary()`    |      100.0      |
|  2   |   `operator2.getSalary()`    |      100.0      |
|  3   | ```conductor1.getSalary()``` |      200.0      |
|  4   |   `conductor2.getSalary()`   |      200.0      |

#### addEmployee

|  #   |                Action                | Expected output |
| :--: | :----------------------------------: | :-------------: |
|  1   |  `company1.addEmployee(operator1)`   |    operator1    |
|  2   |  `company1.addEmployee(operator2)`   |    operator2    |
|  3   |  `company2.addEmployee(conductor1)`  |   conductor1    |
|  4   | ``company2.addEmployee(conductor2)`` |   conductor2    |

#### scheduleTrip

|  #   |                    Action                     |  Expected output   |
| :--: | :-------------------------------------------: | :----------------: |
|  1   |     `company1.scheduleTrip(emmenZwolle)`      |    emmenZwolle     |
|  2   |  `company1.scheduleTrip(groningenAmsterdam)`  | groningenAmsterdam |
|  3   |     `company2.scheduleTrip(emmenZwolle)`      |    emmenZwolle     |
|  4   | ``company2.scheduleTrip(groningenAmsterdam)`` | groningenAmsterdam |

#### findEmployee

|  #   |          Action           | Expected output |
| :--: | :-----------------------: | :-------------: |
|  1   | `company1.findEmployee()` |    operator1    |
|  2   | `company2.findEmployee()` |    operator2    |
|  3   | `company3.findEmployee()` |   conductor3    |
|  4   | `company4.findEmployee()` |   conductor4    |

#### getProfits

|  #   |                   Action                    | Expected output |
| :--: | :-----------------------------------------: | :-------------: |
|  1   | `company1.getProfits(1/01/2022,31/12/2022)` |       550       |

#### getExpenses

|  #   |                    Action                     | Expected output |
| :--: | :-------------------------------------------: | :-------------: |
|  1   | `company1.getExpenses(12/02/2022,19/02/2022)` |       200       |

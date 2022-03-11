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
| normalMeal | price: 15, portion: 1, drink: Juice | new NormalMeal(15, 2, "Juice") |

#### SpecialMeal

| ID         | Input                              | Code                          |
| ---------- | ---------------------------------- | ----------------------------- |
| normalMeal | price: 22, portion: 2, drink: Wine | new NormalMeal(22, 2, "Wine") |

#### FirstClass

| ID          | Input | Code |
| ----------- | ----- | ---- |
| firstClass1 |       |      |
| firstClass2 |       |      |

#### SecondClass

| ID           | Input | Code |
| ------------ | ----- | ---- |
| secondClass1 |       |      |
| secondClass2 |       |      |

#### Trip

| ID                 | Input | Code |
| ------------------ | ----- | ---- |
| emmenZwolle        |       |      |
| groningenAmsterdam |       |      |
| rotterdamUtrecht   |       |      |

#### Blauwnet

| ID       | Input                                                        | Code                                                    |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------- |
| blauwnet | brand: Blauwnet, model: AB-1, capasity: 200, hasAssignedTrip: TRUE, electricityPerKm: 5, numberOfFirstClassSeat: 50, numberOfSecondClassSeat: 150. | new Blauwnet("Blauwnet", "AB-1", 200, TRUE, 5, 50, 150) |

#### NS

| ID   | Input                                                        | Code                                        |
| ---- | ------------------------------------------------------------ | ------------------------------------------- |
| NS   | brand: NS, model: BC-1, capasity: 220, hasAssignedTrip: TRUE, electricityPerKm: 4, numberOfFirstClassSeat: 60, numberOfSecondClassSeat: 160. | new NS("NS", "BC-1", 210, TRUE, 4, 60, 150) |

#### Passenger



#### Operator



#### Conductor



#### Company



#### Station





### Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

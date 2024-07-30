An online shop needs a new deal history feature. Create a query that returns all of the three seller profiles with the highest total deals in June 2022.

The result should have the following columns:

- `first_name`
- `last_name`
- `email`
- `total` (the total amount of all deals for a specific profile)
The result should be sorted in descending order by `total`. The result should be limited to the first three records.

**Note:**

- Only deals for June 2022 should be included in the report.

## Schema


### `profiles`

| Column      | Type         | Description                  |
|-------------|--------------|------------------------------|
| id          | SMALLINT     | Unique ID, primary key       |
| first_name  | VARCHAR(255) | First name of the profile    |
| last_name   | VARCHAR(255) | Last name of the profile     |
| email       | VARCHAR(255) | Email address of the profile |

### `deals`

| Column      | Type         | Description                  |
|-------------|--------------|------------------------------|
| id          | SMALLINT     | Unique ID, primary key       |
| profile_id  | SMALLINT     | Foreign key to profiles.id   |
| dt          | VARCHAR(19)  | Deal datetime                |
| amount      | DECIMAL(5,2) | Deal amount                  |

## Sample Data

### `profiles`

| id | first_name | last_name | email                    |
|----|------------|-----------|--------------------------|
| 1  | Wallis     | Treadway  | wtreadway@senate.gov     |
| 2  | Franklin   | Blackston | blackston@parallels.com  |
| 3  | Honoria    | Constant  | bconstant2@umich.edu     |
| 4  | Bertine    | Hillaby   | bhillaby@artisteer.com   |
| 5  | Constance  | Knutsen   | cknutsen4@google.ca      |

### `deals`

| id  | profile_id | dt                  | amount |
|-----|------------|---------------------|--------|
| 1   | 1          | 2022-06-04 07:16:27 | 22.31  |
| 2   | 1          | 2022-06-07 02:58:06 | 20.04  |
| 3   | 1          | 2022-06-08 05:09:52 | 24.41  |
| 4   | 1          | 2022-06-13 03:28:52 | 61.55  |
| 5   | 1          | 2022-06-16 15:09:30 | 77.70  |
| 6   | 1          | 2022-06-18 16:51:32 | 58.79  |
| 7   | 1          | 2022-06-20 02:55:20 | 43.61  |
| 8   | 1          | 2022-06-22 06:52:10 | 10.41  |
| 9   | 1          | 2022-06-23 04:59:05 | 6.59   |
| 10  | 1          | 2022-06-30 16:11:02 | 43.07  |

## Expected Output

| first_name | last_name | email                   | total  |
|------------|-----------|-------------------------|--------|
| Bertine    | Hillaby   | bhillaby@artisteer.com  | 204.36 |
| Wallis     | Treadway  | wtreadway@senate.gov    | 142.50 |
| Constance  | Knutsen   | cknutsen4@google.ca     | 80.20  |
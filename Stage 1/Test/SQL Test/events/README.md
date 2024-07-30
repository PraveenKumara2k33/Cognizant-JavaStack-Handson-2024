You are working on developing visitor tracking software and need to get a list of events by quarter for the year 2021.

The result should include the following columns:
- **`period`**: The quarter in 2021 when the event occurred.
  - Format: `Q##'##`
    - `##`: Quarter number
    - `##`: Last two digits of the year

- **`events`**: A list of event records for a specific quarter of 2021.
  - Format: `event_type=total_number_of_events_of_this_type`
    - Records are separated by semicolons and spaces.
    - Sorted in descending order by the total number of events of each type and then in ascending order by event type.

The final result should be sorted in ascending order by period.

### Table Schema

#### `events`

| Column Name | Column Type | Column Description |
|-------------|-------------|---------------------|
| dt          | VARCHAR(19) | Event timestamp     |
| type        | VARCHAR(64) | Event type          |

### Sample Data

#### `events`

| dt                   | type |
|----------------------|------|
| 2020-09-08 19:35:17  | other|
| 2020-09-14 02:44:57  | other|
| 2020-09-28 06:54:38  | sell |
| 2020-12-01 00:58:27  | other|
| 2020-12-14 05:29:57  | other|
| 2021-03-01 03:15:53  | buy  |
| 2021-01-18 11:53:13  | other|
| 2021-02-10 12:07:44  | sell |
| 2021-05-18 06:50:16  | other|
| 2021-04-17 18:05:53  | other|
| 2021-09-28 15:53:00  | buy  |
| 2021-09-17 03:57:26  | other|
| 2021-07-30 15:47:52  | sell |
| 2021-10-14 14:25:25  | buy  |
| 2021-11-03 10:07:03  | other|
| 2022-03-25 00:55:29  | other|
| 2022-02-26 15:42:03  | other|
| 2022-01-20 03:32:23  | sell |
| 2022-05-31 12:02:48  | buy  |
| 2022-04-02 02:05:03  | sell |

### Expected Output

| period | events                          |
|--------|---------------------------------|
| Q1'21  | buy=1; other=1; sell=1           |
| Q2'21  | other=2                          |
| Q3'21  | buy=1; other=1; sell=1           |
| Q4'21  | buy=1; other=1                   |

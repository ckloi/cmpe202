
## CRC

| CustomerParty   |       | 
|----------|:-------------:|
| Send sign up request to the Restaurant Manager with Info | Restaurant |
| Confirm / Cancel request to  |      | 

| Restaurant Manager  |            | 
|----------|:-------------:|
| Send new Customer to wait queue | Restaurant Manager |
| Send Remove Customer from wait queue |  CustomerParty | 
|                                     |Wait Queue|
||Event Handler|

| Wait Queue   |            | 
|----------|:-------------:|
| Find Customer which satisfy table requirement | Restaurant Manager |
| Send request to Event Handler | Event Handler | 

| Event Handler   |            | 
|----------|:-------------:|
| Process Wait Queue modification request from Restaurant Manager  | Restaurant Manager |
| Alert Restaurnt Manager when Eligible Customer event triggered fromWait Queue  | Wait Queue | 


![alt text](https://github.com/ckloi/cmpe202/blob/master/lab4/output/din-tai-fung.png "din tai fung")











## CRC

| CustomerParty   |       | 
|----------|:-------------:|
| Send sign up request to the Restaurant Manager with Info | Restaurant |
| Confirm request |      |
| Cancel request   |      | 

| Restaurant Manager  |            | 
|----------|:-------------:|
| Send new Customer request to Event Handler | Restaurant Manager |
| Send Remove Customer request to Event Handler |  CustomerParty | 
| Send Notify Message to Customer              |Wait Queue|
|                                           |Event Handler|

| Wait Queue   |            | 
|----------|:-------------:|
| Find Customer which satisfy table requirement | Restaurant Manager |
| Send request to Event Handler | Event Handler | 

| Event Handler   |            | 
|----------|:-------------:|
| Process Wait Queue modification request from Restaurant Manager  | Restaurant Manager |
| Alert Restaurnt Manager when Eligible Customer event triggered fromWait Queue  | Wait Queue | 


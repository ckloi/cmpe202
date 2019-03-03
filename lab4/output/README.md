![alt text](https://github.com/ckloi/cmpe202/blob/master/lab4/output/din-tai-fung.png "din tai fung")


## Explaination

### Pattern

I used two chain of responsibility design pattern for this lab. The first chain is for Wait Queue which will continously find eligible Customer Party who meet the current empty table requirement. The second chain is the the Event Handler which will prcoess various request from Restaurant Manager and Wait Queue. eg: (Add/Delete Queue request, Eligible user event). This design allows decoupling between wait queue and restaurant manager. In addition, the Restaurant Manager acts as the admin of the system, and the Customer doesn't need to know how the system works.

### Role

Client: Restaurant Manager, Wait Queue

Handler: Wait Queue, Event Handler



## CRC

| CustomerParty   |       | 
|----------|:-------------:|
|**responsibility** | **collaborators**|
| Send sign up request to the Restaurant Manager with Info | Restaurant |
| Confirm request |      |
| Cancel request   |      | 

| Restaurant Manager  |            | 
|----------|:-------------:|
|**responsibility** | **collaborators**|
| Send new Customer request to Event Handler | Restaurant Manager |
| Send Remove Customer request to Event Handler |  CustomerParty | 
| Send Notify Message to Customer              |Wait Queue|
|                                           |Event Handler|

| Wait Queue   |            | 
|----------|:-------------:|
|**responsibility** | **collaborators**|
| Find Customer which satisfy table requirement | Restaurant Manager |
| Send request to Event Handler | Event Handler | 

| Event Handler   |            | 
|----------|:-------------:|
|**responsibility** | **collaborators** |
| Process Wait Queue modification request from Restaurant Manager  | Restaurant Manager |
| Alert Restaurnt Manager when Eligible Customer event triggered from Wait Queue  | Wait Queue | 


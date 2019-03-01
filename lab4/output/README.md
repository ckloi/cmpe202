
## CRC

| CustomerParty   |       | 
|----------|:-------------:|
| Send sign up request to the restaurant with Info | Restaurant |
| Confirm / Cancel request|       | 

| Restaurant   |            | 
|----------|:-------------:|
| Add new CustomerParty to wait queue | Restaurant |
| Remove CustomerParty from wait queue |  CustomerParty | 

| Wait Queue   |            | 
|----------|:-------------:|
| Find CustomerParty which satisfy table requirement | Restaurant |
| Notify CustomerParty via Text Message | CustomerParty | 

